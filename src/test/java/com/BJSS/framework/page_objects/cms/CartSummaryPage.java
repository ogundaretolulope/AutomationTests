package com.BJSS.framework.page_objects.cms;

import com.BJSS.framework.helpers.Page_Object_Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.DecimalFormat;
import java.util.List;

public class CartSummaryPage extends Page_Object_Utility {

    private By listItemNames = By.cssSelector("#cart_summary > tbody > tr > td > p > a");
    private By listItemColAndSize = By.cssSelector("#cart_summary > tbody > tr > td > small > a");
    private By listItemsUnitPrices = By.cssSelector("#cart_summary > tbody > tr > td > span > span");
    private By listItemsTotal = By.cssSelector("#cart_summary > tbody > tr > td:nth-child(6)> span");
    private By totalProducts = By.cssSelector("#total_product");
    private By totalShipping = By.cssSelector("#total_shipping");
    private By totalBeforeTax = By.cssSelector("#total_price_without_tax");
    private By checkoutBtn = By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium > span");


    public List<WebElement> getItemNames() { return presenceOfAllElementsLocatedBy(listItemNames); }

    public List<WebElement> getItemColAndSize() { return presenceOfAllElementsLocatedBy(listItemColAndSize); }

    public List<WebElement> getItemsUnitPrices() { return presenceOfAllElementsLocatedBy(listItemsUnitPrices); }

    public List<WebElement> getItemsTotalPrice(){ return presenceOfAllElementsLocatedBy(listItemsTotal); }

    public String getItemSizeColourPrice(String item){
        String colourSizePrice ="";
        for(int i=0; i<getItemNames().size(); i++){
            String itemName = getItemNames().get(i).getText();
            if(itemName.equalsIgnoreCase(item)){
                colourSizePrice = getItemColAndSize().get(i).getText()+" "+getItemsUnitPrices().get(i).getText();
            }
        } return colourSizePrice;
    }

    public Double addAllItemsTotal(){
        double totalPrice = 0.0;
        for(int i=0; i<getItemsTotalPrice().size(); i++){
            String price = getItemsTotalPrice().get(i).getText().trim();
            double convPrice = TrimDollarAndConvertToDouble(price);
            totalPrice = convPrice + totalPrice;
        }
        DecimalFormat df = new DecimalFormat("#.00");
        return Double.valueOf(df.format(totalPrice));
    }

    public Double getTotalProducts(){
        String total = waitForExpectedElement(totalProducts).getText().trim();
        return TrimDollarAndConvertToDouble(total);
    }

    public Double getTotalShipping(){
        String total = waitForExpectedElement(totalShipping).getText().trim();
        return TrimDollarAndConvertToDouble(total);
    }

    public Double getTotalBeforeShipping(){
        String total = waitForExpectedElement(totalBeforeTax).getText().trim();
        return TrimDollarAndConvertToDouble(total);
    }

    public void clickCheckoutBtn(){ waitForExpectedElement(checkoutBtn).click(); }


}
