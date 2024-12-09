package com.swag.co.steps.productos;

import com.swag.co.pages.productos.SeleccionarProductosPage;
import com.swag.co.pages.validaciones.ValidacionPage;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class SeleccionarProductosSteps {

    @Page
    SeleccionarProductosPage seleccionarProductosPage;

    @Page
    ValidacionPage validacionPage;

    @Step("Click en el botón añadir al carrito")
    public void clickAnadirAlCarrito() {
        seleccionarProductosPage.clickAnadirAlCarrito();

    }
}
