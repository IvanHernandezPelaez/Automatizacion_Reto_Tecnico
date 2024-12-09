package com.swag.co.utilidades.sitioweb;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class SitioWeb {

    @Steps(shared = true)
    PageObject web;

    @Step("Navegar al sitio web")
    public void navigarAlSitioWeb(String url){
        web.setDefaultBaseUrl(url);
        web.open();

    }

}
