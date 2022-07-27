package com.demo.helper;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public  class Encrypt {
	
	
	public static String BcryptPass(String str) {
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			return passwordEncoder.encode(str);
	}
}
