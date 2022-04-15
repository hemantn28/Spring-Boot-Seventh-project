package com.example.SpringBootSeventhproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MixedController {

    @RequestMapping("/division")
    public String divide(){
        double a=65;
        double b=2;
        double c=a/b;
        return "Division is: "+c;
    }

    @RequestMapping("/multiplication")
    public float multiply(){
        float a=2.3f;
        float b=4.5f;
        float c=a*b;
        return c;

    }

    @RequestMapping("/mobile")
    public long mobileNumber(){
        return 6543289714l;
    }

    @RequestMapping("/subtraction")
    public float subtract(){
        float a=87.54f;
        float b=21.97f;
        float c=a-b;
        return c;
    }

    @RequestMapping("/info")
    public String information(){
        return "make a statement";
    }

}
