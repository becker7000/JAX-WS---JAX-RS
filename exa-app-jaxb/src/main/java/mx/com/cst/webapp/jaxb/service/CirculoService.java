package mx.com.cst.webapp.jaxb.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import mx.com.cst.webapp.jaxb.model.Circulo;

@WebService
public interface CirculoService {
    @WebMethod
    Circulo calcularArea(Circulo circulo);

    @WebMethod
    Circulo calcularPerimetro(Circulo circulo);
}
