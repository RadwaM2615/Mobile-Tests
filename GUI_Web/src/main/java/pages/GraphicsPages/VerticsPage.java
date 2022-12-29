package pages.GraphicsPages;

import ElementMobileActions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class VerticsPage {
    WebDriver driver;
    String titleXpath = "//android.widget.TextView[@text='Graphics/Vertices']";
    String photo = "//android.view.View[@package='io.appium.android.apis']";
    private By VerticsPageTitle = AppiumBy.xpath(titleXpath);
    private By PhotoXpath = AppiumBy.xpath(photo);

    public VerticsPage(WebDriver driver) {
        this.driver = driver;
    }
    ///////////////////// ACTIONS ///////////////////////////
    public VerticsPage swepPhotoToRight(){
        MobileActions.swipeRightOnElement(PhotoXpath,driver);
        return this;
    }
    public VerticsPage swepPhotoToLeft(){
        MobileActions.swipeLeftOnElement(PhotoXpath);
        return this;
    }
    ////////////////// ASSERTIONS ///////////////////////////
    public VerticsPage verifyThatUserInTheVerticsPage(){
        Assert.assertEquals(driver.findElement(VerticsPageTitle).getText(),"Graphics/Vertices");
        return this;
    }
}
