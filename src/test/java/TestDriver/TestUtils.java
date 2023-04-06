package TestDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestUtils {

        public WebDriver driver;

        @BeforeMethod
        protected void BeforeMethod(){
        driver = BaseTest.driver();
    }

        @AfterMethod
        protected void AfterMethod(){
        driver.quit();
    }

        protected WebDriver getDriver(){
        return driver;
    }

    //          = Утилитарные Методы =
    public String getPassword() throws InterruptedException{

        TestUtils testUtils = new TestUtils();

        getDriver().findElement(By.xpath("//a[text()='Forgot your password?']")).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//button[text()='Reset Login']")).click();
        Thread.sleep(2000);
        String pass = getDriver().findElement(By.xpath("//p[contains(@class,'infoMsg')]")).getText();
        String[] passArr = pass.split("'", 3);
        String str = passArr[1];
        getDriver().findElement(By.xpath("//button[text()='Go to Login']")).click();
        return str;
    }

}
