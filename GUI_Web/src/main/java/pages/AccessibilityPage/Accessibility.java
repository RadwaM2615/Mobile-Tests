package pages.AccessibilityPage;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AppHomePage.HomePage;

public class Accessibility {
    WebDriver driver;
    private By AccessiibilityNodeProviderTab =  AppiumBy.accessibilityId("Accessibility Node Provider");
    private By AccessibilityNodeQuery =  AppiumBy.accessibilityId("Accessibility Node Querying");

    public Accessibility(WebDriver driver) {
        this.driver = driver;
    }
    /////////////////////// ACTIONS /////////////////
    public AccessibilityNodeQuery clickOnAccessibilityNodeQuery(){
        driver.findElement(AccessibilityNodeQuery).click();
        return new AccessibilityNodeQuery(driver);
    }
    /////////////////////////// assertions ////////
    public Accessibility VerifyTheTextOfAccessibilityNodeProviderTab(){
        Assert.assertEquals(driver.findElement(AccessiibilityNodeProviderTab).getText()
                ,"Accessibility Node Provider");
        return this;
    }
}
