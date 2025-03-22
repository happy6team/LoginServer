package com.practice.loginServer.dto;

import com.practice.loginServer.domain.Users;
import lombok.Getter;

@Getter
public class UsersResponse {

    private final Long id;
    private final String userId;
    private final String userName;
    private final String nickname;
    private final String password;
    private final String phoneNumber;

    public UsersResponse(Users users) {
        this.id = users.getId();
        this.userId = users.getUserId();
        this.userName = users.getUserName();
        this.nickname = users.getNickname();
        this.password = users.getPassword();
        this.phoneNumber = users.getPhoneNumber();
    }
}
