package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//*[@class='fb-masthead-login__user-info__logged']")
    private WebElement clickIniciaSesion;
    @FindBy(xpath = "//input[@id='emailAddress']")
    private WebElement campoEmail;
    @FindBy(xpath = "//*[@name='password']")
    private WebElement campoPassword;
    @FindBy(xpath = "//*[contains (text() , 'Iniciar sesión')]")
    private WebElement loginButton;
    @FindBy(xpath = "//*[contains (text(),'Bienvenid@,')]")
    private WebElement usuarioLogueado;

    public  LoginPage(WebDriver driver){
        this.driver= driver;
        wait = new WebDriverWait(driver,15);
        PageFactory.initElements(this.driver,this);

    }

    public void Login(String email,String password){

        clickIniciaSesion.click();
        campoEmail.sendKeys(email);
        campoPassword.sendKeys(password);
        loginButton.click();

    }
    public boolean ok(){
      return usuarioLogueado.isDisplayed();
    }
}
