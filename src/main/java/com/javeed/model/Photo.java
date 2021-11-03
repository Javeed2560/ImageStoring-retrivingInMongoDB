package com.javeed.model;

import org.bson.types.Binary;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Document(collection = "photos")
public class Photo {

	@Getter
	@Setter
	private String id;
	
	@Getter
	@Setter
	private String title;
	
	@Getter
	@Setter
	private Binary image;
	
	@Getter
	@Setter
	private byte[] file;
	
	public Photo(String title) {
	}

}
