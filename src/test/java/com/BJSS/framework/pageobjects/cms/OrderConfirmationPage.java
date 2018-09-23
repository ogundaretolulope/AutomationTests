package com.BJSS.framework.pageobjects.cms;

import com.BJSS.framework.helpers.PageObjectUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrderConfirmationPage extends PageObjectUtility {

    private By orderConfirmationTitle = By.cssSelector("#center_column > h1");
    private By logOut = By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(2) > a");
    private By orderNo = By.xpath("//*[@id=\"center_column\"]/div/text()[11]");

    public WebElement getOrderConfirmationTitle(){
        return waitForExpectedElement(orderConfirmationTitle);
    }

    public String getOrderNo(){ return waitForExpectedElement(orderNo).getText().trim(); }

    public void clickLogOut(){ waitForExpectedElement(logOut).click(); }
}
