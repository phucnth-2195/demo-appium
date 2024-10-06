import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSessionByOptions {
    public static void main(String[] args) throws MalformedURLException {
        String projectPath = System.getProperty("user.dir");
        String appPath = projectPath+"\\src\\main\\resources\\app\\ApiDemos-debug.apk";

        UiAutomator2Options options = new UiAutomator2Options();
        options.setAutomationName("uiautomator2")
                .setPlatformName("Android")
                .setDeviceName("emulator-5554")
                .setApp(appPath);

        URL url = new URL("http://0.0.0.0:4723");
        AppiumDriver driver = new AndroidDriver(url,options);
        System.out.println("End.");
    }
}
