package com.adoption.ms2requests.repo;

import com.adoption.ms2requests.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepo extends JpaRepository<User, UUID> {
}

