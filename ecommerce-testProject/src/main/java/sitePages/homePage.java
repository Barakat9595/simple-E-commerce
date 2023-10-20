package sitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import java.util.concurrent.TimeUnit;

public class homePage {
    private WebDriver driver;
    public homePage(WebDriver driver)
    {
        this.driver = driver;
    }

    private By LogOutHomeIcon = By.id("icon");
    private By SearchBar = By.id("search");
    private By SearchBtn = By.className("search-button");


    public welcomePage LogOut() {
        try {
            // Delay execution for 7 seconds
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(LogOutHomeIcon).click();
        return new welcomePage(driver);
    }

    public void EnterItem(String item)
    {
        driver.findElement(SearchBar).sendKeys(item);
    }

    public IphonePage searchClick()
    {
        driver.findElement(SearchBtn).click();
        return new IphonePage(driver);
    }


}
