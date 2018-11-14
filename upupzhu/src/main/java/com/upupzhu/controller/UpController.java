package com.upupzhu.controller;

import com.upupzhu.pojo.SO.SClass;
import com.upupzhu.pojo.*;
import com.upupzhu.pojo.SO.UpHome;
import com.upupzhu.service.UpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/UpController")
public class UpController {

    @Autowired
    private UpService service;

    //say hi
    @RequestMapping(value = "/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }

    //获取用户
    @RequestMapping(value = "/getUser")
    public User getUser(String swanId, String nickName, int userGender, String userPic){
        User user = new User();
        user.setSwanId(swanId);
        user.setUserName(nickName);
        user.setUserGender(userGender);
        user.setUserPic(userPic);
        return service.getUser(user);
    }

    //视频信息
    @RequestMapping(value = "/singleVideo")
    public Video singleVideo(@RequestParam(value = "videoId", required = true) Integer videoId) {
        System.out.print("进入视频");
        return service.singleVideo(videoId);
    }

    //首页展示的分类及封面
    @RequestMapping(value = "/homeVideoClassList")
    public List<UpHome> homeVideoClassList() {
        System.out.print("进入首页");
        return service.homeVideoClassList();
    }

    //分类展示频道的及封面
    @RequestMapping(value = "/channelVideoClassList")
    public List<SClass> channelVideoClassList() {
        System.out.print("分类展示频道及封面");
        return service.channelVideoClassList();
    }

    //违禁词
    @RequestMapping(value = "/forbiddenWord")
    public String forbiddenWord() {
        System.out.print("载入违禁词");
        return service.forbiddenWord();
    }

    //添加点赞
    //} ---------------------------------------------------待优化
    @RequestMapping(value = "/addVideoUp")
    public int addVideoUp(int videoId, int userId) {
        System.out.print("视频点赞");
        VideoUp videoUp = new VideoUp();
        videoUp.setVideoId(videoId);
        videoUp.setUserId(userId);
        return service.addVideoUp(videoUp);
    }

    //取消点赞 ----------------------------------------------待优化
    @RequestMapping(value = "/dltVideoUp")
    public int dltVideoUp(int videoId, int userId) {
        System.out.print("视频取消点赞");
        VideoUp videoUp = new VideoUp();
        videoUp.setVideoId(videoId);
        videoUp.setUserId(userId);
        return service.dltVideoUp(videoUp);
    }

    //保存并返回新的评论集合 ----------------------------------------------待优化
    @RequestMapping(value = "/addComments")
    public List<Comments> addComments(String commentsText, String commentsTime, int videoId, int userId) {
        System.out.print("评论事件");
        System.out.print(commentsText + "-----" + commentsTime + "-----" + videoId + "-----" + userId + "\n");
        Comments comments = new Comments();
        comments.setCommentsText(commentsText);
        comments.setCommentsTime(commentsTime);
        comments.setVideoId(videoId);
        comments.setUserId(userId);
        return service.addComments(comments);
    }

    //添加播放量
    @RequestMapping(value = "/udtFrequency")
    public void udtFrequency(@RequestParam(value = "videoId", required = true) int videoId) {
        System.out.print("播放量+1");
        service.udtFrequency(videoId);
    }

    //点过赞的视频
    @RequestMapping(value = "/likeVideo")
    public List<Video> likeVideo(int userId, int page, int quantity) {
        System.out.print("加载点赞视频");
        return service.likeVideo(userId, page, quantity);
    }
}
