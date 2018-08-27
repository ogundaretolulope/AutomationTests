package com.BJSS.framework.page_objects.cms;

import com.BJSS.framework.helpers.Page_Object_Utility;
import org.openqa.selenium.By;

public class PaymentPage extends Page_Object_Utility {

    private By payByWireBtn = By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a");
    private By confirmOrderBtn = By.cssSelector("#cart_navigation > button > span");

    public void clickPayByWireBtn(){ waitForExpectedElement(payByWireBtn).click(); }

    public void clickConfirmOrderBtn(){ waitForExpectedElement(confirmOrderBtn).click(); }
}
