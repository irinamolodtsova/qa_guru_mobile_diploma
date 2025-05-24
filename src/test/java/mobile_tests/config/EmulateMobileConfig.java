package mobile_tests.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.FIRST)
@Config.Sources({
        "file:src/test/resources/properties/emulation.properties"
})
public interface EmulateMobileConfig extends Config {

    @Key("deviceNameEm")
    String deviceName();

    @Key("appiumServerUrlEm")
    String mobileUrl();

    @Key("appPackageEm")
    String appPackage();

    @Key("appActivityEm")
    String appActivity();

    @Key("platformVersionEm")
    String platformVersion();

}
