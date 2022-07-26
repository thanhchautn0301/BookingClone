package com.demo.services;

public interface IMailService {
	public void sendHTML(String toAddress, String fromAddress, String subject, String content) throws Exception;
}
