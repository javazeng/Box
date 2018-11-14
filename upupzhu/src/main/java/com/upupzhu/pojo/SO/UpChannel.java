package com.upupzhu.pojo.SO;

import com.upupzhu.pojo.VideoClassSubentry;

import java.util.List;

public class UpChannel {
    private int classId;
    private String className;
    private List<VideoClassSubentry> videoClassSubentrys;

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<VideoClassSubentry> getVideoClassSubentrys() {
        return videoClassSubentrys;
    }

    public void setVideoClassSubentrys(List<VideoClassSubentry> videoClassSubentrys) {
        this.videoClassSubentrys = videoClassSubentrys;
    }
}
