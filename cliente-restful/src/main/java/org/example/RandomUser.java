package org.example;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.GenericType;

import java.util.List;
import java.util.Map;

public class RandomUser {

    public static void main(String[] args) {
        // Crear el cliente
        Client client = ClientBuilder.newClient();

        // Definir el objetivo de la solicitud
        WebTarget target = client.target("https://randomuser.me/api/?results=10");

        // Realizar la solicitud GET y obtener la respuesta
        Response response = target.request(MediaType.APPLICATION_JSON).get();

        // Verificar que la respuesta sea exitosa
        if (response.getStatus() == 200) {
            // Leer el cuerpo de la respuesta como un mapa genérico
            Map<String, Object> jsonResponse = response.readEntity(new GenericType<Map<String, Object>>() {});

            // Obtener la lista de usuarios
            List<Map<String, Object>> users = (List<Map<String, Object>>) jsonResponse.get("results");

            // Iterar sobre la lista de usuarios y mostrar los datos
            for (Map<String, Object> user : users) {
                /*
                    // Suponiendo que 'name' es un mapa que contiene los campos 'first' y 'last'
                    Map<String, Object> name = (Map<String, Object>) user.get("name");
                    System.out.println("Nombre: " + name.get("first"));
                 */
                System.out.println("Nombre: " + user.get("name"));
                System.out.println("Email: " + user.get("email"));
                System.out.println("Teléfono: " + user.get("phone"));
                System.out.println("Dirección: " + user.get("location"));
                System.out.println("Cumpleaños: " + user.get("dob"));
                System.out.println("Género: " + user.get("gender"));
                System.out.println("Foto: " + user.get("picture"));
                System.out.println("Nacionalidad: " + user.get("nat"));
                System.out.println("ID: " + user.get("login"));
                System.out.println("------------------------------------------------");
            }
        } else {
            // Manejar el error si la respuesta no es exitosa
            System.err.println("Error en la solicitud: " + response.getStatus());
        }

        // Cerrar el cliente
        client.close();
    }
}
