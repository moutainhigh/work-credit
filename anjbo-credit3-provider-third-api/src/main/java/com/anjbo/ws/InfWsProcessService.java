
package com.anjbo.ws;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

import org.springframework.util.ResourceUtils;

import com.anjbo.creditapp.InfWsLoginService;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "InfWsProcessService", targetNamespace = "http://ws.inf.creditapp.app/", wsdlLocation = "http://192.168.64.5:51080/cms/services/creditService?wsdl")
public class InfWsProcessService
    extends Service
{

    private final static URL INFWSPROCESSSERVICE_WSDL_LOCATION;
    private final static WebServiceException INFWSPROCESSSERVICE_EXCEPTION;
    private final static QName INFWSPROCESSSERVICE_QNAME = new QName("http://ws.inf.creditapp.app/", "InfWsProcessService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
       	 url =  	InfWsProcessService.class.getResource("/sgtws/stgCreditService.wsdl");
       	if (url == null) {
       		url = ResourceUtils.getURL(ResourceUtils.CLASSPATH_URL_PREFIX + "/sgtws/stgCreditService.wsdl");
		}
       	System.out.println("url======="+url);
        	
        } catch (Exception ex) {
            e = new WebServiceException(ex);
        }
        INFWSPROCESSSERVICE_WSDL_LOCATION = url;
        INFWSPROCESSSERVICE_EXCEPTION = e;
    }

    public InfWsProcessService() {
        super(__getWsdlLocation(), INFWSPROCESSSERVICE_QNAME);
    }

    public InfWsProcessService(WebServiceFeature... features) {
        super(__getWsdlLocation(), INFWSPROCESSSERVICE_QNAME, features);
    }

    public InfWsProcessService(URL wsdlLocation) {
        super(wsdlLocation, INFWSPROCESSSERVICE_QNAME);
    }

    public InfWsProcessService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INFWSPROCESSSERVICE_QNAME, features);
    }

    public InfWsProcessService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InfWsProcessService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns InfWsProcess
     */
    @WebEndpoint(name = "InfWsProcessPort")
    public InfWsProcess getInfWsProcessPort() {
        return super.getPort(new QName("http://ws.inf.creditapp.app/", "InfWsProcessPort"), InfWsProcess.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InfWsProcess
     */
    @WebEndpoint(name = "InfWsProcessPort")
    public InfWsProcess getInfWsProcessPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.inf.creditapp.app/", "InfWsProcessPort"), InfWsProcess.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INFWSPROCESSSERVICE_EXCEPTION!= null) {
            throw INFWSPROCESSSERVICE_EXCEPTION;
        }
        return INFWSPROCESSSERVICE_WSDL_LOCATION;
    }

}