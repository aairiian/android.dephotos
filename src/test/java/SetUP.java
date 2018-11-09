import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class SetUP {

    AndroidDriver driver;


    @Before
    public void setUp() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "8.00");
        capabilities.setCapability("deviceName","Samsung SM-G950FD");
        capabilities.setCapability(MobileCapabilityType.UDID, "ce12171ca2cbab0d04");
        capabilities.setCapability("app", "/Users/user/Downloads/Root-debug.apk");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        capabilities.setCapability(MobileCapabilityType.FULL_RESET, "False");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");


        URL remoteUrl = new URL("http://127.0.0.01:4723/wd/hub");
        driver = new AndroidDriver(remoteUrl,capabilities);
        System.out.println("Appium server started successfully");

    }

    @After
    public void teardown() throws Exception {
        driver.quit();
    }

    @Test
    public void openSplashScreen (){

        WebDriverWait waitForDoneIcon = new WebDriverWait(driver, 10);
        waitForDoneIcon.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageButton")));

        WebElement doneIcon = driver.findElement(By.className("android.widget.ImageButton"));
        doneIcon.click();
    }

}

