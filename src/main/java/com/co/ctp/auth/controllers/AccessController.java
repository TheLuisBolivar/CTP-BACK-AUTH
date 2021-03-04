package com.co.ctp.auth.controllers;

import com.co.ctp.auth.models.dtos.LoginReqDto;
import com.co.ctp.auth.services.services.LoginService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping({"/auth/access"})
public class AccessController {

    @Autowired private LoginService loginService;

    @PostMapping({"/login"})
    public ResponseEntity login(@RequestBody LoginReqDto loginReqDto){
        String value = loginService.login(loginReqDto);
        return new ResponseEntity(value, HttpStatus.OK);
    }
}
