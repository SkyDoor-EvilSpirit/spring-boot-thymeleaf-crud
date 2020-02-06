package com.duyi.controller;

import com.duyi.model.Guest;
import com.duyi.service.IGuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/guest")
public class ThymeleafCrudController {

    @Autowired
    private IGuestService service;
//    返回页面的路径
    private String path="view";

    @GetMapping
    public String list(Model model){
        List<Guest> list = service.list();
        model.addAttribute("list",list);
        return path+"/index";
    }

}
