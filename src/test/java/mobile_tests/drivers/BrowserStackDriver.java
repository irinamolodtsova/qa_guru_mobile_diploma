package mobile_tests.drivers;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import mobile_tests.config.BrowserStackDriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;


public class BrowserStackDriver implements WebDriverProvider {
    static BrowserStackDriverConfig config = ConfigFactory.create(BrowserStackDriverConfig.class, System.getProperties());

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("appium:app", config.getApp());
        caps.setCapability("appium:deviceName", config.getDeviceName());
        caps.setCapability("appium:platformVersion", config.getPlatformVersion());

        try {
            return new AndroidDriver(
                    new URL(config.getBrowserstackURL()), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}

