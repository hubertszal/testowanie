import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class PetStore {

    private WebDriver driver;

    @Test
    public void petStore(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rb26509\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();



        driver.get("http://przyklady.javastart.pl/jpetstore/actions/Catalog.action");
        driver.findElement(By.cssSelector("#MenuContent a[href*='signonForm']")).click();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("logintestowy");
        driver.findElement(By.xpath("//input[@name='password']")).clear();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("zlehaslo");
        driver.findElement(By.xpath("//input[@name='signon']")).click();

    }
}
