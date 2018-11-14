package com.upupzhu.service;


import com.upupzhu.mapper.UpMeMapper;
import com.upupzhu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpMeService implements UpMeMapper {

    @Autowired
    private UpMeMapper upMeMapper;

    //根据设备标识找用户信息
    @Override
    public User swanUser(String swanId) {
        return upMeMapper.swanUser(swanId);
    }

    //根据用户Id找用户信息
    @Override
    public User user(int userId) {
        return upMeMapper.user(userId);
    }

    //新建用户
    public int addUser(User user){
        return upMeMapper.addUser(user);
    }

}
