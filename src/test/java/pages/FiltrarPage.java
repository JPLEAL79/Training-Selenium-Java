package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FiltrarPage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//*[@id='vertical-filters-custom']/div[2]/div[2]/ul/div/li/label/span[1]")
    private List<WebElement> listaDeMarcas;

    @FindBy(xpath = "//*[@class='fb-filter-subcategory'][contains (text(),'Notebooks')]")
    private WebElement listaVisisble;


    public FiltrarPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(this.driver, this);

    }

    public void obtenerDatosDeListaDeMarcas() {
        String nombreMarca = "";

        for (WebElement marca : listaDeMarcas) {
            nombreMarca = marca.getText();
            System.out.println(nombreMarca);

        }
    }
    public boolean listaVisisble(){
        return listaVisisble.isDisplayed();
    }
}