package com.demo.services;

import java.util.Date;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class MailService implements IMailService{
	// Chich mailSender
	@Autowired
	private JavaMailSender javaMailSender;

	@Value("${spring.mail.username}") private String sender;

	public String sendSimpleMail(String toAddress, String subject, String content)
	{

		// Try block to check for exceptions
		try {

			// Creating a simple mail message
			SimpleMailMessage mailMessage
					= new SimpleMailMessage();

			// Setting up necessary details
			mailMessage.setFrom(sender);
			mailMessage.setTo(toAddress);
			mailMessage.setText(content);
			mailMessage.setSubject(subject);

			// Sending the mail
			javaMailSender.send(mailMessage);
			return "Mail Sent Successfully...";
		}

		// Catch block to handle the exceptions
		catch (Exception e) {
			e.printStackTrace();
			return "Error while Sending Mail";
		}
	}

	@Override
	public String sendHTML(String toAddress, String subject, String content) throws Exception {
		try {
			MimeMessage mimeMessage = javaMailSender.createMimeMessage();
			MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
			mimeMessageHelper.setFrom(sender);
			mimeMessageHelper.setTo(toAddress);
			mimeMessageHelper.setSubject(subject);
			mimeMessageHelper.setText(content, true);
			mimeMessageHelper.setSentDate(new Date());
			javaMailSender.send(mimeMessage);
			return "Mail send successfully !";
		} catch (Exception e) {
			e.printStackTrace();
			return "Mail send failed !";
		}
	}

}
