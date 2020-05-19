package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import pages.YandexMarketPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static helpers.Environment.*;

public class YandexMarketTests extends TestBase {

    @Test
    @Description("Positive test")
    void successProductSearch() {
        open(yandexMarketUrl);


        $("#header-search").setValue(yandexMarketItemName).pressEnter();
        $x("//h3/a").click();
        switchTo().window(1);


        $(".n-title__text").shouldHave(text("Смартфон Apple iPhone 8 64GB"));
    }

// то же самое, только через PageObject > YandexMarketPage
    @Test
    @Description("Positive test with PO")
    void successProductSearchWithPO() {
        YandexMarketPage yandexMarketPage = new YandexMarketPage();

        open(yandexMarketUrl);

        yandexMarketPage.typeSearchItem(yandexMarketItemName);

        yandexMarketPage.selectItem();

        yandexMarketPage.verifyTextItem("Смартфон Apple iPhone 8 64GB");
    }
}
