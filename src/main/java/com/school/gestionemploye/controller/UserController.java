package com.school.gestionemploye.controller;


import com.school.gestionemploye.dto.request.UserRequest;
import com.school.gestionemploye.dto.response.UserResponse;
import com.school.gestionemploye.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService ;

    @PostMapping
    public ResponseEntity<UserResponse> create(@Valid @RequestBody  UserRequest userRequest){
        return ResponseEntity.ok().body(userService.createUser(userRequest));
    }
    @GetMapping
    public ResponseEntity<List<UserResponse>> findAll(){
        return ResponseEntity.ok().body(userService.getAllUsers());
    }
}
