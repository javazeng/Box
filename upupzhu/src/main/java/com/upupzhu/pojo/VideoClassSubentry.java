package com.upupzhu.pojo;


import java.util.List;

public class VideoClassSubentry {

  private long subentryId;
  private String subentryName;
  private long subentryRanking;
  private long subentrySwitch;
  private long classId;
  private List<Video> videos;

  public List<Video> getVideos() {
    return videos;
  }

  public void setVideos(List<Video> videos) {
    this.videos = videos;
  }

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


  public long getSubentryRanking() {
    return subentryRanking;
  }

  public void setSubentryRanking(long subentryRanking) {
    this.subentryRanking = subentryRanking;
  }


  public long getSubentrySwitch() {
    return subentrySwitch;
  }

  public void setSubentrySwitch(long subentrySwitch) {
    this.subentrySwitch = subentrySwitch;
  }


  public long getClassId() {
    return classId;
  }

  public void setClassId(long classId) {
    this.classId = classId;
  }

}
