package guru.qa.tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static guru.qa.tests.TestData.firstName;
import static guru.qa.tests.TestData.lastName;

public class PracticeFormWithPageObjectTests extends TestBase{

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTest() {
        registrationPage.openPage();

        registrationPage.typeFirstName(firstName)
                        .typeLastName(lastName);
    }

}
