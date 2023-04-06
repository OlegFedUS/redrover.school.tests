package MyTest;

import TestDriver.TestUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FirstTest extends TestUtils {

    @Test
    public void testFirst() throws InterruptedException {

        getDriver().get("https://rahulshettyacademy.com/locatorspractice/");

        String password = getPassword();

        getDriver().findElement(By.id("inputUsername")).sendKeys("rahulAcademy");
        getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
        //getDriver().findElement(By.id("chkboxOne")).click();
        Thread.sleep(500);
        //getDriver().findElement(By.id("chkboxTwo")).click();
        getDriver().findElement(By.xpath("//button[text()='Sign In']")).click();

        String successfulLoginMessage = getDriver().findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText();

        Assert.assertEquals(successfulLoginMessage, "You are successfHuYully logged in.");


    }
}
