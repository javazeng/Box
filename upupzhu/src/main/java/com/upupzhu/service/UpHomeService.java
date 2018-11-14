package com.upupzhu.service;

import com.upupzhu.mapper.UpHomeMapper;
import com.upupzhu.pojo.*;
import com.upupzhu.pojo.SO.SVideo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UpHomeService implements UpHomeMapper {

    @Autowired
    private UpHomeMapper upHomeMapper;

    //添加播放量
    public void udtFrequency(int videoId){
        upHomeMapper.udtFrequency(videoId);
    }

    //获取违禁词
    public String forbiddenWord(){
        return upHomeMapper.forbiddenWord();
    }

    //添加评论
    public boolean  addComments(Comments comments){
        return upHomeMapper.addComments(comments);
    }

    //查询评论
    public List<Comments> commentss(int videoId){
        return upHomeMapper.commentss(videoId);
    }

    //添加点赞
    public boolean addVideoUp(VideoUp videoUp){
        return upHomeMapper.addVideoUp(videoUp);
    }

    //取消点赞
    public boolean dltVideoUp(VideoUp videoUp){
        return upHomeMapper.dltVideoUp(videoUp);
    }

    //点赞数量
    @Override
    public int VideoUps(VideoUp videoUp){
        return upHomeMapper.VideoUps(videoUp);
    }

    //根据id查询视频
    @Override
    public Video singleVideo(int videoId) {
        return upHomeMapper.singleVideo(videoId);
    }

    //首页置顶视频
    @Override
    public List<SVideo> recommendhomeVideo() {
        return upHomeMapper.recommendhomeVideo();
    }

    //补充首页置顶视频
    @Override
    public List<SVideo> supplementhomeVideo(int quantity) {
        return upHomeMapper.supplementhomeVideo(quantity);
    }

    //获取根据Id集合获取需要视频
    @Override
    public List<Video> videos(List list) {
        return upHomeMapper.videos(list);
    }

    // 查询单个分类
    @Override
    public VideoClass singleVideoClass(int classId) {
        return upHomeMapper.singleVideoClass(classId);
    }

    //获取置顶分类
    @Override
    public List<VideoClass> recommendVideoClassList(int page, int quantity) {
        return upHomeMapper.recommendVideoClassList(page, quantity);
    }

    //补充热门分类
    @Override
    public List<VideoClass> supplementVideoClassList(int page, int quantity) {
        return upHomeMapper.supplementVideoClassList(page, quantity);
    }

    //获取分类频道
    @Override
    public List<VideoClassSubentry> videoClassSubentrys(int classId){
        return upHomeMapper.videoClassSubentrys(classId);
    }

    //获取分类置顶视频
    @Override
    public List<SVideo> recommendClassVideoList(int classId) {
        return upHomeMapper.recommendClassVideoList(classId);
    }

    //补充分类热门视频
    @Override
    public List<SVideo> supplementClassVideoList(int classId, int quantity) {
        return upHomeMapper.supplementClassVideoList(classId, quantity);
    }

}
