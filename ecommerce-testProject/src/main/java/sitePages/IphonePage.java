 package sitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IphonePage {
    private WebDriver driver;
    public IphonePage(WebDriver driver)
    {
        this.driver = driver;
    }
    private By CartBtn = By.id("addToCartBtn");
    private By CartMenu = By.xpath("//*[@id=\"lil2\"]/a");

    public void addToBtn()
    {
        driver.findElement(CartBtn).click();
    }
    public CartPage goToCart()
    {
        driver.findElement(CartMenu).click();
        return new CartPage(driver);
    }
    public void alertOK()
    {
        driver.switchTo().alert().accept();
    }


}
