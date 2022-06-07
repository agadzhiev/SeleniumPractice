package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw_lesson3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://automationpractice.com/index.php");


        webDriver.switchTo().frame(webDriver.findElement(By.xpath("//a[@name=\"Selenium Framework\"]")));
        webDriver.findElement(By.xpath("//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[2]/div/p/a")).click();

        webDriver.switchTo().parentFrame();

        Thread.sleep(5000);
        webDriver.quit();

    }
}
