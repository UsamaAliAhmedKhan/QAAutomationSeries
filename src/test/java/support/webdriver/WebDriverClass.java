package support.webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class WebDriverClass {

    private static WebDriver driver;

    public void WebDriverClass(){

    }

    public WebDriver getDriver(){
        WebDriverManager.chromedriver().setup();

        if (driver == null){
            driver = new ChromeDriver();
        }

        return driver;

    }

    @AfterSuite
    public void tearup(){
        if (driver != null){
            driver.quit();
        }
    }


}
