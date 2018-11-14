package com.upupzhu.service;

import com.upupzhu.mapper.UpFindMapper;
import com.upupzhu.pojo.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpFindService implements UpFindMapper{

    @Autowired
    private UpFindMapper upFindMapper;

    //获取点过赞的视频
    @Override
    public List<Video> likeVideo(int userId, int page, int quantity) {
        return upFindMapper.likeVideo(userId,page,quantity);
    }

}
