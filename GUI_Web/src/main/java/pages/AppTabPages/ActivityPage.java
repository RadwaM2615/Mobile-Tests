package pages.AppTabPages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ActivityPage {
    WebDriver driver;
    private By CustomTitleTab = AppiumBy.accessibilityId("Custom Title");

    public ActivityPage(WebDriver driver) {
        this.driver = driver;
    }
    public CustomTitlePage clickOnCustomTitleBtn(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(CustomTitleTab).click();
        return new CustomTitlePage(driver);
    }
}
