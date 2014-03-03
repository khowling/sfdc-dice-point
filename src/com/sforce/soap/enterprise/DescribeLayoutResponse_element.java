package com.sforce.soap.enterprise;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class DescribeLayoutResponse_element implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public DescribeLayoutResponse_element() {}

    /**
     * element : result of type {urn:enterprise.soap.sforce.com}DescribeLayoutResult
     * java type: com.sforce.soap.enterprise.DescribeLayoutResult
     */
    private static final com.sforce.ws.bind.TypeInfo result__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","result","urn:enterprise.soap.sforce.com","DescribeLayoutResult",1,1,true);

    private boolean result__is_set = false;

    private com.sforce.soap.enterprise.DescribeLayoutResult result;

    public com.sforce.soap.enterprise.DescribeLayoutResult getResult() {
      return result;
    }

    public void setResult(com.sforce.soap.enterprise.DescribeLayoutResult result) {
      this.result = result;
      result__is_set = true;
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       __typeMapper.writeObject(__out, result__typeInfo, result, result__is_set);
    }

    @Override
    public void load(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __typeMapper.consumeStartTag(__in);
      loadFields(__in, __typeMapper);
      __typeMapper.consumeEndTag(__in);
    }

    protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
        __in.peekTag();
        if (__typeMapper.verifyElement(__in, result__typeInfo)) {
            setResult((com.sforce.soap.enterprise.DescribeLayoutResult)__typeMapper.readObject(__in, result__typeInfo, com.sforce.soap.enterprise.DescribeLayoutResult.class));
        }
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[DescribeLayoutResponse_element ");
      sb.append(" result=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(result)+"'\n");
      sb.append("]\n");
      return sb.toString();
    }
}