
package com.example.vaccination_web.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vaccination_web.Modal.User;
import com.example.vaccination_web.Repository.vaccinerepo;

@Service 
public class vaccineservice {

    @Autowired
    vaccinerepo repo;

    public void add(User user) {
        repo.save(user);
    }

    public List<User> show() {
        return repo.findAll();
    }

}
