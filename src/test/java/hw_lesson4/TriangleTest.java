package hw_lesson4;

import io.github.bonigarcia.wdm.WebDriverManager;
import lesson4.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DecimalFormat;

public class TriangleTest {

    private static Logger logger = LoggerFactory.getLogger(com.geekbrains.lesson4.FunctionsTest.class);

    @BeforeAll
    static void beforeAll() {
        WebDriverManager.chromedriver().setup();
        // TRACE, DEBUG, INFO, WARN, ERROR
        logger.info("info");
    }

    @Test
    @DisplayName("Тест проверяет метод triangleArea")
    void givenTriangleArea() {
        double value = Triangle.triangleArea(10,12,13);

        double result = Math.ceil(value);

        Assertions.assertEquals(57.0, result);
    }

    @ParameterizedTest
    //Вопрос: не понятно как для разного набора данных подставлять свой ожидаемый результат
    //то есть я могу передать несколько наборов данных {}{}{}, а они будут сравниваться с одним expected result
    @CsvSource({"15, 16, 20"})
    void checkCalculationOfTriangleArea(int a, int b, int c) {
        double value = Triangle.triangleArea(a,b,c);
        double result = Math.ceil(value);
        Assertions.assertEquals(119.0, result);
    }



    @Test
     @DisplayName("Тест проверяет метод triangleArea если одно из значений 0")
     void givenTriangleAreaNull() {
         double value = Triangle.triangleArea(0,12,13);

         double result = Math.ceil(value);

         Assertions.assertEquals(57.0, result);
     }
    @Test
    @DisplayName("Тест проверяет метод triangleArea если одно из значений отрицательное число")
    void givenTriangleAreaMinusValue() {
        double value = Triangle.triangleArea(10,-12,13);

        double result = Math.ceil(value);

        Assertions.assertEquals(57.0, result);
    }

    @Test
    @DisplayName("Тест проверяет метод triangleArea если треугольника не существует")
    void givenTriangleAreaNullValue() {
        double value = Triangle.triangleArea(1,12,13);
        double result = Math.ceil(value);
        Assertions.assertEquals(0.0, result);
    }


    @Test
    //как тут правильно сравнить что результат соотвествет ожиданию?
    @DisplayName("Тест проверяет метод triangleArea если треугольника не существует")
    void givenTriangleAreaNanValue() {
        double value = Triangle.triangleArea(13,1,1);
        double result = Math.ceil(value);
    }




}
