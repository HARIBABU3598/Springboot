package com.example.Badminton_Hub.Service;

import com.example.Badminton_Hub.Model.UserModel;
import com.example.Badminton_Hub.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepository;

    public UserModel register(UserModel user) {
        return userRepository.save(user);
    }

    public boolean login(String email, String password) {
        UserModel existingUser = userRepository.findByEmail(email);
        return existingUser != null && existingUser.getPassword().equals(password);
    }

    public UserModel getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
