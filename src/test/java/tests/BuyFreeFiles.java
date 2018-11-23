package tests;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.tools.ant.taskdefs.Touch;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.AndroidKey;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class BuyFreeFiles extends TestBase {


    @Test
    public void loginViaEmailAndBuyFreeFiles() throws InterruptedException {

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
        System.out.println("User is logged in");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.depositphotos.root:id/toolbar")));


// Vertical scroll Home page
        driver.findElementByAndroidUIAutomator(
                "new UiScrollable(new UiSelector()" +
                        ".resourceId(\"com.depositphotos.root:id/scrollContainer\"))" +
                        ".scrollIntoView(new UiSelector()" +
                        ".resourceId(\"com.depositphotos.root:id/free_files_label\"))")
                .click();

        //Horizontal scroll Free Files
//       driver.findElementByAndroidUIAutomator(
//               "new UiScrollable(new UiSelector()" +
//                       ".resourceId(\"com.depositphotos" +
//                       ".root:id/free_files_list\"))" +
//                       ".setAsHorizontalList()" +
//                       ".scrollIntoView(new UiSelector()" +
//                       ".descriptionContains(\"Family\"))");



        MobileElement selectImage = (MobileElement) driver.findElement(By.id("com.depositphotos.root:id/image"));
        selectImage.click();

        driver.currentActivity();

//            try {
//                Thread.sleep(2000);
//            }

//            catch (Exception e) {}
//            driver.navigate().back();

        MobileElement favoritesIcon = (MobileElement) driver.findElement(By.id("com.depositphotos.root:id/action_favorites"));
        favoritesIcon.click();


        MobileElement floatBtn = (MobileElement)driver.findElement(By.id("com.depositphotos.root:id/fab"));
        floatBtn.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.depositphotos.root:id/buy")));

        driver.findElement(By.id("com.depositphotos.root:id/buy")).click();

        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        wait.until(ExpectedConditions.textToBe(By.id("com.depositphotos.root:id/buy"), "RE-DOWNLOADS"));

//        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout")).click();




    }
}


//((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.HOME);
//        3 - reopen client later again
//
//        try {driver.runAppInBackground(1);}catch(Exception e){}
