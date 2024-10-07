import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class CreateDriverSession_ActionOnApp {
    public static void main(String[] args) throws MalformedURLException {
            String projectPath = System.getProperty("user.dir");
            String appPath = projectPath+"\\src\\main\\resources\\app\\ApiDemos-debug.apk";

            UiAutomator2Options options = new UiAutomator2Options();
            options.setAutomationName("uiautomator2")
                    .setPlatformName("Android")
                    .setDeviceName("Pixel 9")
                    .setUdid("emulator-5554")
                    .setAvd("Pixel_9")
                    .setAvdLaunchTimeout(Duration.ofSeconds(360))
                    .setAppPackage("io.appium.android.apis") // as path to app
//                    .setAppActivity("io.appium.android.apis.ApiDemos"); // launching app
                    .setAppActivity("io.appium.android.apis.accessibility.CustomViewAccessibilityActivity"); //accessing directly "Custom view" in app

            URL url = new URL("http://0.0.0.0:4723");
            AppiumDriver driver = new AndroidDriver(url,options);
            System.out.println("End.");
    }
}
