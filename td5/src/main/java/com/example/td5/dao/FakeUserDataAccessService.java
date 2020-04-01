package com.example.td5.dao;

import com.example.td5.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakeUserDataAccessService implements UserDAO{

    private static ArrayList<User> DB = new ArrayList<>();

    @Override
    public int insertUser(UUID id, User user) {
        DB.add(new User(id, user.getLogin(), user.getPassword(), user.getEmail(),user.getIdentity()));
        return 1;
    }

    @Override
    public ArrayList<User> selectAllUser() {
        return DB;
    }

    @Override
    public Optional<User> selectUserById(UUID id) {
        return DB.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    @Override
    public int deleteUserById(UUID id) {
        Optional<User> users = selectUserById(id);
        if(users.isEmpty()){
            return 0;
        }else {
         DB.remove(users.get());
        }
        return 1;
    }

    @Override
    public int updateUserByID(UUID id, User userUpdate) {
        return selectUserById(id).map(u -> {
            int indexOfUserToUpdate = DB.indexOf(u);
            if (indexOfUserToUpdate >= 0){
                DB.set(indexOfUserToUpdate, new User(id,userUpdate.getLogin(), userUpdate.getPassword(), userUpdate.getEmail(), userUpdate.getIdentity()));
                return 1;
            }
            return 0;
        }).orElse(0);
    }
}
