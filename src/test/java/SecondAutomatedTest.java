import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static org.testng.Reporter.clear;

public class SecondAutomatedTest {

    private WebDriver driver;

    @Test
    public void email() throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rb26509\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        Thread.sleep(5000);
        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email")).sendKeys("KrzysFraczek@wp.pl");
        driver.findElement(By.id("passwd")).sendKeys("krzysiek");
        driver.findElement(By.id("SubmitLogin")).click();
        WebElement error = driver.findElement(By.xpath("//li[contains(text(),'Authentication failed')]"));
        Assert.assertEquals(error.getText(), "Authentication failed.");

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("C:\\Users\\rb26509\\screenshot100.png"));
    }


    @Test

    public void canDressBeFound() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rb26509\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.id("search_query_top")).sendKeys("t-shirts");
        driver.findElement(By.name("submit_search")).click();
        driver.findElement(By.xpath("//span[contains(text(),'More')]")).click();
        WebElement quantity = driver.findElement(By.id("quantity_wanted"));
        quantity.clear();
        quantity.sendKeys("15");
        driver.findElement(By.id("color_14")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();

    }

}








