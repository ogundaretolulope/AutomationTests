package com.BJSS.framework.pageobjects.gui;

import com.BJSS.framework.helpers.PageObjectUtility;
import org.openqa.selenium.By;

public class QuickViewPage extends PageObjectUtility {

    private By sizeList  = By.cssSelector("#group_1");
    private By unitPrice = By.id("our_price_display");
    private By addToCart = By.id("add_to_cart");
    private By quickViewIFrame = By.className("fancybox-iframe");
    private By continueShopping = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span > span");

    public void focusOnQuickView(){ driver.switchTo().frame(visibilityOf(waitForExpectedElement(quickViewIFrame))); }

    public void selectASize(String size){ selectByText(waitForExpectedElement(sizeList), size); }

    public String getDefaultSize() { return getFirstSelected(waitForExpectedElement(sizeList)); }

    public String getUnitPrice(){ return waitForExpectedElement(unitPrice).getText(); }

    public void clickAddToCart(){ waitForExpectedElement(addToCart).click(); }

    public void clickContinueShopping(){
        driver.switchTo().activeElement();
        clickElementUsingJavascriptExecutor(waitForExpectedElement(continueShopping));
        driver.switchTo().defaultContent();
    }
}
