package com.BJSS.framework.pageobjects.cms;

import com.BJSS.framework.helpers.PageObjectUtility;
import org.openqa.selenium.By;

public class ShippingAddressPage extends PageObjectUtility {

    private By proceedToCheckoutBtn = By.cssSelector("#form > p > button > span");
    private By tAndcTickbox = By.cssSelector("#cgv");

    public void clicktAndcTickbox(){ waitForExpectedElement(tAndcTickbox).click(); }

    public void clickProceedToCheckoutBtn(){ waitForExpectedElement(proceedToCheckoutBtn).click(); }
}
