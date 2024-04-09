package orangePage;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {
    public boolean isDisplay() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.withMessage("Wait for login success.");
        WebElement userDropDown = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"oxd-userdropdown-tab\"]")));
        return userDropDown.isDisplayed();
    }
}
