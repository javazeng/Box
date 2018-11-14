package com.upupzhu.pojo.SO;

import java.util.List;

public class Subentry {
    private long subentryId;
    private String subentryName;
    private List<SVideo> videos;

    public long getSubentryId() {
        return subentryId;
    }

    public void setSubentryId(long subentryId) {
        this.subentryId = subentryId;
    }

    public String getSubentryName() {
        return subentryName;
    }

    public void setSubentryName(String subentryName) {
        this.subentryName = subentryName;
    }

    public List<SVideo> getVideos() {
        return videos;
    }

    public void setVideos(List<SVideo> videos) {
        this.videos = videos;
    }
}
