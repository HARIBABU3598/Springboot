package com.example.Badminton_Hub.Repository;

import com.example.Badminton_Hub.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserModel, Long> {
    UserModel findByEmail(String email);
}
