package co.com.choucairtesting.certification.reto2.pagesobject;

import co.com.choucairtesting.certification.reto2.steps.AbrirChoucairTestingStep;
import co.com.choucairtesting.certification.reto2.steps.ModelDataStep;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import net.thucydides.core.annotations.DefaultUrl;


import java.awt.*;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DefaultUrl("https://www.choucairtesting.com/")
public class MapeoChoucairTestingReto2Empleo  extends PageObject {
    AbrirChoucairTestingStep abrirChoucairTestingStep;

    @FindBy(xpath = "//*[@id='menu-item-550']/a")
    WebElementFacade OPCION_EMPLEO;
    @FindBy(xpath = "//*[@id='content']/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div/div/div/figure/a/img")
    WebElementFacade CONVOCATORIAS;
    @FindBy(name = "search_keywords")
    static
    WebElementFacade PALABRA_CLAVE;
    @FindBy (id = "search_location")
    static
    WebElementFacade UBICACION;
    @FindBy (xpath = "//*[@id='content']/div/div/div/div/div/section[12]/div/div/div/div/div/div[2]/div/div/div/form/div[1]/div[4]/input")
    static
    WebElementFacade BOTON_BUSCAR_EMPLEO;
    @FindBy (xpath = "//*[@id='content']/div/div/div/div/div/section[12]/div/div/div/div/div/div[2]/div/div/div/ul/li[1]/a/div[1]/h3")
    static
    WebElementFacade EMPLEO;
    @FindBy (xpath = "//*[@id='post-387']/header/h1")
    WebElementFacade RESPUESTA;

    public void abrirModuloEmpleo () {
        OPCION_EMPLEO.click();
    }

    public void clickConvocatoria () {
        CONVOCATORIAS.click();

    }

    public static void agregarData(List<ModelDataStep> dato) throws AWTException {
        PALABRA_CLAVE.sendKeys(dato.get(0).getPalabraclave());
        UBICACION.sendKeys(dato.get(0).getUbicacion());
        BOTON_BUSCAR_EMPLEO.click();

    }

    public void clickEmpleo() {
        EMPLEO.click();
    }

    public void verificarEmpleo(String mensaje) {
        assertThat(mensaje,containsText(RESPUESTA.getText()));
    }

    private void assertThat(String mensaje, boolean containsText) {
    }
}

