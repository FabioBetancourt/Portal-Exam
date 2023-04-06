package com.examenes.controller;

import com.examenes.model.Role;
import com.examenes.model.User;
import com.examenes.model.UserRole;
import com.examenes.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public User saveUser(@RequestBody User user) throws Exception {
        user.setProfile("default.png");
        Set<UserRole> userRoles = new HashSet<>();

        Role role = new Role();
        role.setRolId(2L);
        role.setName("NORMAL");

        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);
        userRoles.add(userRole);

        return userService.saveUser(user, userRoles);
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username) throws Exception {
        return userService.getUser(username);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId) throws Exception{
        userService.deleteUser(userId);
    }
}
