package com.sforce.soap.enterprise.sobject;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class FAQ__VoteStat extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public FAQ__VoteStat() {}

    /**
     * element : Channel of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo Channel__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Channel","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean Channel__is_set = false;

    private java.lang.String Channel;

    public java.lang.String getChannel() {
      return Channel;
    }

    public void setChannel(java.lang.String Channel) {
      this.Channel = Channel;
      Channel__is_set = true;
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
     * element : NormalizedScore of type {http://www.w3.org/2001/XMLSchema}double
     * java type: java.lang.Double
     */
    private static final com.sforce.ws.bind.TypeInfo NormalizedScore__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NormalizedScore","http://www.w3.org/2001/XMLSchema","double",0,1,true);

    private boolean NormalizedScore__is_set = false;

    private java.lang.Double NormalizedScore;

    public java.lang.Double getNormalizedScore() {
      return NormalizedScore;
    }

    public void setNormalizedScore(java.lang.Double NormalizedScore) {
      this.NormalizedScore = NormalizedScore;
      NormalizedScore__is_set = true;
    }

    /**
     * element : Parent of type {urn:sobject.enterprise.soap.sforce.com}FAQ__ka
     * java type: com.sforce.soap.enterprise.sobject.FAQ__ka
     */
    private static final com.sforce.ws.bind.TypeInfo Parent__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Parent","urn:sobject.enterprise.soap.sforce.com","FAQ__ka",0,1,true);

    private boolean Parent__is_set = false;

    private com.sforce.soap.enterprise.sobject.FAQ__ka Parent;

    public com.sforce.soap.enterprise.sobject.FAQ__ka getParent() {
      return Parent;
    }

    public void setParent(com.sforce.soap.enterprise.sobject.FAQ__ka Parent) {
      this.Parent = Parent;
      Parent__is_set = true;
    }

    /**
     * element : ParentId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo ParentId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ParentId","urn:enterprise.soap.sforce.com","ID",0,1,true);

    private boolean ParentId__is_set = false;

    private java.lang.String ParentId;

    public java.lang.String getParentId() {
      return ParentId;
    }

    public void setParentId(java.lang.String ParentId) {
      this.ParentId = ParentId;
      ParentId__is_set = true;
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "FAQ__VoteStat");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeString(__out, Channel__typeInfo, Channel, Channel__is_set);
       __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
       __typeMapper.writeObject(__out, NormalizedScore__typeInfo, NormalizedScore, NormalizedScore__is_set);
       __typeMapper.writeObject(__out, Parent__typeInfo, Parent, Parent__is_set);
       __typeMapper.writeString(__out, ParentId__typeInfo, ParentId, ParentId__is_set);
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
        if (__typeMapper.isElement(__in, Channel__typeInfo)) {
            setChannel(__typeMapper.readString(__in, Channel__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
            setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, NormalizedScore__typeInfo)) {
            setNormalizedScore((java.lang.Double)__typeMapper.readObject(__in, NormalizedScore__typeInfo, java.lang.Double.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, Parent__typeInfo)) {
            setParent((com.sforce.soap.enterprise.sobject.FAQ__ka)__typeMapper.readObject(__in, Parent__typeInfo, com.sforce.soap.enterprise.sobject.FAQ__ka.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, ParentId__typeInfo)) {
            setParentId(__typeMapper.readString(__in, ParentId__typeInfo, java.lang.String.class));
        }
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[FAQ__VoteStat ");
      sb.append(super.toString());sb.append(" Channel=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(Channel)+"'\n");
      sb.append(" IsDeleted=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
      sb.append(" NormalizedScore=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(NormalizedScore)+"'\n");
      sb.append(" Parent=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(Parent)+"'\n");
      sb.append(" ParentId=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ParentId)+"'\n");
      sb.append("]\n");
      return sb.toString();
    }
}
