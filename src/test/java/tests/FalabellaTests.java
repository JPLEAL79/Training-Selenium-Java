package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FalabellaTests extends BaseTests {


    @Test
    public void testBuscarArticulo() {

        String nombreProducto = "Notebooks";

        loginPage.Login("jpleal79@gmail.com","serrano832");
        Assert.assertTrue(loginPage.ok());

        homePage.buscarEnCajaDeTexto(nombreProducto);
        Assert.assertTrue(homePage.at());

        filtrarPage.obtenerDatosDeListaDeMarcas();
        Assert.assertTrue(filtrarPage.listaVisisble());


    }
}
