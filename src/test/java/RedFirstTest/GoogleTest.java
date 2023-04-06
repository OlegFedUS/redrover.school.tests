package RedFirstTest;

import TestDriver.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class GoogleTest extends TestUtils {

    @Test
    public void testS() throws InterruptedException{

        getDriver().get("https://google.com");

        //Enter as "\n" OR "Keys.RETURN"
        WebElement find = getDriver().findElement(By.xpath("//input[@class='gLFyf']"));//.sendKeys("Selenium");
        find.sendKeys("Selenium");
        find.sendKeys(Keys.RETURN);

        getDriver().findElement(By.xpath("//h3[normalize-space()='Selenium']")).click();
        String url = getDriver().getCurrentUrl();

        Assert.assertEquals(url, "https://www.selenium.dev/");


        }
    }

/*
        List<WebElement> options = driver.findElements(By.xpath("//div[@class='aajZCb']"));
        options
         */



        /*
        for (WebElement option : options) {
            if (option.getText().equals("Selenium")) {
                {
                    option.click();
                    break;
                }
            }
*/
//driver.findElement(By.xpath("//h3[normalize-space()='Selenium']")).click();
