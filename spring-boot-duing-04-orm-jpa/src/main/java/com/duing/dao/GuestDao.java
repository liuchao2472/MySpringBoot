package com.duing.dao;

import com.duing.bean.Guest;
import com.duing.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GuestDao {

    @Autowired
    private GuestRepository guestRepository;

    public List<Guest> list() {
        return guestRepository.findAll();
    }

}
