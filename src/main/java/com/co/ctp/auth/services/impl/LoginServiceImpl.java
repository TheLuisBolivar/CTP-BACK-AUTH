package com.co.ctp.auth.services.impl;

import com.co.ctp.auth.models.dtos.LoginReqDto;
import com.co.ctp.auth.services.services.LoginService;
import com.co.ctp.auth.utils.app.ParseUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public String login(LoginReqDto loginReqDto) {
        log.info("[login]: start to do login: {}", ParseUtil.objectLog(loginReqDto));
        return "Starting Login";
    }
}
