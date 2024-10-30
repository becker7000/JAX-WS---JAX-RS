# Servicios Web RESTful

## Descripción de la arquitectura RESTful y cómo se puede aplicar a los servicios web

**REST (Representational State Transfer)** es un estilo arquitectónico para diseñar servicios web que utiliza el protocolo HTTP. REST se basa en principios fundamentales que permiten la comunicación entre cliente y servidor de manera escalable y eficiente. Algunos de sus principios clave son:

- **Cliente-servidor**: La separación de preocupaciones entre cliente y servidor, lo que permite que ambos evolucionen de forma independiente.
- **Sin estado**: Cada solicitud del cliente al servidor debe contener toda la información necesaria para entender y procesar la solicitud. El servidor no almacena información sobre el estado del cliente entre solicitudes.
- **Cacheable**: Las respuestas deben ser definidas como caché o no caché, lo que ayuda a mejorar el rendimiento al reducir la necesidad de solicitudes redundantes.
- **Interfaz uniforme**: La comunicación se lleva a cabo a través de una interfaz uniforme que simplifica la arquitectura y permite la interoperabilidad.

Estos principios se aplican a los servicios web al definir recursos y sus representaciones, facilitando el acceso y la manipulación de datos a través de HTTP.

## Diseño de un servicio web RESTful e identificación de recursos

Al diseñar un servicio web RESTful, es crucial identificar los **recursos** que se ofrecerán. Los recursos son entidades que representan información que puede ser manipulada. Por ejemplo, en un servicio de gestión de libros, los recursos pueden ser:

- `/books`: Colección de libros.
- `/books/{id}`: Un libro específico por su ID.

Es importante utilizar sustantivos en lugar de verbos para los endpoints, ya que las acciones se definen a través de los métodos HTTP (GET, POST, PUT, DELETE).

## Navegación por un servicio web RESTful mediante hipermedia

La **hipermedia** es una técnica que permite a los clientes navegar por un servicio web RESTful utilizando enlaces en las respuestas. Esto se basa en el principio de **HATEOAS (Hypermedia as the Engine of Application State)**, donde un cliente interactúa con la aplicación enteramente a través de hipermedios proporcionados por el servidor.

Por ejemplo, al solicitar un recurso de libro, la respuesta podría incluir enlaces a otros recursos relacionados:

```json
{
  "id": 1,
  "title": "Aprendiendo REST",
  "author": "Juan Pérez",
  "links": [
    { "rel": "self", "href": "/books/1" },
    { "rel": "author", "href": "/authors/1" },
    { "rel": "reviews", "href": "/books/1/reviews" }
  ]
}
```

# Creación de Clientes RESTful en Java

## Uso de las API de Java SE para realizar solicitudes HTTP

Java SE proporciona la clase `HttpURLConnection` que permite realizar solicitudes HTTP. Esta clase es parte del paquete `java.net` y ofrece una forma básica de interactuar con servicios web. Los pasos típicos para realizar una solicitud son:

1. **Establecer la conexión**: Usar `URL` para crear un objeto de conexión.
2. **Configurar la solicitud**: Especificar el método HTTP (GET, POST, etc.), los encabezados y otros parámetros.
3. **Enviar la solicitud**: Leer la respuesta y manejarla según sea necesario.

Un ejemplo básico de una solicitud GET:

```java
import java.net.HttpURLConnection;
import java.net.URL;

public class SimpleHttpClient {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://api.example.com/data");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);

        // Manejar la respuesta...
    }
}
```

