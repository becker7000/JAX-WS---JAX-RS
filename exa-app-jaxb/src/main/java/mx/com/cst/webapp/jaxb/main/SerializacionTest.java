package mx.com.cst.webapp.jaxb.main;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import mx.com.cst.webapp.jaxb.model.Circulo;

import java.io.File;

public class SerializacionTest {
    public static void main(String[] args) {
        try {
            // Crear un objeto Circulo
            Circulo circulo = new Circulo(5.0); // radio 5.0

            // Crear el contexto JAXB
            JAXBContext contexto = JAXBContext.newInstance(Circulo.class);

            // Crear el marshaller
            Marshaller marshaller = contexto.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // Especificar el archivo de salida
            File archivo = new File("circulo.xml");

            // Serializar el objeto a XML
            marshaller.marshal(circulo, archivo);
            System.out.println("Objeto Circulo serializado a XML: " + archivo.getAbsolutePath());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
