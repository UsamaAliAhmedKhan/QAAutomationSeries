package tests;

import Pages.LoginPage.LoginPage;
import Pages.LoginPage.LoginPageActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import support.webdriver.WebDriverClass;

public class orangeHRMTest extends WebDriverClass {

    @Test(priority = 1, description = "Login to OrangeHRM")
    public void orangeTest() throws InterruptedException {

        LoginPage loginPage = new LoginPage(getDriver());
        LoginPageActions loginPageActions = new LoginPageActions();

        loginPageActions.LoginToOrangeHRM(loginPage,"Admin","admin123");

        Thread.sleep(9000);

        System.out.println(getDriver().getTitle());

        Thread.sleep(2000);

    }


}
