package com.duyi.mapper;

import com.duyi.model.Guest;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;


@Mapper
public interface GuestMapper {
    List<Guest> findAll();
}
