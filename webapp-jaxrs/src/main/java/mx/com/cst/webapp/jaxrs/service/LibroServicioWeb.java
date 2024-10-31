package mx.com.cst.webapp.jaxrs.service;

import jakarta.ejb.Stateless;
import jakarta.jws.WebService;
import mx.com.cst.webapp.jaxrs.model.Libro;

import java.util.List;

@WebService
public interface LibroServicioWeb {
    List<Libro> listar();
    Libro guardar(Libro libro);
}
