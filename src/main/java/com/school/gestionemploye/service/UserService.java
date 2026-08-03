package com.school.gestionemploye.service;

import com.school.gestionemploye.Entity.User;

public interface UserService {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
    User findUserById(long id);
}
