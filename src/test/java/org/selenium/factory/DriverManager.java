package org.selenium.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.selenium.constants.BrowserType;


public class DriverManager {
    public WebDriver initializeDriver(){
        String browser = System.getProperty("browser", "CHROME");
        WebDriver driver;

        switch (BrowserType.valueOf(browser.toUpperCase())){
            case CHROME: {
                driver = new ChromeDriver();
                break;
            }
            case FIREFOX: {
                driver = new FirefoxDriver();
                break;
            }
            default:
                throw new IllegalArgumentException("Invalid browser name: " + browser);
        }
        driver.manage().window().maximize();
        return driver;
    }
}
