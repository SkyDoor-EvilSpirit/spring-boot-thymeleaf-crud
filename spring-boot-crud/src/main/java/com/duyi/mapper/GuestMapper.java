package com.duyi.mapper;

import com.duyi.model.Guest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Mapper
 * 如果主程序的类上没有@MapperScan提示扫描注解，那么也可以在dao类上直接写这个注解@Mapper
 */
public interface GuestMapper {
    @Select("select * from guest")
    List<Guest> findAll();
    @Select("select * from guest where name=#{name} and role=#{role}")
    Guest select(String name,String role);
}
