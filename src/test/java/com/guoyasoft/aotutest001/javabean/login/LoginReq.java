package com.guoyasoft.aotutest001.javabean.login;

/**
 * @program: aotu-test001
 * @description:
 * @author: Administrator
 * @create: 2018-11-10 14:59
 **/
public class LoginReq {
  private String pwd;
  private String userName;


  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  @Override
  public String toString() {
    return "LoginReq{" +
        "pwd='" + pwd + '\'' +
        ", userName='" + userName + '\'' +
        '}';
  }
}
