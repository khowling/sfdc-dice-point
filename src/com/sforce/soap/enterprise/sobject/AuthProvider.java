package com.sforce.soap.enterprise.sobject;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class AuthProvider extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public AuthProvider() {}

    /**
     * element : AuthorizeUrl of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo AuthorizeUrl__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AuthorizeUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean AuthorizeUrl__is_set = false;

    private java.lang.String AuthorizeUrl;

    public java.lang.String getAuthorizeUrl() {
      return AuthorizeUrl;
    }

    public void setAuthorizeUrl(java.lang.String AuthorizeUrl) {
      this.AuthorizeUrl = AuthorizeUrl;
      AuthorizeUrl__is_set = true;
    }

    /**
     * element : ConsumerKey of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo ConsumerKey__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ConsumerKey","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean ConsumerKey__is_set = false;

    private java.lang.String ConsumerKey;

    public java.lang.String getConsumerKey() {
      return ConsumerKey;
    }

    public void setConsumerKey(java.lang.String ConsumerKey) {
      this.ConsumerKey = ConsumerKey;
      ConsumerKey__is_set = true;
    }

    /**
     * element : ConsumerSecret of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo ConsumerSecret__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ConsumerSecret","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean ConsumerSecret__is_set = false;

    private java.lang.String ConsumerSecret;

    public java.lang.String getConsumerSecret() {
      return ConsumerSecret;
    }

    public void setConsumerSecret(java.lang.String ConsumerSecret) {
      this.ConsumerSecret = ConsumerSecret;
      ConsumerSecret__is_set = true;
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
     * element : DefaultScopes of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo DefaultScopes__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DefaultScopes","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean DefaultScopes__is_set = false;

    private java.lang.String DefaultScopes;

    public java.lang.String getDefaultScopes() {
      return DefaultScopes;
    }

    public void setDefaultScopes(java.lang.String DefaultScopes) {
      this.DefaultScopes = DefaultScopes;
      DefaultScopes__is_set = true;
    }

    /**
     * element : DeveloperName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo DeveloperName__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DeveloperName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean DeveloperName__is_set = false;

    private java.lang.String DeveloperName;

    public java.lang.String getDeveloperName() {
      return DeveloperName;
    }

    public void setDeveloperName(java.lang.String DeveloperName) {
      this.DeveloperName = DeveloperName;
      DeveloperName__is_set = true;
    }

    /**
     * element : ErrorUrl of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo ErrorUrl__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ErrorUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean ErrorUrl__is_set = false;

    private java.lang.String ErrorUrl;

    public java.lang.String getErrorUrl() {
      return ErrorUrl;
    }

    public void setErrorUrl(java.lang.String ErrorUrl) {
      this.ErrorUrl = ErrorUrl;
      ErrorUrl__is_set = true;
    }

    /**
     * element : ExecutionUserId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo ExecutionUserId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ExecutionUserId","urn:enterprise.soap.sforce.com","ID",0,1,true);

    private boolean ExecutionUserId__is_set = false;

    private java.lang.String ExecutionUserId;

    public java.lang.String getExecutionUserId() {
      return ExecutionUserId;
    }

    public void setExecutionUserId(java.lang.String ExecutionUserId) {
      this.ExecutionUserId = ExecutionUserId;
      ExecutionUserId__is_set = true;
    }

    /**
     * element : FriendlyName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo FriendlyName__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FriendlyName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean FriendlyName__is_set = false;

    private java.lang.String FriendlyName;

    public java.lang.String getFriendlyName() {
      return FriendlyName;
    }

    public void setFriendlyName(java.lang.String FriendlyName) {
      this.FriendlyName = FriendlyName;
      FriendlyName__is_set = true;
    }

    /**
     * element : ProviderType of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo ProviderType__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ProviderType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean ProviderType__is_set = false;

    private java.lang.String ProviderType;

    public java.lang.String getProviderType() {
      return ProviderType;
    }

    public void setProviderType(java.lang.String ProviderType) {
      this.ProviderType = ProviderType;
      ProviderType__is_set = true;
    }

    /**
     * element : RegistrationHandlerId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo RegistrationHandlerId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RegistrationHandlerId","urn:enterprise.soap.sforce.com","ID",0,1,true);

    private boolean RegistrationHandlerId__is_set = false;

    private java.lang.String RegistrationHandlerId;

    public java.lang.String getRegistrationHandlerId() {
      return RegistrationHandlerId;
    }

    public void setRegistrationHandlerId(java.lang.String RegistrationHandlerId) {
      this.RegistrationHandlerId = RegistrationHandlerId;
      RegistrationHandlerId__is_set = true;
    }

    /**
     * element : TokenUrl of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo TokenUrl__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TokenUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean TokenUrl__is_set = false;

    private java.lang.String TokenUrl;

    public java.lang.String getTokenUrl() {
      return TokenUrl;
    }

    public void setTokenUrl(java.lang.String TokenUrl) {
      this.TokenUrl = TokenUrl;
      TokenUrl__is_set = true;
    }

    /**
     * element : UserInfoUrl of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo UserInfoUrl__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserInfoUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean UserInfoUrl__is_set = false;

    private java.lang.String UserInfoUrl;

    public java.lang.String getUserInfoUrl() {
      return UserInfoUrl;
    }

    public void setUserInfoUrl(java.lang.String UserInfoUrl) {
      this.UserInfoUrl = UserInfoUrl;
      UserInfoUrl__is_set = true;
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "AuthProvider");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeString(__out, AuthorizeUrl__typeInfo, AuthorizeUrl, AuthorizeUrl__is_set);
       __typeMapper.writeString(__out, ConsumerKey__typeInfo, ConsumerKey, ConsumerKey__is_set);
       __typeMapper.writeString(__out, ConsumerSecret__typeInfo, ConsumerSecret, ConsumerSecret__is_set);
       __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
       __typeMapper.writeString(__out, DefaultScopes__typeInfo, DefaultScopes, DefaultScopes__is_set);
       __typeMapper.writeString(__out, DeveloperName__typeInfo, DeveloperName, DeveloperName__is_set);
       __typeMapper.writeString(__out, ErrorUrl__typeInfo, ErrorUrl, ErrorUrl__is_set);
       __typeMapper.writeString(__out, ExecutionUserId__typeInfo, ExecutionUserId, ExecutionUserId__is_set);
       __typeMapper.writeString(__out, FriendlyName__typeInfo, FriendlyName, FriendlyName__is_set);
       __typeMapper.writeString(__out, ProviderType__typeInfo, ProviderType, ProviderType__is_set);
       __typeMapper.writeString(__out, RegistrationHandlerId__typeInfo, RegistrationHandlerId, RegistrationHandlerId__is_set);
       __typeMapper.writeString(__out, TokenUrl__typeInfo, TokenUrl, TokenUrl__is_set);
       __typeMapper.writeString(__out, UserInfoUrl__typeInfo, UserInfoUrl, UserInfoUrl__is_set);
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
        if (__typeMapper.isElement(__in, AuthorizeUrl__typeInfo)) {
            setAuthorizeUrl(__typeMapper.readString(__in, AuthorizeUrl__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, ConsumerKey__typeInfo)) {
            setConsumerKey(__typeMapper.readString(__in, ConsumerKey__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, ConsumerSecret__typeInfo)) {
            setConsumerSecret(__typeMapper.readString(__in, ConsumerSecret__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, CreatedDate__typeInfo)) {
            setCreatedDate((java.util.Calendar)__typeMapper.readObject(__in, CreatedDate__typeInfo, java.util.Calendar.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, DefaultScopes__typeInfo)) {
            setDefaultScopes(__typeMapper.readString(__in, DefaultScopes__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, DeveloperName__typeInfo)) {
            setDeveloperName(__typeMapper.readString(__in, DeveloperName__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, ErrorUrl__typeInfo)) {
            setErrorUrl(__typeMapper.readString(__in, ErrorUrl__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, ExecutionUserId__typeInfo)) {
            setExecutionUserId(__typeMapper.readString(__in, ExecutionUserId__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, FriendlyName__typeInfo)) {
            setFriendlyName(__typeMapper.readString(__in, FriendlyName__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, ProviderType__typeInfo)) {
            setProviderType(__typeMapper.readString(__in, ProviderType__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, RegistrationHandlerId__typeInfo)) {
            setRegistrationHandlerId(__typeMapper.readString(__in, RegistrationHandlerId__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, TokenUrl__typeInfo)) {
            setTokenUrl(__typeMapper.readString(__in, TokenUrl__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, UserInfoUrl__typeInfo)) {
            setUserInfoUrl(__typeMapper.readString(__in, UserInfoUrl__typeInfo, java.lang.String.class));
        }
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[AuthProvider ");
      sb.append(super.toString());sb.append(" AuthorizeUrl=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(AuthorizeUrl)+"'\n");
      sb.append(" ConsumerKey=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ConsumerKey)+"'\n");
      sb.append(" ConsumerSecret=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ConsumerSecret)+"'\n");
      sb.append(" CreatedDate=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
      sb.append(" DefaultScopes=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(DefaultScopes)+"'\n");
      sb.append(" DeveloperName=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(DeveloperName)+"'\n");
      sb.append(" ErrorUrl=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ErrorUrl)+"'\n");
      sb.append(" ExecutionUserId=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ExecutionUserId)+"'\n");
      sb.append(" FriendlyName=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(FriendlyName)+"'\n");
      sb.append(" ProviderType=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ProviderType)+"'\n");
      sb.append(" RegistrationHandlerId=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(RegistrationHandlerId)+"'\n");
      sb.append(" TokenUrl=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(TokenUrl)+"'\n");
      sb.append(" UserInfoUrl=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(UserInfoUrl)+"'\n");
      sb.append("]\n");
      return sb.toString();
    }
}