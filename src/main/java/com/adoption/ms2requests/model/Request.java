package com.adoption.ms2requests.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "`request`", indexes = {
        @Index(name = "idx_request_date", columnList = "requestDate")
})
public class Request {

    @Id
    private UUID id = UUID.randomUUID();

    @Column(nullable = false) private UUID userId;  // FK lógica a user.id/pet.id?
    @Column(nullable = false) private UUID petId;

    @CreationTimestamp
    @Column(nullable = false)
    private Instant requestDate;

    @Column(nullable = false)
    private String status = "pending"; // pending | approved | rejected

    @UpdateTimestamp
    private Instant statusDate;

    @Column(columnDefinition = "TEXT")
    private String message = "Your request is being processed.";

    public Request() {}

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public UUID getUserId() { return userId; }
    public void setUserId(UUID userId) { this.userId = userId; }
    public UUID getPetId() { return petId; }
    public void setPetId(UUID petId) { this.petId = petId; }
    public Instant getRequestDate() { return requestDate; }
    public void setRequestDate(Instant requestDate) { this.requestDate = requestDate; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public Instant getStatusDate() { return statusDate; }
    public void setStatusDate(Instant statusDate) { this.statusDate = statusDate; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}

