package com.swag.co.pages.validaciones;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidacionPage extends PageObject {

    @FindBy(xpath = "//h1[@class='entry-title']")
    private WebElementFacade txtFinalizarCompra;


    public WebElementFacade getTxtFinalizarCompra() {
        return txtFinalizarCompra;
    }

}
