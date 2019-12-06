package co.com.choucairtesting.certification.reto2.definitions;

import co.com.choucairtesting.certification.reto2.steps.AbrirChoucairTestingStep;

import co.com.choucairtesting.certification.reto2.steps.ModelDataStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.model.DataTable;

import java.awt.*;
import java.util.List;

public class reto2EmpleoDefinition {
    @Steps
    AbrirChoucairTestingStep abrirChoucairTestingStep;


    @Dado("^que (.*) quiere encontrar empleo$")
    public void que_Jennifer_quiere_encontrar_empleo(String Jennifer)  {
        abrirChoucairTestingStep.abrirPagina();
        abrirChoucairTestingStep.abrirEmpleo();
    }

    @Cuando("^ella de click en convocatorias e ingrese una palabra clave en empleo y su ubicación$")
    public void ella_de_click_en_convocatorias_e_ingrese_una_palabra_clave_en_empleo_y_su_ubicación(List<ModelDataStep> dato) throws AWTException {
        abrirChoucairTestingStep.abrirConvocatorias();
        abrirChoucairTestingStep.agregarData(dato);
        abrirChoucairTestingStep.elegirEmpleo();

    }

    @Entonces("^ella verifica el empleo con la palabra (.*)$")
    public void ella_verifica_el_empleo_con_la_palabra_Analista(String mensaje)  {
        abrirChoucairTestingStep.verificarautomatizacion(mensaje);
    }
}
