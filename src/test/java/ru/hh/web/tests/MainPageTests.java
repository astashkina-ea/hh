package ru.hh.web.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.hh.web.pages.MainPage;
import ru.hh.web.pages.SignUpPage;

@Feature("Главная страница")
@DisplayName("Главная страница")
public class MainPageTests extends TestBase{

    MainPage mainPage = new MainPage();
    SignUpPage signUpPage = new SignUpPage();

    @Test
    @Tag("web")
    @Story("Регистрация")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Переход на страницу регистрации")
    void loginByEmailAndPasswordTest() {
        mainPage.openPage()
                .clickSignUbButton();
        signUpPage.checkOpeningSignupPage();
    }
}