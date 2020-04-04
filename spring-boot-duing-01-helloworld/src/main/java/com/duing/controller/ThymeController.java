package com.duing.controller;


import com.duing.bean.Restaurant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeController {
    @RequestMapping("/thyme")
    public String index(Model model){
        model.addAttribute("name","<h1>thymeleaf</h1>");
        return  "thymeleaf/index.html";
    }

    @RequestMapping("/thyme1")
    public String index2(Model model){
        Restaurant restaurant = new Restaurant();
        restaurant.setBoss("黄晓明");
        restaurant.setChef("林大厨");
//        model.addAttribute("name","<h1>Thymeleaf</h1>");
        model.addAttribute("restaurant",restaurant);
        return "/thymeleaf/index";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "/thymeleaf/welcome";
    }


}
