package com.school.gestionemploye.serviceImpl;

import com.school.gestionemploye.Entity.User;
import com.school.gestionemploye.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Override
    public void addUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public User findUserById(long id) {
        return null;
    }
}
