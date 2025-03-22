package com.practice.loginServer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UpdateUsersRequest {
    private String userName;
    private String nickname;
    private String password;
    private String phoneNumber;
}
