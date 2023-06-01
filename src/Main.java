//import SOAP.wsdl.SOAPRequest;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {

        //Consumo de un Web Service
        /*SOAPRequest soapRequest = new SOAPRequest();
        soapRequest.consume();*/

        //Consumo de un API Rest
        Rest rest = new Rest("https://regionalsupport.tigo.com.gt/portalcx_api/api/nodo/prefactibilidad/address", "POST");
        String response = rest.connectToEndpoint("{\n" +
                "    \"Speed\": 5,\n" +
                "    \"ServiceAddress\": \"Aldea santa inés, san martín chile verde, QUETZALTENANGO\",\n" +
                "    \"Term\": 12\n" +
                "}");
        System.out.println(response);
    }
}