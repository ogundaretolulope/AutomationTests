package com.BJSS.framework.page_objects.cms;


import com.BJSS.framework.helpers.Page_Object_Utility;
import org.openqa.selenium.By;

public class MyAccountPage extends Page_Object_Utility {

    private By loginEmail = By.id("email");
    private By loginPassword = By.id("passwd");
    private By signInBtn = By.cssSelector("#SubmitLogin > span");
    private By homeClick = By.cssSelector("#header_logo > a");
    private By orderHistory = By.cssSelector("#center_column > div > div:nth-child(1) > ul > li:nth-child(1) > a > span");
    private String username = "tolu.ogundare@gmail.com";
    private String password = "BJSSTest";

    public void login(){
        waitForExpectedElement(loginEmail).sendKeys(username);
        waitForExpectedElement(loginPassword).sendKeys(password);
        waitForExpectedElement(signInBtn).click();
    }

    public void returnToHomepage(){ waitForExpectedElement(homeClick).click(); }

    public void clickOrderHistory(){ waitForExpectedElement(orderHistory).click(); }

}
