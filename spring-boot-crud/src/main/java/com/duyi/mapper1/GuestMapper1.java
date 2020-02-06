package com.duyi.mapper1;

import com.duyi.model.Guest;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GuestMapper1 {
    @Select("select * from guest")
    List<Guest> list();
}
