package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTest {
    @BeforeAll
    static void beforeAll(){
        Configuration.startMaximized = true;
    }

    @Test
    void fillFormsTest() {

        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Alex");
        $("#lastName").setValue("Ivanov");
        $("#userEmail").setValue("Alex@qaguru.com");
        $("#[for=gender-radio-2]").click();
        $("#userNumber").setValue("9876543210");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("Feb");
        $(".react-datepicker__year-select").selectOption("1988");
        $(".react-datepicker__day react-datepicker__day--028 react-datepicker__day--selected react-datepicker__day--today").click();
        $("#subjectsInput").setValue("Some subjects");
        $("#hobbies-checkbox-1").click();
        $("#uploadPicture").uploadFromClasspath("https://github.com/LeibushVictoria/DemoQATest/blob/master/src/test/resources/test.jpg");
        $("#currentAddress").setValue("some street");
       // $("#stateCity-wrapper").$(byText("Select State")).scrollIntoView(true).click();
       // stateSelector.$(byText(state)).click();
       // stateCityDropdown.click();
        //citySelector.$(byText(city)).click();
        $("#submit").click();
        $("#submit").click();
    }
}
