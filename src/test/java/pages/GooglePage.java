package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class GooglePage {
    SelenideElement
            searchInput = $(byName("q")),
            htmlBody = $("html");


    @Step("Ввод текста в поле поиска")
    public void typeSearch (String text) {
        searchInput.val("lepra").pressEnter();
    }

    @Step("Проверка, что найден искомый текст")
    public void verifySearchHasResult (String text) {
        htmlBody.shouldHave(text(text));
    }

}