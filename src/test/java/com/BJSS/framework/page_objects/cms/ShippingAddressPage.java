package com.BJSS.framework.page_objects.cms;

import com.BJSS.framework.helpers.Page_Object_Utility;
import org.openqa.selenium.By;

public class ShippingAddressPage extends Page_Object_Utility {

    private By proceedToCheckoutBtn = By.cssSelector("#form > p > button > span");
    private By tAndcTickbox = By.cssSelector("#cgv");

    public void clicktAndcTickbox(){ waitForExpectedElement(tAndcTickbox).click(); }

    public void clickProceedToCheckoutBtn(){ waitForExpectedElement(proceedToCheckoutBtn).click(); }
}
