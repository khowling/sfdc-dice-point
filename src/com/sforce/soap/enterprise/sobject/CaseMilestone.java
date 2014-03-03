package com.sforce.soap.enterprise.sobject;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class CaseMilestone extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public CaseMilestone() {}

    /**
     * element : Case of type {urn:sobject.enterprise.soap.sforce.com}Case
     * java type: com.sforce.soap.enterprise.sobject.Case
     */
    private static final com.sforce.ws.bind.TypeInfo Case__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Case","urn:sobject.enterprise.soap.sforce.com","Case",0,1,true);

    private boolean Case__is_set = false;

    private com.sforce.soap.enterprise.sobject.Case Case;

    public com.sforce.soap.enterprise.sobject.Case getCase() {
      return Case;
    }

    public void setCase(com.sforce.soap.enterprise.sobject.Case Case) {
      this.Case = Case;
      Case__is_set = true;
    }

    /**
     * element : CaseId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo CaseId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CaseId","urn:enterprise.soap.sforce.com","ID",0,1,true);

    private boolean CaseId__is_set = false;

    private java.lang.String CaseId;

    public java.lang.String getCaseId() {
      return CaseId;
    }

    public void setCaseId(java.lang.String CaseId) {
      this.CaseId = CaseId;
      CaseId__is_set = true;
    }

    /**
     * element : CompletionDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private static final com.sforce.ws.bind.TypeInfo CompletionDate__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CompletionDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

    private boolean CompletionDate__is_set = false;

    private java.util.Calendar CompletionDate;

    public java.util.Calendar getCompletionDate() {
      return CompletionDate;
    }

    public void setCompletionDate(java.util.Calendar CompletionDate) {
      this.CompletionDate = CompletionDate;
      CompletionDate__is_set = true;
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
     * element : ElapsedTimeInDays of type {http://www.w3.org/2001/XMLSchema}double
     * java type: java.lang.Double
     */
    private static final com.sforce.ws.bind.TypeInfo ElapsedTimeInDays__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ElapsedTimeInDays","http://www.w3.org/2001/XMLSchema","double",0,1,true);

    private boolean ElapsedTimeInDays__is_set = false;

    private java.lang.Double ElapsedTimeInDays;

    public java.lang.Double getElapsedTimeInDays() {
      return ElapsedTimeInDays;
    }

    public void setElapsedTimeInDays(java.lang.Double ElapsedTimeInDays) {
      this.ElapsedTimeInDays = ElapsedTimeInDays;
      ElapsedTimeInDays__is_set = true;
    }

    /**
     * element : ElapsedTimeInHrs of type {http://www.w3.org/2001/XMLSchema}double
     * java type: java.lang.Double
     */
    private static final com.sforce.ws.bind.TypeInfo ElapsedTimeInHrs__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ElapsedTimeInHrs","http://www.w3.org/2001/XMLSchema","double",0,1,true);

    private boolean ElapsedTimeInHrs__is_set = false;

    private java.lang.Double ElapsedTimeInHrs;

    public java.lang.Double getElapsedTimeInHrs() {
      return ElapsedTimeInHrs;
    }

    public void setElapsedTimeInHrs(java.lang.Double ElapsedTimeInHrs) {
      this.ElapsedTimeInHrs = ElapsedTimeInHrs;
      ElapsedTimeInHrs__is_set = true;
    }

    /**
     * element : ElapsedTimeInMins of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private static final com.sforce.ws.bind.TypeInfo ElapsedTimeInMins__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ElapsedTimeInMins","http://www.w3.org/2001/XMLSchema","int",0,1,true);

    private boolean ElapsedTimeInMins__is_set = false;

    private java.lang.Integer ElapsedTimeInMins;

    public java.lang.Integer getElapsedTimeInMins() {
      return ElapsedTimeInMins;
    }

    public void setElapsedTimeInMins(java.lang.Integer ElapsedTimeInMins) {
      this.ElapsedTimeInMins = ElapsedTimeInMins;
      ElapsedTimeInMins__is_set = true;
    }

    /**
     * element : IsCompleted of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private static final com.sforce.ws.bind.TypeInfo IsCompleted__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsCompleted","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean IsCompleted__is_set = false;

    private java.lang.Boolean IsCompleted;

    public java.lang.Boolean getIsCompleted() {
      return IsCompleted;
    }

    public void setIsCompleted(java.lang.Boolean IsCompleted) {
      this.IsCompleted = IsCompleted;
      IsCompleted__is_set = true;
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
     * element : IsViolated of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private static final com.sforce.ws.bind.TypeInfo IsViolated__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsViolated","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean IsViolated__is_set = false;

    private java.lang.Boolean IsViolated;

    public java.lang.Boolean getIsViolated() {
      return IsViolated;
    }

    public void setIsViolated(java.lang.Boolean IsViolated) {
      this.IsViolated = IsViolated;
      IsViolated__is_set = true;
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
     * element : MilestoneType of type {urn:sobject.enterprise.soap.sforce.com}MilestoneType
     * java type: com.sforce.soap.enterprise.sobject.MilestoneType
     */
    private static final com.sforce.ws.bind.TypeInfo MilestoneType__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MilestoneType","urn:sobject.enterprise.soap.sforce.com","MilestoneType",0,1,true);

    private boolean MilestoneType__is_set = false;

    private com.sforce.soap.enterprise.sobject.MilestoneType MilestoneType;

    public com.sforce.soap.enterprise.sobject.MilestoneType getMilestoneType() {
      return MilestoneType;
    }

    public void setMilestoneType(com.sforce.soap.enterprise.sobject.MilestoneType MilestoneType) {
      this.MilestoneType = MilestoneType;
      MilestoneType__is_set = true;
    }

    /**
     * element : MilestoneTypeId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo MilestoneTypeId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MilestoneTypeId","urn:enterprise.soap.sforce.com","ID",0,1,true);

    private boolean MilestoneTypeId__is_set = false;

    private java.lang.String MilestoneTypeId;

    public java.lang.String getMilestoneTypeId() {
      return MilestoneTypeId;
    }

    public void setMilestoneTypeId(java.lang.String MilestoneTypeId) {
      this.MilestoneTypeId = MilestoneTypeId;
      MilestoneTypeId__is_set = true;
    }

    /**
     * element : StartDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private static final com.sforce.ws.bind.TypeInfo StartDate__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","StartDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

    private boolean StartDate__is_set = false;

    private java.util.Calendar StartDate;

    public java.util.Calendar getStartDate() {
      return StartDate;
    }

    public void setStartDate(java.util.Calendar StartDate) {
      this.StartDate = StartDate;
      StartDate__is_set = true;
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
     * element : TargetDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private static final com.sforce.ws.bind.TypeInfo TargetDate__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TargetDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

    private boolean TargetDate__is_set = false;

    private java.util.Calendar TargetDate;

    public java.util.Calendar getTargetDate() {
      return TargetDate;
    }

    public void setTargetDate(java.util.Calendar TargetDate) {
      this.TargetDate = TargetDate;
      TargetDate__is_set = true;
    }

    /**
     * element : TargetResponseInDays of type {http://www.w3.org/2001/XMLSchema}double
     * java type: java.lang.Double
     */
    private static final com.sforce.ws.bind.TypeInfo TargetResponseInDays__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TargetResponseInDays","http://www.w3.org/2001/XMLSchema","double",0,1,true);

    private boolean TargetResponseInDays__is_set = false;

    private java.lang.Double TargetResponseInDays;

    public java.lang.Double getTargetResponseInDays() {
      return TargetResponseInDays;
    }

    public void setTargetResponseInDays(java.lang.Double TargetResponseInDays) {
      this.TargetResponseInDays = TargetResponseInDays;
      TargetResponseInDays__is_set = true;
    }

    /**
     * element : TargetResponseInHrs of type {http://www.w3.org/2001/XMLSchema}double
     * java type: java.lang.Double
     */
    private static final com.sforce.ws.bind.TypeInfo TargetResponseInHrs__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TargetResponseInHrs","http://www.w3.org/2001/XMLSchema","double",0,1,true);

    private boolean TargetResponseInHrs__is_set = false;

    private java.lang.Double TargetResponseInHrs;

    public java.lang.Double getTargetResponseInHrs() {
      return TargetResponseInHrs;
    }

    public void setTargetResponseInHrs(java.lang.Double TargetResponseInHrs) {
      this.TargetResponseInHrs = TargetResponseInHrs;
      TargetResponseInHrs__is_set = true;
    }

    /**
     * element : TargetResponseInMins of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private static final com.sforce.ws.bind.TypeInfo TargetResponseInMins__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TargetResponseInMins","http://www.w3.org/2001/XMLSchema","int",0,1,true);

    private boolean TargetResponseInMins__is_set = false;

    private java.lang.Integer TargetResponseInMins;

    public java.lang.Integer getTargetResponseInMins() {
      return TargetResponseInMins;
    }

    public void setTargetResponseInMins(java.lang.Integer TargetResponseInMins) {
      this.TargetResponseInMins = TargetResponseInMins;
      TargetResponseInMins__is_set = true;
    }

    /**
     * element : TimeRemainingInMins of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo TimeRemainingInMins__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TimeRemainingInMins","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean TimeRemainingInMins__is_set = false;

    private java.lang.String TimeRemainingInMins;

    public java.lang.String getTimeRemainingInMins() {
      return TimeRemainingInMins;
    }

    public void setTimeRemainingInMins(java.lang.String TimeRemainingInMins) {
      this.TimeRemainingInMins = TimeRemainingInMins;
      TimeRemainingInMins__is_set = true;
    }

    /**
     * element : TimeSinceTargetInMins of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo TimeSinceTargetInMins__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TimeSinceTargetInMins","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean TimeSinceTargetInMins__is_set = false;

    private java.lang.String TimeSinceTargetInMins;

    public java.lang.String getTimeSinceTargetInMins() {
      return TimeSinceTargetInMins;
    }

    public void setTimeSinceTargetInMins(java.lang.String TimeSinceTargetInMins) {
      this.TimeSinceTargetInMins = TimeSinceTargetInMins;
      TimeSinceTargetInMins__is_set = true;
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "CaseMilestone");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeObject(__out, Case__typeInfo, Case, Case__is_set);
       __typeMapper.writeString(__out, CaseId__typeInfo, CaseId, CaseId__is_set);
       __typeMapper.writeObject(__out, CompletionDate__typeInfo, CompletionDate, CompletionDate__is_set);
       __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
       __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
       __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
       __typeMapper.writeObject(__out, ElapsedTimeInDays__typeInfo, ElapsedTimeInDays, ElapsedTimeInDays__is_set);
       __typeMapper.writeObject(__out, ElapsedTimeInHrs__typeInfo, ElapsedTimeInHrs, ElapsedTimeInHrs__is_set);
       __typeMapper.writeObject(__out, ElapsedTimeInMins__typeInfo, ElapsedTimeInMins, ElapsedTimeInMins__is_set);
       __typeMapper.writeObject(__out, IsCompleted__typeInfo, IsCompleted, IsCompleted__is_set);
       __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
       __typeMapper.writeObject(__out, IsViolated__typeInfo, IsViolated, IsViolated__is_set);
       __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
       __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
       __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
       __typeMapper.writeObject(__out, MilestoneType__typeInfo, MilestoneType, MilestoneType__is_set);
       __typeMapper.writeString(__out, MilestoneTypeId__typeInfo, MilestoneTypeId, MilestoneTypeId__is_set);
       __typeMapper.writeObject(__out, StartDate__typeInfo, StartDate, StartDate__is_set);
       __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
       __typeMapper.writeObject(__out, TargetDate__typeInfo, TargetDate, TargetDate__is_set);
       __typeMapper.writeObject(__out, TargetResponseInDays__typeInfo, TargetResponseInDays, TargetResponseInDays__is_set);
       __typeMapper.writeObject(__out, TargetResponseInHrs__typeInfo, TargetResponseInHrs, TargetResponseInHrs__is_set);
       __typeMapper.writeObject(__out, TargetResponseInMins__typeInfo, TargetResponseInMins, TargetResponseInMins__is_set);
       __typeMapper.writeString(__out, TimeRemainingInMins__typeInfo, TimeRemainingInMins, TimeRemainingInMins__is_set);
       __typeMapper.writeString(__out, TimeSinceTargetInMins__typeInfo, TimeSinceTargetInMins, TimeSinceTargetInMins__is_set);
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
        if (__typeMapper.isElement(__in, Case__typeInfo)) {
            setCase((com.sforce.soap.enterprise.sobject.Case)__typeMapper.readObject(__in, Case__typeInfo, com.sforce.soap.enterprise.sobject.Case.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, CaseId__typeInfo)) {
            setCaseId(__typeMapper.readString(__in, CaseId__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, CompletionDate__typeInfo)) {
            setCompletionDate((java.util.Calendar)__typeMapper.readObject(__in, CompletionDate__typeInfo, java.util.Calendar.class));
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
        if (__typeMapper.isElement(__in, ElapsedTimeInDays__typeInfo)) {
            setElapsedTimeInDays((java.lang.Double)__typeMapper.readObject(__in, ElapsedTimeInDays__typeInfo, java.lang.Double.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, ElapsedTimeInHrs__typeInfo)) {
            setElapsedTimeInHrs((java.lang.Double)__typeMapper.readObject(__in, ElapsedTimeInHrs__typeInfo, java.lang.Double.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, ElapsedTimeInMins__typeInfo)) {
            setElapsedTimeInMins((java.lang.Integer)__typeMapper.readObject(__in, ElapsedTimeInMins__typeInfo, java.lang.Integer.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, IsCompleted__typeInfo)) {
            setIsCompleted((java.lang.Boolean)__typeMapper.readObject(__in, IsCompleted__typeInfo, java.lang.Boolean.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
            setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, IsViolated__typeInfo)) {
            setIsViolated((java.lang.Boolean)__typeMapper.readObject(__in, IsViolated__typeInfo, java.lang.Boolean.class));
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
        if (__typeMapper.isElement(__in, MilestoneType__typeInfo)) {
            setMilestoneType((com.sforce.soap.enterprise.sobject.MilestoneType)__typeMapper.readObject(__in, MilestoneType__typeInfo, com.sforce.soap.enterprise.sobject.MilestoneType.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, MilestoneTypeId__typeInfo)) {
            setMilestoneTypeId(__typeMapper.readString(__in, MilestoneTypeId__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, StartDate__typeInfo)) {
            setStartDate((java.util.Calendar)__typeMapper.readObject(__in, StartDate__typeInfo, java.util.Calendar.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
            setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, TargetDate__typeInfo)) {
            setTargetDate((java.util.Calendar)__typeMapper.readObject(__in, TargetDate__typeInfo, java.util.Calendar.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, TargetResponseInDays__typeInfo)) {
            setTargetResponseInDays((java.lang.Double)__typeMapper.readObject(__in, TargetResponseInDays__typeInfo, java.lang.Double.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, TargetResponseInHrs__typeInfo)) {
            setTargetResponseInHrs((java.lang.Double)__typeMapper.readObject(__in, TargetResponseInHrs__typeInfo, java.lang.Double.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, TargetResponseInMins__typeInfo)) {
            setTargetResponseInMins((java.lang.Integer)__typeMapper.readObject(__in, TargetResponseInMins__typeInfo, java.lang.Integer.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, TimeRemainingInMins__typeInfo)) {
            setTimeRemainingInMins(__typeMapper.readString(__in, TimeRemainingInMins__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, TimeSinceTargetInMins__typeInfo)) {
            setTimeSinceTargetInMins(__typeMapper.readString(__in, TimeSinceTargetInMins__typeInfo, java.lang.String.class));
        }
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[CaseMilestone ");
      sb.append(super.toString());sb.append(" Case=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(Case)+"'\n");
      sb.append(" CaseId=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CaseId)+"'\n");
      sb.append(" CompletionDate=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CompletionDate)+"'\n");
      sb.append(" CreatedBy=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
      sb.append(" CreatedById=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
      sb.append(" CreatedDate=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
      sb.append(" ElapsedTimeInDays=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ElapsedTimeInDays)+"'\n");
      sb.append(" ElapsedTimeInHrs=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ElapsedTimeInHrs)+"'\n");
      sb.append(" ElapsedTimeInMins=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ElapsedTimeInMins)+"'\n");
      sb.append(" IsCompleted=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(IsCompleted)+"'\n");
      sb.append(" IsDeleted=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
      sb.append(" IsViolated=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(IsViolated)+"'\n");
      sb.append(" LastModifiedBy=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
      sb.append(" LastModifiedById=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
      sb.append(" LastModifiedDate=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
      sb.append(" MilestoneType=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(MilestoneType)+"'\n");
      sb.append(" MilestoneTypeId=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(MilestoneTypeId)+"'\n");
      sb.append(" StartDate=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(StartDate)+"'\n");
      sb.append(" SystemModstamp=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
      sb.append(" TargetDate=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(TargetDate)+"'\n");
      sb.append(" TargetResponseInDays=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(TargetResponseInDays)+"'\n");
      sb.append(" TargetResponseInHrs=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(TargetResponseInHrs)+"'\n");
      sb.append(" TargetResponseInMins=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(TargetResponseInMins)+"'\n");
      sb.append(" TimeRemainingInMins=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(TimeRemainingInMins)+"'\n");
      sb.append(" TimeSinceTargetInMins=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(TimeSinceTargetInMins)+"'\n");
      sb.append("]\n");
      return sb.toString();
    }
}