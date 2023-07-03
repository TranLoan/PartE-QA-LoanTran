package org.selenium.tests;

import org.selenium.pages.HomePage;
import org.selenium.pages.SignInPage;
import org.selenium.pages.SignUpPage;
import org.selenium.utils.Helper;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest
{
    @Test
    public void VerifyThatAUserCannotLoginWhenEnteringAWrongEmailAddressOrPassword() throws InterruptedException
    {
        String email = Helper.createRandomString(5) + "@gmail.com" ;
        String password = Helper.createRandomString(10);

        HomePage homePage = new HomePage(driver).load();
        SignInPage signInPage = homePage.navigateToSignInPage();
        signInPage.enterEmail(email).
                enterPassword(password).
                clickSignInButton();
        Assert.assertEquals(homePage.isOnHomePage(), false);
        String expectedErrorMessage = "email or password is invalid";
        Assert.assertEquals(signInPage.getErrorMessage(), expectedErrorMessage);
    }
}
