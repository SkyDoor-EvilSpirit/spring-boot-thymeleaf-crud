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
        System.out.println("到list了。。。");
        return "view/index";
    }
    @RequestMapping("/guest/addview")
    public String addview(){
        System.out.println("到addview了。。。");
        return "view/addview";
    }
    @RequestMapping("/guest/add")
    public String add(Guest guest){
        service.add(guest);
        System.out.println("到add了。。。");
        return "redirect:/guest/list";
    }
    @RequestMapping("/guest/updateview")
    public String updateview(Model model,String name){
        Guest guest=service.get(name);
        model.addAttribute("guest",guest);
        System.out.println(guest);
        return "view/update";
    }
    @RequestMapping("/guest/update")
    public String update(Guest newGuest){
        service.update(newGuest);
        return "redirect:/guest/list";
    }
    @RequestMapping("/guest/delete")
    public String delete(String name){
        service.delete(name);
        return "redirect:/guest/list";
    }

}
