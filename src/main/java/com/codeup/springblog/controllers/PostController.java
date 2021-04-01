package com.codeup.springblog.controllers;


import com.codeup.springblog.models.Post;
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

    List<Post> posts = new ArrayList<>();
    @GetMapping("/posts")
    public String seeAllPosts(Model viewModel){
        posts.add(new Post("PS5", "Brand new"));
        posts.add(new Post("Xbox X", "Brand new"));
        posts.add(new Post("N Switch", "Used"));
        viewModel.addAttribute("posts", posts);
        // do not use a / to reference a template
        return "posts/index";
    }

//    @GetMapping("/posts")
//    @ResponseBody
//    public String hello() {
//        return "posts index page";
//    }

//    @GetMapping("/posts")
//    public String index() {
//
//        return "/posts/index";
//    }

    @GetMapping("/posts/{id}")
    public String showOnePost(@PathVariable int id, Model vModel){
        vModel.addAttribute("post", new Post("iPad", "Pro 11in"));
        return "posts/show";
    }

//    @GetMapping("/show")
//    public String show() {
//
//        return "/posts/show";
//    }


//    @GetMapping("/posts/{id}")
//    @ResponseBody
//    public String viewIndividualPost(@PathVariable int id) {
//        return "view an individual post id of: " + id;
//    }
//
//    @GetMapping("/posts/create")
//    @ResponseBody
//    public String viewPostForm(){
//        return "will come here to create a new post";
//    }
//
//    @PostMapping("/posts/create")
//    @ResponseBody
//    public String createPost(){
//        return "submit a new post here";
//    }


}