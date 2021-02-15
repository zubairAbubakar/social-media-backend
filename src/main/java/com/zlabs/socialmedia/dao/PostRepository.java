package com.zlabs.socialmedia.dao;

import com.zlabs.socialmedia.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface PostRepository extends JpaRepository<Post, Integer> {
}
