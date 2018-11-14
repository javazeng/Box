package com.upupzhu.pojo;


public class User {

  private long userId;
  private String userName;
  private int userGender;
  private int userAge;
  private String userPic;
  private String userSignature;
  private String swanId;
  private String nickName;

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public int getUserGender() {
    return userGender;
  }

  public void setUserGender(int userGender) {
    this.userGender = userGender;
  }

  public int getUserAge() {
    return userAge;
  }

  public void setUserAge(int userAge) {
    this.userAge = userAge;
  }

  public String getUserPic() {
    return userPic;
  }

  public void setUserPic(String userPic) {
    this.userPic = userPic;
  }

  public String getUserSignature() {
    return userSignature;
  }

  public void setUserSignature(String userSignature) {
    this.userSignature = userSignature;
  }

  public String getSwanId() {
    return swanId;
  }

  public void setSwanId(String swanId) {
    this.swanId = swanId;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }
}
