package com.booking.helpers;

import com.booking.entities.Staff;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Optional;

public class TokenReader {
    public static String accessToken = null;
    public static int userid =0;

    public static void assignToken(String token) {
        if(token !=null) accessToken = token;
    }
//
    public static void assignUserId(int id) {
        if(id >0) userid = id;
    }

//
//    public static int getUserId() {
//        int userid=-1;
//        if(accessToken !=null) {
//            Claims claims = parseClaims(accessToken);
//            userid = Integer.parseInt(String.valueOf(claims.get("id")));
//        }
//        return userid;
//    }
//
//    public static Claims parseClaims(String token) {
//        return Jwts.parser()
//                .setSigningKey("Chauisgay")
//                .parseClaimsJws(token)
//                .getBody();
//    }
}
