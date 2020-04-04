package com.duing.service;

import com.duing.bean.Guest;
import com.duing.dao.GuestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestDao guestDao;

    @Override
    public List<Guest> list() {
        return guestDao.list();
    }

    @Override
    public void addGuest(Guest guest) {
        guestDao.addGuest(guest);
    }

    @Override
    public Guest getGuest(String name) {
        return guestDao.getGuest(name);
    }

    @Override
    public void updateGuest(Guest newGuest) {
        guestDao.updateGuest(newGuest);
    }

    @Override
    public void deleteGuest(String name) {
        guestDao.deleteGuest(name);
    }
}
