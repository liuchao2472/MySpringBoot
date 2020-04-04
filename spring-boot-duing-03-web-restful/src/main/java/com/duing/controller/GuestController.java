package com.duing.controller;


import com.duing.bean.Guest;
import com.duing.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;

    @GetMapping
    public String list(Model model){
        List<Guest> guestList = guestService.list();
        model.addAttribute("guestList",guestList);
        return "list";
    }

    @GetMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

    @PostMapping
    public String add(Guest guest){
        guestService.addGuest(guest);
        return "redirect:/guest";
    }

    /**
     *
     * @param model
     * @param name
     * @return
     */
    @GetMapping("/toUpdate/{name}")
    public String toUpdate(Model model,@PathVariable("name") String name){
        Guest guest = guestService.getGuest(name);
        model.addAttribute("guest",guest);
        return "update";
    }

    @PutMapping
    public String update(Guest guest){
        guestService.updateGuest(guest);
        System.out.println(guest.toString());
        return "redirect:/guest";
    }

    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name){
        guestService.deleteGuest(name);
        return "redirect:/guest";
    }
}
