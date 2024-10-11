package Section14_NativeAppsAutomation;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class CreateDriverSession {
    public static AppiumDriver initializerDriver() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setAutomationName("uiautomator2")
                    .setPlatformName("Android")
                    .setDeviceName("Pixel 9")
                    .setUdid("emulator-5554")
                    .setAvd("Pixel_9") // auto start AVD
                    .setAvdLaunchTimeout(Duration.ofSeconds(360))
                    .setAppPackage("io.appium.android.apis") // package of the app
                    .setAppActivity("io.appium.android.apis.ApiDemos"); // launching demo app

        URL url = new URL("http://0.0.0.0:4723");

        return new AndroidDriver(url,options);
    }

}
