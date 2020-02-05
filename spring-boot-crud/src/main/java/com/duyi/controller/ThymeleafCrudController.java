package com.duyi.controller;

import com.duyi.bean.Guest;
import com.duyi.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ThymeleafCrudController {

    @Autowired
    private GuestService service;

    @RequestMapping("/guest/list")
    public String list(Model model){
        List<Guest> list = service.list();
        model.addAttribute("list",list);
        return "view/index";
    }
}
