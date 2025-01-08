package ir.imi.testwebcard.domain.soap;

import org.springframework.core.io.ResourceLoader;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.6.5
 * 2025-01-08T14:55:54.054+03:30
 * Generated source version: 3.6.5
 *
 */
@WebServiceClient(name = "EtsGeneralDataProviderService",
                  wsdlLocation = "http://172.17.70.21:8090/EtsGeneralDataProviderService.asmx?WSDL",
                  targetNamespace = "http://tempuri.org/")
public class EtsGeneralDataProviderService extends Service {

    public static final URL WSDL_LOCATION;

    public static final QName SERVICE = new QName("http://tempuri.org/", "EtsGeneralDataProviderService");
    public static final QName EtsGeneralDataProviderServiceSoap = new QName("http://tempuri.org/", "EtsGeneralDataProviderServiceSoap");
    public static final QName EtsGeneralDataProviderServiceSoap12 = new QName("http://tempuri.org/", "EtsGeneralDataProviderServiceSoap12");
    public static final QName EtsGeneralDataProviderServiceHttpPost = new QName("http://tempuri.org/", "EtsGeneralDataProviderServiceHttpPost");
    public static final QName EtsGeneralDataProviderServiceHttpGet = new QName("http://tempuri.org/", "EtsGeneralDataProviderServiceHttpGet");
    static {
        URL resourceUR = ResourceLoader.class.getClassLoader().getResource("wsdl/webCardSoapService.xml");;
        URL url = null;
        try {
//            url = URI.create("http://172.17.70.21:8090/EtsGeneralDataProviderService.asmx?WSDL").toURL();
//        } catch (MalformedURLException e) {
//            java.util.logging.Logger.getLogger(EtsGeneralDataProviderService.class.getName())
//                .log(java.util.logging.Level.INFO,
//                     "Can not initialize the default wsdl from {0}", "http://172.17.70.21:8090/EtsGeneralDataProviderService.asmx?WSDL");
//        }
            if (resourceUR != null) {
                url = resourceUR;
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(EtsGeneralDataProviderService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "wsdl/webCardSoapService.xml");
        }
        WSDL_LOCATION = url;
    }

    public EtsGeneralDataProviderService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EtsGeneralDataProviderService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EtsGeneralDataProviderService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public EtsGeneralDataProviderService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public EtsGeneralDataProviderService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public EtsGeneralDataProviderService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns EtsGeneralDataProviderServiceSoap
     */
    @WebEndpoint(name = "EtsGeneralDataProviderServiceSoap")
    public EtsGeneralDataProviderServiceSoap getEtsGeneralDataProviderServiceSoap() {
        return super.getPort(EtsGeneralDataProviderServiceSoap, EtsGeneralDataProviderServiceSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EtsGeneralDataProviderServiceSoap
     */
    @WebEndpoint(name = "EtsGeneralDataProviderServiceSoap")
    public EtsGeneralDataProviderServiceSoap getEtsGeneralDataProviderServiceSoap(WebServiceFeature... features) {
        return super.getPort(EtsGeneralDataProviderServiceSoap, EtsGeneralDataProviderServiceSoap.class, features);
    }


    /**
     *
     * @return
     *     returns EtsGeneralDataProviderServiceSoap
     */
    @WebEndpoint(name = "EtsGeneralDataProviderServiceSoap12")
    public EtsGeneralDataProviderServiceSoap getEtsGeneralDataProviderServiceSoap12() {
        return super.getPort(EtsGeneralDataProviderServiceSoap12, EtsGeneralDataProviderServiceSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EtsGeneralDataProviderServiceSoap
     */
    @WebEndpoint(name = "EtsGeneralDataProviderServiceSoap12")
    public EtsGeneralDataProviderServiceSoap getEtsGeneralDataProviderServiceSoap12(WebServiceFeature... features) {
        return super.getPort(EtsGeneralDataProviderServiceSoap12, EtsGeneralDataProviderServiceSoap.class, features);
    }


    /**
     *
     * @return
     *     returns EtsGeneralDataProviderServiceHttpPost
     */
    @WebEndpoint(name = "EtsGeneralDataProviderServiceHttpPost")
    public EtsGeneralDataProviderServiceHttpPost getEtsGeneralDataProviderServiceHttpPost() {
        return super.getPort(EtsGeneralDataProviderServiceHttpPost, EtsGeneralDataProviderServiceHttpPost.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EtsGeneralDataProviderServiceHttpPost
     */
    @WebEndpoint(name = "EtsGeneralDataProviderServiceHttpPost")
    public EtsGeneralDataProviderServiceHttpPost getEtsGeneralDataProviderServiceHttpPost(WebServiceFeature... features) {
        return super.getPort(EtsGeneralDataProviderServiceHttpPost, EtsGeneralDataProviderServiceHttpPost.class, features);
    }


    /**
     *
     * @return
     *     returns EtsGeneralDataProviderServiceHttpGet
     */
    @WebEndpoint(name = "EtsGeneralDataProviderServiceHttpGet")
    public EtsGeneralDataProviderServiceHttpGet getEtsGeneralDataProviderServiceHttpGet() {
        return super.getPort(EtsGeneralDataProviderServiceHttpGet, EtsGeneralDataProviderServiceHttpGet.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EtsGeneralDataProviderServiceHttpGet
     */
    @WebEndpoint(name = "EtsGeneralDataProviderServiceHttpGet")
    public EtsGeneralDataProviderServiceHttpGet getEtsGeneralDataProviderServiceHttpGet(WebServiceFeature... features) {
        return super.getPort(EtsGeneralDataProviderServiceHttpGet, EtsGeneralDataProviderServiceHttpGet.class, features);
    }

}