package com.upupzhu.mapper;

import com.upupzhu.pojo.SO.SClass;
import com.upupzhu.pojo.SO.SVideo;
import com.upupzhu.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UpMeMapper {

    //根据设备标识找用户信息
    User swanUser(@Param("swanId")String swanId);

    //根据用户Id找用户信息
    User user(@Param("userId")int userId);

    //新建用户
    int addUser(User user);

}
