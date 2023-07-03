package org.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage{
    private By txtEmail = By.xpath("//input[contains(@placeholder,'Email')]");
    private By txtPassword = By.xpath("//input[contains(@placeholder,'Password')]");
    private By btnSignIn = By.xpath("//button[contains(text(),'Sign in')]");
    private By txtErrorMessage = By.xpath("//ul[@class='error-messages']//li");
    public SignInPage(WebDriver driver){
        super(driver);
    }

    public SignInPage enterEmail(String email) throws InterruptedException {
        waitForElementToBeVisible(txtEmail).sendKeys(email);
        return this;
    }

    public SignInPage enterPassword(String password) throws InterruptedException {
        driver.findElement(txtPassword).sendKeys(password);
        return this;
    }

    public void clickSignInButton(){
        driver.findElement(btnSignIn).click();
    }

    public String getErrorMessage(){
        return waitForElementToBeVisible(txtErrorMessage).getText();
    }
}
