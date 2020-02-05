package com.duyi.controller;

import com.duyi.bean.Guest;
import com.duyi.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/guest")
public class ThymeleafCrudController {

    @Autowired
    private GuestService service;

//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String list(Model model){
        List<Guest> list = service.list();
        model.addAttribute("list",list);
        System.out.println("到list了。。。");
        return "view/index";
    }
//    @RequestMapping(path = "addview")
    @GetMapping("/add")
    public String addview(){
        System.out.println("到add了。。。");
        return "view/addview";
    }
//    @RequestMapping(path = "/guest",method =RequestMethod.POST)
    @PostMapping
    public String add(Guest guest){
        service.add(guest);
        System.out.println("到add了。。。");
        return "redirect:/guest";
    }
//    @RequestMapping(path = "/guest/updateview",method = RequestMethod.GET)
    @GetMapping("/update/{name}")
    public String updateview(Model model,@PathVariable String name){
        Guest guest=service.get(name);
        model.addAttribute("guest",guest);
        System.out.println("到update了。。。");
        return "view/update";
    }
//    @RequestMapping(path = "/guest/update/name",method = RequestMethod.PUT)
    @PutMapping
    public String update(Guest newGuest){
        System.out.println("到update的执行方法了...");
        service.update(newGuest);
        return "redirect:/guest";
    }
//    @RequestMapping(path = "/guest/delete/{name}",method = RequestMethod.DELETE)
    @DeleteMapping("/{name}")
    public String delete(@PathVariable String name){
        service.delete(name);
        return "redirect:/guest";
    }

}
