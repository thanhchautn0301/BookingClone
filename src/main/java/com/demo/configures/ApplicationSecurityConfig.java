package com.demo.configures;

import com.demo.jwt.JwtTokenFilter;
import com.demo.repositories.CustomerRepository;
import com.demo.repositories.StaffRepository;
import com.demo.services.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletResponse;
@EnableWebSecurity
@EnableGlobalMethodSecurity(
        prePostEnabled = true, securedEnabled = true, jsr250Enabled = true
)
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private StaffRepository staffRepository;

    @Autowired
    private JwtTokenFilter jwtTokenFilter;
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(username ->staffRepository.findStaffApiByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("Email "+username +" not found !"))
                );
    }

    @Override @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // disable csrf
        http.csrf().disable();
        // remove session state
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        // allow request ( chia role )
        http.authorizeRequests()
                .antMatchers("/api/staff/login").permitAll()
                .antMatchers("/api/staff/create").permitAll()
                .antMatchers("/api/staff/findstaffbyid").permitAll()
                .antMatchers("/api/staff/findstaffapibyemail").permitAll()
                .antMatchers("/api/staff/forgotpw").permitAll()
                .antMatchers("/api/accomodation/findaccomodationbycityid/{id}").permitAll()
                .antMatchers("/api/accomodation/*").permitAll()
                .antMatchers("/api/image/getimage/{name}").permitAll()
                .antMatchers("/api/category/*").permitAll()
                .antMatchers("/api/city/*").permitAll()
                .anyRequest().authenticated();

        // handling error
        http.exceptionHandling().authenticationEntryPoint(
                (request, response, ex) -> {
                    response.sendError(HttpServletResponse.SC_UNAUTHORIZED,ex.getMessage());
                }
        );

        // custom filter
        http.addFilterBefore(jwtTokenFilter, UsernamePasswordAuthenticationFilter.class);
    }
}
