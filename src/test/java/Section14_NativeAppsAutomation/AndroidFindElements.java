package Section14_NativeAppsAutomation;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import javax.xml.xpath.XPath;
import java.net.MalformedURLException;

public class AndroidFindElements {
    public static void main(String[] args) throws MalformedURLException {
        AppiumDriver driver = CreateDriverSession.initializerDriver();
        System.out.println("DriverSessionID: "+driver.getSessionId());

        //Accessing [Views] page
        WebElement btnViews = driver.findElement(AppiumBy.accessibilityId("Views"));
        btnViews.click();

        //Accessing [Buttons] page
//        WebElement btnButtons = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Buttons\"]"));
        WebElement btnButtons = driver.findElements(AppiumBy.id("android:id/text1")).get(2);
        btnButtons.click();

        //Turn ON toggle btn
        WebElement btnToggle = driver.findElement(AppiumBy.className("android.widget.ToggleButton"));
//        WebElement btnToggle = driver.findElement(AppiumBy.xpath("//android.widget.ToggleButton[@content-desc=\"Toggle\"]"));
        while(btnToggle.getText().equals("OFF")){
            btnToggle.click();
        }
        System.out.println("Status's button:"+btnToggle.getText());

        driver.quit();
    }

}
