package com.example.vaccination_web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vaccination_web.Modal.User;

public interface vaccinerepo extends JpaRepository<User, Integer>{
    
}
