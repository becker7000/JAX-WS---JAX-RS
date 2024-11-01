package mx.com.cst.webapp.jaxrs;

import mx.com.cst.webapp.jaxrs.service.LibroService;
import mx.com.cst.webapp.jaxrs.service.LibroServiceImp;

public class Main {
    public static void main(String[] args) {

        LibroService unLibroService = new LibroServiceImp();
        unLibroService.listar().forEach(
                l -> System.out.println("\n\t Titulo: "+l.getTitulo())
        );

    }
}