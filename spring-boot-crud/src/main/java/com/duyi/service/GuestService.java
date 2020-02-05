package com.duyi.service;

import com.duyi.bean.Guest;

import java.util.List;
import java.util.Map;

public interface GuestService {
    List<Guest> list();

    void add(Guest guest);

    Guest get(String name);

    void update(Guest guest);

    void delete(String name);
}
