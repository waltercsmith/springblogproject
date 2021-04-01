package com.codeup.springblog.controllers;


import com.codeup.springblog.models.Post;
import com.codeup.springblog.repos.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    private final PostRepository postDao;
    // whenever we use this controller (PostController) we will use the default controller


    // injected this in our controller
    public PostController(PostRepository postDao){
        this.postDao = postDao;
    }


//    List<Post> posts = new ArrayList<>();
    @GetMapping("/posts")
    public String seeAllPosts(Model viewModel){
        List<Post> postsFromDB = postDao.findAll();
        viewModel.addAttribute("posts", postsFromDB);
        return "posts/index";
    }



    @GetMapping("/posts/{id}")
    public String showOnePost(@PathVariable int id, Model vModel){
        vModel.addAttribute("post", new Post("iPad", "Pro 11in"));
        return "posts/show";
    }



    @GetMapping("/posts/create")
    @ResponseBody
    public String viewPostForm(){
        return "will come here to create a new post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "submit a new post here";
    }


}