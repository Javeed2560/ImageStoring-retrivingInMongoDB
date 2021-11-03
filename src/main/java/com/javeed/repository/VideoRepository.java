package com.javeed.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javeed.model.Video;

public interface VideoRepository extends MongoRepository<Video, String> {

}
