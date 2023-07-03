package org.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.utils.JacksonUtils;

import java.io.File;
import java.net.URL;

public class HomePage extends BasePage{
    private By lnkSignUp = By.xpath("//a[contains(text(),'Sign up')]");
    private By lnkSignIn = By.xpath("//a[contains(text(),'Sign in')]");
    private By lnkGlobalFeed = By.xpath("//a[contains(text(),'Global Feed')]");
    public HomePage(WebDriver driver){
        super(driver);
    }

    public HomePage load(){
        String url = JacksonUtils.getValueFromJsonFile("src/test/resources/configurations.json", "url");
        driver.get(url);
        return this;
    }

    public SignUpPage navigateToSignUpPage() throws InterruptedException {
        waitForElementToBeVisible(lnkSignUp).click();
        return new SignUpPage(driver);
    }

    public SignInPage navigateToSignInPage() throws InterruptedException {
        waitForElementToBeVisible(lnkSignIn).click();
        return new SignInPage(driver);
    }

    public boolean isOnHomePage(){
        try{
            waitForElementToBeVisible(lnkGlobalFeed);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
}
