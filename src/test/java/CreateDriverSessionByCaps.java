import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSessionByCaps {
    public static void main(String[] args) throws MalformedURLException {
        String projectPath = System.getProperty("user.dir");
        String appPath = projectPath+"\\src\\main\\resources\\app\\ApiDemos-debug.apk";

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("appium:automationName","uiautomator2");
        caps.setCapability("appium:platformName","Android");
        caps.setCapability("appium:deviceName","emulator-5554");
        caps.setCapability("appium:app",appPath);

        URL url = new URL("http://0.0.0.0:4723");
        AppiumDriver driver = new AndroidDriver(url,caps);
        System.out.println("End.");
    }
}
