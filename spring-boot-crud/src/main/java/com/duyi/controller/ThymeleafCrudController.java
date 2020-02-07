package com.duyi.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.duyi.bean.Guest;
import com.duyi.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.beans.Transient;
import java.util.List;
import java.util.Map;

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
        return "view/index";
    }
//    @RequestMapping(path = "addview")
    @GetMapping("/add")
    public String addview(){
        return "view/addview";
    }
//    @RequestMapping(path = "/guest",method =RequestMethod.POST)


    @Transactional
    @PostMapping
    public String add(Guest guest){
        service.save(guest);
        return "redirect:/guest";
    }


    //    @RequestMapping(path = "/guest/updateview",method = RequestMethod.GET)
    @Transactional
    @GetMapping("/update/{name}")
    public String updateview(Model model, @PathVariable String name) {
        Guest guest = service.getOne(new QueryWrapper<Guest>().eq("name",name));
        model.addAttribute("guest", guest);
        return "view/update";
    }
//    @RequestMapping(path = "/guest/update/name",method = RequestMethod.PUT)
    @PutMapping
    public String update(Guest newGuest){
        System.out.println(newGuest);
        service.update(new UpdateWrapper<Guest>().eq("name",newGuest.getName())
                .set("role",newGuest.getRole()));
        return "redirect:/guest";
    }
//    @RequestMapping(path = "/guest/delete/{name}",method = RequestMethod.DELETE)
    @DeleteMapping("/{name}")
    public String delete(@PathVariable String name){
        service.remove(new QueryWrapper<Guest>().eq("name", name));
        return "redirect:/guest";
    }

}
