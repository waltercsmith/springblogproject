package com.codeup.springblog.repos;

import com.codeup.springblog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByTitleEquals(String titleToSearchFor);

    @Query("from Post post where post.body like %:term%")
    List<Post> searchByBodyLike(@Param("term") String term);
}
