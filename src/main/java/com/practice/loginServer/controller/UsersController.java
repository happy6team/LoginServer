package com.practice.loginServer.controller;

import com.practice.loginServer.domain.Users;
import com.practice.loginServer.dto.AddUsersRequest;
import com.practice.loginServer.dto.UpdateUsersRequest;
import com.practice.loginServer.dto.UsersResponse;
import com.practice.loginServer.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UsersController {

    private final UsersService usersService;

    @PostMapping
    public ResponseEntity<UsersResponse> createUsers(@RequestBody AddUsersRequest request) {
        Users users = usersService.create(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new UsersResponse(users));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UsersResponse> findUsers(@PathVariable(name = "userId") String userId) {
        Users users = usersService.findUsers(userId);
        return ResponseEntity.ok()
                .body(new UsersResponse(users));
    }

    @GetMapping("/all")
    public ResponseEntity<List<UsersResponse>> findAllUsers() {
        List<UsersResponse> users = usersService.findAllUsers()
                .stream().map(UsersResponse::new).toList();
        return ResponseEntity.ok()
                .body(users);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteUsers(@PathVariable(name = "userId") String userId) {
        usersService.deleteUsers(userId);
        return ResponseEntity.ok()
                .build();
    }

    @PutMapping("/{userId}")
    public ResponseEntity<UsersResponse> updateUsers(@PathVariable(name = "userId") String userId, @RequestBody UpdateUsersRequest request) {
        Users users = usersService.updateUsers(userId, request);
        return ResponseEntity.ok()
                .body(new UsersResponse(users));
    }
}
