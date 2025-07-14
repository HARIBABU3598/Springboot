package com.example.Badminton_Hub.Controller;

import com.example.Badminton_Hub.Model.UserModel;
import com.example.Badminton_Hub.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestBody UserModel user) {
        UserModel newUser = userService.register(user);
        return "User registered with ID: " + newUser.getId();
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody UserModel user) {
        boolean isAuthenticated = userService.login(user.getEmail(), user.getPassword());
        return isAuthenticated ? "Login successful" : "Invalid email or password";
    }
}
