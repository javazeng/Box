package com.upupzhu.pojo;


import com.upupzhu.pojo.Comments;
import com.upupzhu.pojo.VideoUp;

import java.util.List;

public class Video {

  private long videoId;
  private String videoUrl;
  private String videoTitle;
  private String videoBlurb;
  private String videoCover;
  private String videoDuration;
  private String promulgateTime;
  private long frequency;
  private long subentryId;
  private long userId;
  private User user;
  private List<VideoUp> videoUps;
  private List<Comments> commentss;

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public List<Comments> getCommentss() {
    return commentss;
  }

  public void setCommentss(List<Comments> commentss) {
    this.commentss = commentss;
  }

  public List<VideoUp> getVideoUps() {
    return videoUps;
  }

  public void setVideoUps(List<VideoUp> videoUps) {
    this.videoUps = videoUps;
  }

  public long getVideoId() {
    return videoId;
  }

  public void setVideoId(long videoId) {
    this.videoId = videoId;
  }


  public String getVideoUrl() {
    return videoUrl;
  }

  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }


  public String getVideoTitle() {
    return videoTitle;
  }

  public void setVideoTitle(String videoTitle) {
    this.videoTitle = videoTitle;
  }


  public String getVideoBlurb() {
    return videoBlurb;
  }

  public void setVideoBlurb(String videoBlurb) {
    this.videoBlurb = videoBlurb;
  }


  public String getVideoCover() {
    return videoCover;
  }

  public void setVideoCover(String videoCover) {
    this.videoCover = videoCover;
  }

  public String getVideoDuration() {
    return videoDuration;
  }

  public void setVideoDuration(String videoDuration) {
    this.videoDuration = videoDuration;
  }

  public String getPromulgateTime() {
    return promulgateTime;
  }

  public void setPromulgateTime(String promulgateTime) {
    this.promulgateTime = promulgateTime;
  }


  public long getFrequency() {
    return frequency;
  }

  public void setFrequency(long frequency) {
    this.frequency = frequency;
  }


  public long getSubentryId() {
    return subentryId;
  }

  public void setSubentryId(long subentryId) {
    this.subentryId = subentryId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

}
