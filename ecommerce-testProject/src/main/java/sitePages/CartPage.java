package sitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    public CartPage(WebDriver driver)
    {
        this.driver = driver;
    }
    private By cartStatus = By.xpath("//*[@id=\"cartItems\"]/div/p[1]");
    private By purchaseKey = By.xpath("/html/body/div/div[2]/button[2]");
    private By LogOutHomeIcon = By.id("icon");

    public String cartEmptyOrNot()
    {
        return driver.findElement(cartStatus).getText();
    }

    public void clickPurchase()
    {
        driver.findElement(purchaseKey).click();
    }
    public String alertMsg()
    {
        return driver.switchTo().alert().getText();
    }
    public void alertOK()
    {
        driver.switchTo().alert().accept();
    }
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


}
