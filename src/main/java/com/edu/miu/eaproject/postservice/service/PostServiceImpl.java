package com.edu.miu.eaproject.postservice.service;

import com.edu.miu.eaproject.postservice.domain.Post;
import com.edu.miu.eaproject.postservice.repository.PostRepository;
import com.edu.miu.eaproject.postservice.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
   private PostRepository postRepository;

    @Override
    public List<Post> getAll() {
        return postRepository.findAll();
    }

    @Override
    public Post getById(Long PostId) {
        return postRepository.getById(PostId);
    }
    @Override
    public  boolean existsById(Long postId) {
        return postRepository.existsById(postId);
    }

    @Override
    public Post create(Post post) {
        return postRepository.save(post);
    }
    @Override
    public Post update(Post post) {

        return postRepository.save(post);
    }

    @Override
    public void deleteById(Long PostId) {
        postRepository.deleteById(PostId);
    }
}
