package WebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class CreateAccountTests extends TestBase {

    @Test
    public void CreateAccountPositiveTest() {

        //click on Login //a[.='Log in']
        driver.findElement(By.xpath("//a[.='Log in']")).click();

        //click on Register //input[@class='button-1 register-button']
        driver.findElement(By.xpath("//input[@class='button-1 register-button']")).click();

        //click on Female By.name ("gender-female")
        WebElement checkbox = driver.findElement(By.cssSelector("#gender-female"));
        assertFalse(checkbox.isSelected());
        checkbox.click();
        assertTrue(checkbox.isSelected());

        //enter First Name By.name ("FirstName")
        driver.findElement(By.name("FirstName")).click();
        driver.findElement(By.name("FirstName")).clear();
        driver.findElement(By.name("FirstName")).sendKeys("Galina");

        //enter Last Name By.name ("LastName")
        driver.findElement(By.name("LastName")).click();
        driver.findElement(By.name("LastName")).clear();
        driver.findElement(By.name("LastName")).sendKeys("Troshina");

        //enter Email By.name("Email")
        driver.findElement(By.name("Email")).click();
        driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys("galchibu1@gmail.com");

        //enter password By.name("Password")
        driver.findElement(By.name("Password")).click();
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys("Qwerty1@");

        //enter Confirm Password By.name("ConfirmPassword")
        driver.findElement(By.name("ConfirmPassword")).click();
        driver.findElement(By.name("ConfirmPassword")).clear();
        driver.findElement(By.name("ConfirmPassword")).sendKeys("Qwerty1@");

        //click on registration button By.name("register-button")
        driver.findElement(By.name("register-button")).click();

        Assert.assertTrue(isElementPresent(By.xpath("//input[@class='button-1 register-continue-button']")));
    }

    @Test
    public void CreateAccountNegativeTest(){

        driver.findElement(By.xpath("//a[.='Log in']")).click();
        driver.findElement(By.xpath("//input[@class='button-1 register-button']")).click();

        WebElement checkbox = driver.findElement(By.cssSelector("#gender-female"));
        assertFalse(checkbox.isSelected());
        checkbox.click();
        assertTrue(checkbox.isSelected());

        driver.findElement(By.name("FirstName")).click();
        driver.findElement(By.name("FirstName")).clear();
        driver.findElement(By.name("FirstName")).sendKeys("Galina");
        driver.findElement(By.name("LastName")).click();
        driver.findElement(By.name("LastName")).clear();
        driver.findElement(By.name("LastName")).sendKeys("Troshina");
        driver.findElement(By.name("Email")).click();
        driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys("galchibu1@gmail.com");
        driver.findElement(By.name("Password")).click();
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys("Qwerty1@");
        driver.findElement(By.name("ConfirmPassword")).click();
        driver.findElement(By.name("ConfirmPassword")).clear();
        driver.findElement(By.name("ConfirmPassword")).sendKeys("Qwerty1@");
        driver.findElement(By.name("register-button")).click();
        //Assert.assertTrue(isAlertPresent());
        }

        @Test
        public  void CreateAccountNegativeSoftAssertTest() {
            SoftAssert softAssert = new SoftAssert();
            driver.findElement(By.xpath("//a[.='Log in']")).click();
            driver.findElement(By.xpath("//input[@class='button-1 register-button']")).click();

            WebElement checkbox = driver.findElement(By.cssSelector("#gender-female"));
            assertFalse(checkbox.isSelected());
            checkbox.click();
            assertTrue(checkbox.isSelected());

            driver.findElement(By.name("FirstName")).click();
            driver.findElement(By.name("FirstName")).clear();
            driver.findElement(By.name("FirstName")).sendKeys("Galina");
            driver.findElement(By.name("LastName")).click();
            driver.findElement(By.name("LastName")).clear();
            driver.findElement(By.name("LastName")).sendKeys("Troshina");
            driver.findElement(By.name("Email")).click();
            driver.findElement(By.name("Email")).clear();
            driver.findElement(By.name("Email")).sendKeys("galchibu1@gmail.com");
            driver.findElement(By.name("Password")).click();
            driver.findElement(By.name("Password")).clear();
            driver.findElement(By.name("Password")).sendKeys("Qwerty1@");
            driver.findElement(By.name("ConfirmPassword")).click();
            driver.findElement(By.name("ConfirmPassword")).clear();
            driver.findElement(By.name("ConfirmPassword")).sendKeys("Qwerty1@");
            driver.findElement(By.name("register-button")).click();
//            softAssert.assertTrue(isAlertPresent());
//            softAssert.assertTrue(isElementPresent(By.xpath("//li[contains(text(),'The specified email already exists')]")));
//            softAssert.assertAll();
        }


}
