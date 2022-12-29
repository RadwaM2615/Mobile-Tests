package pages.ViewsPages;

import ElementMobileActions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewsPage {
    WebDriver driver;
    private By RadioGroupTab =  AppiumBy.accessibilityId("Radio Group");

    public ViewsPage(WebDriver driver) {
        this.driver = driver;
    }
    public ViewsPage scrollDownToRadioGroupTab(){
        MobileActions.scrollDownToSpecificText("Radio Group");
        return this;
    }
    public RadioGroupPage clickOnRadioGroupTab(){
        driver.findElement(RadioGroupTab).click();
        return new RadioGroupPage(driver);
    }
}
