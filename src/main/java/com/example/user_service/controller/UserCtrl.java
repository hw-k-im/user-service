package com.example.user_service.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/users")
public class UserCtrl {

  @GetMapping
  public String test() {
    return "hello!!";
  }
  
}
