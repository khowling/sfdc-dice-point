package com.sforce.soap.enterprise;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class Create_element implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public Create_element() {}

    /**
     * element : sObjects of type {urn:sobject.enterprise.soap.sforce.com}sObject
     * java type: com.sforce.soap.enterprise.sobject.SObject[]
     */
    private static final com.sforce.ws.bind.TypeInfo sObjects__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","sObjects","urn:sobject.enterprise.soap.sforce.com","sObject",0,-1,true);

    private boolean sObjects__is_set = false;

    private com.sforce.soap.enterprise.sobject.SObject[] sObjects = new com.sforce.soap.enterprise.sobject.SObject[0];

    public com.sforce.soap.enterprise.sobject.SObject[] getSObjects() {
      return sObjects;
    }

    public void setSObjects(com.sforce.soap.enterprise.sobject.SObject[] sObjects) {
      this.sObjects = sObjects;
      sObjects__is_set = true;
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
       __typeMapper.writeObject(__out, sObjects__typeInfo, sObjects, sObjects__is_set);
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
        if (__typeMapper.isElement(__in, sObjects__typeInfo)) {
            setSObjects((com.sforce.soap.enterprise.sobject.SObject[])__typeMapper.readObject(__in, sObjects__typeInfo, com.sforce.soap.enterprise.sobject.SObject[].class));
        }
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[Create_element ");
      sb.append(" sObjects=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(sObjects)+"'\n");
      sb.append("]\n");
      return sb.toString();
    }
}
