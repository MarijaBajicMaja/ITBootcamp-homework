import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CookiesLogovanje {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/login");
        Cookie kolacic = new Cookie("userName", "majasneg");
        driver.manage().addCookie(kolacic);
        driver.navigate().refresh();

        Cookie kolacicId = new Cookie("userID", "71ee3b55-d67b-413e-9869-afe5e76920bd");
        driver.manage().addCookie(kolacicId);
        driver.navigate().refresh();


        Cookie kolacicToken = new Cookie("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6Im1hamFzbmVnIiwicGFzc3dvcmQiOiJtYWphIzg2c25lZyIsImlhdCI6MTY0MjM0OTI2N30.TkTr8FCARLKYKXUUXS9aWviHS2kA-lGPVdTkORuDD6k");
        driver.manage().addCookie(kolacicToken);
        driver.navigate().refresh();

        Cookie kolacicExpires = new Cookie("expires", "2022-01-23T16%3A07%3A47.174Z");
        driver.manage().addCookie(kolacicExpires);
        driver.navigate().refresh();

        WebElement logOut = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        logOut.click();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://demoqa.com/login";

        WebElement logInButton = driver.findElement(By.className("//*[@id=\"login\"]"));

        WebElement userNameField = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"password\"]"));


        Assert.assertEquals(actualURL, expectedURL);
        Assert.assertTrue(logInButton.isDisplayed());
        Assert.assertTrue(userNameField.isDisplayed());
        Assert.assertTrue(passwordField.isDisplayed());

    }
}
