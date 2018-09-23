package com.BJSS.framework.pageobjects.cms;

import com.BJSS.framework.helpers.PageObjectUtility;
import org.openqa.selenium.By;

public class BillingAddressPage extends PageObjectUtility {

    private By proceedToCheckoutBtn = By.cssSelector("#center_column > form > p > button > span");

    public void clickProceedToCheckoutBtn(){ waitForExpectedElement(proceedToCheckoutBtn).click(); }
}
