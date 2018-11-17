package com.guoyasoft.aotuuitest001.testcase;


import com.guoyasoft.aotuuitest001.common.BaseUI;
import com.guoyasoft.aotuuitest001.javabean.JD.Search;
import com.guoyasoft.aotuuitest001.javabean.JD.SecKill;
import com.guoyasoft.aotuuitest001.javabean.JD.SignUp;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @program: aotu
 * @description:
 * @author: guoya
 * @create: 2018-11-17 14:51
 **/
public class TestCase extends BaseUI {
  String url = "https://www.jd.com";
  @Test
  public void searchTest() {

    driver.get(url);
    Search logIn = PageFactory.initElements(driver, Search.class);
    logIn.inputSendKeys("手机");
    sleep(500);
    snapshot((TakesScreenshot) driver,"softdata\\selenium\\input.jpg");
    logIn.searchClick();
    snapshot((TakesScreenshot) driver,"softdata\\selenium\\searchClick.jpg");
    sleep(500);
    Assert.assertEquals(driver.getTitle().contains("手机"),true);
  }
  @Test
  public void secKillTest(){
    driver.get(url);
    SecKill secKill = PageFactory.initElements(driver,SecKill.class);
    secKill.clickSecKill();
    sleep(500);
    snapshot((TakesScreenshot) driver,"softdata\\selenium\\secKill.jpg");
    sleep(500);
    driver.switchTo().window("京东秒杀");
    sleep(1500);
    Assert.assertEquals(driver.getTitle().contains("京东秒杀"),true);

  }
  @Test
  public void loginTest(){
    driver.get(url);
    SignUp signUp = PageFactory.initElements(driver,SignUp.class);
    signUp.clickLoginA();
    snapshot((TakesScreenshot) driver,"softdata\\selenium\\点击登录链接.jpg");
    sleep(500);
    signUp.clickAccA();
    snapshot((TakesScreenshot) driver,"softdata\\selenium\\点击账户登录.jpg");
    sleep(500);
    signUp.inputLoginname("18818140570");
    snapshot((TakesScreenshot) driver,"softdata\\selenium\\输入账户.jpg");
    sleep(500);
    signUp.inputNloginpwd("132456");
    snapshot((TakesScreenshot) driver,"softdata\\selenium\\输入密码.jpg");
    sleep(500);
    signUp.clickLoginsubmit();
    snapshot((TakesScreenshot) driver,"softdata\\selenium\\点击登录.jpg");
    sleep(1500);
  }
}
