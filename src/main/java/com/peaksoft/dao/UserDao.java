package com.peaksoft.dao;

import com.peaksoft.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User User);

    List<User> listUsers();
    void deleteById(int id);

    User getUserById(int id);
    void update(int id, User user);

}
