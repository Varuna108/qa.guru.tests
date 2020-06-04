package tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.GooglePage;


@Tag("google")
class GoogleSearchTests extends TestBase {


    @Test
    @Description("Positive test with PageObject")
    void successfulSearchWithPO() {
        GooglePage googlePage = new GooglePage();

        googlePage.openUrl();

        googlePage.typeSearch("lepra");

        googlePage.verifySearchHasResult("Lepra");
    }
}