/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author magic_000
 */
@WebService(serviceName = "WebServiceSum")
public class WebServiceSum {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "sum")
    public String sum(@WebParam(name = "number_1")String number1, @WebParam(name = "number_2") String number2) {
        try {
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);
            return Double.toString(num1+num2);
        } catch (NumberFormatException ne) {
            return "Số nhập sai";
        }
    }
}
