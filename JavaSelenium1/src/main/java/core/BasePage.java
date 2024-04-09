package core;

import org.openqa.selenium.WebDriver;

public class BasePage {

    public WebDriver getDriver() {
        return WebDriverManager.getDriver();
    }

    public boolean isDisplay() {
        return false;
    }
}
