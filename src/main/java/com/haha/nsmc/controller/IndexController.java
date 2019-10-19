package com.haha.nsmc.controller;

import com.haha.nsmc.config.SysMenu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/menu")
    public SysMenu sysMenu(){
        SysMenu menu = new SysMenu();
        menu.setId("1");
        menu.setName("asdfasdf");
        menu.setPId("1");
        menu.setUrl("asdfsadfasdf");
        System.out.println(menu);
        return menu;
    }
}
