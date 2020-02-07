package com.duyi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duyi.bean.Guest;
import com.duyi.dao.GuestDao;
import com.duyi.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestServiceImpl extends ServiceImpl<GuestDao, Guest> implements GuestService {
}
