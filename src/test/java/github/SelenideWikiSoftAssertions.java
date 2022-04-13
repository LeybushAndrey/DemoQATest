package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideWikiSoftAssertions {

    @Test
            void shouldFindSelenideWikiSoftAssertions(){
        //открыть станицу selenide
        open("https://github.com/selenide/selenide");
        //Перейти в раздел Wiki
        $("#wiki-tab").click();
        //раскрыть полностью список Pages
        $(".js-wiki-more-pages-link").click();
        //Список Pages содержит SoftAssertions
        $(".wiki-rightbar").shouldHave(text("SoftAssertions"));
        //перейти по ссылке SoftAssertions
        $(byText("SoftAssertions")).click();
        //проверить наличие кода JUnit5
        $("#wiki-content").shouldHave(text("Using JUnit5 extend test class"), text("@ExtendWith"));
    }
}
