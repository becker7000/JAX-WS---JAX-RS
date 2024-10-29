
package mx.com.cst.webapp.jaxws.service;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.com.cst.webapp.jaxws.service package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _CrearPaciente_QNAME = new QName("http://service.jaxws.webapp.cst.com.mx/", "crearPaciente");
    private static final QName _CrearPacienteResponse_QNAME = new QName("http://service.jaxws.webapp.cst.com.mx/", "crearPacienteResponse");
    private static final QName _ListarPacientes_QNAME = new QName("http://service.jaxws.webapp.cst.com.mx/", "listarPacientes");
    private static final QName _ListarPacientesResponse_QNAME = new QName("http://service.jaxws.webapp.cst.com.mx/", "listarPacientesResponse");
    private static final QName _ObtenerDiagnostico_QNAME = new QName("http://service.jaxws.webapp.cst.com.mx/", "obtenerDiagnostico");
    private static final QName _ObtenerDiagnosticoResponse_QNAME = new QName("http://service.jaxws.webapp.cst.com.mx/", "obtenerDiagnosticoResponse");
    private static final QName _Saludar_QNAME = new QName("http://service.jaxws.webapp.cst.com.mx/", "saludar");
    private static final QName _SaludarResponse_QNAME = new QName("http://service.jaxws.webapp.cst.com.mx/", "saludarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.cst.webapp.jaxws.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearPaciente }
     * 
     * @return
     *     the new instance of {@link CrearPaciente }
     */
    public CrearPaciente createCrearPaciente() {
        return new CrearPaciente();
    }

    /**
     * Create an instance of {@link CrearPacienteResponse }
     * 
     * @return
     *     the new instance of {@link CrearPacienteResponse }
     */
    public CrearPacienteResponse createCrearPacienteResponse() {
        return new CrearPacienteResponse();
    }

    /**
     * Create an instance of {@link ListarPacientes }
     * 
     * @return
     *     the new instance of {@link ListarPacientes }
     */
    public ListarPacientes createListarPacientes() {
        return new ListarPacientes();
    }

    /**
     * Create an instance of {@link ListarPacientesResponse }
     * 
     * @return
     *     the new instance of {@link ListarPacientesResponse }
     */
    public ListarPacientesResponse createListarPacientesResponse() {
        return new ListarPacientesResponse();
    }

    /**
     * Create an instance of {@link ObtenerDiagnostico }
     * 
     * @return
     *     the new instance of {@link ObtenerDiagnostico }
     */
    public ObtenerDiagnostico createObtenerDiagnostico() {
        return new ObtenerDiagnostico();
    }

    /**
     * Create an instance of {@link ObtenerDiagnosticoResponse }
     * 
     * @return
     *     the new instance of {@link ObtenerDiagnosticoResponse }
     */
    public ObtenerDiagnosticoResponse createObtenerDiagnosticoResponse() {
        return new ObtenerDiagnosticoResponse();
    }

    /**
     * Create an instance of {@link Saludar }
     * 
     * @return
     *     the new instance of {@link Saludar }
     */
    public Saludar createSaludar() {
        return new Saludar();
    }

    /**
     * Create an instance of {@link SaludarResponse }
     * 
     * @return
     *     the new instance of {@link SaludarResponse }
     */
    public SaludarResponse createSaludarResponse() {
        return new SaludarResponse();
    }

    /**
     * Create an instance of {@link Paciente }
     * 
     * @return
     *     the new instance of {@link Paciente }
     */
    public Paciente createPaciente() {
        return new Paciente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearPaciente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearPaciente }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.jaxws.webapp.cst.com.mx/", name = "crearPaciente")
    public JAXBElement<CrearPaciente> createCrearPaciente(CrearPaciente value) {
        return new JAXBElement<>(_CrearPaciente_QNAME, CrearPaciente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearPacienteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearPacienteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.jaxws.webapp.cst.com.mx/", name = "crearPacienteResponse")
    public JAXBElement<CrearPacienteResponse> createCrearPacienteResponse(CrearPacienteResponse value) {
        return new JAXBElement<>(_CrearPacienteResponse_QNAME, CrearPacienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPacientes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarPacientes }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.jaxws.webapp.cst.com.mx/", name = "listarPacientes")
    public JAXBElement<ListarPacientes> createListarPacientes(ListarPacientes value) {
        return new JAXBElement<>(_ListarPacientes_QNAME, ListarPacientes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPacientesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarPacientesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.jaxws.webapp.cst.com.mx/", name = "listarPacientesResponse")
    public JAXBElement<ListarPacientesResponse> createListarPacientesResponse(ListarPacientesResponse value) {
        return new JAXBElement<>(_ListarPacientesResponse_QNAME, ListarPacientesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDiagnostico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerDiagnostico }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.jaxws.webapp.cst.com.mx/", name = "obtenerDiagnostico")
    public JAXBElement<ObtenerDiagnostico> createObtenerDiagnostico(ObtenerDiagnostico value) {
        return new JAXBElement<>(_ObtenerDiagnostico_QNAME, ObtenerDiagnostico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDiagnosticoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerDiagnosticoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.jaxws.webapp.cst.com.mx/", name = "obtenerDiagnosticoResponse")
    public JAXBElement<ObtenerDiagnosticoResponse> createObtenerDiagnosticoResponse(ObtenerDiagnosticoResponse value) {
        return new JAXBElement<>(_ObtenerDiagnosticoResponse_QNAME, ObtenerDiagnosticoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Saludar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Saludar }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.jaxws.webapp.cst.com.mx/", name = "saludar")
    public JAXBElement<Saludar> createSaludar(Saludar value) {
        return new JAXBElement<>(_Saludar_QNAME, Saludar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaludarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaludarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.jaxws.webapp.cst.com.mx/", name = "saludarResponse")
    public JAXBElement<SaludarResponse> createSaludarResponse(SaludarResponse value) {
        return new JAXBElement<>(_SaludarResponse_QNAME, SaludarResponse.class, null, value);
    }

}
