
package br.com.lemontech.selfbooking.wsselfbooking.services;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WsSelfBookingService", targetNamespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", wsdlLocation = "https://treinamento.lemontech.com.br/wsselfbooking/WsSelfBookingService?wsdl")
public class WsSelfBookingService
    extends Service
{

    private final static URL WSSELFBOOKINGSERVICE_WSDL_LOCATION;
    private final static WebServiceException WSSELFBOOKINGSERVICE_EXCEPTION;
    private final static QName WSSELFBOOKINGSERVICE_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "WsSelfBookingService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://treinamento.lemontech.com.br/wsselfbooking/WsSelfBookingService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSSELFBOOKINGSERVICE_WSDL_LOCATION = url;
        WSSELFBOOKINGSERVICE_EXCEPTION = e;
    }

    public WsSelfBookingService() {
        super(__getWsdlLocation(), WSSELFBOOKINGSERVICE_QNAME);
    }

    public WsSelfBookingService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSSELFBOOKINGSERVICE_QNAME, features);
    }

    public WsSelfBookingService(URL wsdlLocation) {
        super(wsdlLocation, WSSELFBOOKINGSERVICE_QNAME);
    }

    public WsSelfBookingService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSSELFBOOKINGSERVICE_QNAME, features);
    }

    public WsSelfBookingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsSelfBookingService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsSelfBooking
     */
    @WebEndpoint(name = "WsSelfBookingPort")
    public WsSelfBooking getWsSelfBookingPort() {
        return super.getPort(new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "WsSelfBookingPort"), WsSelfBooking.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsSelfBooking
     */
    @WebEndpoint(name = "WsSelfBookingPort")
    public WsSelfBooking getWsSelfBookingPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "WsSelfBookingPort"), WsSelfBooking.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSSELFBOOKINGSERVICE_EXCEPTION!= null) {
            throw WSSELFBOOKINGSERVICE_EXCEPTION;
        }
        return WSSELFBOOKINGSERVICE_WSDL_LOCATION;
    }

}
