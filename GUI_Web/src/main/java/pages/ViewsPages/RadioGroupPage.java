package pages.ViewsPages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RadioGroupPage {
    WebDriver driver;
    private  By SnackRadioBtn = AppiumBy.id("io.appium.android.apis:id/snack");
    public RadioGroupPage(WebDriver driver) {
        this.driver = driver;
    }
    //////////////////// ACTIONS //////////////////
    public RadioGroupPage clickOnSnackRadioButton(){
        driver.findElement(SnackRadioBtn).click();
        return this;
    }
    /////////////////// ASSERTIONS //////////////////
    public RadioGroupPage verifyTheSnackRadioBtnIsClicked(){
        Assert.assertEquals(driver.findElement(SnackRadioBtn).getAttribute("checked"),"true");
        return this;
    }
}
