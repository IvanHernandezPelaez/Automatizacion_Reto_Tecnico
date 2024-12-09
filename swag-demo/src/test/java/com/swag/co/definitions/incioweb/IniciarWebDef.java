package com.swag.co.definitions.incioweb;

import com.swag.co.steps.productos.SeleccionarProductosSteps;
import com.swag.co.steps.validaciones.ValidacionStep;
import com.swag.co.utilidades.sitioweb.SitioWeb;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class IniciarWebDef {

    @Steps(shared = true)
    SitioWeb url;

    @Steps
    SeleccionarProductosSteps seleccionarProductosSteps;

    @Steps(shared = true)
    ValidacionStep validate;


    @Dado("el usuario navega al sitio web")
    public void queElUsuarioNavegaAlSitioWeb(){
        url.navigarAlSitioWeb("https://sanangel.com.co/producto/versalles/");
    }

    @Cuando ("agrega productos al carrito de compras")
    public void agregaProductosAlCarritoDeCompras(){
        seleccionarProductosSteps.clickAnadirAlCarrito();
    }

    @Entonces ("el sistema debería mostrar pagina para finalizar compra")
    public void elSistemaDeberiaMostrarPaginaParaFinalizarCompra(){
        Assert.assertTrue(validate.textoFinalizarCompra());

    }

}


