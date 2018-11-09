package UI_tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SplashScreen extends SetUP {


    @Test
    public void openSplashScreen (){

        WebDriverWait waitForDoneIcon = new WebDriverWait(driver, 10);
        waitForDoneIcon.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageButton")));

        WebElement doneIcon = driver.findElement(By.className("android.widget.ImageButton"));
        doneIcon.click();

    }
}
