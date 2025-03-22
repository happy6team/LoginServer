package com.practice.loginServer.service;

import com.practice.loginServer.domain.Users;
import com.practice.loginServer.dto.AddUsersRequest;
import com.practice.loginServer.repository.UsersRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@RequiredArgsConstructor
@Service
public class UsersService {

    private final UsersRepository usersRepository;

    public Users create(AddUsersRequest request) {
        return usersRepository.save(request.toEntity());
    }

    public Users findUsers(String userId) {
        return usersRepository.findByUserId(userId);
    }

    public List<Users> findAllUsers() {
        return usersRepository.findAll();
    }

    public void deleteUsers(String userId) {
        usersRepository.deleteByUserId(userId);
    }
}
