package com.duyi.service.impl;

import com.duyi.model.Guest;
import com.duyi.mapper.GuestMapper;
import com.duyi.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestMapper mapper;

    public List<Guest> list() {
        List<Guest> all = mapper.findAll();
        return all;
    }

    @Override
    public Guest selectOne(String name,String role) {
        return mapper.select(name,role);
    }


}
