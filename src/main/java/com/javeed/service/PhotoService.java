package com.javeed.service;

import java.io.IOException;
import java.util.List;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.javeed.model.Photo;
import com.javeed.repository.PhotoRepository;

@Service
public class PhotoService {

	@Autowired
	private PhotoRepository photoRepository;
	
	public String addPhoto(String title, MultipartFile file) throws IOException{
		Photo photo = new Photo(title);
		photo.setImage(
				new Binary(BsonBinarySubType.BINARY, file.getBytes()));
		photo = photoRepository.insert(photo);
		return photo.getId();
	}
	
	public Photo getPhoto(String id) {
		return photoRepository.findById(id).get();
	}
	
	public List<Photo> getAll() {
		return photoRepository.findAll();
	}
}
