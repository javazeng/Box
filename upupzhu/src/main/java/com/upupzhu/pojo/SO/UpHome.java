package com.upupzhu.pojo.SO;

import com.upupzhu.pojo.Video;

import java.util.List;

public class UpHome {
    private int classId;
    private String className;
    private List<SVideo> videos;

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

    public List<SVideo> getVideos() {
        return videos;
    }

    public void setVideos(List<SVideo> videos) {
        this.videos = videos;
    }

    public UpHome(int classId, String className, List<SVideo> videos) {
        this.classId = classId;
        this.className = className;
        this.videos = videos;
    }
}
