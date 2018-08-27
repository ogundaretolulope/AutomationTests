package com.BJSS.framework.page_objects.cms;

import com.BJSS.framework.helpers.Page_Object_Utility;
import org.openqa.selenium.By;

public class BillingAddressPage extends Page_Object_Utility {

    private By proceedToCheckoutBtn = By.cssSelector("#center_column > form > p > button > span");

    public void clickProceedToCheckoutBtn(){ waitForExpectedElement(proceedToCheckoutBtn).click(); }
}
