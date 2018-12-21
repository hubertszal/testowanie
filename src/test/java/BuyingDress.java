import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BuyingDress {

    private WebDriver driver;

    @Test
    public void dress() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rb26509\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.xpath("(//*[@id='block_top_menu']//*[@title='Dresses'])[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='left_column']//a[@title='Browse our different dresses to choose the perfect dress for an unforgettable evening!']/..")).click();


    }


}
