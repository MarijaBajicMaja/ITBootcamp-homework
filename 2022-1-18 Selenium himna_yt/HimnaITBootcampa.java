import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.Keys.ENTER;

public class HimnaITBootcampa {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.navigate().to("https://www.youtube.com/");
        Thread.sleep(2000);

        WebElement searchbox = driver.findElement(By.name("search_query"));
        searchbox.sendKeys("Rick Astley - Never Gonna Give You Up");
        Thread.sleep(2000);

        WebElement ytIcon = driver.findElement(By.id("search-icon-legacy"));
        ytIcon.click();
        Thread.sleep(2000);

        WebElement link = driver.findElement(By.linkText("Rick Astley - Never Gonna Give You Up (Official Music Video)"));
        link.click();


    }
}
