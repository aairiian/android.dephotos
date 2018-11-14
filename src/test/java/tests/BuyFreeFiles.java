package tests;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.tools.ant.taskdefs.Touch;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BuyFreeFiles extends TestBase {


    @Test
    public void loginViaEmailAndBuyFreeFiles(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.depositphotos.root:id/fab")));

        MobileElement doneIcon = (MobileElement) driver.findElement(By.id("com.depositphotos.root:id/fab"));
        doneIcon.click();

        MobileElement menuIcon = (MobileElement) driver.findElementByAccessibilityId("Depositphotos");
        menuIcon.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.depositphotos.root:id/design_menu_item_text")));

        MobileElement loginPanel = (MobileElement) driver.findElement(By.id("com.depositphotos.root:id/design_menu_item_text"));
        loginPanel.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.depositphotos.root:id/photo_background_view")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.depositphotos.root:id/fragment_login_username")));

        MobileElement inputLogin = (MobileElement) driver.findElement(By.id("com.depositphotos.root:id/fragment_login_username"));
        inputLogin.clear();
        inputLogin.sendKeys("qadeposit1");


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.depositphotos.root:id/fragment_login_password")));


        MobileElement inputPassword = (MobileElement) driver.findElement(By.id("com.depositphotos.root:id/fragment_login_password"));
        inputPassword.clear();
        inputPassword.sendKeys("123456");

        MobileElement tapOnLoginButton = (MobileElement) driver.findElement(By.id("com.depositphotos.root:id/tv_auth_action"));
        tapOnLoginButton.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.depositphotos.root:id/toolbar")));

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.depositphotos.root:id/scrollContainer\")).scrollIntoView(new UiSelector().resourceId(\"com.depositphotos.root:id/free_files_label\"))").click();

//
//        TouchAction swipeUp = new TouchAction(driver);
//        swipeUp.press(PointOption.point(startX ,yStart));
//        swipeUp.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)));
//        swipeUp.moveTo(PointOption.point(xEnd, yEnd));
//        swipeUp.release();
//        swipeUp.perform();


        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.depositphotos.root:id/free_files_list")));

    }
}
