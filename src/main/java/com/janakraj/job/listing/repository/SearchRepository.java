package com.janakraj.job.listing.repository;

import com.janakraj.job.listing.model.Post;

import java.util.List;

public interface SearchRepository {

    public List<Post> findByText(String text);
}
