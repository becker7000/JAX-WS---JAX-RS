
package mx.com.cst.webapp.jaxws.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "ServicioWebMedicoImpService", targetNamespace = "http://service.jaxws.webapp.cst.com.mx/", wsdlLocation = "http://localhost:8080/exa-webapp-jax-ws/ServicioWebMedicoImp?wsdl")
public class ServicioWebMedicoImpService
    extends Service
{

    private static final URL SERVICIOWEBMEDICOIMPSERVICE_WSDL_LOCATION;
    private static final WebServiceException SERVICIOWEBMEDICOIMPSERVICE_EXCEPTION;
    private static final QName SERVICIOWEBMEDICOIMPSERVICE_QNAME = new QName("http://service.jaxws.webapp.cst.com.mx/", "ServicioWebMedicoImpService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/exa-webapp-jax-ws/ServicioWebMedicoImp?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOWEBMEDICOIMPSERVICE_WSDL_LOCATION = url;
        SERVICIOWEBMEDICOIMPSERVICE_EXCEPTION = e;
    }

    public ServicioWebMedicoImpService() {
        super(__getWsdlLocation(), SERVICIOWEBMEDICOIMPSERVICE_QNAME);
    }

    public ServicioWebMedicoImpService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOWEBMEDICOIMPSERVICE_QNAME, features);
    }

    public ServicioWebMedicoImpService(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOWEBMEDICOIMPSERVICE_QNAME);
    }

    public ServicioWebMedicoImpService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOWEBMEDICOIMPSERVICE_QNAME, features);
    }

    public ServicioWebMedicoImpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioWebMedicoImpService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicioWebMedico
     */
    @WebEndpoint(name = "ServicioWebMedicoImpPort")
    public ServicioWebMedico getServicioWebMedicoImpPort() {
        return super.getPort(new QName("http://service.jaxws.webapp.cst.com.mx/", "ServicioWebMedicoImpPort"), ServicioWebMedico.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioWebMedico
     */
    @WebEndpoint(name = "ServicioWebMedicoImpPort")
    public ServicioWebMedico getServicioWebMedicoImpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.jaxws.webapp.cst.com.mx/", "ServicioWebMedicoImpPort"), ServicioWebMedico.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOWEBMEDICOIMPSERVICE_EXCEPTION!= null) {
            throw SERVICIOWEBMEDICOIMPSERVICE_EXCEPTION;
        }
        return SERVICIOWEBMEDICOIMPSERVICE_WSDL_LOCATION;
    }

}