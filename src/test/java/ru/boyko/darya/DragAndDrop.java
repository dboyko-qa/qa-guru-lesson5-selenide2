package ru.boyko.darya;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;

public class DragAndDrop {

    @Test
    void actionsDnDTest(){
        SelenideElement columnA = $("#column-a");
        SelenideElement columnB = $("#column-b");
        open("https://the-internet.herokuapp.com/drag_and_drop");
        columnA.dragAndDropTo(columnB);
        // verify that square A is moved to column B
        columnB.$("header").shouldHave(text("A"));
        columnA.$("header").shouldHave(text("B"));
    }
}
