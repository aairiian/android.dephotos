package UI_tests;

import io.appium.java_client.MobileElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginUser extends SetUP {

    @Test
    public void loginWithValidCredentials() {

        MobileElement doneIcon = (MobileElement) driver.findElement(By.id("com.depositphotos.root:id/fab"));
        doneIcon.click();

        MobileElement menuIcon = (MobileElement) driver.findElementByAccessibilityId("Depositphotos");
        menuIcon.click();

        WebDriverWait waitForPanel = new WebDriverWait(driver, 10);
        waitForPanel.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.CheckedTextView")));

        MobileElement loginPanel = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.CheckedTextView"));
        loginPanel.click();

        MobileElement inputLogin = (MobileElement) driver.findElement(By.id("com.depositphotos.root:id/fragment_login_username"));
        inputLogin.click();
        inputLogin.sendKeys("qa9.mob.com");


        MobileElement inputPassword = (MobileElement) driver.findElement(By.id("com.depositphotos.root:id/fragment_login_password"));
        inputPassword.click();
       inputPassword.sendKeys("123456");


        MobileElement tapOnLoginButton = (MobileElement) driver.findElement(By.id("com.depositphotos.root:id/tv_auth_action"));
        tapOnLoginButton.click();

        WebDriverWait waitForHome = new WebDriverWait(driver,10);
        waitForHome.until(ExpectedConditions.presenceOfElementLocated(By.id("android.widget.TextView classs deposit")));
    }

}
