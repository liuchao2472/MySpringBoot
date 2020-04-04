package com.duing.service;

import com.duing.bean.Guest;

import java.util.List;

public interface GuestService {

    List<Guest> list();

    void addGuest(Guest guest);

    Guest getGuest(String name);

    void updateGuest(Guest newGuest);

    void deleteGuest(String name);
}
