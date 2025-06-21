package mobile_tests.helpers;

import io.qameta.allure.Attachment;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Attach {

    @Attachment(value = "Page source", type = "text/plain")
    public static void pageSource() {
        getWebDriver().getPageSource();
    }

    @Attachment(value = "Video", type = "text/html", fileExtension = ".html")
    public static void addVideo(String sessionId) {
        Browserstack.videoUrl(sessionId);
    }
}
