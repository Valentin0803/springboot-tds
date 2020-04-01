package com.example.td5.service;

import com.example.td5.dao.UserDAO;
import com.example.td5.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserService(@Qualifier("fakeDao")UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public int addUser(User user){
        return userDAO.insertUser(user);
    }

    public ArrayList<User> getAllUser(){
        return userDAO.selectAllUser();
    }

    public Optional<User> getUserById(UUID id){
        return userDAO.selectUserById(id);
    }

    public int deleteUser(UUID id){
        return userDAO.deleteUserById(id);
    }

    public int updateUser(UUID id, User user){
        return userDAO.updateUserByID(id, user);
    }

}
