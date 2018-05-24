package com.mws.cars.services.impl;

import com.mws.cars.services.LoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public boolean login(String login, String password) {
        return "root".equals(login) && "root".equals(password);
    }
}
