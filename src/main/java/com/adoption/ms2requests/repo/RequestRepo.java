package com.adoption.ms2requests.repo;

import com.adoption.ms2requests.model.Request;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface RequestRepo extends JpaRepository<Request, UUID> {
    List<Request> findByUserId(UUID userId);
}

