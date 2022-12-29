package pages.AppTabPages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.AppHomePage.HomePage;

import java.time.Duration;

public class AppPage {
    WebDriver driver;
    private By ActivityTab = AppiumBy.accessibilityId("Activity");
    public AppPage(WebDriver driver) {
        this.driver = driver;
    }
    public ActivityPage clickOnActivityBtn(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(ActivityTab).click();
        return new ActivityPage(driver);
    }
}
