package com.trading.crypto.controller;

import com.trading.crypto.entity.User;
import com.trading.crypto.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

  @Autowired
  private UserRepository userRepository;

  @PostMapping("/signUp")
  public ResponseEntity<User> register(@RequestBody User user){
    User newUser = new User();
    newUser.setEmail(user.getEmail());
    newUser.setPassword(user.getPassword());
    newUser.setFullName(user.getFullName());
    User savedUser = userRepository.save(newUser);
    return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
  }
}
