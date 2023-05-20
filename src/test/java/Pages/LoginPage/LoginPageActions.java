package Pages.LoginPage;

import org.openqa.selenium.Dimension;
import support.webdriver.WebDriverClass;

public class LoginPageActions extends WebDriverClass {

    public void LoginToOrangeHRM(LoginPage loginPage, String username, String password) throws InterruptedException {
        Dimension size = new Dimension(1350,750);
        getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        getDriver().manage().window().setSize(size);

        Thread.sleep(9000);

        loginPage.addUsername(username);
        loginPage.addPassword(password);
        loginPage.clickOnLogin();
    }

}
