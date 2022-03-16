package com.sontd.bookingpj.api.admin;

import com.sontd.bookingpj.entity.UserEntity;
import com.sontd.bookingpj.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/admin/agencyManagement")
public class AgencyManagementApi {

    @Autowired
    private UserService userService;

    @GetMapping("/getAgency")
    public List<UserEntity> getAgency(){
        List<UserEntity> listAgency= userService.getAgency();
        return listAgency;
    }
}
