package com.sforce.soap.enterprise.sobject;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class ServiceContractHistory extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public ServiceContractHistory() {}

    /**
     * element : CreatedBy of type {urn:sobject.enterprise.soap.sforce.com}Name
     * java type: com.sforce.soap.enterprise.sobject.Name
     */
    private static final com.sforce.ws.bind.TypeInfo CreatedBy__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CreatedBy","urn:sobject.enterprise.soap.sforce.com","Name",0,1,true);

    private boolean CreatedBy__is_set = false;

    private com.sforce.soap.enterprise.sobject.Name CreatedBy;

    public com.sforce.soap.enterprise.sobject.Name getCreatedBy() {
      return CreatedBy;
    }

    public void setCreatedBy(com.sforce.soap.enterprise.sobject.Name CreatedBy) {
      this.CreatedBy = CreatedBy;
      CreatedBy__is_set = true;
    }

    /**
     * element : CreatedById of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo CreatedById__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CreatedById","urn:enterprise.soap.sforce.com","ID",0,1,true);

    private boolean CreatedById__is_set = false;

    private java.lang.String CreatedById;

    public java.lang.String getCreatedById() {
      return CreatedById;
    }

    public void setCreatedById(java.lang.String CreatedById) {
      this.CreatedById = CreatedById;
      CreatedById__is_set = true;
    }

    /**
     * element : CreatedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private static final com.sforce.ws.bind.TypeInfo CreatedDate__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CreatedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

    private boolean CreatedDate__is_set = false;

    private java.util.Calendar CreatedDate;

    public java.util.Calendar getCreatedDate() {
      return CreatedDate;
    }

    public void setCreatedDate(java.util.Calendar CreatedDate) {
      this.CreatedDate = CreatedDate;
      CreatedDate__is_set = true;
    }

    /**
     * element : Field of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo Field__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Field","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean Field__is_set = false;

    private java.lang.String Field;

    public java.lang.String getField() {
      return Field;
    }

    public void setField(java.lang.String Field) {
      this.Field = Field;
      Field__is_set = true;
    }

    /**
     * element : IsDeleted of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private static final com.sforce.ws.bind.TypeInfo IsDeleted__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsDeleted","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean IsDeleted__is_set = false;

    private java.lang.Boolean IsDeleted;

    public java.lang.Boolean getIsDeleted() {
      return IsDeleted;
    }

    public void setIsDeleted(java.lang.Boolean IsDeleted) {
      this.IsDeleted = IsDeleted;
      IsDeleted__is_set = true;
    }

    /**
     * element : NewValue of type {http://www.w3.org/2001/XMLSchema}anyType
     * java type: java.lang.Object
     */
    private static final com.sforce.ws.bind.TypeInfo NewValue__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NewValue","http://www.w3.org/2001/XMLSchema","anyType",0,1,true);

    private boolean NewValue__is_set = false;

    private java.lang.Object NewValue;

    public java.lang.Object getNewValue() {
      return NewValue;
    }

    public void setNewValue(java.lang.Object NewValue) {
      this.NewValue = NewValue;
      NewValue__is_set = true;
    }

    /**
     * element : OldValue of type {http://www.w3.org/2001/XMLSchema}anyType
     * java type: java.lang.Object
     */
    private static final com.sforce.ws.bind.TypeInfo OldValue__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OldValue","http://www.w3.org/2001/XMLSchema","anyType",0,1,true);

    private boolean OldValue__is_set = false;

    private java.lang.Object OldValue;

    public java.lang.Object getOldValue() {
      return OldValue;
    }

    public void setOldValue(java.lang.Object OldValue) {
      this.OldValue = OldValue;
      OldValue__is_set = true;
    }

    /**
     * element : ServiceContract of type {urn:sobject.enterprise.soap.sforce.com}ServiceContract
     * java type: com.sforce.soap.enterprise.sobject.ServiceContract
     */
    private static final com.sforce.ws.bind.TypeInfo ServiceContract__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ServiceContract","urn:sobject.enterprise.soap.sforce.com","ServiceContract",0,1,true);

    private boolean ServiceContract__is_set = false;

    private com.sforce.soap.enterprise.sobject.ServiceContract ServiceContract;

    public com.sforce.soap.enterprise.sobject.ServiceContract getServiceContract() {
      return ServiceContract;
    }

    public void setServiceContract(com.sforce.soap.enterprise.sobject.ServiceContract ServiceContract) {
      this.ServiceContract = ServiceContract;
      ServiceContract__is_set = true;
    }

    /**
     * element : ServiceContractId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo ServiceContractId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ServiceContractId","urn:enterprise.soap.sforce.com","ID",0,1,true);

    private boolean ServiceContractId__is_set = false;

    private java.lang.String ServiceContractId;

    public java.lang.String getServiceContractId() {
      return ServiceContractId;
    }

    public void setServiceContractId(java.lang.String ServiceContractId) {
      this.ServiceContractId = ServiceContractId;
      ServiceContractId__is_set = true;
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ServiceContractHistory");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
       __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
       __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
       __typeMapper.writeString(__out, Field__typeInfo, Field, Field__is_set);
       __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
       __typeMapper.writeObject(__out, NewValue__typeInfo, NewValue, NewValue__is_set);
       __typeMapper.writeObject(__out, OldValue__typeInfo, OldValue, OldValue__is_set);
       __typeMapper.writeObject(__out, ServiceContract__typeInfo, ServiceContract, ServiceContract__is_set);
       __typeMapper.writeString(__out, ServiceContractId__typeInfo, ServiceContractId, ServiceContractId__is_set);
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
        super.loadFields(__in, __typeMapper);
        __in.peekTag();
        if (__typeMapper.isElement(__in, CreatedBy__typeInfo)) {
            setCreatedBy((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, CreatedBy__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, CreatedById__typeInfo)) {
            setCreatedById(__typeMapper.readString(__in, CreatedById__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, CreatedDate__typeInfo)) {
            setCreatedDate((java.util.Calendar)__typeMapper.readObject(__in, CreatedDate__typeInfo, java.util.Calendar.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, Field__typeInfo)) {
            setField(__typeMapper.readString(__in, Field__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
            setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, NewValue__typeInfo)) {
            setNewValue((java.lang.Object)__typeMapper.readObject(__in, NewValue__typeInfo, java.lang.Object.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, OldValue__typeInfo)) {
            setOldValue((java.lang.Object)__typeMapper.readObject(__in, OldValue__typeInfo, java.lang.Object.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, ServiceContract__typeInfo)) {
            setServiceContract((com.sforce.soap.enterprise.sobject.ServiceContract)__typeMapper.readObject(__in, ServiceContract__typeInfo, com.sforce.soap.enterprise.sobject.ServiceContract.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, ServiceContractId__typeInfo)) {
            setServiceContractId(__typeMapper.readString(__in, ServiceContractId__typeInfo, java.lang.String.class));
        }
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[ServiceContractHistory ");
      sb.append(super.toString());sb.append(" CreatedBy=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
      sb.append(" CreatedById=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
      sb.append(" CreatedDate=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
      sb.append(" Field=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(Field)+"'\n");
      sb.append(" IsDeleted=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
      sb.append(" NewValue=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(NewValue)+"'\n");
      sb.append(" OldValue=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(OldValue)+"'\n");
      sb.append(" ServiceContract=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ServiceContract)+"'\n");
      sb.append(" ServiceContractId=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ServiceContractId)+"'\n");
      sb.append("]\n");
      return sb.toString();
    }
}
