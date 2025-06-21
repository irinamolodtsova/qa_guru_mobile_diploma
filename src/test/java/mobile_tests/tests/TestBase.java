package mobile_tests.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import mobile_tests.drivers.BrowserStackDriver;
import mobile_tests.drivers.EmulateMobileDriver;
import mobile_tests.drivers.RealMobileDriver;
import mobile_tests.helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {


    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = null;
        Configuration.pageLoadTimeout = 0;
        Configuration.timeout = 10000;
        if (System.getProperty("deviceHost", "browserstack").equals("real")) {
            Configuration.browser = RealMobileDriver.class.getName();
        } else if (System.getProperty("deviceHost", "browserstack").equals("emulation")) {
            Configuration.browser = EmulateMobileDriver.class.getName();
        } else if (System.getProperty("deviceHost", "browserstack").equals("browserstack")) {
            Configuration.browser = BrowserStackDriver.class.getName();
        }
    }

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void afterEach() {
        closeWebDriver();
        String sessionId = Selenide.sessionId().toString();
        Attach.pageSource();
        closeWebDriver();
        Attach.addVideo(sessionId);
    }
}