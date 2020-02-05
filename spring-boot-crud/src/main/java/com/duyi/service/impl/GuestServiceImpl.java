package com.duyi.service.impl;

import com.duyi.bean.Guest;
import com.duyi.dao.GuestDao;
import com.duyi.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestDao dao;

    public List<Guest> list() {
        return dao.findAll();
    }
}
