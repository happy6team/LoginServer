package com.practice.loginServer.repository;

import com.practice.loginServer.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
