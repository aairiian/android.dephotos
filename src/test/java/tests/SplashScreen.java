package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SplashScreen extends TestBase {


    @Test
    public void openSplashScreen (){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageButton")));

        WebElement doneIcon = driver.findElement(By.className("android.widget.ImageButton"));
        doneIcon.click();

    }
}
