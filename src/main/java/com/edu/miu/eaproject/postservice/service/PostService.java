package com.edu.miu.eaproject.postservice.service;

import com.edu.miu.eaproject.postservice.domain.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostService {
    public List<Post> getAll();
    public Post getById(Long PostId);


    public Post create(Post Post);
    public Post update(Post Post);
    public void deleteById(Long PostId);


    boolean existsById(Long id);


    List<Post> getPostByUserId(Long id);

    void addPostLikes(Long id);

    void removePostLikes(Long id);
}
