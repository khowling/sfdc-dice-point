package com.sforce.soap.enterprise.sobject;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class Suport__c extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public Suport__c() {}

    /**
     * element : AttachedContentDocuments of type {urn:enterprise.soap.sforce.com}QueryResult
     * java type: com.sforce.soap.enterprise.QueryResult
     */
    private static final com.sforce.ws.bind.TypeInfo AttachedContentDocuments__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AttachedContentDocuments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

    private boolean AttachedContentDocuments__is_set = false;

    private com.sforce.soap.enterprise.QueryResult AttachedContentDocuments;

    public com.sforce.soap.enterprise.QueryResult getAttachedContentDocuments() {
      return AttachedContentDocuments;
    }

    public void setAttachedContentDocuments(com.sforce.soap.enterprise.QueryResult AttachedContentDocuments) {
      this.AttachedContentDocuments = AttachedContentDocuments;
      AttachedContentDocuments__is_set = true;
    }

    /**
     * element : Attachments of type {urn:enterprise.soap.sforce.com}QueryResult
     * java type: com.sforce.soap.enterprise.QueryResult
     */
    private static final com.sforce.ws.bind.TypeInfo Attachments__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Attachments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

    private boolean Attachments__is_set = false;

    private com.sforce.soap.enterprise.QueryResult Attachments;

    public com.sforce.soap.enterprise.QueryResult getAttachments() {
      return Attachments;
    }

    public void setAttachments(com.sforce.soap.enterprise.QueryResult Attachments) {
      this.Attachments = Attachments;
      Attachments__is_set = true;
    }

    /**
     * element : CombinedAttachments of type {urn:enterprise.soap.sforce.com}QueryResult
     * java type: com.sforce.soap.enterprise.QueryResult
     */
    private static final com.sforce.ws.bind.TypeInfo CombinedAttachments__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CombinedAttachments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

    private boolean CombinedAttachments__is_set = false;

    private com.sforce.soap.enterprise.QueryResult CombinedAttachments;

    public com.sforce.soap.enterprise.QueryResult getCombinedAttachments() {
      return CombinedAttachments;
    }

    public void setCombinedAttachments(com.sforce.soap.enterprise.QueryResult CombinedAttachments) {
      this.CombinedAttachments = CombinedAttachments;
      CombinedAttachments__is_set = true;
    }

    /**
     * element : Correo_del_Call_Center__c of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo Correo_del_Call_Center__c__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Correo_del_Call_Center__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean Correo_del_Call_Center__c__is_set = false;

    private java.lang.String Correo_del_Call_Center__c;

    public java.lang.String getCorreo_del_Call_Center__c() {
      return Correo_del_Call_Center__c;
    }

    public void setCorreo_del_Call_Center__c(java.lang.String Correo_del_Call_Center__c) {
      this.Correo_del_Call_Center__c = Correo_del_Call_Center__c;
      Correo_del_Call_Center__c__is_set = true;
    }

    /**
     * element : Correo_del_Gerente__c of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo Correo_del_Gerente__c__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Correo_del_Gerente__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean Correo_del_Gerente__c__is_set = false;

    private java.lang.String Correo_del_Gerente__c;

    public java.lang.String getCorreo_del_Gerente__c() {
      return Correo_del_Gerente__c;
    }

    public void setCorreo_del_Gerente__c(java.lang.String Correo_del_Gerente__c) {
      this.Correo_del_Gerente__c = Correo_del_Gerente__c;
      Correo_del_Gerente__c__is_set = true;
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
     * element : FeedSubscriptionsForEntity of type {urn:enterprise.soap.sforce.com}QueryResult
     * java type: com.sforce.soap.enterprise.QueryResult
     */
    private static final com.sforce.ws.bind.TypeInfo FeedSubscriptionsForEntity__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FeedSubscriptionsForEntity","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

    private boolean FeedSubscriptionsForEntity__is_set = false;

    private com.sforce.soap.enterprise.QueryResult FeedSubscriptionsForEntity;

    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
      return FeedSubscriptionsForEntity;
    }

    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult FeedSubscriptionsForEntity) {
      this.FeedSubscriptionsForEntity = FeedSubscriptionsForEntity;
      FeedSubscriptionsForEntity__is_set = true;
    }

    /**
     * element : Gerente_del_Call_Center__c of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo Gerente_del_Call_Center__c__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Gerente_del_Call_Center__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean Gerente_del_Call_Center__c__is_set = false;

    private java.lang.String Gerente_del_Call_Center__c;

    public java.lang.String getGerente_del_Call_Center__c() {
      return Gerente_del_Call_Center__c;
    }

    public void setGerente_del_Call_Center__c(java.lang.String Gerente_del_Call_Center__c) {
      this.Gerente_del_Call_Center__c = Gerente_del_Call_Center__c;
      Gerente_del_Call_Center__c__is_set = true;
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
     * element : List_Contact_Suport__r of type {urn:enterprise.soap.sforce.com}QueryResult
     * java type: com.sforce.soap.enterprise.QueryResult
     */
    private static final com.sforce.ws.bind.TypeInfo List_Contact_Suport__r__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","List_Contact_Suport__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

    private boolean List_Contact_Suport__r__is_set = false;

    private com.sforce.soap.enterprise.QueryResult List_Contact_Suport__r;

    public com.sforce.soap.enterprise.QueryResult getList_Contact_Suport__r() {
      return List_Contact_Suport__r;
    }

    public void setList_Contact_Suport__r(com.sforce.soap.enterprise.QueryResult List_Contact_Suport__r) {
      this.List_Contact_Suport__r = List_Contact_Suport__r;
      List_Contact_Suport__r__is_set = true;
    }

    /**
     * element : Name of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo Name__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Name","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean Name__is_set = false;

    private java.lang.String Name;

    public java.lang.String getName() {
      return Name;
    }

    public void setName(java.lang.String Name) {
      this.Name = Name;
      Name__is_set = true;
    }

    /**
     * element : Notes of type {urn:enterprise.soap.sforce.com}QueryResult
     * java type: com.sforce.soap.enterprise.QueryResult
     */
    private static final com.sforce.ws.bind.TypeInfo Notes__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Notes","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

    private boolean Notes__is_set = false;

    private com.sforce.soap.enterprise.QueryResult Notes;

    public com.sforce.soap.enterprise.QueryResult getNotes() {
      return Notes;
    }

    public void setNotes(com.sforce.soap.enterprise.QueryResult Notes) {
      this.Notes = Notes;
      Notes__is_set = true;
    }

    /**
     * element : NotesAndAttachments of type {urn:enterprise.soap.sforce.com}QueryResult
     * java type: com.sforce.soap.enterprise.QueryResult
     */
    private static final com.sforce.ws.bind.TypeInfo NotesAndAttachments__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NotesAndAttachments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

    private boolean NotesAndAttachments__is_set = false;

    private com.sforce.soap.enterprise.QueryResult NotesAndAttachments;

    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
      return NotesAndAttachments;
    }

    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult NotesAndAttachments) {
      this.NotesAndAttachments = NotesAndAttachments;
      NotesAndAttachments__is_set = true;
    }

    /**
     * element : Owner of type {urn:sobject.enterprise.soap.sforce.com}Name
     * java type: com.sforce.soap.enterprise.sobject.Name
     */
    private static final com.sforce.ws.bind.TypeInfo Owner__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Owner","urn:sobject.enterprise.soap.sforce.com","Name",0,1,true);

    private boolean Owner__is_set = false;

    private com.sforce.soap.enterprise.sobject.Name Owner;

    public com.sforce.soap.enterprise.sobject.Name getOwner() {
      return Owner;
    }

    public void setOwner(com.sforce.soap.enterprise.sobject.Name Owner) {
      this.Owner = Owner;
      Owner__is_set = true;
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
     * element : Pais__c of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo Pais__c__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Pais__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean Pais__c__is_set = false;

    private java.lang.String Pais__c;

    public java.lang.String getPais__c() {
      return Pais__c;
    }

    public void setPais__c(java.lang.String Pais__c) {
      this.Pais__c = Pais__c;
      Pais__c__is_set = true;
    }

    /**
     * element : Photo__c of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo Photo__c__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Photo__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean Photo__c__is_set = false;

    private java.lang.String Photo__c;

    public java.lang.String getPhoto__c() {
      return Photo__c;
    }

    public void setPhoto__c(java.lang.String Photo__c) {
      this.Photo__c = Photo__c;
      Photo__c__is_set = true;
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
     * element : Telefono__c of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo Telefono__c__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Telefono__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean Telefono__c__is_set = false;

    private java.lang.String Telefono__c;

    public java.lang.String getTelefono__c() {
      return Telefono__c;
    }

    public void setTelefono__c(java.lang.String Telefono__c) {
      this.Telefono__c = Telefono__c;
      Telefono__c__is_set = true;
    }

    /**
     * element : Telefono_del_Gerente__c of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo Telefono_del_Gerente__c__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Telefono_del_Gerente__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean Telefono_del_Gerente__c__is_set = false;

    private java.lang.String Telefono_del_Gerente__c;

    public java.lang.String getTelefono_del_Gerente__c() {
      return Telefono_del_Gerente__c;
    }

    public void setTelefono_del_Gerente__c(java.lang.String Telefono_del_Gerente__c) {
      this.Telefono_del_Gerente__c = Telefono_del_Gerente__c;
      Telefono_del_Gerente__c__is_set = true;
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Suport__c");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
       __typeMapper.writeObject(__out, Attachments__typeInfo, Attachments, Attachments__is_set);
       __typeMapper.writeObject(__out, CombinedAttachments__typeInfo, CombinedAttachments, CombinedAttachments__is_set);
       __typeMapper.writeString(__out, Correo_del_Call_Center__c__typeInfo, Correo_del_Call_Center__c, Correo_del_Call_Center__c__is_set);
       __typeMapper.writeString(__out, Correo_del_Gerente__c__typeInfo, Correo_del_Gerente__c, Correo_del_Gerente__c__is_set);
       __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
       __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
       __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
       __typeMapper.writeObject(__out, FeedSubscriptionsForEntity__typeInfo, FeedSubscriptionsForEntity, FeedSubscriptionsForEntity__is_set);
       __typeMapper.writeString(__out, Gerente_del_Call_Center__c__typeInfo, Gerente_del_Call_Center__c, Gerente_del_Call_Center__c__is_set);
       __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
       __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
       __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
       __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
       __typeMapper.writeObject(__out, List_Contact_Suport__r__typeInfo, List_Contact_Suport__r, List_Contact_Suport__r__is_set);
       __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
       __typeMapper.writeObject(__out, Notes__typeInfo, Notes, Notes__is_set);
       __typeMapper.writeObject(__out, NotesAndAttachments__typeInfo, NotesAndAttachments, NotesAndAttachments__is_set);
       __typeMapper.writeObject(__out, Owner__typeInfo, Owner, Owner__is_set);
       __typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId, OwnerId__is_set);
       __typeMapper.writeString(__out, Pais__c__typeInfo, Pais__c, Pais__c__is_set);
       __typeMapper.writeString(__out, Photo__c__typeInfo, Photo__c, Photo__c__is_set);
       __typeMapper.writeObject(__out, ProcessInstances__typeInfo, ProcessInstances, ProcessInstances__is_set);
       __typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps, ProcessSteps__is_set);
       __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
       __typeMapper.writeString(__out, Telefono__c__typeInfo, Telefono__c, Telefono__c__is_set);
       __typeMapper.writeString(__out, Telefono_del_Gerente__c__typeInfo, Telefono_del_Gerente__c, Telefono_del_Gerente__c__is_set);
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
        if (__typeMapper.isElement(__in, AttachedContentDocuments__typeInfo)) {
            setAttachedContentDocuments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, AttachedContentDocuments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, Attachments__typeInfo)) {
            setAttachments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Attachments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, CombinedAttachments__typeInfo)) {
            setCombinedAttachments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, CombinedAttachments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, Correo_del_Call_Center__c__typeInfo)) {
            setCorreo_del_Call_Center__c(__typeMapper.readString(__in, Correo_del_Call_Center__c__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, Correo_del_Gerente__c__typeInfo)) {
            setCorreo_del_Gerente__c(__typeMapper.readString(__in, Correo_del_Gerente__c__typeInfo, java.lang.String.class));
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
        if (__typeMapper.isElement(__in, FeedSubscriptionsForEntity__typeInfo)) {
            setFeedSubscriptionsForEntity((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, FeedSubscriptionsForEntity__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, Gerente_del_Call_Center__c__typeInfo)) {
            setGerente_del_Call_Center__c(__typeMapper.readString(__in, Gerente_del_Call_Center__c__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
            setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
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
        if (__typeMapper.isElement(__in, List_Contact_Suport__r__typeInfo)) {
            setList_Contact_Suport__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, List_Contact_Suport__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, Name__typeInfo)) {
            setName(__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, Notes__typeInfo)) {
            setNotes((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Notes__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, NotesAndAttachments__typeInfo)) {
            setNotesAndAttachments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, NotesAndAttachments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, Owner__typeInfo)) {
            setOwner((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, Owner__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, OwnerId__typeInfo)) {
            setOwnerId(__typeMapper.readString(__in, OwnerId__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, Pais__c__typeInfo)) {
            setPais__c(__typeMapper.readString(__in, Pais__c__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, Photo__c__typeInfo)) {
            setPhoto__c(__typeMapper.readString(__in, Photo__c__typeInfo, java.lang.String.class));
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
        if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
            setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, Telefono__c__typeInfo)) {
            setTelefono__c(__typeMapper.readString(__in, Telefono__c__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, Telefono_del_Gerente__c__typeInfo)) {
            setTelefono_del_Gerente__c(__typeMapper.readString(__in, Telefono_del_Gerente__c__typeInfo, java.lang.String.class));
        }
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[Suport__c ");
      sb.append(super.toString());sb.append(" AttachedContentDocuments=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentDocuments)+"'\n");
      sb.append(" Attachments=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(Attachments)+"'\n");
      sb.append(" CombinedAttachments=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CombinedAttachments)+"'\n");
      sb.append(" Correo_del_Call_Center__c=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(Correo_del_Call_Center__c)+"'\n");
      sb.append(" Correo_del_Gerente__c=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(Correo_del_Gerente__c)+"'\n");
      sb.append(" CreatedBy=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
      sb.append(" CreatedById=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
      sb.append(" CreatedDate=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
      sb.append(" FeedSubscriptionsForEntity=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedSubscriptionsForEntity)+"'\n");
      sb.append(" Gerente_del_Call_Center__c=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(Gerente_del_Call_Center__c)+"'\n");
      sb.append(" IsDeleted=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
      sb.append(" LastModifiedBy=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
      sb.append(" LastModifiedById=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
      sb.append(" LastModifiedDate=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
      sb.append(" List_Contact_Suport__r=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(List_Contact_Suport__r)+"'\n");
      sb.append(" Name=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
      sb.append(" Notes=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(Notes)+"'\n");
      sb.append(" NotesAndAttachments=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(NotesAndAttachments)+"'\n");
      sb.append(" Owner=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(Owner)+"'\n");
      sb.append(" OwnerId=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(OwnerId)+"'\n");
      sb.append(" Pais__c=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(Pais__c)+"'\n");
      sb.append(" Photo__c=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(Photo__c)+"'\n");
      sb.append(" ProcessInstances=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstances)+"'\n");
      sb.append(" ProcessSteps=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessSteps)+"'\n");
      sb.append(" SystemModstamp=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
      sb.append(" Telefono__c=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(Telefono__c)+"'\n");
      sb.append(" Telefono_del_Gerente__c=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(Telefono_del_Gerente__c)+"'\n");
      sb.append("]\n");
      return sb.toString();
    }
}
