package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPracticeExample {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://automationpractice.com/index.php");
        webDriver.findElement(By.xpath("//a[@title = 'T-shirts']")).click();


        Thread.sleep(5000);
        webDriver.quit();


    }
}
