package com.sforce.soap.enterprise.sobject;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class KnowledgeArticleVersion extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public KnowledgeArticleVersion() {}

    /**
     * element : ArchivedById of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo ArchivedById__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ArchivedById","urn:enterprise.soap.sforce.com","ID",0,1,true);

    private boolean ArchivedById__is_set = false;

    private java.lang.String ArchivedById;

    public java.lang.String getArchivedById() {
      return ArchivedById;
    }

    public void setArchivedById(java.lang.String ArchivedById) {
      this.ArchivedById = ArchivedById;
      ArchivedById__is_set = true;
    }

    /**
     * element : ArchivedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private static final com.sforce.ws.bind.TypeInfo ArchivedDate__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ArchivedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

    private boolean ArchivedDate__is_set = false;

    private java.util.Calendar ArchivedDate;

    public java.util.Calendar getArchivedDate() {
      return ArchivedDate;
    }

    public void setArchivedDate(java.util.Calendar ArchivedDate) {
      this.ArchivedDate = ArchivedDate;
      ArchivedDate__is_set = true;
    }

    /**
     * element : ArticleNumber of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo ArticleNumber__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ArticleNumber","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean ArticleNumber__is_set = false;

    private java.lang.String ArticleNumber;

    public java.lang.String getArticleNumber() {
      return ArticleNumber;
    }

    public void setArticleNumber(java.lang.String ArticleNumber) {
      this.ArticleNumber = ArticleNumber;
      ArticleNumber__is_set = true;
    }

    /**
     * element : ArticleType of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo ArticleType__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ArticleType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean ArticleType__is_set = false;

    private java.lang.String ArticleType;

    public java.lang.String getArticleType() {
      return ArticleType;
    }

    public void setArticleType(java.lang.String ArticleType) {
      this.ArticleType = ArticleType;
      ArticleType__is_set = true;
    }

    /**
     * element : CreatedBy of type {urn:sobject.enterprise.soap.sforce.com}User
     * java type: com.sforce.soap.enterprise.sobject.User
     */
    private static final com.sforce.ws.bind.TypeInfo CreatedBy__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CreatedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

    private boolean CreatedBy__is_set = false;

    private com.sforce.soap.enterprise.sobject.User CreatedBy;

    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
      return CreatedBy;
    }

    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User CreatedBy) {
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
     * element : FirstPublishedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private static final com.sforce.ws.bind.TypeInfo FirstPublishedDate__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FirstPublishedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

    private boolean FirstPublishedDate__is_set = false;

    private java.util.Calendar FirstPublishedDate;

    public java.util.Calendar getFirstPublishedDate() {
      return FirstPublishedDate;
    }

    public void setFirstPublishedDate(java.util.Calendar FirstPublishedDate) {
      this.FirstPublishedDate = FirstPublishedDate;
      FirstPublishedDate__is_set = true;
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
     * element : IsLatestVersion of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private static final com.sforce.ws.bind.TypeInfo IsLatestVersion__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsLatestVersion","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean IsLatestVersion__is_set = false;

    private java.lang.Boolean IsLatestVersion;

    public java.lang.Boolean getIsLatestVersion() {
      return IsLatestVersion;
    }

    public void setIsLatestVersion(java.lang.Boolean IsLatestVersion) {
      this.IsLatestVersion = IsLatestVersion;
      IsLatestVersion__is_set = true;
    }

    /**
     * element : IsVisibleInApp of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private static final com.sforce.ws.bind.TypeInfo IsVisibleInApp__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsVisibleInApp","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean IsVisibleInApp__is_set = false;

    private java.lang.Boolean IsVisibleInApp;

    public java.lang.Boolean getIsVisibleInApp() {
      return IsVisibleInApp;
    }

    public void setIsVisibleInApp(java.lang.Boolean IsVisibleInApp) {
      this.IsVisibleInApp = IsVisibleInApp;
      IsVisibleInApp__is_set = true;
    }

    /**
     * element : IsVisibleInCsp of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private static final com.sforce.ws.bind.TypeInfo IsVisibleInCsp__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsVisibleInCsp","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean IsVisibleInCsp__is_set = false;

    private java.lang.Boolean IsVisibleInCsp;

    public java.lang.Boolean getIsVisibleInCsp() {
      return IsVisibleInCsp;
    }

    public void setIsVisibleInCsp(java.lang.Boolean IsVisibleInCsp) {
      this.IsVisibleInCsp = IsVisibleInCsp;
      IsVisibleInCsp__is_set = true;
    }

    /**
     * element : IsVisibleInPkb of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private static final com.sforce.ws.bind.TypeInfo IsVisibleInPkb__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsVisibleInPkb","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean IsVisibleInPkb__is_set = false;

    private java.lang.Boolean IsVisibleInPkb;

    public java.lang.Boolean getIsVisibleInPkb() {
      return IsVisibleInPkb;
    }

    public void setIsVisibleInPkb(java.lang.Boolean IsVisibleInPkb) {
      this.IsVisibleInPkb = IsVisibleInPkb;
      IsVisibleInPkb__is_set = true;
    }

    /**
     * element : IsVisibleInPrm of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private static final com.sforce.ws.bind.TypeInfo IsVisibleInPrm__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsVisibleInPrm","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean IsVisibleInPrm__is_set = false;

    private java.lang.Boolean IsVisibleInPrm;

    public java.lang.Boolean getIsVisibleInPrm() {
      return IsVisibleInPrm;
    }

    public void setIsVisibleInPrm(java.lang.Boolean IsVisibleInPrm) {
      this.IsVisibleInPrm = IsVisibleInPrm;
      IsVisibleInPrm__is_set = true;
    }

    /**
     * element : KnowledgeArticleId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo KnowledgeArticleId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","KnowledgeArticleId","urn:enterprise.soap.sforce.com","ID",0,1,true);

    private boolean KnowledgeArticleId__is_set = false;

    private java.lang.String KnowledgeArticleId;

    public java.lang.String getKnowledgeArticleId() {
      return KnowledgeArticleId;
    }

    public void setKnowledgeArticleId(java.lang.String KnowledgeArticleId) {
      this.KnowledgeArticleId = KnowledgeArticleId;
      KnowledgeArticleId__is_set = true;
    }

    /**
     * element : Language of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo Language__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Language","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean Language__is_set = false;

    private java.lang.String Language;

    public java.lang.String getLanguage() {
      return Language;
    }

    public void setLanguage(java.lang.String Language) {
      this.Language = Language;
      Language__is_set = true;
    }

    /**
     * element : LastModifiedBy of type {urn:sobject.enterprise.soap.sforce.com}User
     * java type: com.sforce.soap.enterprise.sobject.User
     */
    private static final com.sforce.ws.bind.TypeInfo LastModifiedBy__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastModifiedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

    private boolean LastModifiedBy__is_set = false;

    private com.sforce.soap.enterprise.sobject.User LastModifiedBy;

    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
      return LastModifiedBy;
    }

    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User LastModifiedBy) {
      this.LastModifiedBy = LastModifiedBy;
      LastModifiedBy__is_set = true;
    }

    /**
     * element : LastModifiedById of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo LastModifiedById__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastModifiedById","urn:enterprise.soap.sforce.com","ID",0,1,true);

    private boolean LastModifiedById__is_set = false;

    private java.lang.String LastModifiedById;

    public java.lang.String getLastModifiedById() {
      return LastModifiedById;
    }

    public void setLastModifiedById(java.lang.String LastModifiedById) {
      this.LastModifiedById = LastModifiedById;
      LastModifiedById__is_set = true;
    }

    /**
     * element : LastModifiedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private static final com.sforce.ws.bind.TypeInfo LastModifiedDate__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastModifiedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

    private boolean LastModifiedDate__is_set = false;

    private java.util.Calendar LastModifiedDate;

    public java.util.Calendar getLastModifiedDate() {
      return LastModifiedDate;
    }

    public void setLastModifiedDate(java.util.Calendar LastModifiedDate) {
      this.LastModifiedDate = LastModifiedDate;
      LastModifiedDate__is_set = true;
    }

    /**
     * element : LastPublishedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private static final com.sforce.ws.bind.TypeInfo LastPublishedDate__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastPublishedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

    private boolean LastPublishedDate__is_set = false;

    private java.util.Calendar LastPublishedDate;

    public java.util.Calendar getLastPublishedDate() {
      return LastPublishedDate;
    }

    public void setLastPublishedDate(java.util.Calendar LastPublishedDate) {
      this.LastPublishedDate = LastPublishedDate;
      LastPublishedDate__is_set = true;
    }

    /**
     * element : OwnerId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo OwnerId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OwnerId","urn:enterprise.soap.sforce.com","ID",0,1,true);

    private boolean OwnerId__is_set = false;

    private java.lang.String OwnerId;

    public java.lang.String getOwnerId() {
      return OwnerId;
    }

    public void setOwnerId(java.lang.String OwnerId) {
      this.OwnerId = OwnerId;
      OwnerId__is_set = true;
    }

    /**
     * element : ProcessInstances of type {urn:enterprise.soap.sforce.com}QueryResult
     * java type: com.sforce.soap.enterprise.QueryResult
     */
    private static final com.sforce.ws.bind.TypeInfo ProcessInstances__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ProcessInstances","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

    private boolean ProcessInstances__is_set = false;

    private com.sforce.soap.enterprise.QueryResult ProcessInstances;

    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
      return ProcessInstances;
    }

    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult ProcessInstances) {
      this.ProcessInstances = ProcessInstances;
      ProcessInstances__is_set = true;
    }

    /**
     * element : ProcessSteps of type {urn:enterprise.soap.sforce.com}QueryResult
     * java type: com.sforce.soap.enterprise.QueryResult
     */
    private static final com.sforce.ws.bind.TypeInfo ProcessSteps__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ProcessSteps","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

    private boolean ProcessSteps__is_set = false;

    private com.sforce.soap.enterprise.QueryResult ProcessSteps;

    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
      return ProcessSteps;
    }

    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult ProcessSteps) {
      this.ProcessSteps = ProcessSteps;
      ProcessSteps__is_set = true;
    }

    /**
     * element : PublishStatus of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo PublishStatus__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PublishStatus","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean PublishStatus__is_set = false;

    private java.lang.String PublishStatus;

    public java.lang.String getPublishStatus() {
      return PublishStatus;
    }

    public void setPublishStatus(java.lang.String PublishStatus) {
      this.PublishStatus = PublishStatus;
      PublishStatus__is_set = true;
    }

    /**
     * element : SourceId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo SourceId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SourceId","urn:enterprise.soap.sforce.com","ID",0,1,true);

    private boolean SourceId__is_set = false;

    private java.lang.String SourceId;

    public java.lang.String getSourceId() {
      return SourceId;
    }

    public void setSourceId(java.lang.String SourceId) {
      this.SourceId = SourceId;
      SourceId__is_set = true;
    }

    /**
     * element : Summary of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo Summary__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Summary","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean Summary__is_set = false;

    private java.lang.String Summary;

    public java.lang.String getSummary() {
      return Summary;
    }

    public void setSummary(java.lang.String Summary) {
      this.Summary = Summary;
      Summary__is_set = true;
    }

    /**
     * element : SystemModstamp of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private static final com.sforce.ws.bind.TypeInfo SystemModstamp__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SystemModstamp","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

    private boolean SystemModstamp__is_set = false;

    private java.util.Calendar SystemModstamp;

    public java.util.Calendar getSystemModstamp() {
      return SystemModstamp;
    }

    public void setSystemModstamp(java.util.Calendar SystemModstamp) {
      this.SystemModstamp = SystemModstamp;
      SystemModstamp__is_set = true;
    }

    /**
     * element : Title of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo Title__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Title","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean Title__is_set = false;

    private java.lang.String Title;

    public java.lang.String getTitle() {
      return Title;
    }

    public void setTitle(java.lang.String Title) {
      this.Title = Title;
      Title__is_set = true;
    }

    /**
     * element : UrlName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo UrlName__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UrlName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean UrlName__is_set = false;

    private java.lang.String UrlName;

    public java.lang.String getUrlName() {
      return UrlName;
    }

    public void setUrlName(java.lang.String UrlName) {
      this.UrlName = UrlName;
      UrlName__is_set = true;
    }

    /**
     * element : ValidationStatus of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo ValidationStatus__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ValidationStatus","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean ValidationStatus__is_set = false;

    private java.lang.String ValidationStatus;

    public java.lang.String getValidationStatus() {
      return ValidationStatus;
    }

    public void setValidationStatus(java.lang.String ValidationStatus) {
      this.ValidationStatus = ValidationStatus;
      ValidationStatus__is_set = true;
    }

    /**
     * element : VersionNumber of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private static final com.sforce.ws.bind.TypeInfo VersionNumber__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VersionNumber","http://www.w3.org/2001/XMLSchema","int",0,1,true);

    private boolean VersionNumber__is_set = false;

    private java.lang.Integer VersionNumber;

    public java.lang.Integer getVersionNumber() {
      return VersionNumber;
    }

    public void setVersionNumber(java.lang.Integer VersionNumber) {
      this.VersionNumber = VersionNumber;
      VersionNumber__is_set = true;
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "KnowledgeArticleVersion");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeString(__out, ArchivedById__typeInfo, ArchivedById, ArchivedById__is_set);
       __typeMapper.writeObject(__out, ArchivedDate__typeInfo, ArchivedDate, ArchivedDate__is_set);
       __typeMapper.writeString(__out, ArticleNumber__typeInfo, ArticleNumber, ArticleNumber__is_set);
       __typeMapper.writeString(__out, ArticleType__typeInfo, ArticleType, ArticleType__is_set);
       __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
       __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
       __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
       __typeMapper.writeObject(__out, FirstPublishedDate__typeInfo, FirstPublishedDate, FirstPublishedDate__is_set);
       __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
       __typeMapper.writeObject(__out, IsLatestVersion__typeInfo, IsLatestVersion, IsLatestVersion__is_set);
       __typeMapper.writeObject(__out, IsVisibleInApp__typeInfo, IsVisibleInApp, IsVisibleInApp__is_set);
       __typeMapper.writeObject(__out, IsVisibleInCsp__typeInfo, IsVisibleInCsp, IsVisibleInCsp__is_set);
       __typeMapper.writeObject(__out, IsVisibleInPkb__typeInfo, IsVisibleInPkb, IsVisibleInPkb__is_set);
       __typeMapper.writeObject(__out, IsVisibleInPrm__typeInfo, IsVisibleInPrm, IsVisibleInPrm__is_set);
       __typeMapper.writeString(__out, KnowledgeArticleId__typeInfo, KnowledgeArticleId, KnowledgeArticleId__is_set);
       __typeMapper.writeString(__out, Language__typeInfo, Language, Language__is_set);
       __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
       __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
       __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
       __typeMapper.writeObject(__out, LastPublishedDate__typeInfo, LastPublishedDate, LastPublishedDate__is_set);
       __typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId, OwnerId__is_set);
       __typeMapper.writeObject(__out, ProcessInstances__typeInfo, ProcessInstances, ProcessInstances__is_set);
       __typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps, ProcessSteps__is_set);
       __typeMapper.writeString(__out, PublishStatus__typeInfo, PublishStatus, PublishStatus__is_set);
       __typeMapper.writeString(__out, SourceId__typeInfo, SourceId, SourceId__is_set);
       __typeMapper.writeString(__out, Summary__typeInfo, Summary, Summary__is_set);
       __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
       __typeMapper.writeString(__out, Title__typeInfo, Title, Title__is_set);
       __typeMapper.writeString(__out, UrlName__typeInfo, UrlName, UrlName__is_set);
       __typeMapper.writeString(__out, ValidationStatus__typeInfo, ValidationStatus, ValidationStatus__is_set);
       __typeMapper.writeObject(__out, VersionNumber__typeInfo, VersionNumber, VersionNumber__is_set);
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
        if (__typeMapper.isElement(__in, ArchivedById__typeInfo)) {
            setArchivedById(__typeMapper.readString(__in, ArchivedById__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, ArchivedDate__typeInfo)) {
            setArchivedDate((java.util.Calendar)__typeMapper.readObject(__in, ArchivedDate__typeInfo, java.util.Calendar.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, ArticleNumber__typeInfo)) {
            setArticleNumber(__typeMapper.readString(__in, ArticleNumber__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, ArticleType__typeInfo)) {
            setArticleType(__typeMapper.readString(__in, ArticleType__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, CreatedBy__typeInfo)) {
            setCreatedBy((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, CreatedBy__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
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
        if (__typeMapper.isElement(__in, FirstPublishedDate__typeInfo)) {
            setFirstPublishedDate((java.util.Calendar)__typeMapper.readObject(__in, FirstPublishedDate__typeInfo, java.util.Calendar.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
            setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, IsLatestVersion__typeInfo)) {
            setIsLatestVersion((java.lang.Boolean)__typeMapper.readObject(__in, IsLatestVersion__typeInfo, java.lang.Boolean.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, IsVisibleInApp__typeInfo)) {
            setIsVisibleInApp((java.lang.Boolean)__typeMapper.readObject(__in, IsVisibleInApp__typeInfo, java.lang.Boolean.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, IsVisibleInCsp__typeInfo)) {
            setIsVisibleInCsp((java.lang.Boolean)__typeMapper.readObject(__in, IsVisibleInCsp__typeInfo, java.lang.Boolean.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, IsVisibleInPkb__typeInfo)) {
            setIsVisibleInPkb((java.lang.Boolean)__typeMapper.readObject(__in, IsVisibleInPkb__typeInfo, java.lang.Boolean.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, IsVisibleInPrm__typeInfo)) {
            setIsVisibleInPrm((java.lang.Boolean)__typeMapper.readObject(__in, IsVisibleInPrm__typeInfo, java.lang.Boolean.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, KnowledgeArticleId__typeInfo)) {
            setKnowledgeArticleId(__typeMapper.readString(__in, KnowledgeArticleId__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, Language__typeInfo)) {
            setLanguage(__typeMapper.readString(__in, Language__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, LastModifiedBy__typeInfo)) {
            setLastModifiedBy((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, LastModifiedBy__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, LastModifiedById__typeInfo)) {
            setLastModifiedById(__typeMapper.readString(__in, LastModifiedById__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, LastModifiedDate__typeInfo)) {
            setLastModifiedDate((java.util.Calendar)__typeMapper.readObject(__in, LastModifiedDate__typeInfo, java.util.Calendar.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, LastPublishedDate__typeInfo)) {
            setLastPublishedDate((java.util.Calendar)__typeMapper.readObject(__in, LastPublishedDate__typeInfo, java.util.Calendar.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, OwnerId__typeInfo)) {
            setOwnerId(__typeMapper.readString(__in, OwnerId__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, ProcessInstances__typeInfo)) {
            setProcessInstances((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ProcessInstances__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, ProcessSteps__typeInfo)) {
            setProcessSteps((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ProcessSteps__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, PublishStatus__typeInfo)) {
            setPublishStatus(__typeMapper.readString(__in, PublishStatus__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, SourceId__typeInfo)) {
            setSourceId(__typeMapper.readString(__in, SourceId__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, Summary__typeInfo)) {
            setSummary(__typeMapper.readString(__in, Summary__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
            setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, Title__typeInfo)) {
            setTitle(__typeMapper.readString(__in, Title__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, UrlName__typeInfo)) {
            setUrlName(__typeMapper.readString(__in, UrlName__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, ValidationStatus__typeInfo)) {
            setValidationStatus(__typeMapper.readString(__in, ValidationStatus__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, VersionNumber__typeInfo)) {
            setVersionNumber((java.lang.Integer)__typeMapper.readObject(__in, VersionNumber__typeInfo, java.lang.Integer.class));
        }
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[KnowledgeArticleVersion ");
      sb.append(super.toString());sb.append(" ArchivedById=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ArchivedById)+"'\n");
      sb.append(" ArchivedDate=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ArchivedDate)+"'\n");
      sb.append(" ArticleNumber=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ArticleNumber)+"'\n");
      sb.append(" ArticleType=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ArticleType)+"'\n");
      sb.append(" CreatedBy=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
      sb.append(" CreatedById=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
      sb.append(" CreatedDate=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
      sb.append(" FirstPublishedDate=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(FirstPublishedDate)+"'\n");
      sb.append(" IsDeleted=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
      sb.append(" IsLatestVersion=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(IsLatestVersion)+"'\n");
      sb.append(" IsVisibleInApp=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(IsVisibleInApp)+"'\n");
      sb.append(" IsVisibleInCsp=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(IsVisibleInCsp)+"'\n");
      sb.append(" IsVisibleInPkb=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(IsVisibleInPkb)+"'\n");
      sb.append(" IsVisibleInPrm=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(IsVisibleInPrm)+"'\n");
      sb.append(" KnowledgeArticleId=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(KnowledgeArticleId)+"'\n");
      sb.append(" Language=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(Language)+"'\n");
      sb.append(" LastModifiedBy=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
      sb.append(" LastModifiedById=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
      sb.append(" LastModifiedDate=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
      sb.append(" LastPublishedDate=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(LastPublishedDate)+"'\n");
      sb.append(" OwnerId=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(OwnerId)+"'\n");
      sb.append(" ProcessInstances=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstances)+"'\n");
      sb.append(" ProcessSteps=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessSteps)+"'\n");
      sb.append(" PublishStatus=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(PublishStatus)+"'\n");
      sb.append(" SourceId=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(SourceId)+"'\n");
      sb.append(" Summary=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(Summary)+"'\n");
      sb.append(" SystemModstamp=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
      sb.append(" Title=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(Title)+"'\n");
      sb.append(" UrlName=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(UrlName)+"'\n");
      sb.append(" ValidationStatus=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ValidationStatus)+"'\n");
      sb.append(" VersionNumber=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(VersionNumber)+"'\n");
      sb.append("]\n");
      return sb.toString();
    }
}
