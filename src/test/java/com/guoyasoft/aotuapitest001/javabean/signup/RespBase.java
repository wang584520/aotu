package com.guoyasoft.aotutest001.javabean.signup;

/**
 * @program: aotu-test001
 * @description:
 * @author: Administrator
 * @create: 2018-11-11 14:45
 **/
public class RespBase {

  private String respCode;
  private String respDesc;

  public String getRespCode() {
    return respCode;
  }

  public void setRespCode(String respCode) {
    this.respCode = respCode;
  }

  public String getRespDesc() {
    return respDesc;
  }

  public void setRespDesc(String respDesc) {
    this.respDesc = respDesc;
  }

  @Override
  public String toString() {
    return "RespBase{" +
        "respCode='" + respCode + '\'' +
        ", respDesc='" + respDesc + '\'' +
        '}';
  }
}
