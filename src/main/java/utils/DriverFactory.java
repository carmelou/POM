package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void initDriver() {
        driver.set(new ChromeDriver());
        getDriver().manage().window().maximize();
    }

    public static void quitDriver() {
        getDriver().quit();
        driver.remove();
    }
}
    