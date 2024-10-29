package mx.com.cst.webapp.jaxb.main;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import mx.com.cst.webapp.jaxb.model.Circulo;

import java.io.File;

public class DeserializacionTest {
    public static void main(String[] args) {
        try {
            // Especificar el archivo XML de entrada
            File archivo = new File("circulo.xml");

            // Crear el contexto JAXB
            JAXBContext contexto = JAXBContext.newInstance(Circulo.class);

            // Crear el unmarshaller
            Unmarshaller unmarshaller = contexto.createUnmarshaller();

            // Deserializar el objeto de XML a un objeto Circulo
            Circulo circulo = (Circulo) unmarshaller.unmarshal(archivo);

            // Mostrar el resultado
            System.out.println("Objeto Circulo deserializado: ");
            System.out.println("Radio: " + circulo.getRadio());
            System.out.println("Área: " + circulo.calcularArea());
            System.out.println("Perímetro: " + circulo.calcularPerimetro());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

