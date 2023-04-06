package com.examenes.services;

import com.examenes.model.User;
import com.examenes.model.UserRole;

import java.util.Set;

public interface UserService {

    /*
    method: User
    name: saveUser
    param: User user
    set: set to assign to user
     */
    public User saveUser (User user, Set<UserRole> userRoles) throws Exception;
    public User getUser (String username) throws Exception;
    public void deleteUser(Long userId);
}
