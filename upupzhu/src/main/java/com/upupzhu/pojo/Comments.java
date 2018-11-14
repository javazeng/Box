package com.upupzhu.pojo;

public class Comments {

  private long commentsId;
  private String commentsText;
  private String commentsTime;
  private long videoId;
  private long userId;
  private User user;

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public long getCommentsId() {
    return commentsId;
  }

  public void setCommentsId(long commentsId) {
    this.commentsId = commentsId;
  }


  public String getCommentsText() {
    return commentsText;
  }

  public void setCommentsText(String commentsText) {
    this.commentsText = commentsText;
  }


  public String getCommentsTime() {
    return commentsTime;
  }

  public void setCommentsTime(String commentsTime) {
    this.commentsTime = commentsTime;
  }


  public long getVideoId() {
    return videoId;
  }

  public void setVideoId(long videoId) {
    this.videoId = videoId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

}
