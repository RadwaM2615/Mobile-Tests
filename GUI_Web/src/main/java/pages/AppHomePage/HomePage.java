package pages.AppHomePage;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AccessibilityPage.Accessibility;
import pages.AppTabPages.AppPage;
import pages.GraphicsPages.GraphicsPage;
import pages.ViewsPages.ViewsPage;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    private By ACCESSIIBILITY = AppiumBy.accessibilityId("Access'ibility");
    private By AppBtn = AppiumBy.accessibilityId("App");
    private By GraphicsBtn = AppiumBy.accessibilityId("Graphics");
    private By ViewsBtn =  AppiumBy.accessibilityId("Views");



    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public Accessibility clickOnAccessibilityBtn(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(ACCESSIIBILITY).click();
        return new Accessibility(driver);
    }
    public AppPage clickOnAppBtn(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(AppBtn).click();
        return new AppPage(driver);
    }
    public GraphicsPage clickOnGraphicsBtn(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(GraphicsBtn).click();
        return new GraphicsPage(driver);
    }
    public ViewsPage clickOnViewsBtn(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(ViewsBtn).click();
        return new ViewsPage(driver);
    }

}
