package org.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends BasePage{
    private By txtUsername = By.xpath("//input[contains(@placeholder,'Username')]");
    private By txtEmail = By.xpath("//input[contains(@placeholder,'Email')]");
    private By txtPassword = By.xpath("//input[contains(@placeholder,'Password')]");
    private By btnSignIn = By.xpath("//button[contains(text(),'Sign in')]");
    public SignUpPage(WebDriver driver){
        super(driver);
    }

    public SignUpPage enterUsername(String username) throws InterruptedException {
        waitForElementToBeVisible(txtUsername).sendKeys(username);
        return this;
    }

    public SignUpPage enterEmail(String email) throws InterruptedException {
        driver.findElement(txtEmail).sendKeys(email);
        return this;
    }

    public SignUpPage enterPassword(String password) throws InterruptedException {
        driver.findElement(txtPassword).sendKeys(password);
        return this;
    }

    public void clickSignInButton(){
        driver.findElement(btnSignIn).click();
    }
}
