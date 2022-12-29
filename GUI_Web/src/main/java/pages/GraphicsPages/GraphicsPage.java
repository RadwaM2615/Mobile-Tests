package pages.GraphicsPages;

import ElementMobileActions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class GraphicsPage {
    WebDriver driver;
    private By VerticsTab = AppiumBy.accessibilityId("Vertices");

    public GraphicsPage(WebDriver driver) {
        this.driver = driver;
    }
    public GraphicsPage scrollDownToVertics(){
        MobileActions.scrollDownToSpecificText("Vertices");
        return this;
    }
    public VerticsPage clickOnVerticsTab(){
        driver.findElement(VerticsTab).click();
        return new VerticsPage(driver);
    }

}
