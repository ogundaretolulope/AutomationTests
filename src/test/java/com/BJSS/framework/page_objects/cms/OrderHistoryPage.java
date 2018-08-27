package com.BJSS.framework.page_objects.cms;

import com.BJSS.framework.helpers.Page_Object_Utility;
import com.BJSS.framework.models.OrderHistoryPageModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OrderHistoryPage extends Page_Object_Utility {

    private By sortOrderDateBtn = By.cssSelector("#order-list > thead > tr > th > span");
    private By orderReferences = By.cssSelector("#order-list > tbody > tr > td.history_link.bold.footable-first-column > a");
    private By orderItems = By.cssSelector("#sendOrderMessage > p:nth-child(3) > select");
    private By commentBox = By.cssSelector("#sendOrderMessage > p:nth-child(4) > textarea");
    private By sendComment = By.cssSelector("#sendOrderMessage > div > button > span");
    private By savedComments = By.cssSelector("#block-order-detail > div:nth-child(9) > table > tbody > tr > td:nth-child(2)");
    private String orderMessage = "This is Automation order - "+getRandomNumber();

    private OrderHistoryPageModel orderHistoryPageModel;

    public OrderHistoryPage( OrderHistoryPageModel OrderHistoryPageModel){
        this.orderHistoryPageModel = OrderHistoryPageModel;
    }

    public List<WebElement> listOrderReferences(){ return presenceOfAllElementsLocatedBy(orderReferences); }

    public void selectLastOrder(){
        clickElementUsingJavascriptExecutor(listOrderReferences().get(0));
    }

    public void sortOrderByMostRecent(){
        for(int i=0; i<2; i++){ clickElementUsingJavascriptExecutor(waitForExpectedElement(sortOrderDateBtn)); }
    }

    public void selectAnItemFromOrder(){
        selectByIndex(waitForExpectedElement(orderItems), 1);
    }

    public void addCommentToOrder(){
        orderHistoryPageModel.setOrderComment(orderMessage);
        waitForExpectedElement(commentBox).sendKeys(orderMessage);
    }

    public void clickSendComment(){ waitForExpectedElement(sendComment).click(); }

    public String lastSavedComment(){
        List<WebElement> listOfSavedComments = visibilityOfAllElementsLocatedBy(savedComments);
        return listOfSavedComments.get(0).getText().trim();
    }
}
