import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class JavaStart {

    private WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rb26509\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://przyklady.javastart.pl/test/full_form.html");
    }


    @Test

    public void filePicking() {

        WebElement uploadFilePicker = driver.findElement(By.id("upload_file"));
        uploadFilePicker.sendKeys("C:\\Users\\rb26509\\plik.png");

    }

    @Test
    public void checkRadioButtonTest() throws InterruptedException {

        WebElement maleRadioButton = driver.findElement(By.cssSelector("input[value='male']"));
        WebElement femaleRadioButton = driver.findElement(By.cssSelector("input[value='female']"));


        maleRadioButton.click();
        sleep(3000);
        assertTrue(maleRadioButton.isSelected());
        femaleRadioButton.click();
        assertTrue(femaleRadioButton.isSelected());


    }

    @Test
    public void dropDownListTest() {

        WebElement dropDown = driver.findElement(By.id("country"));
        Select dropDownSelect = new Select(dropDown);

        List<WebElement> options = dropDownSelect.getOptions();
        List<String> namesOfOptions = new ArrayList<String>();

        for (WebElement option : options) {
            namesOfOptions.add(option.getText());
            System.out.println(option.getText());

        }

            List<String> expectedNamesOfOptions = new ArrayList<String>();
            expectedNamesOfOptions.add("Germany");
            expectedNamesOfOptions.add("Poland");
            expectedNamesOfOptions.add("UK");

            assertEquals(namesOfOptions, expectedNamesOfOptions);



    }

    @Test
    public void selectingOptionsFromDropDownTest() throws InterruptedException {

        WebElement countryWebElement = driver.findElement(By.id("country"));
        Select countryDropDown = new Select(countryWebElement);

        sleep(3000);

        countryDropDown.selectByIndex(1);

        sleep(3000);

        assertEquals(countryDropDown.getFirstSelectedOption().getText(), "Poland");
    }

    @Test
    public void smileyIcons(){
        WebElement smileyIcon1 = driver.findElement(By.id("smiley"));
        WebElement smileyIcon2 = driver.findElement(By.id("Smiley2"));

        Actions action = new Actions(driver);
        action.moveToElement(smileyIcon1).moveToElement(smileyIcon2).build().perform();
    }



}
