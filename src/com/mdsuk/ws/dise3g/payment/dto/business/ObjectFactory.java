
package com.mdsuk.ws.dise3g.payment.dto.business;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mdsuk.ws.dise3g.payment.dto.business package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PaymentTypeStartDateMMYYNumber_QNAME = new QName("", "startDateMMYYNumber");
    private final static QName _PaymentTypeNameOnCard_QNAME = new QName("", "nameOnCard");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mdsuk.ws.dise3g.payment.dto.business
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link DirectDebitResponseType }
     * 
     */
    public DirectDebitResponseType createDirectDebitResponseType() {
        return new DirectDebitResponseType();
    }

    /**
     * Create an instance of {@link DirectDebitType }
     * 
     */
    public DirectDebitType createDirectDebitType() {
        return new DirectDebitType();
    }

    /**
     * Create an instance of {@link ChequeType }
     * 
     */
    public ChequeType createChequeType() {
        return new ChequeType();
    }

    /**
     * Create an instance of {@link PaymentDetailsType }
     * 
     */
    public PaymentDetailsType createPaymentDetailsType() {
        return new PaymentDetailsType();
    }

    /**
     * Create an instance of {@link UpdatePaymentCardType }
     * 
     */
    public UpdatePaymentCardType createUpdatePaymentCardType() {
        return new UpdatePaymentCardType();
    }

    /**
     * Create an instance of {@link PaymentType }
     * 
     */
    public PaymentType createPaymentType() {
        return new PaymentType();
    }

    /**
     * Create an instance of {@link PaymentCardType }
     * 
     */
    public PaymentCardType createPaymentCardType() {
        return new PaymentCardType();
    }

    /**
     * Create an instance of {@link MonthYearType }
     * 
     */
    public MonthYearType createMonthYearType() {
        return new MonthYearType();
    }

    /**
     * Create an instance of {@link PaymentCardQueryType }
     * 
     */
    public PaymentCardQueryType createPaymentCardQueryType() {
        return new PaymentCardQueryType();
    }

    /**
     * Create an instance of {@link CancellationPaymentType }
     * 
     */
    public CancellationPaymentType createCancellationPaymentType() {
        return new CancellationPaymentType();
    }

    /**
     * Create an instance of {@link UpdateDirectDebitType }
     * 
     */
    public UpdateDirectDebitType createUpdateDirectDebitType() {
        return new UpdateDirectDebitType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonthYearType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "startDateMMYYNumber", scope = PaymentType.class)
    public JAXBElement<MonthYearType> createPaymentTypeStartDateMMYYNumber(MonthYearType value) {
        return new JAXBElement<MonthYearType>(_PaymentTypeStartDateMMYYNumber_QNAME, MonthYearType.class, PaymentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nameOnCard", scope = PaymentType.class)
    public JAXBElement<String> createPaymentTypeNameOnCard(String value) {
        return new JAXBElement<String>(_PaymentTypeNameOnCard_QNAME, String.class, PaymentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonthYearType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "startDateMMYYNumber", scope = PaymentDetailsType.class)
    public JAXBElement<MonthYearType> createPaymentDetailsTypeStartDateMMYYNumber(MonthYearType value) {
        return new JAXBElement<MonthYearType>(_PaymentTypeStartDateMMYYNumber_QNAME, MonthYearType.class, PaymentDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nameOnCard", scope = PaymentDetailsType.class)
    public JAXBElement<String> createPaymentDetailsTypeNameOnCard(String value) {
        return new JAXBElement<String>(_PaymentTypeNameOnCard_QNAME, String.class, PaymentDetailsType.class, value);
    }

}
