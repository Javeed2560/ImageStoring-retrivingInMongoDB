package com.javeed.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javeed.model.Photo;

public interface PhotoRepository extends MongoRepository<Photo, String> {

}
