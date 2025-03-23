package com.practice.loginServer.service;

import com.practice.loginServer.domain.Users;
import com.practice.loginServer.dto.AddUsersRequest;
import com.practice.loginServer.dto.UpdateUsersRequest;
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
        return findByUserId(userId);
    }

    public List<Users> findAllUsers() {
        return usersRepository.findAll();
    }

    public void deleteUsers(String userId) {
        usersRepository.deleteByUserId(userId);
    }

    public Users updateUsers(String userId, UpdateUsersRequest request) {
        Users users = findByUserId(userId);
        users.update(
                request.getUserName(),
                request.getNickname(),
                request.getPassword(),
                request.getPhoneNumber()
        );
        return users;
    }

    public Boolean loginUsers(String userId, String password) {
        Users users = findByUserId(userId);
        return users.getPassword().equals(password.trim());
    }

    public Users findByUserId(String userId) throws IllegalArgumentException {
        Users users = usersRepository.findByUserId(userId);
        if (users == null) {
            throw new IllegalArgumentException("USER NOT FOUND");
        }
        return users;
    }
}
