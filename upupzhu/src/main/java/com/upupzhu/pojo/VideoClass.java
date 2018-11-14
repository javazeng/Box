package com.upupzhu.pojo;


import java.util.List;

public class VideoClass {

  private long classId;
  private String className;
  private long classRanking;
  private long classSwitch;
  private List<VideoClassSubentry> videoClassSubentrys;

  public List<VideoClassSubentry> getVideoClassSubentrys() {
    return videoClassSubentrys;
  }

  public void setVideoClassSubentrys(List<VideoClassSubentry> videoClassSubentrys) {
    this.videoClassSubentrys = videoClassSubentrys;
  }

  public long getClassId() {
    return classId;
  }

  public void setClassId(long classId) {
    this.classId = classId;
  }


  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }


  public long getClassRanking() {
    return classRanking;
  }

  public void setClassRanking(long classRanking) {
    this.classRanking = classRanking;
  }


  public long getClassSwitch() {
    return classSwitch;
  }

  public void setClassSwitch(long classSwitch) {
    this.classSwitch = classSwitch;
  }

}
