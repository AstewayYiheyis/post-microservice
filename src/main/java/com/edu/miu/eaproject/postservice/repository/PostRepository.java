package com.edu.miu.eaproject.postservice.repository;

import com.edu.miu.eaproject.postservice.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long>, PostCustomRepository {

}
