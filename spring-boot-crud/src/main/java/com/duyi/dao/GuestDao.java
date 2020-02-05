package com.duyi.dao;

import com.duyi.bean.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class GuestDao {

    static List<Guest> list = new ArrayList<>();
    static{
        list.add(new Guest("夏天","天门龙头"));
        list.add(new Guest("阿罪","替天0号"));
        list.add(new Guest("银狼","替天3号"));
        list.add(new Guest("红鬼","替天4号"));
        list.add(new Guest("猩猩","天门13"));
        list.add(new Guest("丧失强","天门13"));
    }
    public List<Guest> findAll(){
        return list;
    }

    public void insert(Guest guest) {
        list.add(guest);
    }

    public Guest selectOne(String name) {
        for (Guest guest:list){
            if (guest.getName().equals(name)){
                return guest;
            }
        }
        return null;
    }

    public void update(Guest newGuest) {
        Guest oldGuest = selectOne(newGuest.getName());
        oldGuest.setRole(newGuest.getRole());
    }

    public void delete(String name) {
        Guest guest = selectOne(name);
        list.remove(guest);
    }
}
