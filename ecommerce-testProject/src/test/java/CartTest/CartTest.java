package CartTest;

import BaseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import sitePages.CartPage;
import sitePages.IphonePage;
import sitePages.homePage;

public class CartTest extends BaseTest {
    //test if my product added to cart

    @Test
    public void ProductsCart()
    {
        welcome.enterUser("staticwebuser");
        welcome.enterPasswd("12345");
        homePage home = welcome.submitLogin();
        home.EnterItem("Iphone");
        IphonePage iphone = home.searchClick();
        iphone.addToBtn();
        iphone.alertOK();
        CartPage myCart = iphone.goToCart();
        String myMsg = myCart.cartEmptyOrNot();
        Assert.assertEquals(myMsg,"Iphone - Apple Mobile");
        welcome = myCart.LogOut();


    }

    //check if product process actually purchased

    @Test
    public void PurchaseFromCart()
    {
        welcome.enterUser("staticwebuser");
        welcome.enterPasswd("12345");
        homePage home = welcome.submitLogin();
        home.EnterItem("Iphone");
        IphonePage iphone = home.searchClick();
        iphone.addToBtn();
        iphone.alertOK();
        CartPage myCart = iphone.goToCart();
        myCart.clickPurchase();
        String myMsg = myCart.alertMsg();
        Assert.assertEquals(myMsg,"Successful purchase!");
        myCart.alertOK();


    }


}
