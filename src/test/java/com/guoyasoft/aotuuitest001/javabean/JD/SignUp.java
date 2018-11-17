package com.guoyasoft.aotuuitest001.javabean.JD;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @program: aotu
 * @description:
 * @author: guoya
 * @create: 2018-11-17 17:22
 **/
public class SignUp {

  @FindBy(xpath = "(//a[@href = \"javascript:login();\"])[1]")
  private WebElement loginA;

  @FindBy(partialLinkText = "账户登录")
  private WebElement accA;

  @FindBy(id = "loginname")
  private WebElement loginname;

  @FindBy(id = "nloginpwd")
  private WebElement nloginpwd;

  @FindBy(id = "loginsubmit")
  private WebElement loginsubmit;


  public void clickLoginA() {

    loginA.click();
  }

  public void clickAccA() {
    accA.click();
  }

  public void inputLoginname(String loginName) {
    loginname.clear();
    loginname.sendKeys(loginName);
  }

  public void inputNloginpwd(String nloginPwd) {
    nloginpwd.sendKeys(nloginPwd);
  }

  public void clickLoginsubmit() {
    loginsubmit.click();
    loginsubmit.click();
  }


}
