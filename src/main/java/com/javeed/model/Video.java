package com.javeed.model;

import java.io.InputStream;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection =  "video")
public class Video {
	
	@Getter
	@Setter
	private String id;
	
	@Getter
	@Setter
	private String title;

	


	public Video() {
		// TODO Auto-generated constructor stub
	}


	@Getter
	@Setter
	private InputStream stream;
}
