package com.sthefanie.springbootmongo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.sthefanie.springbootmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
	@Query("{ 'title': { $regex: ?0, $options: 'i' } }") // i -> IGNORARA LETRAS MAIUSC.
	List<Post> searchTitle(String text);
	
	List<Post> findByTitleContainingIgnoreCase(String text); 
	//IgnoreCase -PARA IGNORAR LETRA MAUSCULA E MINUSCULA
	
	@Query("{ $and: [ { date: {$gte: ?1} }, { date: { $lte: ?2} } , "
			+ "{ $or: [ { 'title': { $regex: ?0, $options: 'i' } }, "
			+ "{ 'body': { $regex: ?0, $options: 'i' } }, "
			+ "{ 'comments.text': { $regex: ?0, $options: 'i' } } ] } ] }")
	List<Post> fullSearch(String text, Date minDate, Date maxDate);
}
