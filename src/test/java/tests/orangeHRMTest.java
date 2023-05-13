package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class orangeHRMTest {

    @Test(priority = 1, description = "Login to OrangeHRM", dependsOnMethods = "")
    public void orangeTest() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        Dimension size = new Dimension(1350,750);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().window().setSize(size);

        Thread.sleep(9000);

        System.out.println(driver.getTitle());

        WebElement username = driver.findElement(By.cssSelector("input[name=\"username\"]"));

        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.cssSelector("input[name=\"password\"]"));

        password.sendKeys("admin123");

        WebElement loginBtn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));

        loginBtn.click();

        Thread.sleep(5000);


    }


}
