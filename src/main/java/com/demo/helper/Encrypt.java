package com.demo.helper;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.mindrot.jbcrypt.BCrypt;

public  class Encrypt {
	
	
	public static String BcryptPass(String str) {
			return BCrypt.hashpw(str, BCrypt.gensalt(12)); 
	}
}
