package com.school.gestionemploye.security;

import com.school.gestionemploye.Entity.User;
import com.school.gestionemploye.Exception.RessourceNotFoundException;
import com.school.gestionemploye.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
//His only job is to loadUser from db
public class UserDetailsService {
    private final UserRepository userRepository;

    public User LoadUserByUserName(String username) {
        return userRepository.findByUsername(username).
                orElseThrow(()->
                        new RessourceNotFoundException("User not found with username : "
                                +username));
    }
}
