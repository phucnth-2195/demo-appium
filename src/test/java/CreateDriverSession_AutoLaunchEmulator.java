import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class CreateDriverSession_AutoLaunchEmulator {

    public static void main(String[] args) throws MalformedURLException {
        String projectPath = System.getProperty("user.dir");
        String appPath = projectPath+"\\src\\main\\resources\\app\\ApiDemos-debug.apk";

        UiAutomator2Options options = new UiAutomator2Options();
        options.setAutomationName("uiautomator2")
                .setPlatformName("Android")
                .setDeviceName("Pixel 9")
                .setUdid("emulator-5554")
                .setApp(appPath)
                .setAvd("Pixel_9")
                .setAvdLaunchTimeout(Duration.ofSeconds(180));

        URL url = new URL("http://0.0.0.0:4723");
        AppiumDriver driver = new AndroidDriver(url,options);
        System.out.println("End.");
    }
}
