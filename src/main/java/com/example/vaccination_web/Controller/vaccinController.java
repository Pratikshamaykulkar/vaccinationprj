
package com.example.vaccination_web.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.vaccination_web.Modal.User;
import com.example.vaccination_web.Service.vaccineservice;

import java.util.List; 

@Controller
public class vaccinController {


    @Autowired
    vaccineservice demo;

    @GetMapping("/")
    public String showForm(User user) {
        return "form";
    }

    @PostMapping("/submitForm")
    public String submitForm(User user) {
        demo.add(user);
        return "redirect:/welcome";
    }

    @GetMapping("/welcome")
    public String welcomePage(Model model) {
        List<User> userList = demo.show();
        model.addAttribute("data", userList);
        return "Welcome";
    }
}


