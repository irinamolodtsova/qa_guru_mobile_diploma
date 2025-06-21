package mobile_tests.config;


import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.FIRST)
@Config.Sources({
        "file:src/test/resources/properties/browserstack.properties"
})

public interface BrowserStackDriverConfig extends Config {

    @Key("userName")
    String getUserName();

    @Key("userKey")
    String getUserKey();

    @Key("app")
    String getApp();

    @Key("browserstackDeviceName")
    String getDeviceName();

    @Key("platformVersion")
    String getPlatformVersion();

    @Key("browserstackURL")
    String getBrowserstackURL();
}
