package com.example.td5.dao;

import com.example.td5.model.User;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

public interface UserDAO {

    int insertUser(UUID id, User user);

    default int insertUser(User user){
        UUID id = UUID.randomUUID();
        return insertUser(id, user);
    }

    ArrayList<User> selectAllUser();

    Optional<User> selectUserById(UUID id);

    int deleteUserById(UUID id);

    int updateUserByID(UUID id, User user);


}
