package com.guoyasoft.aotuuitest001.javabean.JD;

import com.guoyasoft.aotuuitest001.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

/**
 * @program: aotu
 * @description:
 * @author: guoya
 * @create: 2018-11-17 15:04
 **/

public class Search extends BaseUI {

  @FindBy(id = "key")
  private WebElement input;

  @FindBy(xpath = "//div[@id='search']//i[@class='iconfont']")
  private WebElement search;


  public void inputSendKeys(String valuse) {
    input.clear();
    input.sendKeys(valuse);
  }

  public void searchClick() {
    search.click();

  }


}
