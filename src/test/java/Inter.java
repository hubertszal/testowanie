import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Inter {

    private WebDriver driver;

    @Test

    public void link(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rb26509\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.interia.pl");
        driver.findElement(By.xpath("//button[@class='rodo-popup-agree']"));
        driver.findElement(By.xpath("//a[@title='Kiepski żart amerykańskiej armii']")).click();
    }
}
