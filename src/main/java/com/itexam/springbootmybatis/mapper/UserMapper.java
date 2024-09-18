package com.itexam.springbootmybatis.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.itexam.springbootmybatis.pojo.User;

@Mapper
public interface UserMapper {

    @Select("select * from users where id = #{id}")
    public User findById(Integer id);
    
    @Select("select * from users")
    public User[] getUsers();
    
    @Select("select * from users where id = #{nameOrId} or name = #{nameOrId}")
    public User[] getUsersByNameOrId(String nameOrId);
    
    @Delete("delete from users where id = #{id}")
    public Integer deleteUserById(Integer id);
    
    @Options(keyProperty = "id", useGeneratedKeys = true)
    @Insert("insert into users (id,name,gender,phone,state,create_date,update_date) values(#{id},#{name},#{gender},#{phone},#{state},#{createDate},#{updateDate})")
    public Integer addUser(User user);
    
    @Update("update users set id = #{id},name = #{name},gender = #{gender},phone = #{phone},state = #{state},create_date = #{createDate},update_date = #{updateDate} where id = #{id}")
    public Integer updateUser(User user);

}
