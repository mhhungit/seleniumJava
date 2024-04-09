package orangePage;

import DataObject.IUser;
import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {
    By byName = By.name("username");
    By byPass = By.name("password");
    By bySubmit = By.xpath("//button[@type=\"submit\"]");

    public HomePage login(String userNameAdmin, String passWordAdmin) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement eleName = wait.until(ExpectedConditions.presenceOfElementLocated(byName));
        WebElement elePass = wait.until(ExpectedConditions.presenceOfElementLocated(byPass));
        WebElement btnSubmit = wait.until(ExpectedConditions.presenceOfElementLocated(byPass));
        eleName.sendKeys(userNameAdmin);
        elePass.sendKeys(passWordAdmin);
        btnSubmit.click();
        return new HomePage();
    }
    public HomePage login(IUser user) {
        return login(user.getName(), user.getPass());
    }

}
