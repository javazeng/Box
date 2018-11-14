package com.upupzhu.mapper;

import com.upupzhu.pojo.Video;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UpFindMapper {

    //获取点过赞的视频
    List<Video> likeVideo( @Param("userId") int userId, @Param("page")int page, @Param("quantity")int quantity);

}
