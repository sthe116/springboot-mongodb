package com.sthefanie.springbootmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sthefanie.springbootmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
	List<Post> findByTitleContainingIgnoreCase(String text); 
	//IgnoreCase -PARA IGNORAR LETRA MAUSCULA E MINUSCULA
}
