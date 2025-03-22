package com.practice.loginServer.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String userId;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false, unique = true)
    private String nickname;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String phoneNumber;

    @Builder
    public Users(String userId, String userName, String nickname, String password, String phoneNumber) {
        this.userId = userId;
        this.userName = userName;
        this.nickname = nickname;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public void update(String userName, String nickname, String password, String phoneNumber) {
        this.userName = userName;
        this.nickname = nickname;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }
}
