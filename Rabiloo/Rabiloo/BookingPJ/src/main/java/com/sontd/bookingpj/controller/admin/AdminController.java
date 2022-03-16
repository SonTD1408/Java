package com.sontd.bookingpj.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
    @RequestMapping("admin/home")
    public String adminHomePage(){
        return "admin/home";
    }

    @RequestMapping("admin/agencyManagement")
    public String agencyManagementPage(){return "admin/agencyManagement";}
}
