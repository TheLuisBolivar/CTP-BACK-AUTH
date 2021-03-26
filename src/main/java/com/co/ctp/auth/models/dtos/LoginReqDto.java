package com.co.ctp.auth.models.dtos;

import lombok.Data;

@Data
public class LoginReqDto {
    private String username;
    private String password;
}
