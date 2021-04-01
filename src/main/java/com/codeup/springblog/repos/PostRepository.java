package com.codeup.springblog.repos;

import com.codeup.springblog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByTitleEquals(String titleToSearchFor);
}
