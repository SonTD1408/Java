package com.sontd.bookingpj.service.user;

import com.sontd.bookingpj.entity.UserEntity;
import com.sontd.bookingpj.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserEntity checkLogin(String userName, String password){
        UserEntity user = userRepository.getUserByUserNameAndPassword(userName, password);
        return user;
    }

    public void saveAgencyRegister(String company,
                                  String email,
                                  String phone,
                                  String user,
                                  String pass,
                                  String address){
        UserEntity userAgencyRegister = new UserEntity();
        userAgencyRegister.setCompanyName(company);
        userAgencyRegister.setEmail(email);
        userAgencyRegister.setPhone(phone);
        userAgencyRegister.setUserName(user);
        userAgencyRegister.setPassword(pass);
        userAgencyRegister.setAddress(address);
        userAgencyRegister.setStatus(0);
        userAgencyRegister.setRole(2);

        userAgencyRegister = userRepository.save(userAgencyRegister);
    }

    public List<UserEntity> getAgency(){
        List<UserEntity> listAgency = userRepository.getAgency();
        return listAgency;
    }
}
