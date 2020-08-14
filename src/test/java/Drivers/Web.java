package Drivers;


import Utils.ScreenShotHelper;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Web {

    private static WebDriver driver;

    public static void initDriver(String url) {
        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
        driver = new ChromeDriver();
        deleteCookies();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
    }

    public static void refresh () {
        driver.navigate().refresh();
    }
    public static void closeDriver() {
        driver.close();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {
        driver.quit();
    }

    public static void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public static void deleteCookies() {
        driver.manage().deleteAllCookies();
    }

    @After
    public static void quitDriver(Scenario scenario) {
        if (scenario.isFailed()) {
            ScreenShotHelper.takeWebScreenShot(scenario.getName());
        }
        driver.quit();
    }

}
