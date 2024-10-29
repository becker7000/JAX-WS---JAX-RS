```xml
<?xml version="1.0" encoding="UTF-8"?>
```

```xml
<?xml version="1.0" encoding="UTF-8"?>
<libros>
    <libro id="1">
        <titulo>Aprendiendo XML</titulo>
        <autor>Juan Pérez</autor>
        <precio>29.99</precio>
    </libro>
</libros>
```

```xml
<?xml version="1.0" encoding="UTF-8"?>
<libros xmlns:fic="http://example.com/ficcion">
    <fic:libro id="1">
        <fic:titulo>Una novela interesante</fic:titulo>
        <fic:autor>María Gómez</fic:autor>
    </fic:libro>
</libros>
```

```xml
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">
    <xs:element name="libros">
        <xs:complexType>
            <xs:sequence>
                <xs:element name="libro" maxOccurs="unbounded">
                    <xs:complexType>
                        <xs:sequence>
                            <xs:element name="titulo" type="xs:string"/>
                            <xs:element name="autor" type="xs:string"/>
                            <xs:element name="precio" type="xs:decimal"/>
                        </xs:sequence>
                        <xs:attribute name="id" type="xs:integer" use="required"/>
                    </xs:complexType>
                </xs:element>
            </xs:sequence>
        </xs:complexType>
    </xs:element>
</xs:schema>
```

```xml
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">
    <xs:element name="persona">
        <xs:complexType>
            <xs:sequence>
                <xs:element name="nombre" type="xs:string"/>
                <xs:element name="edad" type="xs:integer"/>
                <xs:element name="peso" type="xs:decimal"/>
                <xs:element name="conectada" type="xs:boolean"/>
                <xs:element name="fechaNacimiento" type="xs:date"/>
                <xs:element name="horaRegistro" type="xs:time"/>
            </xs:sequence>
            <xs:attribute name="id" type="xs:long" use="required"/>
        </xs:complexType>
    </xs:element>
</xs:schema>
```

Ejercicio 1:
-Crear un esquema XML (XSD) para describir un documento que contiene información sobre automóviles.
automoviles.xsd
```xml
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">
    <xs:element name="automoviles">
        <xs:complexType>
            <xs:sequence>
                <xs:element name="automovil" maxOccurs="unbounded">
                    <xs:complexType>
                        <xs:sequence>
                            <xs:element name="marca" type="xs:string"/>
                            <xs:element name="modelo" type="xs:string"/>
                            <xs:element name="anio" type="xs:integer"/>
                            <xs:element name="color" type="xs:string"/>
                            <xs:element name="precio" type="xs:decimal"/>
                        </xs:sequence>
                        <xs:attribute name="id" type="xs:integer" use="required"/>
                    </xs:complexType>
                </xs:element>
            </xs:sequence>
        </xs:complexType>
    </xs:element>
</xs:schema>
```

Ejercicio 2:
Crear un documento XML válido basado en este esquema.
```xml
<?xml version="1.0" encoding="UTF-8"?>
<automoviles>
    <automovil id="1">
        <marca>Toyota</marca>
        <modelo>Corolla</modelo>
        <anio>2020</anio>
        <color>Blanco</color>
        <precio>20000.00</precio>
    </automovil>
    <automovil id="2">
        <marca>Ford</marca>
        <modelo>Mustang</modelo>
        <anio>2021</anio>
        <color>Rojo</color>
        <precio>30000.00</precio>
    </automovil>
</automoviles>
```

```bash
echo %JBOSS_HOME%
```

```bash
standalone.bat
```

```bash
add-user.bat
```

![alt text](image.png)

> EXPLICACIÓN WSDL
# Explicación del WSDL

El WSDL (Web Services Description Language) describe el servicio web, sus operaciones, tipos de datos y cómo interactuar con él.

## Estructura del WSDL

1. **Elementos Principales**:
   - `<wsdl:definitions>`: Elemento raíz que encapsula la definición del servicio web. Incluye espacios de nombres y define el objetivo del WSDL.
   - `xmlns:tns`: Define el espacio de nombres de destino, que es único para este servicio.

2. **Tipos de Datos (`<wsdl:types>`)**:
   - Contiene esquemas XML (`<xs:schema>`) que definen los tipos de datos utilizados por el servicio.
   - Aquí se definen varios elementos y tipos complejos, como `crearPaciente`, `saludar`, `listarPacientes`, etc.

3. **Mensajes (`<wsdl:message>`)**:
   - Define los mensajes que se intercambiarán entre el cliente y el servicio. Cada operación tiene un mensaje de entrada y uno de salida.
   - Ejemplos:
     - `crearPaciente` incluye un parámetro que es un objeto de tipo `paciente`.
     - `saludar` recibe un `String` y devuelve otro `String`.

4. **Puerto (`<wsdl:portType>`)**:
   - Define las operaciones disponibles en el servicio. En este caso, las operaciones son `crearPaciente`, `saludar` y `listarPacientes`.
   - Cada operación incluye las entradas y salidas correspondientes.

5. **Binding (`<wsdl:binding>`)**:
   - Define cómo se transmiten los mensajes (en este caso, usando SOAP).
   - Especifica el estilo de la operación (documento) y el transporte (HTTP).

6. **Servicio (`<wsdl:service>`)**:
   - Describe el servicio web y su punto de acceso.
   - Contiene un puerto que se puede usar para acceder al servicio, incluyendo la dirección donde está disponible.

## Ejemplo de Operaciones Definidas

- **crearPaciente**:
  - **Entrada**: Un objeto `paciente` que contiene el nombre.
  - **Salida**: Un objeto `paciente` que representa al paciente creado.

- **saludar**:
  - **Entrada**: Un `String` (nombre o saludo).
  - **Salida**: Un `String` que contiene el saludo.

- **listarPacientes**:
  - **Entrada**: No requiere parámetros.
  - **Salida**: Una lista de objetos `paciente`.

## Conclusión

Este WSDL proporciona una descripción clara del servicio web `ServicioWebMedicoImpService`, detallando cómo interactuar con él a través de operaciones SOAP. Los clientes pueden usar este WSDL para generar código y realizar llamadas al servicio web.

> Mensaje SOAP

```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
               xmlns:tns="http://example.com/servicio">
    <soap:Header>
        <tns:Security>
            <tns:Username>usuario</tns:Username>
            <tns:Password>contraseña</tns:Password>
        </tns:Security>
    </soap:Header>
    <soap:Body>
        <tns:SolicitarDatos>
            <tns:Param1>valor1</tns:Param1>
            <tns:Param2>valor2</tns:Param2>
        </tns:SolicitarDatos>
    </soap:Body>
</soap:Envelope>

```