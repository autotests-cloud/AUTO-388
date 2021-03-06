package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Translation")
    void generatedTest() {
        step("Open 'https://translate.yandex.by/'", () -> {
            step("// todo: just add selenium action");
        });

        step("Set fakeArea 'test'", () -> {
            step("// todo: just add selenium action");
        });

        step("Verify translation is 'тест'", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://translate.yandex.by/'", () ->
            open("https://translate.yandex.by/"));

        step("Page title should have text 'Яндекс.Перакладчык – слоўнік анлайн пераклад на англійскую, рускую, нямецкую, французскую, украінскую і іншыя мовы.'", () -> {
            String expectedTitle = "Яндекс.Перакладчык – слоўнік анлайн пераклад на англійскую, рускую, нямецкую, французскую, украінскую і іншыя мовы.";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://translate.yandex.by/'", () ->
            open("https://translate.yandex.by/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}