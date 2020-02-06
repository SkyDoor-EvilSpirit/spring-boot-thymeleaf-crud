package com.duyi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duyi.mapper.GuestMapper;
import com.duyi.model.Guest;
import com.duyi.service.IGuestService;
import org.springframework.stereotype.Service;

@Service
public class IGuestServiceImpl extends ServiceImpl<GuestMapper,Guest> implements IGuestService {

}
