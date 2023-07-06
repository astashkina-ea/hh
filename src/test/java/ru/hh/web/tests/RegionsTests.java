package ru.hh.web.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.hh.web.pages.MainPage;
import ru.hh.web.pages.components.RegionsModalComponent;

@Feature("Регионы")
@DisplayName("Модалка выбора региона")
public class RegionsTests extends TestBase {

    MainPage mainPage = new MainPage();
    RegionsModalComponent regionsModalComponent = new RegionsModalComponent();

    @Tag("web")
    @Story("Модалка регионов")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Проверка открытия и закрытия модалки региона")
    void openAndCloseRegionsModalTest() {
        mainPage.openPage();
        regionsModalComponent.checkClosingRegionsModal();
        mainPage.clickRegionLink();
        regionsModalComponent.checkOpeningRegionsModal()
                .closeRegionsModal()
                .checkClosingRegionsModal();
    }
}