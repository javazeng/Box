package com.upupzhu.mapper;

import com.upupzhu.pojo.*;
import com.upupzhu.pojo.SO.SVideo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UpHomeMapper {

    //添加播放量
    void udtFrequency(@Param("videoId")int videoId);

    //违禁词
    String forbiddenWord();

    //添加评论
    boolean  addComments(Comments comments);

    //查询评论
    List<Comments> commentss(@Param("videoId")int videoId);

    //添加点赞
    boolean addVideoUp(VideoUp videoUp);

    //取消点赞
    boolean dltVideoUp(VideoUp videoUp);

    //点赞数量
    int VideoUps(VideoUp videoUp);

    //根据id查询视频
    Video singleVideo(@Param("videoId")int videoId);

    //推荐首页置顶视频
    List<SVideo> recommendhomeVideo();

    //补充首页置顶视频
    List<SVideo> supplementhomeVideo(@Param("quantity")int quantity);

    //获取分类推荐视频
    List<SVideo> recommendClassVideoList(@Param("classId")int classId);

    //补充分类推荐视频
    List<SVideo> supplementClassVideoList(@Param("classId")int classId,@Param("quantity")int quantity);

    //获取分类频道
    List<VideoClassSubentry> videoClassSubentrys(@Param("classId")int classId);

    //获取推荐分类
    List<VideoClass> recommendVideoClassList(@Param("page")int page,@Param("quantity")int quantity);

    //补充热门分类
    List<VideoClass> supplementVideoClassList(@Param("page")int page,@Param("quantity")int quantity);

    // 查询单个分类
    VideoClass singleVideoClass(@Param("classId")int classId);

    //获取根据Id集合获取需要视频
    List<Video> videos(List list);

}
