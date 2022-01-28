package com.edu.miu.eaproject.postservice.controller;

import com.edu.miu.eaproject.postservice.domain.Post;
import com.edu.miu.eaproject.postservice.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
   private PostService postService;

    @GetMapping
    public List<Post> findAll() {

        return postService.getAll();
    }

    @GetMapping("/{id}")
    public Post getById(@PathVariable Long id) {

        return postService.getById(id);
    }

    @PostMapping
    public Post create(@RequestBody Post post) {

        return postService.create(post);
    }
    @PutMapping("/{id}")
    public Post update(@RequestBody Post post, @PathVariable Long id) {
        if (! postService.existsById(id)) {
            System.out.println("PUT ERROR : Post with ID" + id + " not found");
            throw new IllegalArgumentException();
        }
        post.setId(id);
        return postService.update(post);
    }
    @DeleteMapping("/{id}")
    public void deleteById (@PathVariable Long id){

        postService.deleteById(id);
    }

}
