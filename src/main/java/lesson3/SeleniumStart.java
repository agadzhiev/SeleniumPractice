package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumStart {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        WebDriver driver = new ChromeDriver();

       driver.get("https://google.com");

       WebDriverManager.safaridriver().setup();

       WebDriver safari = new SafariDriver();
       safari.get("https://google.com");

       Thread.sleep(5000);

       safari.quit();
       driver.quit();
    }
}
