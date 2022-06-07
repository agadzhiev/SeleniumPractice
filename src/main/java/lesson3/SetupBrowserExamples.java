package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SetupBrowserExamples {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("--disable-notifications");

        WebDriver webDriver  = new ChromeDriver(chromeOptions);
        webDriver.get("https:/?ya.ru");

        webDriver.quit();

    }
}
