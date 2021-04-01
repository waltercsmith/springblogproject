package com.codeup.springblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String hello() {
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String viewIndividualPost(@PathVariable int id) {
        return "view an individual post id of: " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String viewPostForm(){
        return "will come here to create a new post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "sumbit a new post here";
    }


}