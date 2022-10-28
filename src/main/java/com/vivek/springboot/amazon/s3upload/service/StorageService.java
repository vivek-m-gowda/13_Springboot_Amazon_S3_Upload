package com.vivek.springboot.amazon.s3upload.service;

import org.springframework.web.multipart.MultipartFile;

public interface StorageService {

	public String uploadFile(MultipartFile file);	//To Upload File
	public byte[] downloadFile(String fileName);	//To Download File
	public String deleteFile(String fileName);	//To Delete File
	
}
