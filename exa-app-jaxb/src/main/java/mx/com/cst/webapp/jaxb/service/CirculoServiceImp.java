package mx.com.cst.webapp.jaxb.service;

import jakarta.jws.WebService;
import mx.com.cst.webapp.jaxb.model.Circulo;

@WebService(endpointInterface = "mx.com.cst.webapp.jaxws.service.CirculoService")
public class CirculoServiceImp implements CirculoService {

    @Override
    public Circulo calcularArea(Circulo circulo) {
        double area = circulo.calcularArea();
        return new Circulo(area);
    }

    @Override
    public Circulo calcularPerimetro(Circulo circulo) {
        double perimetro = circulo.calcularPerimetro();
        return new Circulo(perimetro);
    }
}
