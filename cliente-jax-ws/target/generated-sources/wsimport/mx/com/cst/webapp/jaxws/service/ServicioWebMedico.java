
package mx.com.cst.webapp.jaxws.service;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "ServicioWebMedico", targetNamespace = "http://service.jaxws.webapp.cst.com.mx/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioWebMedico {


    /**
     * 
     * @param arg0
     * @return
     *     returns mx.com.cst.webapp.jaxws.service.Paciente
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearPaciente", targetNamespace = "http://service.jaxws.webapp.cst.com.mx/", className = "mx.com.cst.webapp.jaxws.service.CrearPaciente")
    @ResponseWrapper(localName = "crearPacienteResponse", targetNamespace = "http://service.jaxws.webapp.cst.com.mx/", className = "mx.com.cst.webapp.jaxws.service.CrearPacienteResponse")
    public Paciente crearPaciente(
        @WebParam(name = "arg0", targetNamespace = "")
        Paciente arg0);

    /**
     * 
     * @param arg0
     * @param arg1
     * @param arg2
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerDiagnostico", targetNamespace = "http://service.jaxws.webapp.cst.com.mx/", className = "mx.com.cst.webapp.jaxws.service.ObtenerDiagnostico")
    @ResponseWrapper(localName = "obtenerDiagnosticoResponse", targetNamespace = "http://service.jaxws.webapp.cst.com.mx/", className = "mx.com.cst.webapp.jaxws.service.ObtenerDiagnosticoResponse")
    public String obtenerDiagnostico(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        double arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "saludar", targetNamespace = "http://service.jaxws.webapp.cst.com.mx/", className = "mx.com.cst.webapp.jaxws.service.Saludar")
    @ResponseWrapper(localName = "saludarResponse", targetNamespace = "http://service.jaxws.webapp.cst.com.mx/", className = "mx.com.cst.webapp.jaxws.service.SaludarResponse")
    public String saludar(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<mx.com.cst.webapp.jaxws.service.Paciente>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarPacientes", targetNamespace = "http://service.jaxws.webapp.cst.com.mx/", className = "mx.com.cst.webapp.jaxws.service.ListarPacientes")
    @ResponseWrapper(localName = "listarPacientesResponse", targetNamespace = "http://service.jaxws.webapp.cst.com.mx/", className = "mx.com.cst.webapp.jaxws.service.ListarPacientesResponse")
    public List<Paciente> listarPacientes();

}