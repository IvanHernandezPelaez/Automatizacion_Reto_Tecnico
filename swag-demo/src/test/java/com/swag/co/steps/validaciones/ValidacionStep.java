package com.swag.co.steps.validaciones;

import com.swag.co.pages.validaciones.ValidacionPage;
import net.serenitybdd.annotations.Step;
public class ValidacionStep {

    private ValidacionPage validacionPage;
    @Step("Validar página de finalizar compra")
    public Boolean textoFinalizarCompra(){
        return validacionPage.getTxtFinalizarCompra().isVisible();
    }


}
