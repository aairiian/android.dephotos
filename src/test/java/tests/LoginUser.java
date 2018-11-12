package tests;

import io.appium.java_client.MobileElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginUser extends TestBase {

    @Test
    public void loginWithValidCredentials() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.depositphotos.root:id/fab")));

        MobileElement doneIcon = (MobileElement) driver.findElement(By.id("com.depositphotos.root:id/fab"));
        doneIcon.click();

        MobileElement menuIcon = (MobileElement) driver.findElementByAccessibilityId("Depositphotos");
        menuIcon.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.CheckedTextView")));

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

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("android.widget.TextView classs deposit")));
    }

}
