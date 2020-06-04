package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static helpers.Environment.yandexMarketUrl;

public class YandexMarketPage {
    SelenideElement
            searchMarketItem = $("#header-search"),
            clickMarketItem = $x("//h3/a"),
            verifyMarketItem = $("div[data-apiary-widget-id='/content/productCardTitle']");

    @Step("Переход на сайт market.yandex.ru")
    public void openUrl () {
        open(yandexMarketUrl);
    }

    @Step("Ввод текста в поле поиска")
    public void typeSearchItem (String text) {
        searchMarketItem.setValue(text).pressEnter();
    }

    @Step("Переход на страницу товара")
    public void selectItem () {
        clickMarketItem.click();
        switchTo().window(1);
    }

    @Step("Проверка, что на странице товара присутствует искомый текст")
    public void verifyTextItem (String text) {
        verifyMarketItem.shouldHave(text(text));

    }
}
