import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class SecondAutomatedTest {

    private WebDriver driver;

    @Test
    public void email() throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\rb26509\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        Thread.sleep(5000);
        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email")).sendKeys("KrzysFraczek@wp.pl");
        driver.findElement(By.id("passwd")).sendKeys("krzysiek");
        driver.findElement(By.id("SubmitLogin")).click();
        WebElement error = driver.findElement(By.xpath("//li[contains(text(),'Authentication failed')]"));
        Assert.assertEquals(error.getText(),"Authentication failed.");

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("C:\\Users\\rb26509\\screenshot100.png"));
            }
        }







