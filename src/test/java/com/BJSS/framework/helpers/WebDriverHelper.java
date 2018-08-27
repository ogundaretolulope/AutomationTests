package com.BJSS.framework.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverHelper extends EventFiringWebDriver {

    private static final WebDriver driver;
    private static final Thread CLOSE_THREAD = new Thread() {
        @Override
        public void run() {
            driver.close();
        }
    };

    static {
        Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
        try {
            driver = buildChromeBrowser();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            throw new Error(throwable);
        }
    }

    public WebDriverHelper() {
        super(driver);
    }

    public static WebDriver buildChromeBrowser() throws Throwable {
        ChromeDriver chrome =new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        return chrome;
    }

    public static WebDriver getWebDriver() {
        return driver;
    }

    @Override
    public void close() {
        if (Thread.currentThread() != CLOSE_THREAD) {
            throw new UnsupportedOperationException("You shouldn't close this WebDriver. It's shared and will close when the JVM exits.");
        }
        super.close();
    }
}
