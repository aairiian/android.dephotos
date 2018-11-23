package tests;

import io.appium.java_client.MobileElement;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.assertEquals;


public class LoginUser extends TestBase {

    @Test
    public void loginWithValidCredentials() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.depositphotos.root:id/fab")));

        MobileElement doneIcon = (MobileElement) driver.findElement(By.id("com.depositphotos.root:id/fab"));
        doneIcon.click();

        MobileElement menuIcon = (MobileElement) driver.findElementByAccessibilityId("Depositphotos");
        menuIcon.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.depositphotos.root:id/design_menu_item_text")));

        MobileElement loginPanel = (MobileElement) driver.findElement(By.id("com.depositphotos.root:id/design_menu_item_text"));
        loginPanel.click();


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

        assertEquals("User is successfully logged in", tapOnLoginButton.getText(), "LOG IN");
        System.out.println("User is logged in");


        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.depositphotos.root:id/toolbar")));

    }




}



