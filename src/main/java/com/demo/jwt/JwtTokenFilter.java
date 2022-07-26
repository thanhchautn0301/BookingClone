package com.demo.jwt;

import com.demo.entities.Role;
import com.demo.entities_api.RoleApi;
import com.demo.entities_api.StaffApi;
import com.demo.repositories.RoleRepository;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Component
public class JwtTokenFilter extends OncePerRequestFilter {
    @Autowired private JwtTokenUtil jwtUtil;

    @Autowired private RoleRepository roleRepository;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // block incoming request without header bearer
        if(!hasAuthorizedBearer(request)) {
            filterChain.doFilter(request,response);
            return;
        }
        String accessToken = getAccessToken(request);

        // check validate access token
        if(!jwtUtil.validateAccessToken(accessToken)) {
            filterChain.doFilter(request,response);
            return;
        }
        // check authentication context
        setAuthenticationContext(accessToken,request);
        filterChain.doFilter(request,response);
    }

    private boolean hasAuthorizedBearer(HttpServletRequest request) {
        String header = request.getHeader("Authorization");
        System.out.println("Authorization header: "+header);

        if(ObjectUtils.isEmpty(header) || !header.startsWith("Bearer")) {
            System.out.println("Loi header");
            return false;
        }

        return true;
    }

    private String getAccessToken(HttpServletRequest request) {
        String header = request.getHeader("Authorization");
        String token = header.split(" ")[1].trim();

        System.out.println("Access token: "+token);

        return token;
    }
    // set authenticated  only if token validate success
    private void setAuthenticationContext(String accessToken, HttpServletRequest request) {
        UserDetails userDetails = getUserDetails(accessToken);
        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails,null, userDetails.getAuthorities());

        authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
        SecurityContextHolder.getContext().setAuthentication(authentication);
    }

    private UserDetails getUserDetails(String accessToken) {
        StaffApi userDetails = new StaffApi();
        Claims claims = jwtUtil.parseClaims(accessToken);
        String subject = (String) claims.get(Claims.SUBJECT);
        String roleName = (String) claims.get("role");

        System.out.println("Role ben jwt token filter la: "+roleName);

        // Create and reassign role to the staff

        RoleApi role = roleRepository.findRoleByName(roleName);

        System.out.println("Role tim ve dc la: "+role.getId());

        // Assign role for userDetails
        userDetails.setRole_name(role.getName());

        String[] jwtSubject = subject.split(",");

        userDetails.setId(Integer.parseInt(jwtSubject[0]));
        userDetails.setEmail(jwtSubject[1]);
        return userDetails;
    }
}
