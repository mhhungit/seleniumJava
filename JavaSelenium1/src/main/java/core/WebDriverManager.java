package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void init() {
        driver.set(new ChromeDriver());
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void close() {
        driver.get().close();
    }
}
