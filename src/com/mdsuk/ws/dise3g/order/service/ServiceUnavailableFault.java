
package com.mdsuk.ws.dise3g.order.service;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ServiceUnavailableFault", targetNamespace = "http://mdsuk.com/ws/dise3g/order/definition")
public class ServiceUnavailableFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private com.mdsuk.ws.dise3g.fault.ServiceUnavailableFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public ServiceUnavailableFault(String message, com.mdsuk.ws.dise3g.fault.ServiceUnavailableFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public ServiceUnavailableFault(String message, com.mdsuk.ws.dise3g.fault.ServiceUnavailableFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.mdsuk.ws.dise3g.fault.ServiceUnavailableFault
     */
    public com.mdsuk.ws.dise3g.fault.ServiceUnavailableFault getFaultInfo() {
        return faultInfo;
    }

}