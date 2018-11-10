package com.guoyasoft.aotutest001.testcase;

import com.alibaba.fastjson.JSON;
import com.guoyasoft.aotutest001.javabean.LoginReq;
import com.guoyasoft.aotutest001.javabean.LoginResp;
import com.guoyasoft.aotutest001.tools.HttpTools;
import org.apache.http.client.utils.HttpClientUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @program: aotu-test001
 * @description:
 * @author: Administrator
 * @create: 2018-11-10 15:06
 **/
public class LoginTest {

  @Test
  public void loginTest(){
    LoginReq loginReq = new LoginReq();
    loginReq.setUserName("xuepl");
    loginReq.setPwd("aaaaaa");
    String reqJson = JSON.toJSONString(loginReq,true);
    System.out.println("--------------登录接口：请求报文------------");
    System.out.println(reqJson);
    String url = "http://qa.guoyasoft.com:8080/user/login";
    String respJson = HttpTools.doPostByJson(url,reqJson,"UTF-8");
    System.out.println("---------------登录接口：响应报文");
    System.out.println(respJson);
    LoginResp loginResp = JSON.parseObject(respJson,LoginResp.class);
    Assert.assertEquals(loginResp.getRespCode(),"0000");
  }
}
