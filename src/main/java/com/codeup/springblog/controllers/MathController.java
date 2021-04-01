package com.codeup.springblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {

    @RequestMapping(path = "/add/{num1}/and/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public int addition(@PathVariable int num1, @PathVariable int num2) {
        return num1 + num2;
    }

    @GetMapping("/multiply/{numOne}/and/{numTwo}")
    @ResponseBody
    public int product(@PathVariable int numOne, @PathVariable int numTwo){
        return numTwo * numOne;
    }

    @GetMapping("/subtract/{numOne}/from/{numTwo}")
    @ResponseBody
    public int subtract(@PathVariable int numOne, @PathVariable int numTwo){
        return numTwo - numOne;
    }


    @GetMapping("/divide/{numOne}/by/{numTwo}")
    @ResponseBody
    public float divide(@PathVariable float numOne, @PathVariable float numTwo){
        return numOne/numTwo;
    }
}
