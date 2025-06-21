package mobile_tests.tests;

import mobile_tests.screen.OnboardingPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("AndroidStudioOnboardingTest")
public class OnboardingTest extends TestBase {

    OnboardingPage onboardingScreen = new OnboardingPage();

    @Test
    void gettingStartedTest() {
        onboardingScreen.clickFirstScreen();
        onboardingScreen.clickSecondScreen();
        onboardingScreen.clickThirdScreen();
        onboardingScreen.clickFourthScreen();
    }
}