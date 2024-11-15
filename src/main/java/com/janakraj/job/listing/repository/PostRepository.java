package com.janakraj.job.listing.repository;

import com.janakraj.job.listing.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {


}
