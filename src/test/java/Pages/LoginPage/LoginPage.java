package Pages.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

public class LoginPage {

    WebDriver driver;

    @FindBy(how = How.CSS, using = ("input[name=\"username\"]"))
    public WebElement username;

    @FindBy(how = How.CSS, using = ("input[name=\"password\"]"))
    public WebElement password;

    @FindBy(how = How.CSS, using = ("button[type=\"submit\"]"))
    public WebElement loginBtn;



    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void addUsername(String usernameField){
        username.sendKeys(usernameField);
    }

    public void addPassword(String passwordField){
        password.sendKeys(passwordField);
    }

    public void clickOnLogin(){
        loginBtn.click();
    }


}
