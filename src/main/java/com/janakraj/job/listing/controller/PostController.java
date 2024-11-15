package com.janakraj.job.listing.controller;

import com.janakraj.job.listing.model.Post;
import com.janakraj.job.listing.repository.PostRepository;
import com.janakraj.job.listing.repository.SearchRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    SearchRepository searchRepository;

    @GetMapping("/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("swagger-ui/index.html");
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){

        return postRepository.save(post);
    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable("text") String text){

        return searchRepository.findByText(text);
    }
}
