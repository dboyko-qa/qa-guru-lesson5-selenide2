package ru.boyko.darya;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SolutionsPageTest {

    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
    }
    @Test
    void solutionsPageTest(){
        open("https://github.com");
        SelenideElement header = $("header");
        header.$(byText("Solutions")).hover();
        header.$(withTextCaseInsensitive("Enterprise")).click();
        $("h1").shouldHave(Condition.text("Build like the best"));

    }
}
