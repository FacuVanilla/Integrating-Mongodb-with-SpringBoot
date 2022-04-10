package com.seun.mongod.repository;

import com.seun.mongod.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserMongoRepo extends MongoRepository<User, Integer> {
}

