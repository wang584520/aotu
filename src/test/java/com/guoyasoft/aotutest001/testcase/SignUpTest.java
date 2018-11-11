package com.guoyasoft.aotutest001.testcase;

import com.alibaba.fastjson.JSON;
import com.guoyasoft.aotutest001.javabean.login.LoginReq;
import com.guoyasoft.aotutest001.javabean.login.LoginResp;
import com.guoyasoft.aotutest001.javabean.signup.SignUpReq;
import com.guoyasoft.aotutest001.javabean.signup.SignUpResp;
import com.guoyasoft.aotutest001.tools.HttpTools;
import com.guoyasoft.aotutest001.tools.PinYinTools;
import com.guoyasoft.aotutest001.tools.PropertiesTools;
import com.guoyasoft.aotutest001.tools.RandomTools;
import java.util.Properties;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @program: aotu-test001
 * @description:
 * @author: Administrator
 * @create: 2018-11-11 14:46
 **/
public class SignUpTest {

  String phone = RandomTools.getTel();
  String pwd = "ww987654";
  String userName = PinYinTools
      .toFirstChar(RandomTools.getChineseName() + RandomTools.getNum(100, 999));
  private Properties result = PropertiesTools
      .getProperties("src\\test\\resources\\application.properties");
  String http = result.getProperty("api.host.protocal");
  String ip = result.getProperty("api.host.ip");
  String port = result.getProperty("api.host.port");

  //用户注册
  @Test
  public void signUpTest() {

    SignUpReq signUpReq = new SignUpReq();
    signUpReq.setPhone(phone);
    signUpReq.setPwd(pwd);
    signUpReq.setRePwd(pwd);
    signUpReq.setUserName(userName);

    System.out.println("电话 = " + phone);
    System.out.println("用户名 = " + userName);

    String reqJson = JSON.toJSONString(signUpReq, true);
    System.out.println("------------------注册接口:请求报文--------------------");
    System.out.println(reqJson);


    String url = http + "://" + ip + ":" + port + "/user/signup";
    System.out.println("-------------------URL------------------");
    System.out.println(url);

    String respJson = HttpTools.doPostByJson(url, reqJson, "UTF-8");
    System.out.println("-------------------注册接口:响应报文-------------------");
    System.out.println(respJson);

    SignUpResp signUpResp = JSON.parseObject(respJson, SignUpResp.class);
    Assert.assertEquals(signUpResp.getRespBase().getRespCode(), "0000");
  }
  //用户登录
  @Test
  public void loginTest(){
    LoginReq loginReq = new LoginReq();
    loginReq.setUserName(userName);
    loginReq.setPwd(pwd);

    String reqJson = JSON.toJSONString(loginReq,true);
    System.out.println("--------------登录接口：请求报文------------");
    System.out.println(reqJson);

    String url = http+"://"+ip+":"+port+"/user/login";
    String respJson = HttpTools.doPostByJson(url,reqJson,"UTF-8");
    System.out.println("---------------登录接口：响应报文");
    System.out.println(respJson);

    LoginResp loginResp = JSON.parseObject(respJson,LoginResp.class);
    Assert.assertEquals(loginResp.getRespCode(),"0000");
  }
}
