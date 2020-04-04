package com.duing.controller;

import com.duing.bean.Food;
import com.duing.bean.Vegetable;
import com.duing.config.FoodConfig;
import com.duing.config.VegetableConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {

    @Value("${food.rice}")
    private String rice;
    @Value("${food.meat}")
    private String meat;
    @Value("${info.username}")
    private String username;

    @Value("${info.password}")
    private String password;

    @RequestMapping("name")
    private String name(){
        return username + "--->" + password;
    }



    @RequestMapping("/json")
    public Food json(){
        Food food = new Food();
        food.setRice(rice);
        food.setMeat(meat);
        return food;
    }
    @Autowired
    private FoodConfig foodConfig;

    @RequestMapping("json2")
    public Food json2(){
        Food food = new Food();
        food.setMeat(foodConfig.getMeat());
        food.setRice(foodConfig.getRice());
        food.setSauce(foodConfig.getSauce());
        return food;
    }
    @Autowired
    private VegetableConfig vegetableConfig;

    @RequestMapping("vegetable")
    public Vegetable json3(){
        Vegetable vegetable = new Vegetable();
        vegetable.setEggplant(vegetableConfig.getEggplate());
        vegetable.setGreenpeper(vegetableConfig.getGreenpeper());
        vegetable.setPotato(vegetableConfig.getPotato());
        return vegetable;
    }

}
