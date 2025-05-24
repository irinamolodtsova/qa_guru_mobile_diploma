package mobile_tests.tests;

import mobile_tests.pages.WikiSearchPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("AndroidStudioSearchTest")
public class SearchTest extends TestBase {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Test
    void successfulAppiumSearchTest() {
        wikiSearchPage.clickSearch();
        wikiSearchPage.searchData("Appium");
        wikiSearchPage.checkFoundResult();
    }

    @Test
    void unsuccessfulPageVisit() {
        wikiSearchPage.clickSearch();
        wikiSearchPage.searchData("Starbucks");
        wikiSearchPage.checkFoundResult();
        wikiSearchPage.clickToTheFoundPage();
        wikiSearchPage.checkAnErrorMessage();
    }
}
