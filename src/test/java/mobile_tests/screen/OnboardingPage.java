package mobile_tests.screen;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class OnboardingPage {

    @Step("First Screen click")
    public void clickFirstScreen() {

        $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"))
                .click();
        $(id("org.wikipedia.alpha:id/primaryTextView"))
                .shouldHave(visible);
    }

    @Step("Second Screen click")
    public void clickSecondScreen() {

        $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"))
                .click();
        $(id("org.wikipedia.alpha:id/primaryTextView"))
                .shouldHave(visible);
    }

    @Step("Third Screen click")
    public void clickThirdScreen() {

        $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"))
                .click();
        $(id("org.wikipedia.alpha:id/primaryTextView"))
                .shouldHave(visible);
    }

    @Step("Fourth Screen click")
    public void clickFourthScreen() {

        $(id("org.wikipedia.alpha:id/fragment_onboarding_done_button"))
                .click();
        $(id("org.wikipedia.alpha:id/search_container"))
                .shouldHave(visible);
    }

}
