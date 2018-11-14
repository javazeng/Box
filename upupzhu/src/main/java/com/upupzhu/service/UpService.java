package com.upupzhu.service;

import com.upupzhu.pojo.SO.SClass;
import com.upupzhu.pojo.SO.SVideo;
import com.upupzhu.pojo.SO.Subentry;
import com.upupzhu.pojo.SO.UpHome;
import com.upupzhu.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UpService {
    @Autowired
    private UpHomeService upHomeService;
    @Autowired
    private UpChannelService upChannelService;
    @Autowired
    private UpFindService upFindService;
    @Autowired
    private UpMeService upmeService;

    //获取用户
    public User getUser(User user){
        User u = upmeService.swanUser(user.getSwanId());
        if(u!=null){
            return u;
        }else{
            int userId = upmeService.addUser(user);
            return upmeService.user(userId);
        }
    }

    //添加播放量
    public void udtFrequency(int videoId){
        upHomeService.udtFrequency(videoId);
    }

    //获取违禁词
    public String forbiddenWord(){
        return upHomeService.forbiddenWord();
    }

    //保存并返回新的评论集合
    public List<Comments> addComments(Comments comments){
        boolean bl = upHomeService.addComments(comments);
        if(bl){
            return upHomeService.commentss((int)comments.getVideoId());
        }else{
            return null;
        }
    }

    //添加点赞
    public int addVideoUp(VideoUp videoUp){
        upHomeService.addVideoUp(videoUp);
        return upHomeService.VideoUps(videoUp);
    }

    //取消点赞
    public int dltVideoUp(VideoUp videoUp){
        upHomeService.dltVideoUp(videoUp);
        return upHomeService.VideoUps(videoUp);
    }

    //根据id查询视频
    public Video singleVideo(int videoId) {
        return upHomeService.singleVideo(videoId);
    }

    //获取置顶分类Id ××条 未满时填充热门分类 根据需求更改 用于首页
    public List<VideoClass> videoClassList1() {
        List<VideoClass> videoClasslist = upHomeService.recommendVideoClassList(0,4);
        if (videoClasslist.size() < 4) {
            videoClasslist.addAll(upHomeService.supplementVideoClassList(0,4 - videoClasslist.size()));
        }
        return videoClasslist;
    }

    //获取首页置顶视频集合
    public List<UpHome> homeVideoClassList() {
        //首页精简集合
        List<UpHome> uhlist = new ArrayList();
        List<SVideo> lvs1 = upHomeService.recommendhomeVideo();
        if (lvs1.size() < 4) {
            lvs1.addAll(upHomeService.supplementhomeVideo(4-lvs1.size()));
        }
        UpHome uhr = new UpHome(0,"置顶热门",lvs1);
        uhlist.add(uhr);
        //分类集合
        List<VideoClass> videoClassList = videoClassList1();
        //查询分类置顶视频
        for (VideoClass obj : videoClassList) {
            List<SVideo> lvs2 = upHomeService.recommendClassVideoList((int) obj.getClassId());
            if (lvs2.size() < 4) {
                lvs2.addAll(upHomeService.supplementClassVideoList((int) obj.getClassId(), 4 - lvs2.size()));
            }
            UpHome uhs = new UpHome((int)obj.getClassId(),obj.getClassName(),lvs2);
            uhlist.add(uhs);
        }
        return uhlist;
    }

    //获取分类频道视频集合
    public List<SClass> channelVideoClassList() {
        //分类精简集合
        List<SClass> videoClassList = upChannelService.videoClassList();
        for (SClass c:videoClassList
             ) {
            List<SVideo> lvs = upChannelService.recommendClassVideoList((int)c.getClassId());
            if (lvs.size() < 4) {
                lvs.addAll(upChannelService.supplementClassVideoList((int) c.getClassId(), 4 - lvs.size()));
            }
            Subentry s = new Subentry();
            s.setSubentryId(0);
            s.setSubentryName("热播精选");
            s.setVideos(lvs);
            List<Subentry> ls = c.getSubentrys();
            ls.add(0,s);
            c.setSubentrys(ls);
        }
        return videoClassList;
    }

    //点过赞的视频
    public List<Video> likeVideo(int userId, int page, int quantity){
        return upFindService.likeVideo(userId,page,quantity);
    }


}
