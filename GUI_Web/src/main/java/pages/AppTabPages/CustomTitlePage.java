package pages.AppTabPages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CustomTitlePage {
    WebDriver driver;
    private By TextLabelOfChangeLeft = AppiumBy.id("io.appium.android.apis:id/left_text_edit");
    private By ChangeLeftBtn =  AppiumBy.accessibilityId("Change Left");

    public CustomTitlePage(WebDriver driver) {
        this.driver = driver;
    }
    ////////////////// ACTIONS /////////////////////////////////////////
    public CustomTitlePage clearTextField(){
        driver.findElement(TextLabelOfChangeLeft).clear();
        return this;
    }
    public CustomTitlePage enterNewValueToTextField(String value){
        driver.findElement(TextLabelOfChangeLeft).sendKeys(value);
        return this;
    }
    public CustomTitlePage clickOnChangeLeftBtn(){
        driver.findElement(ChangeLeftBtn).click();
        return this;
    }
    ///////////////////// ASSERTIONS /////////////////
    public CustomTitlePage verifyThatTitleChangedToEnteredValue(){
        Assert.assertEquals(driver.findElement(TextLabelOfChangeLeft).getText(),
                "Appium");
        return this;
    }
}
