package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
    void fillFormTest() {
        String permanentAddress = "some street 2";
        String currentAddress = "some street 1";

        open("https://demoqa.com/text-box");
        $("#userName").setValue("Alex");
        $("#userEmail").setValue("alex@qaguru.com");
        $("#currentAddress").setValue(currentAddress);
        $("#permanentAddress").setValue(permanentAddress);
        $("#submit").click();


       $("#output #name").shouldHave(text("Alex"));
       $("#output #email").shouldHave(text("alex@qaguru.com"));
       $("#output #currentAddress").shouldHave(text(currentAddress));
       $("#output #permanentAddress").shouldHave(text(permanentAddress));
    }
}