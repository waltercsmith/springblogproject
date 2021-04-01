package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Ad;
import com.codeup.springblog.models.Post;
import com.codeup.springblog.repos.AdRepository;
import com.codeup.springblog.repos.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AdController {

    private final AdRepository adDao;
    AdController(AdRepository adDao){
        this.adDao = adDao;
    }


    @GetMapping("/ads")
    public String seeAllads(Model viewModel){
        List<Ad> adsFromDB = adDao.findAll();
        viewModel.addAttribute("ads", adsFromDB);
        return "ads/index";
    }



    @GetMapping("/ads/{id}")
    public String showOnePost(@PathVariable int id, Model vModel){
        vModel.addAttribute("post", new Post("iPad", "Pro 11in"));
        return "ads/show";
    }



    @GetMapping("/ads/create")
    @ResponseBody
    public String viewPostForm(){
        return "will come here to create a new post";
    }

    @PostMapping("/ads/create")
    @ResponseBody
    public String createPost(){
        return "submit a new post here";
    }


}
