package com.BJSS.framework.page_objects.cms;

import com.BJSS.framework.helpers.Page_Object_Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SearchPage extends Page_Object_Utility {

    private By quickView = By.cssSelector("#center_column > ul > li > div > div.left-block > div > a.quick-view > span");
    private By searchResults = By.cssSelector("#center_column > ul > li > div > div.right-block > h5 > a");

    public List<WebElement> getProductsQuickViewList (){ return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(quickView));
    }

    public List<WebElement> getSearchResults() { return visibilityOfAllElementsLocatedBy(searchResults); }

    public void quickViewAnItem(String item){
        String itemName="";
        for(int i=0; i<getSearchResults().size(); i++){
            itemName = getSearchResults().get(i).getText().trim();
            if(item.equalsIgnoreCase(itemName)){
                startActions().moveToElement(getSearchResults().get(i)).build().perform();
                getProductsQuickViewList().get(i).click();
                break;
            }
        }
    }
}
