package com.duyi.service;
import com.duyi.model.Guest;

import java.util.List;
public interface GuestService {
    List<Guest> list();

    Guest selectOne(String name,String role);

}
