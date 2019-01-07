import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThirdAutomationTest {

    private WebDriver driver;

    @Test

    public void article() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rb26509\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.wp.pl/");
        driver.findElement(By.xpath("//button[contains(text(),'PRZECHODZĘ')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("6335923171801217")).click();

    }
}
