package co.com.choucairtesting.certification.reto2.steps;

import co.com.choucairtesting.certification.reto2.pagesobject.MapeoChoucairTestingReto2Empleo;
import net.thucydides.core.annotations.Step;

import java.awt.*;
import java.util.List;

public class AbrirChoucairTestingStep {
    MapeoChoucairTestingReto2Empleo mapeoChoucairTestingReto2Empleo;

    @Step
    public void abrirPagina() {
        mapeoChoucairTestingReto2Empleo.open();
    }

    @Step
    public void abrirEmpleo() {
        mapeoChoucairTestingReto2Empleo.abrirModuloEmpleo();
    }

    @Step
    public void abrirConvocatorias() {
        mapeoChoucairTestingReto2Empleo.clickConvocatoria();
    }

    @Step
    public void agregarData(List<ModelDataStep> dato) throws AWTException {
        mapeoChoucairTestingReto2Empleo.agregarData(dato);
    }

    @Step
    public void elegirEmpleo() {
        mapeoChoucairTestingReto2Empleo.clickEmpleo();
    }

    @Step
    public void verificarautomatizacion (String mensaje) {
        mapeoChoucairTestingReto2Empleo.verificarEmpleo(mensaje);
    }

}
