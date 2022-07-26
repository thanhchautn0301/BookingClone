package com.demo.helper;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.web.multipart.MultipartFile;

public class FileUpload {
	public static String upload(ServletContext servletContext,MultipartFile file) {
		try {
			String name = UUID.randomUUID().toString().replace("-", "");
			int lastIndex = file.getOriginalFilename().lastIndexOf(".");
			String ext = file.getOriginalFilename().substring(lastIndex);
			
			String fileName = name+ext;
			byte[] bytes = file.getBytes(); 
			Path path = Paths.get(servletContext.getRealPath("/images/") + fileName);
			Files.write(path, bytes);
			return fileName;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	
}
