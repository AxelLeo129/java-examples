package SOAP.wsdl;

import SOAP.wsdl.org.tempuri.Calculator;
import SOAP.wsdl.org.tempuri.CalculatorSoap;

public class SOAPRequest {

    public void consume() {
        Calculator service = new Calculator();
        CalculatorSoap port = service.getCalculatorSoap();

        int sum = port.add(1, 2);
        int diff = port.subtract(5, 3);
        int prod = port.multiply(4, 3);
        int quotient = port.divide(10, 2);

        System.out.println("Suma: " + sum);
        System.out.println("Resta: " + diff);
        System.out.println("Multiplicación: " + prod);
        System.out.println("División: " + quotient);
    }

}
