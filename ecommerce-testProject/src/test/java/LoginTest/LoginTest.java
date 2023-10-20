package LoginTest;

import BaseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import sitePages.homePage;

public class LoginTest extends BaseTest {

    //testing valid login

    @Test
    public void testSuccessLogin()
    {
        welcome.enterUser("staticwebuser");
        welcome.enterPasswd("12345");
        homePage home = welcome.submitLogin();
        welcome = home.LogOut();

    }

    //testing invalid login with invalid credentials

    @Test
    public void testInvalidLogin()
    {
        welcome.enterUser("myuser");
        welcome.enterPasswd("12345");
        welcome.submitLogin();
        String errorMessage = welcome.invalidLoginMessage();
        Assert.assertEquals(errorMessage,"Invalid username or password. Please try again.");
        welcome.alertClick();
        welcome.clarifyUser();
        welcome.clarifyPasswd();


    }




}
