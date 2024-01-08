package com.anas.postsservice.dao.repositories;

import com.anas.postsservice.dao.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<Post, Long> {

}
