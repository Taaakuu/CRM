package com.itexam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itexam.springbootmybatis.pojo.User;
import com.itexam.springbootmybatis.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/findById")
    public User findById(Integer id){
      return userService.findById(id);
    }
    
    @GetMapping("/getUsers")
    public User[] getUsers(){
      return userService.getUsers();
    }
    
    @GetMapping("/getUsersByNameOrId")
    public User[] getUsersByNameOrId(String nameOrId){
      return userService.getUsersByNameOrId(nameOrId);
    }
    
    @CrossOrigin
    @DeleteMapping("/delUserById/{id}")
    public Integer delUserById(@PathVariable("id") Integer id ){

      return userService.deleteUserById(id);
    }
    
    @PostMapping("/addUser")
    public Integer addUser(@RequestBody String body ){
    	System.out.println(body);
    	
    	ObjectMapper objectMapper = new ObjectMapper();
    	//jsonからUserへ変換
    	User user = null;
		try {
			user = objectMapper.readValue(body, User.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
    	System.out.println(user);

    	return userService.addUser(user);
    }
    
    @PutMapping("/updateUser")
    public Integer updateUser(@RequestBody String body){
    	System.out.println(body);
    	
    	ObjectMapper objectMapper = new ObjectMapper();
    	//jsonからUserへ変換
    	User user = null;
		try {
			user = objectMapper.readValue(body, User.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
    	System.out.println(user);

    	return userService.updateUser(user);
    }


}
