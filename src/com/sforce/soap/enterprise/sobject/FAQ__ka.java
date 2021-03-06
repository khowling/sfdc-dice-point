package com.sforce.soap.enterprise.sobject;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class FAQ__ka extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public FAQ__ka() {}

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
     * element : CaseArticles of type {urn:enterprise.soap.sforce.com}QueryResult
     * java type: com.sforce.soap.enterprise.QueryResult
     */
    private static final com.sforce.ws.bind.TypeInfo CaseArticles__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CaseArticles","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

    private boolean CaseArticles__is_set = false;

    private com.sforce.soap.enterprise.QueryResult CaseArticles;

    public com.sforce.soap.enterprise.QueryResult getCaseArticles() {
      return CaseArticles;
    }

    public void setCaseArticles(com.sforce.soap.enterprise.QueryResult CaseArticles) {
      this.CaseArticles = CaseArticles;
      CaseArticles__is_set = true;
    }

    /**
     * element : CaseAssociationCount of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private static final com.sforce.ws.bind.TypeInfo CaseAssociationCount__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CaseAssociationCount","http://www.w3.org/2001/XMLSchema","int",0,1,true);

    private boolean CaseAssociationCount__is_set = false;

    private java.lang.Integer CaseAssociationCount;

    public java.lang.Integer getCaseAssociationCount() {
      return CaseAssociationCount;
    }

    public void setCaseAssociationCount(java.lang.Integer CaseAssociationCount) {
      this.CaseAssociationCount = CaseAssociationCount;
      CaseAssociationCount__is_set = true;
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
     * element : Feeds of type {urn:enterprise.soap.sforce.com}QueryResult
     * java type: com.sforce.soap.enterprise.QueryResult
     */
    private static final com.sforce.ws.bind.TypeInfo Feeds__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Feeds","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

    private boolean Feeds__is_set = false;

    private com.sforce.soap.enterprise.QueryResult Feeds;

    public com.sforce.soap.enterprise.QueryResult getFeeds() {
      return Feeds;
    }

    public void setFeeds(com.sforce.soap.enterprise.QueryResult Feeds) {
      this.Feeds = Feeds;
      Feeds__is_set = true;
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
     * element : LastReferencedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private static final com.sforce.ws.bind.TypeInfo LastReferencedDate__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastReferencedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

    private boolean LastReferencedDate__is_set = false;

    private java.util.Calendar LastReferencedDate;

    public java.util.Calendar getLastReferencedDate() {
      return LastReferencedDate;
    }

    public void setLastReferencedDate(java.util.Calendar LastReferencedDate) {
      this.LastReferencedDate = LastReferencedDate;
      LastReferencedDate__is_set = true;
    }

    /**
     * element : LastViewedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private static final com.sforce.ws.bind.TypeInfo LastViewedDate__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastViewedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

    private boolean LastViewedDate__is_set = false;

    private java.util.Calendar LastViewedDate;

    public java.util.Calendar getLastViewedDate() {
      return LastViewedDate;
    }

    public void setLastViewedDate(java.util.Calendar LastViewedDate) {
      this.LastViewedDate = LastViewedDate;
      LastViewedDate__is_set = true;
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
     * element : ViewStats of type {urn:enterprise.soap.sforce.com}QueryResult
     * java type: com.sforce.soap.enterprise.QueryResult
     */
    private static final com.sforce.ws.bind.TypeInfo ViewStats__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ViewStats","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

    private boolean ViewStats__is_set = false;

    private com.sforce.soap.enterprise.QueryResult ViewStats;

    public com.sforce.soap.enterprise.QueryResult getViewStats() {
      return ViewStats;
    }

    public void setViewStats(com.sforce.soap.enterprise.QueryResult ViewStats) {
      this.ViewStats = ViewStats;
      ViewStats__is_set = true;
    }

    /**
     * element : VoteStats of type {urn:enterprise.soap.sforce.com}QueryResult
     * java type: com.sforce.soap.enterprise.QueryResult
     */
    private static final com.sforce.ws.bind.TypeInfo VoteStats__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VoteStats","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

    private boolean VoteStats__is_set = false;

    private com.sforce.soap.enterprise.QueryResult VoteStats;

    public com.sforce.soap.enterprise.QueryResult getVoteStats() {
      return VoteStats;
    }

    public void setVoteStats(com.sforce.soap.enterprise.QueryResult VoteStats) {
      this.VoteStats = VoteStats;
      VoteStats__is_set = true;
    }

    /**
     * element : Votes of type {urn:enterprise.soap.sforce.com}QueryResult
     * java type: com.sforce.soap.enterprise.QueryResult
     */
    private static final com.sforce.ws.bind.TypeInfo Votes__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Votes","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

    private boolean Votes__is_set = false;

    private com.sforce.soap.enterprise.QueryResult Votes;

    public com.sforce.soap.enterprise.QueryResult getVotes() {
      return Votes;
    }

    public void setVotes(com.sforce.soap.enterprise.QueryResult Votes) {
      this.Votes = Votes;
      Votes__is_set = true;
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "FAQ__ka");
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
       __typeMapper.writeObject(__out, CaseArticles__typeInfo, CaseArticles, CaseArticles__is_set);
       __typeMapper.writeObject(__out, CaseAssociationCount__typeInfo, CaseAssociationCount, CaseAssociationCount__is_set);
       __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
       __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
       __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
       __typeMapper.writeObject(__out, FeedSubscriptionsForEntity__typeInfo, FeedSubscriptionsForEntity, FeedSubscriptionsForEntity__is_set);
       __typeMapper.writeObject(__out, Feeds__typeInfo, Feeds, Feeds__is_set);
       __typeMapper.writeObject(__out, FirstPublishedDate__typeInfo, FirstPublishedDate, FirstPublishedDate__is_set);
       __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
       __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
       __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
       __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
       __typeMapper.writeObject(__out, LastPublishedDate__typeInfo, LastPublishedDate, LastPublishedDate__is_set);
       __typeMapper.writeObject(__out, LastReferencedDate__typeInfo, LastReferencedDate, LastReferencedDate__is_set);
       __typeMapper.writeObject(__out, LastViewedDate__typeInfo, LastViewedDate, LastViewedDate__is_set);
       __typeMapper.writeObject(__out, ProcessInstances__typeInfo, ProcessInstances, ProcessInstances__is_set);
       __typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps, ProcessSteps__is_set);
       __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
       __typeMapper.writeObject(__out, ViewStats__typeInfo, ViewStats, ViewStats__is_set);
       __typeMapper.writeObject(__out, VoteStats__typeInfo, VoteStats, VoteStats__is_set);
       __typeMapper.writeObject(__out, Votes__typeInfo, Votes, Votes__is_set);
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
        if (__typeMapper.isElement(__in, CaseArticles__typeInfo)) {
            setCaseArticles((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, CaseArticles__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, CaseAssociationCount__typeInfo)) {
            setCaseAssociationCount((java.lang.Integer)__typeMapper.readObject(__in, CaseAssociationCount__typeInfo, java.lang.Integer.class));
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
        if (__typeMapper.isElement(__in, Feeds__typeInfo)) {
            setFeeds((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Feeds__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
        if (__typeMapper.isElement(__in, LastReferencedDate__typeInfo)) {
            setLastReferencedDate((java.util.Calendar)__typeMapper.readObject(__in, LastReferencedDate__typeInfo, java.util.Calendar.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, LastViewedDate__typeInfo)) {
            setLastViewedDate((java.util.Calendar)__typeMapper.readObject(__in, LastViewedDate__typeInfo, java.util.Calendar.class));
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
        if (__typeMapper.isElement(__in, ViewStats__typeInfo)) {
            setViewStats((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ViewStats__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, VoteStats__typeInfo)) {
            setVoteStats((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, VoteStats__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, Votes__typeInfo)) {
            setVotes((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Votes__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
        }
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[FAQ__ka ");
      sb.append(super.toString());sb.append(" ArchivedById=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ArchivedById)+"'\n");
      sb.append(" ArchivedDate=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ArchivedDate)+"'\n");
      sb.append(" ArticleNumber=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ArticleNumber)+"'\n");
      sb.append(" CaseArticles=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CaseArticles)+"'\n");
      sb.append(" CaseAssociationCount=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CaseAssociationCount)+"'\n");
      sb.append(" CreatedBy=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
      sb.append(" CreatedById=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
      sb.append(" CreatedDate=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
      sb.append(" FeedSubscriptionsForEntity=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedSubscriptionsForEntity)+"'\n");
      sb.append(" Feeds=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(Feeds)+"'\n");
      sb.append(" FirstPublishedDate=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(FirstPublishedDate)+"'\n");
      sb.append(" IsDeleted=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
      sb.append(" LastModifiedBy=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
      sb.append(" LastModifiedById=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
      sb.append(" LastModifiedDate=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
      sb.append(" LastPublishedDate=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(LastPublishedDate)+"'\n");
      sb.append(" LastReferencedDate=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(LastReferencedDate)+"'\n");
      sb.append(" LastViewedDate=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(LastViewedDate)+"'\n");
      sb.append(" ProcessInstances=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstances)+"'\n");
      sb.append(" ProcessSteps=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessSteps)+"'\n");
      sb.append(" SystemModstamp=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
      sb.append(" ViewStats=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ViewStats)+"'\n");
      sb.append(" VoteStats=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(VoteStats)+"'\n");
      sb.append(" Votes=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(Votes)+"'\n");
      sb.append("]\n");
      return sb.toString();
    }
}
