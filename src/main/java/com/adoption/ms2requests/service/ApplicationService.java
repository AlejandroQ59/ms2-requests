package com.adoption.ms2requests.service;

import com.adoption.ms2requests.dto.ApplicationView;
import com.adoption.ms2requests.model.Request;
import com.adoption.ms2requests.repo.RequestRepo;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ApplicationService {
    private final RequestRepo requests;
    public ApplicationService(RequestRepo requests){ this.requests = requests; }

    public List<ApplicationView> listByUser(UUID userId){
        return requests.findByUserId(userId).stream().map(this::map).collect(Collectors.toList());
    }

    public Optional<ApplicationView> detail(UUID userId, UUID applicationId){
        return requests.findById(applicationId)
                .filter(r -> r.getUserId().equals(userId))
                .map(this::map);
    }

    private ApplicationView map(Request r){
        return new ApplicationView(
                r.getId(), r.getUserId(), r.getPetId(), r.getRequestDate(),
                r.getStatus(), r.getStatusDate(), r.getMessage()
        );
    }
}
