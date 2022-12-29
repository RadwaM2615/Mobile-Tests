package pages.AccessibilityPage;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.time.Duration;

public class AccessibilityNodeQuery {
    WebDriver driver;
    String checkBoxXpath="(//android.widget.CheckBox[@resource-id='io.appium.android.apis:id/tasklist_finished'])[3]";
    private By checkBoxXpath1 = AppiumBy.xpath(checkBoxXpath);
    public AccessibilityNodeQuery(WebDriver driver) {
        this.driver = driver;
    }
    //////////////////// ACTIONS ///////////////////
    public AccessibilityNodeQuery clickOnCheckBox(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(checkBoxXpath1).click();
        return this;
    }
    ////////////////// ASSERTIONS /////////////////
    public AccessibilityNodeQuery verifyTheCheckBoxIsClicked(){
        Assert.assertEquals(driver.findElement(checkBoxXpath1).getAttribute("checked"),"true");
        return this;
    }
}
