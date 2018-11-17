package com.guoyasoft.aotuuitest001.javabean.JD;

import com.guoyasoft.aotuuitest001.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @program: aotu
 * @description:
 * @author: guoya
 * @create: 2018-11-17 16:35
 **/
public class SecKill extends BaseUI {

  @FindBy(xpath = "//a[@href=\"//miaosha.jd.com/\"]")
  private WebElement secKill;

  public void clickSecKill(){
    secKill.click();
  }

}
