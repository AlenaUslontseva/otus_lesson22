package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.CoursePage;
import pages.MainPage;

@Epic("Тесты на страницу курсов")
@DisplayName("Тесты на страницу курсов сайта otus")
public class CoursePageTest extends BaseTest {
    MainPage mainPage;
    CoursePage coursePage;

    @Test
    @Story("Проверка курса по Алгоритмы и структуры данных")
    @Description("Тест проверяет заголовок и кнопку записи на странице курса по Алгоритмы и структуры данных")
    @DisplayName("Проверка курса по Алгоритмы и структуры данных")
    public void checkJsCoursePageTest() {
        String expectedCourseName = "Алгоритмы и структуры данных";
        String expectedButtonName = "Вступительное тестирование";

        mainPage = new MainPage(driver);
        coursePage = new CoursePage(driver);

        mainPage
                .open()
                .clickMainMenuByName("Курсы")
                .openSecondLevelMenuByName("Программирование")
                .clickSecondLevelMenuByName("Алгоритмы и структуры данных");

        Assertions.assertEquals(expectedCourseName, coursePage.getTitleText(),
                String.format("Заголовок страницы должен быть равен %s", expectedCourseName));

        Assertions.assertEquals(expectedButtonName, coursePage.getButtonText(),
                String.format("На странице курса должна быть кнопка %s", expectedButtonName));
    }

    @Test
    @Story("Проверка курса по Machine Learning")
    @Description("Тест проверяет заголовок и кнопку записи на странице курса Machine Learning. Professional")
    @DisplayName("Проверка курса по Machine Learning. Professional")
    public void checkDatabaseCoursePageTest() {
        String expectedCourseName = "Machine Learning. Professional";
        String expectedButtonName = "Вступительное тестирование";

        mainPage = new MainPage(driver);
        coursePage = new CoursePage(driver);

        mainPage
                .open()
                .clickMainMenuByName("Курсы")
                .openSecondLevelMenuByName("Data Science")
                .clickSecondLevelMenuByName("Machine Learning. Professional");

        Assertions.assertEquals(expectedCourseName, coursePage.getTitleText(),
                String.format("Заголовок страницы должен быть равен %s", expectedCourseName));

        Assertions.assertEquals(expectedButtonName, coursePage.getButtonText(),
                String.format("На странице курса должна быть кнопка %s", expectedButtonName));
    }

    @Test
    @Story("Проверка курса по тестированию Нагрузочное тестирование")
    @Description("Тест проверяет заголовок и кнопку записи на странице курса по тестированию Нагрузочное тестирование")
    @DisplayName("Проверка курса по тестированию Нагрузочное тестирование")
    public void checkJavaQaCoursePageTest() {
        String expectedCourseName = "Нагрузочное тестирование";
        String expectedButtonName = "Вступительное тестирование";

        mainPage = new MainPage(driver);
        coursePage = new CoursePage(driver);

        mainPage
                .open()
                .clickMainMenuByName("Курсы")
                .openSecondLevelMenuByName("Тестирование")
                .clickSecondLevelMenuByName("Нагрузочное тестирование");

        Assertions.assertEquals(expectedCourseName, coursePage.getTitleText(),
                String.format("Заголовок страницы должен быть равен %s", expectedCourseName));

        Assertions.assertEquals(expectedButtonName, coursePage.getButtonText(),
                String.format("На странице курса должна быть кнопка %s", expectedButtonName));
    }
}
