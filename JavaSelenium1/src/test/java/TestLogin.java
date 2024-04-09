import DataObject.DefaultUser;
import DataObject.User;
import core.WebDriverManager;
import orangePage.HomePage;
import orangePage.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.atomic.AtomicReference;

public class TestLogin {
    static String userNameAdmin  = "Admin";
    static String passWordAdmin = "admin123";

    @BeforeMethod
    public void openBrowserAndGotoHR() {
        // Create a new instance of the Chrome driver
        WebDriverManager.init();
        // Create a new instance of the Chrome driver
        // Navigate to a web page
        WebDriverManager.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterMethod
    public void closeBrowser() {
        WebDriverManager.close();
    }

    @Test
    public void Test01_Login() {
        System.out.println("đfd");
        LoginPage loginPage = new LoginPage();
        HomePage homePage = loginPage.login(DefaultUser.Admin);
        Assert.assertTrue(homePage.isDisplay());
    }
    @Test
    public void Test02_Login() {

//        // Navigate to a web page
//        getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        // Create a WebDriverWait instance with a timeout of 10 seconds
//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
//        // Wait for the element to be present on the page
//        WebElement eleName = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
//        WebElement elePass = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
//        WebElement btnSubmit = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type=\"submit\"]")));
//        eleName.sendKeys(userNameAdmin);
//        String wrong_password = "wrong password";
//        elePass.sendKeys(wrong_password);
//        btnSubmit.click();
//        wait.withMessage("Wait for login success.");
//        AtomicReference<WebElement> userDropDown = null;
//        Assert.assertThrows(()->{
//            userDropDown.set(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"oxd-userdropdown-tab\"]"))));
//            userDropDown.get().isDisplayed();
//        });
    }
}
