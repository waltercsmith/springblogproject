//package com.codeup.springblog.controllers;
//
////import com.codeup.springblog.models.Ad;
//import com.codeup.springblog.models.Post;
////import com.codeup.springblog.repos.AdRepository;
//import com.codeup.springblog.repos.PostRepository;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Controller
//public class AdController {
//
////    private final AdRepository adDao;
////    AdController(AdRepository adDao){
////        this.adDao = adDao;
////    }
//
//
//    @GetMapping("/ads")
//    public String seeAllAds(Model viewModel){
////        List<Ad> adsFromDB = adDao.findAll();
////        viewModel.addAttribute("ads", adsFromDB);
//        return "ads/index";
//    }
//
//
//
//    @GetMapping("/ads/{id}")
//    public String showOneAd(@PathVariable Long id, Model vModel){
////        vModel.addAttribute("ad", adDao.getOne(id));
//        return "ads/show";
//    }
//
//
//
//    @GetMapping("/ads/create")
//
//    public String viewAdForm(){
//        return "/ads/create";
//    }
//
//
//
//    @PostMapping("/ads/create")
//    @ResponseBody
//    public String createAd(@RequestParam("ad_title") String title, @RequestParam("ad_description") String description){
////        Ad adToSave = new Ad(title, description);
////
////        adDao.save(adToSave);
//
//
//
//        return "You created an Ad!!! Good job";
//    }
//
//    @GetMapping("/ads/{id}/update")
//
//    public String updateAdForm(@PathVariable Long id, Model model){
//
////        Ad adFromDB = adDao.getOne(id);
////
////        model.addAttribute("oldAd", adFromDB);
//
//        return "/ads/update";
//    }
//
//
//    @PostMapping("/ads/{id}/update")
//    @ResponseBody
//    public String updateAd(@PathVariable Long id,@RequestParam("ad_title") String title, @RequestParam("ad_description") String description){
////        Ad adToSave = new Ad(id,title, description);
////
////        adDao.save(adToSave);
//
//
//
//        return "You updated an Ad!!! Good job";
//    }
//
//    @PostMapping("/ads/{id}/delete")
//    @ResponseBody
//    public String deleteAd(@PathVariable Long id){
//
////        adDao.deleteById(id);
//
//        return "You deleted an ad";
//
//    }
//
//
//}
