package com.edu.miu.eaproject.postservice.repository;

import com.edu.miu.eaproject.postservice.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepository extends JpaRepository<Post,Long>, PostCustomRepository {

    @Query("select  p from Post p where p.userid = :id")
    List<Post> getPostByUserId(@Param("id") Long id);
}