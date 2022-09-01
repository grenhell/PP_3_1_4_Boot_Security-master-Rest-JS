package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {


    List<User> findAll();

    User findById(Long id);

    Role findRoleById(Long i);

    boolean save(User user);

    boolean updateById(User user, Long id);

    boolean delete(Long id);

    List<Role> getAllRoles();

    User findByEmail(String username);
}
