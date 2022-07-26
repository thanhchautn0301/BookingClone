package com.demo.jwt;

import com.demo.entities_api.RoleApi;
import com.demo.entities_api.StaffApi;
import io.jsonwebtoken.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtTokenUtil {

    private static final long EXPIRE_DURATION = 24*60*60*1000; //24h

    private static final long EXPIRE_DURATION_FOR_ACTIVATE_ACCOUNT = 5*60*1000; //5min

    private static final long EXPIRE_DURATION_FOR_RESET_PW = 2*60*1000; //2min

    private static final Logger LOGGER = LoggerFactory.getLogger(JwtTokenUtil.class);

    @Value("${app.jwt.secret}")
    private String secretKey;

    // generate diffrence token for diffrence purpose

    public String generateAccessToken(StaffApi staffApi) {
        return Jwts.builder()
                .setSubject(staffApi.getId()+","+staffApi.getEmail())
                .claim("role",staffApi.getRole_name())
                .claim("id",staffApi.getId())
                .setIssuer("GiaTuan")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE_DURATION))
                .signWith(SignatureAlgorithm.HS512,secretKey)
                .compact();
    }

    public String generateActivateToken(StaffApi staffApi) {
        return Jwts.builder()
                .setSubject(staffApi.getId()+","+staffApi.getEmail())
                .claim("role",staffApi.getRole_name())
                .claim("id",staffApi.getId())
                .setIssuer("GiaTuan")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE_DURATION_FOR_ACTIVATE_ACCOUNT))
                .signWith(SignatureAlgorithm.HS512,secretKey)
                .compact();
    }

    public String generateResetPwToken(StaffApi staffApi) {
        return Jwts.builder()
                .setSubject(staffApi.getId()+","+staffApi.getEmail())
                .claim("role",staffApi.getRole_name())
                .claim("id",staffApi.getId())
                .setIssuer("GiaTuan")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE_DURATION_FOR_RESET_PW))
                .signWith(SignatureAlgorithm.HS512,secretKey)
                .compact();
    }

    // validate token
    public boolean validateAccessToken(String token) {
        try {
          Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token);
          return true;
        } catch(ExpiredJwtException ex) {
            LOGGER.error("JWT is expire",ex);
        } catch(IllegalArgumentException ex) {
            LOGGER.error("JWT is null, empty or has only whitespace",ex);
        } catch(MalformedJwtException ex) {
            LOGGER.error("JWT is invalid",ex);
        } catch(UnsupportedJwtException ex) {
            LOGGER.error("JWT is not supported",ex);
        } catch(SignatureException ex) {
            LOGGER.error("Signature validation failed",ex);
        }
        return false;
    }

    // getting the subject of the token
    public String getSubject(String token) {
        return parseClaims(token).getSubject();
    }

    public Claims parseClaims(String token) {
        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(token)
                .getBody();
    }

}
