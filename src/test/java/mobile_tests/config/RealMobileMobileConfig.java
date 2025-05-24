package mobile_tests.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.FIRST)
@Config.Sources({
        "file:src/test/resources/properties/real.properties"
})
public interface RealMobileMobileConfig extends Config {

    @Key("deviceNameReal")
    String deviceName();

    @Key("appiumServerUrlReal")
    String mobileUrl();

    @Key("appPackageReal")
    String appPackage();

    @Key("appActivityReal")
    String appActivity();

}
