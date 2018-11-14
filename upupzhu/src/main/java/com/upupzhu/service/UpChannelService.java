package com.upupzhu.service;

import com.upupzhu.mapper.UpChannelMapper;
import com.upupzhu.pojo.SO.*;
import com.upupzhu.pojo.SO.SClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpChannelService implements UpChannelMapper{

    @Autowired
    private UpChannelMapper upChannelMapper;

    //获取所有分类
    @Override
    public List<SClass> videoClassList() {
        return upChannelMapper.videoClassList();
    }
    //获取分类置顶视频
    @Override
    public List<SVideo> recommendClassVideoList(int classId) {
        return upChannelMapper.recommendClassVideoList(classId);
    }

    //补充分类热门视频
    @Override
    public List<SVideo> supplementClassVideoList(int classId, int quantity) {
        return upChannelMapper.supplementClassVideoList(classId, quantity);
    }

}
