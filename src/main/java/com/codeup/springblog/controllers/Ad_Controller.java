package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Ad_Model;
import com.codeup.springblog.models.Post;
import com.codeup.springblog.repos.Ad_Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class Ad_Controller {

    private final Ad_Repository adDao;

    Ad_Controller(Ad_Repository adDao){
        this.adDao = adDao;
    }

    @GetMapping("/ads")
    public String seeAllAds(Model viewModel){
        List<Ad_Model> adsFromDB = adDao.findAll();
        viewModel.addAttribute("ads", adsFromDB);
        return "ads/index";

    }

    @GetMapping("/ads/{id}")
    public String showOneAd(@PathVariable int id, Model vModel){
//        vModel.addAttribute("post", new Post("iPad", "Pro 11in"));
        return "ads/show";
    }

    @GetMapping("/ads/create")

    public String viewAdForm(){
        return "ads/create";
    }

    @PostMapping("/ads/create")
    @ResponseBody
    public String createAd(@RequestParam("ad_title") String title, @RequestParam("ad_description") String description ){

        Ad_Model adToSave = new Ad_Model(title, description);
        adDao.save(adToSave);

        return "You created an ad!";
    }
}
