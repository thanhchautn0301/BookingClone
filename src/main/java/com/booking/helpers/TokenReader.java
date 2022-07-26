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
    public static String token = null;
    public static int userid =0;

    // asign token for user
    // user at 3 state
    // logged, forgot pw or account not activate
    public static void assignToken(String generatedToken) {
            token = generatedToken;
    }
    // assign user id
    public static void assignUserId(int id) {
        if(id >0) userid = id;
    }
}
