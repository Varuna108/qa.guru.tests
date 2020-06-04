package tests;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

@Tag("tinkoff")
public class TinkoffTests extends TestBase {

    @Test
    void searchDeposit () {

        open("https://tinkoff.ru");

        $("div[data-tabs-with-droplist-index='2']").click();

        sleep(1000);


    }
}
