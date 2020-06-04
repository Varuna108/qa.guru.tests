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

@Tag("yandex")
public class YandexMarketTests extends TestBase {

    @Test
    @Description("Positive test with PO")
    void successProductSearchWithPO() {
        YandexMarketPage yandexMarketPage = new YandexMarketPage();

        yandexMarketPage.openUrl();

        yandexMarketPage.typeSearchItem("iPhone 8");

        yandexMarketPage.selectItem();

        yandexMarketPage.verifyTextItem("Смартфон Apple iPhone 8 64GB");
    }
}
