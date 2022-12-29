package TestPackage;

import ElementMobileActions.MobileActions;
import com.shaft.driver.SHAFT;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccessibilityPage.Accessibility;
import pages.AccessibilityPage.AccessibilityNodeQuery;
import pages.AppHomePage.HomePage;
import pages.AppTabPages.CustomTitlePage;
import utils.JsonFileManager;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Test_MobileActions {
    WebDriver driver;
    JsonFileManager value = new JsonFileManager("src/test/resources/testDataFiles/simpleJSON.json");
    @BeforeMethod
    public void setupDevice() throws MalformedURLException {
        String AppName = System.getProperty("user.dir") + "\\src\\test\\resources\\testDataFiles\\ApiDemos-debug.apk";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:deviceName", "Pixel 3a XL API 30");
        caps.setCapability("appium:app", AppName);
        caps.setCapability("appium:platformVersion", "11");
        caps.setCapability("appium:automationName", "UiAutomator2");
        driver = new AndroidDriver(new URL("http://localhost:4723/"), caps);
        new MobileActions(driver);
    }

    @Test
    public void testClickAction() {
        new HomePage(driver)
                .clickOnAccessibilityBtn()
                .VerifyTheTextOfAccessibilityNodeProviderTab();
    }

    @Test
    public void testTyping() {
        // Navigate to APP ,activity , custom title , type "Appium" and check If the text written or not
        new HomePage(driver)
                .clickOnAppBtn()
                .clickOnActivityBtn()
                .clickOnCustomTitleBtn()
                .clearTextField();
        String textValue = value.getTestData("value");
        new CustomTitlePage(driver)
                .enterNewValueToTextField(textValue)
                .clickOnChangeLeftBtn()
                .verifyThatTitleChangedToEnteredValue();
    }

    @Test
    public void testCheckBox() {
        // Navigate to Access'ibility , Accessibility Node Querying , click on any checkbox and validate that the checkbox is checked
        new HomePage(driver)
                .clickOnAccessibilityBtn()
                .clickOnAccessibilityNodeQuery()
                .clickOnCheckBox()
                .verifyTheCheckBoxIsClicked();
    }

    @Test
    public void testScrolling() {
        // Navigate to Graphics , scaleToFit and click on it and check If it's scrolled and clicked or not
        new HomePage(driver)
                .clickOnGraphicsBtn()
                .scrollDownToVertics()
                .clickOnVerticsTab()
                .verifyThatUserInTheVerticsPage();
    }

    @Test
    public void testSwiping() {
        // Navigate to Graphics , Vertices , Swipe right on the photo and then swipe left
        new HomePage(driver)
                .clickOnGraphicsBtn()
                .scrollDownToVertics()
                .clickOnVerticsTab()
                .swepPhotoToLeft()
                .swepPhotoToRight();
    }

    @Test
    public void testRadioButton() {
        // Navigate to Views , Radio Group , click on any radio button and check If it's selected or not
        new HomePage(driver)
                .clickOnViewsBtn()
                .scrollDownToRadioGroupTab()
                .clickOnRadioGroupTab()
                .clickOnSnackRadioButton()
                .verifyTheSnackRadioBtnIsClicked();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
