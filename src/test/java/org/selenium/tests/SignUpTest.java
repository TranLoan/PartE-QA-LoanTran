package org.selenium.tests;
import org.selenium.pages.HomePage;
import org.selenium.pages.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.selenium.utils.Helper;


public class SignUpTest extends BaseTest
{
    @Test
    public void VerifyThatTheUserCanCreateAnAccountSuccessfully() throws InterruptedException
    {
        String username = Helper.createRandomString(5);
        String email = username + "@gmail.com" ;
        String password = Helper.createRandomString(10);

        HomePage homePage = new HomePage(driver).load();
        SignUpPage signUpPage = homePage.navigateToSignUpPage();
        signUpPage.enterUsername(username).
                enterEmail(email).
                enterPassword(password).
                clickSignInButton();
        Assert.assertEquals(homePage.isOnHomePage(), true);
    }
}
