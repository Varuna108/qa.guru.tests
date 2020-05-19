package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.GooglePage;
//import pages.GooglePage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static helpers.Environment.googleUrl;

@Tag("google")
class GoogleSearchTests extends TestBase {

    @Test
    @Description("Positive test")
    void successfulSearch() {
        open(googleUrl);

        $(byName("q")).val("lepra").pressEnter();

        $("html").shouldHave(text("Лепрозорий: вход"));
    }

    @Test
    @Description("Positive test with PageObject")
    void successfulSearchWithPO() {
        GooglePage googlePage = new GooglePage();

        open(googleUrl);

        googlePage.typeSearch("lepra");

        googlePage.verifySearchHasResult("Лепрозорий: вход");
    }
}