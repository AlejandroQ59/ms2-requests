package com.adoption.ms2requests.model;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "`user`")
public class User {

    @Id
    private UUID id = UUID.randomUUID();

    @Column(nullable = false) private String name;
    @Column(nullable = false) private Integer age;
    @Column(nullable = false) private String phone;
    @Column(nullable = false) private String city;
    @Column(nullable = false, unique = true) private String email;
    @Column(nullable = false) private String password;

    public User() {}

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}

