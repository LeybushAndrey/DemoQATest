package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SelenideSearch {
    @Test
    void shouldFindSelenideRepositoryPage(){
        //открыть страницу github.com
        open("https://github.com");
        //ввести в поле поиска selenide
        //нажать Enter
        //нажимаем на линк от первого результата поиска
        //check: в заголовке встречается selenide/selenide

        //arrange
        //act
        //assert


    }
}
