package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import sitePages.welcomePage;

import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    protected welcomePage welcome;
@BeforeClass
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.get("file:///E:/private/ITI's/HTML/welcome.html");
        welcome = new welcomePage(driver);

    }




     /* @BeforeMethod
            public void goHome()
    {
        driver.get("file:///E:/private/ITI's/HTML/welcome.html");
    } */
   /* @AfterMethod
    public void quiting()
    {
        driver.quit();
    } */
}
