package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static helpers.Environment.googleUrl;

public class GooglePage {
    SelenideElement
            searchInput = $(byName("q")),
            htmlBody = $("html");

    @Step("Переход на сайт google.com")
    public void openUrl () {
        open(googleUrl);
    }

    @Step("Ввод текста в поле поиска")
    public void typeSearch (String text) {
        searchInput.val("lepra").pressEnter();
    }

    @Step("Проверка, что найден искомый текст")
    public void verifySearchHasResult (String text) {
        htmlBody.shouldHave(text(text));
    }

}