package com.itexam.springbootmybatis.service;

import com.itexam.springbootmybatis.pojo.User;

public interface UserService {

    public User findById(Integer id);
    public User[] getUsers();
    public User[] getUsersByNameOrId(String nameOrId);
    public Integer deleteUserById(Integer id);
    public Integer addUser(User user);
    public Integer updateUser(User user);
}
