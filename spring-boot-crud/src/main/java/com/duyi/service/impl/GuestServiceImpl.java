package com.duyi.service.impl;

import com.duyi.mapper1.GuestMapper1;
import com.duyi.mapper2.GuestMapper2;
import com.duyi.model.Guest;
import com.duyi.service.IGuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements IGuestService {

    @Autowired
    private GuestMapper1 guestMapper1;
    @Autowired
    private GuestMapper2 guestMapper2;

    @Override
    public List<Guest> list() {
        return guestMapper2.list();
    }
}
