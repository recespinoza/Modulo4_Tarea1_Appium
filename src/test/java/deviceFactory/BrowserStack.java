package deviceFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStack implements  IDevice {

    public static String userName = "reneespinoza1";
    public static String accessKey = "NTTsMZvp6hdWphMcj2BP";

    @Override
    public AppiumDriver create() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");
        caps.setCapability("project", "UCB Diplopmado");
        caps.setCapability("build", "V0.1");
        caps.setCapability("name", "Contact Manager");
        caps.setCapability("app", "bs://3d76f48b73b21c0fa05ff2035b35790f6893f7c8");

        AppiumDriver driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);
        return driver;
    }
}

