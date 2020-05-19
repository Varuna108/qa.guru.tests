package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;
import static helpers.Environment.yandexMarketItemName;

public class YandexMarketPage {
    SelenideElement
            searchMarketItem = $("#header-search"),
            clickMarketItem = $x("//h3/a"),
            verifyMarketItem = $(".n-title__text");

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
