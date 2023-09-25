package demoqa.test;

import com.codeborne.selenide.Configuration;
import demoqa.pages.TextBoxPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TextBoxTest extends BaseTest{
    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    public void registrationTextBoxTest() {
        textBoxPage.openPage()
                .deletedFooter()
                .setFullName("Test Test")
                .setEmail("test@test.com")
                .setCurrentAddress("Test Address 111")
                .setPermanentAddress("Test Address 112")
                .clickSubmitButton();

        textBoxPage.checkOutputResult(
                "Test Test",
                "test@test.com",
                "Test Address 111",
                "Test Address 112");
    }

}
