package UI_tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginUser extends SetUP {

    @Test
    public void loginWithValidCredentials() {

        WebDriverWait waitForMenuIcon = new WebDriverWait(driver,10);
        waitForMenuIcon.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageButton")));

        WebElement menuIcon = driver.findElement(By.className("android.widget.ImageButton"));
        menuIcon.click();

        WebDriverWait waitForPanel = new WebDriverWait(driver, 10);
        waitForPanel.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc=\"Depositphotos\"]")));

        WebElement loginPanel = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Depositphotos\"]"));
        loginPanel.click();
    }

}
