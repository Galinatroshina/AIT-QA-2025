package WebShop;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test
    public void loginExistedUserPositiveTest() {
        clickOnLoginLink();
        typeEmail("galchibu1@gmail.com");
        typePassword("Qwerty1@");
        clickOnLoginButton();
        checkLogin();

    }



}
