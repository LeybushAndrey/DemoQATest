package github;

import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BestSelenideContributor {

    @Test
    void andreiSolntsevShouldBeBestContributor(){

        //открыть станицу selenide
        open("https://github.com/selenide/selenide");

        //подвести мышку к первому элементу в области contributors
                $(".BorderGrid").$(byText("Contributors"))
                .closest("div").$("ul li").hover();

        //проверка: в появившемся окне (overlay) текст Andrei Solntsev
        $$(".Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev"));

    }
}
