package com.school.gestionemploye.service;


import com.school.gestionemploye.Entity.User;
import com.school.gestionemploye.Exception.RessourceNotFoundException;
import com.school.gestionemploye.Mapper.UserMapper;
import com.school.gestionemploye.dto.request.UserRequest;
import com.school.gestionemploye.dto.response.UserResponse;
import com.school.gestionemploye.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService  {

    private  final UserRepository userRepository;
    private  final UserMapper userMapper;

    public UserResponse createUser(UserRequest userRequest) {
        User user = userMapper.toEntity(userRequest);
        User result = userRepository.save(user);
        return userMapper.toResponse(result) ;

    }
    public UserResponse getUserById(Long id) {
        User user = userRepository.findById(id).
                orElseThrow(()->new RessourceNotFoundException("User not found with id : "+id));
        return userMapper.toResponse(user);
    }
    public List<UserResponse> getAllUsers() {
        return userRepository.findAll().
                stream()
                .map(userMapper::toResponse)
                .toList();
    }
    public UserResponse updateUser(UserRequest userRequest ,Long id){
        User user = userRepository.findById(id).
                orElseThrow(()->new RessourceNotFoundException("user Not found with id : "+ id ));
        userMapper.update(userRequest ,user);
        return userMapper.toResponse(user) ;

    }
    public  void deleteUser(Long id){
        User user = userRepository.findById(id).
                orElseThrow(()-> new RessourceNotFoundException("user Not found with id : "+id));
        userRepository.deleteById(id);
    }



}
