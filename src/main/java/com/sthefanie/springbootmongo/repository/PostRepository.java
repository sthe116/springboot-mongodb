package com.sthefanie.springbootmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sthefanie.springbootmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
