package com.BJSS.framework.helpers;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import lombok.Getter;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormatter;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import static com.BJSS.framework.helpers.WebDriverHelper.buildChromeBrowser;

public class Page_Object_Utility {

    private String homeurl = "http://automationpractice.com/";

    @Getter
    protected WebDriverWait wait;
    @Getter
    protected WebDriver driver;

    protected Page_Object_Utility(){
        this.driver = WebDriverHelper.getWebDriver();
        this.wait = new WebDriverWait(driver, 30);
    }

    protected WebElement waitForExpectedElement(final By by){
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void startHomepage() throws Throwable {
        if(driver==null){ driver = buildChromeBrowser(); }
        driver.navigate().to(homeurl);
    }

    public Actions startActions(){
        Actions act = new Actions(driver);
        return act;
    }

    public boolean trimStringAndCheckIfRounded(String value){
        boolean checkValue = false;
        Integer.parseInt(value.replaceAll("[^0-9.]", "").trim());
        checkValue = true;
        return checkValue;
    }

    public WebElement visibilityOf(final WebElement element) {
        return (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOf(element));
    }

    public boolean invisibilityOf(WebElement element) {
        return (new WebDriverWait(driver, 30)).until(ExpectedConditions.invisibilityOf(element));
    }

    public List<WebElement> visibilityOfAllElementsLocatedBy(final By by){
        return wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    public void selectByText(WebElement ele, String text){
        Select selectFromDropdown = new Select(ele);
        selectFromDropdown.selectByVisibleText(text);
    }

    public String getFirstSelected(WebElement ele){
        Select selectFromDropdown = new Select(ele);
        return selectFromDropdown.getFirstSelectedOption().getText();
    }

    public void clickElementUsingJavascriptExecutor(WebElement ele){
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", ele);
    }

    public List<WebElement> presenceOfAllElementsLocatedBy(final By by){
        return (new WebDriverWait(getDriver(), 60)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    public Double TrimDollarAndConvertToDouble(String value){
        String Value = value.replace("$", "");
        return Double.parseDouble(Value);
    }

    public void selectByIndex(WebElement ele, int index){
        Select selectFromDropdown = new Select(ele);
        selectFromDropdown.selectByIndex(index);
    }

    public String getRandomNumber(){
        Random rand = new Random();
        return String.valueOf(rand.nextInt(9000000));
    }
}
