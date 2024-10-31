package org.example;

import mx.com.cst.webapp.jaxrs.service.LibroServicioWeb;
import mx.com.cst.webapp.jaxrs.service.LibrosServicioWebImpService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        LibroServicioWeb libroServicioWeb = new LibrosServicioWebImpService().getLibrosServicioWebImpPort();
        libroServicioWeb.listar().forEach(
                libro -> System.out.println("\n\t Nombre: "+libro.getTitulo())
        );




    }
}