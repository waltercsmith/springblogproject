package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Ad_Model;
import com.codeup.springblog.models.Post;
import com.codeup.springblog.models.User_Model;
import com.codeup.springblog.repos.Ad_Repository;
import com.codeup.springblog.repos.User_Repository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class Ad_Controller {

    private final Ad_Repository adDao;

    @Autowired  //<-- Alternative to injecting it into a constructor
    private User_Repository userDao;

    //This is injection
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
    public String showOneAd(@PathVariable Long id, Model vModel){
        vModel.addAttribute("ad", adDao.getOne(id));
        return "ads/show";
    }

    @GetMapping("/ads/create")

    public String viewAdForm(){

        return "ads/create";
    }

    @PostMapping("/ads/create")
    @ResponseBody
    public String createAd(@RequestParam("ad_title") String title, @RequestParam("ad_description") String description ){

        User_Model user = userDao.getOne(1L);

        Ad_Model adToSave = new Ad_Model(title, description);

        adToSave.setOwner(user);
        adDao.save(adToSave);

        return "You created an ad!";
    }


    @GetMapping("ads/{id}/update")
    public String updateAdForm(@PathVariable Long id, Model model){

        Ad_Model adFromDb = adDao.getOne(id);
        model.addAttribute("oldAd", adFromDb);

        return "ads/update";
    }

    @PostMapping("ads/{id}/update")
    @ResponseBody
    public String updateAd(@PathVariable Long id , @RequestParam("ad_title") String title, @RequestParam("ad_description") String description){


        Ad_Model adToSave = new Ad_Model(id,title,description);

        adDao.save(adToSave);

        return "You updated ad number: " + id ;

    }

//   Did not use a get mapping for the delete function

    @PostMapping("/ads/{id}/delete")
    @ResponseBody
    public String deleteAd(@PathVariable Long id){
        adDao.deleteById(id);
        return "You deleted an ad.";

    }


}
