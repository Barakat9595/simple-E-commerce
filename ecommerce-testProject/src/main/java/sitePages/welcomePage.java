package sitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class welcomePage {

    private WebDriver driver;
    public welcomePage(WebDriver driver)
    {
        this.driver = driver;
    }
    private By formUser = By.id("name");
    private By formPasswd = By.id("password");
    private By btnLogin = By.id("loginButton");

    public void enterUser(String username)
    {
        driver.findElement(formUser).sendKeys(username);
    }

    public void enterPasswd(String password)
    {
        driver.findElement(formPasswd).sendKeys(password);
    }

    public homePage submitLogin()
    {
        driver.findElement(btnLogin).click();

        return new homePage(driver);

    }
    public String invalidLoginMessage()
    {
       return driver.switchTo().alert().getText();
    }
    public void alertClick()
    {
        driver.switchTo().alert().accept();
    }
    public void clarifyUser()
    {
        driver.findElement(formUser).clear();
    }
    public void clarifyPasswd()
    {
        driver.findElement(formPasswd).clear();
    }




}
