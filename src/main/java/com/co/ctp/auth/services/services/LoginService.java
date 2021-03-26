package com.co.ctp.auth.services.services;

import com.co.ctp.auth.models.dtos.LoginReqDto;

public interface LoginService {
    String login(LoginReqDto loginReqDto);
}
