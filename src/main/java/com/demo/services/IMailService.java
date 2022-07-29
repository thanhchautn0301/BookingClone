package com.demo.services;

public interface IMailService {
	public String sendHTML(String toAddress, String subject, String content) throws Exception;
	public String sendSimpleMail(String toAddress, String subject, String content) throws Exception;
}
