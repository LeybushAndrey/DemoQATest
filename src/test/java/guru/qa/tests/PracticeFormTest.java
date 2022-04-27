package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTest extends TestBase{


    @Test
    void fillFormsTest() {

        open("https://demoqa.com/automation-practice-form");

        $("#firstName").setValue("Alex");
        $("#lastName").setValue("Ivanov");
        $("#userEmail").setValue("alex@qaguru.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("9876543210");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("February");
        $(".react-datepicker__year-select").selectOption("1988");
        $(".react-datepicker__month").$(byText("28")).click();
        $("#subjectsInput").setValue("Math").pressEnter();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#uploadPicture").uploadFromClasspath("watch-dogs-legion.jpg");
        $("#currentAddress").setValue("some street");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();

        $("tbody").shouldHave(
                text("Alex" + " " + "Ivanov"),
                text("alex@qaguru.com"),
                text("9876543210"),
                text("Maths"),
                text("some street"),
                text("NCR" + " " + "Delhi")
        );
    }
}
