package mx.com.cst.webapp.jaxrs.service;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import mx.com.cst.webapp.jaxrs.model.Libro;
import mx.com.cst.webapp.jaxrs.repository.LibroRepository;

import java.util.List;

@Stateless
@WebService(endpointInterface = "mx.com.cst.webapp.jaxrs.service.LibroServicioWeb")
public class LibrosServicioWebImp implements LibroServicioWeb{

    @Inject
    private LibroRepository repository;

    @WebMethod
    @Override
    public List<Libro> listar() {
        return repository.listarLibros();
    }

    @WebMethod
    @Override
    public Libro guardar(Libro libro) {
        return repository.guardar(libro);
    }
}
