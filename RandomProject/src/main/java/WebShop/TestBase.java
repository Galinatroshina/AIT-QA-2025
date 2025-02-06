package WebShop;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod(enabled = true)
    public void tearDown() {
        driver.quit();
    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public void typeEmail(String email) {
        type(By.name("Email"), email);
    }

    public void typePassword(String password) {
        type(By.name("Password"), password);
    }

    public void clickOnLoginLink() {
        click(By.xpath("//a[.='Log in']"));
    }

    public void clickOnLoginButton() {
        click(By.cssSelector("input.button-1.login-button"));
    }

    protected void checkLogin() {
        Assert.assertTrue(isElementPresent(By.xpath(" //a[contains(text(),'Log out')]")));
    }

    public boolean isAlertPresent() {
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        if(alert == null){
            return false;
        } else {
            driver.switchTo().alert().accept();
            return true;
    }

}
}



