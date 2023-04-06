package RedFirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class FirstTest {

    @Test
    public void eightComponents() throws InterruptedException{

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        String title = driver.getTitle();
        assertEquals("Web form", title);

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        Thread.sleep(2000);

        textBox.sendKeys("Selenium");
        submitButton.click();

        Thread.sleep(2000);

        WebElement message = driver.findElement(By.id("message"));
        String value = message.getText();

        Thread.sleep(2000);

        assertEquals("Received!", value);

        //driver.quit();

    }

}
