package com.itexam.springbootmybatis.service.impl;

import com.itexam.springbootmybatis.mapper.UserMapper;
import com.itexam.springbootmybatis.pojo.User;
import com.itexam.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

	@Override
	public User[] getUsers() {
		return userMapper.getUsers();
	}

	@Override
	public User[] getUsersByNameOrId(String nameOrId) {
		return userMapper.getUsersByNameOrId(nameOrId);
	}

	@Override
	public Integer deleteUserById(Integer id) {
		return userMapper.deleteUserById(id);
	}

	@Override
	public Integer addUser(User user) {
		return userMapper.addUser(user);
	}

	@Override
	public Integer updateUser(User user) {
		return userMapper.updateUser(user);
	}
}
