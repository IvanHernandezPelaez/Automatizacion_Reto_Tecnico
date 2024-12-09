package com.swag.co.pages.productos;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SeleccionarProductosPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"product-21738\"]/div[2]/form/button")
    private WebElementFacade btnAnadirAlCarrito;

    public void clickAnadirAlCarrito() {
        btnAnadirAlCarrito.click();
    }

}
