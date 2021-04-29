package com.cyberlyticssystems.app.ws.ui.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users") //https:localhost:8080/users
public class usercontroller {
   @GetMapping
   public String getuser()
    {
        return "get user was called";
    }
    @PostMapping
    public String createuser()
    {
        return "create user was called";
    }
    @PutMapping
    public String updateuser()
    {
        return "update user was called";
    }
    @DeleteMapping
    public String deleteuser()
    {
        return "delete user was called";
    }
}
