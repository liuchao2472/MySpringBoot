package com.duing.dao;

import com.duing.bean.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GuestDao {

    static List<Guest> guestList = new ArrayList<>();

    static {
        guestList.add(new Guest("黄晓明","店长"));
        guestList.add(new Guest("秦海璐","财务"));
        guestList.add(new Guest("林述巍","总厨"));
        guestList.add(new Guest("王俊凯","经理"));
        guestList.add(new Guest("杨紫","前台"));
    }

    public List<Guest> list(){
        return guestList;
    }

    public void addGuest(Guest guest){
        guestList.add(guest);
    }

    public Guest getGuest(String name){
        for (Guest g: guestList) {
            if(g.getName().equals(name)){
                return g;
            }
        }
        return null;
    }

    public void updateGuest(Guest newGuest){
        Guest guest = getGuest(newGuest.getName());
        System.out.println(guest.toString());
        guest.setRole(newGuest.getRole());
        System.out.println(guestList);
    }

    public void deleteGuest(String name){
        Guest guest1 = getGuest(name);
        guestList.remove(guest1);
    }
}
