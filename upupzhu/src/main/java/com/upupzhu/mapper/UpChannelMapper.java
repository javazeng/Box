package com.upupzhu.mapper;

import com.upupzhu.pojo.SO.SClass;
import com.upupzhu.pojo.SO.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UpChannelMapper {

    //获取所有分类
    List<SClass> videoClassList();

    //获取分类置顶视频
    List<SVideo> recommendClassVideoList(@Param("classId")int classId);

    //补充分类置顶视频
    List<SVideo> supplementClassVideoList(@Param("classId")int classId, @Param("quantity")int quantity);

}
