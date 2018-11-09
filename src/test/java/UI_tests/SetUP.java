package UI_tests;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
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
        capabilities.setCapability("unicodeKeyboard", "true");
        capabilities.setCapability("resetKeyboard", "true");


        URL remoteUrl = new URL("http://127.0.0.01:4723/wd/hub");
        driver = new AndroidDriver(remoteUrl,capabilities);
        System.out.println("Appium server started successfully");

    }

    @After
    public void teardown() throws Exception {
        driver.quit();
    }


}

