package com.practice.loginServer.dto;

import com.practice.loginServer.domain.Users;
import lombok.Getter;

@Getter
public class AddUsersRequest {

    private String userId;
    private String userName;
    private String nickname;
    private String password;
    private String phoneNumber;

    public Users toEntity() {
        return Users.builder()
                .userId(userId)
                .userName(userName)
                .nickname(nickname)
                .password(password)
                .phoneNumber(phoneNumber)
                .build();
    }
}
