package com.lostfound.lost_found.service;

import com.lostfound.lost_found.common.Msg;

import com.lostfound.lost_found.dao.UserMapper;
import com.lostfound.lost_found.pojo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class UserService {

@Autowired
    UserMapper userMapper ;


public Msg login(Integer userId, String password){

    int i = userMapper.checkUserId(userId);
    System.out.println(i);

//检查用户名是否存在
    if (i == 0){
     return Msg.fail() ;
  }

    User user = userMapper.selectLogin(userId, password);

    if (user == null){
        System.out.println(false);

        return  Msg.fail() ;

    }

    System.out.println("success");
    return  Msg.success().add("user",user) ;
}

private int createUserId()
{
    int i = 0;
    for (int a = 0; a < 7; a++)
    {
        i = i * 10 + new Random().nextInt(10);
    }
    int isOk = userMapper.checkUserId(i);
    if (isOk > 0)
        return createUserId();
    else
        return i;
}

public boolean register(User user){

    int userId = createUserId();
    user.setUserId(userId);
//这个表示插入生效的行数
    userMapper.insertSelective(user);


    return true;
}

public  Msg update_information(User user){



  userMapper.updateByPrimaryKeySelective(user);


       return Msg.success().add("user",user);


}





public int insert(User user){


    return  userMapper.insert(user);


}

public  User getUserById(int id){


    User user = userMapper.selectByPrimaryKey(id);


    return user;


}





}
