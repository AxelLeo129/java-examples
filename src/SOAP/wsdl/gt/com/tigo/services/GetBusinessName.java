
package SOAP.wsdl.gt.com.tigo.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GetBusinessName", targetNamespace = "http://services.tigo.com.gt", wsdlLocation = "http://172.22.181.110:8011/PortalWholesale/ProxyService/BusinessName?wsdl")
public class GetBusinessName
    extends Service
{

    private final static URL GETBUSINESSNAME_WSDL_LOCATION;
    private final static WebServiceException GETBUSINESSNAME_EXCEPTION;
    private final static QName GETBUSINESSNAME_QNAME = new QName("http://services.tigo.com.gt", "GetBusinessName");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://172.22.181.110:8011/PortalWholesale/ProxyService/BusinessName?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GETBUSINESSNAME_WSDL_LOCATION = url;
        GETBUSINESSNAME_EXCEPTION = e;
    }

    public GetBusinessName() {
        super(__getWsdlLocation(), GETBUSINESSNAME_QNAME);
    }

    public GetBusinessName(WebServiceFeature... features) {
        super(__getWsdlLocation(), GETBUSINESSNAME_QNAME, features);
    }

    public GetBusinessName(URL wsdlLocation) {
        super(wsdlLocation, GETBUSINESSNAME_QNAME);
    }

    public GetBusinessName(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GETBUSINESSNAME_QNAME, features);
    }

    public GetBusinessName(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetBusinessName(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GetBusinessNameSoap
     */
    @WebEndpoint(name = "GetBusinessNameSoap12")
    public GetBusinessNameSoap getGetBusinessNameSoap12() {
        return super.getPort(new QName("http://services.tigo.com.gt", "GetBusinessNameSoap12"), GetBusinessNameSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetBusinessNameSoap
     */
    @WebEndpoint(name = "GetBusinessNameSoap12")
    public GetBusinessNameSoap getGetBusinessNameSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.tigo.com.gt", "GetBusinessNameSoap12"), GetBusinessNameSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GETBUSINESSNAME_EXCEPTION!= null) {
            throw GETBUSINESSNAME_EXCEPTION;
        }
        return GETBUSINESSNAME_WSDL_LOCATION;
    }

}
