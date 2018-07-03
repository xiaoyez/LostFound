package com.lostfound.lost_found.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.lostfound.lost_found.pojo.User;
import com.lostfound.lost_found.pojo.UserExample;
import org.springframework.stereotype.Component;

@Mapper
public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);


    int checkUserId(Integer userId);

    User selectLogin(@Param("userId") Integer userId,@Param("password") String password);

    int checkEmail(String email);









}