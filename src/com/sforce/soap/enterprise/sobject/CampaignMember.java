package com.sforce.soap.enterprise.sobject;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class CampaignMember extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public CampaignMember() {}

    /**
     * element : Campaign of type {urn:sobject.enterprise.soap.sforce.com}Campaign
     * java type: com.sforce.soap.enterprise.sobject.Campaign
     */
    private static final com.sforce.ws.bind.TypeInfo Campaign__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Campaign","urn:sobject.enterprise.soap.sforce.com","Campaign",0,1,true);

    private boolean Campaign__is_set = false;

    private com.sforce.soap.enterprise.sobject.Campaign Campaign;

    public com.sforce.soap.enterprise.sobject.Campaign getCampaign() {
      return Campaign;
    }

    public void setCampaign(com.sforce.soap.enterprise.sobject.Campaign Campaign) {
      this.Campaign = Campaign;
      Campaign__is_set = true;
    }

    /**
     * element : CampaignId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo CampaignId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CampaignId","urn:enterprise.soap.sforce.com","ID",0,1,true);

    private boolean CampaignId__is_set = false;

    private java.lang.String CampaignId;

    public java.lang.String getCampaignId() {
      return CampaignId;
    }

    public void setCampaignId(java.lang.String CampaignId) {
      this.CampaignId = CampaignId;
      CampaignId__is_set = true;
    }

    /**
     * element : Contact of type {urn:sobject.enterprise.soap.sforce.com}Contact
     * java type: com.sforce.soap.enterprise.sobject.Contact
     */
    private static final com.sforce.ws.bind.TypeInfo Contact__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Contact","urn:sobject.enterprise.soap.sforce.com","Contact",0,1,true);

    private boolean Contact__is_set = false;

    private com.sforce.soap.enterprise.sobject.Contact Contact;

    public com.sforce.soap.enterprise.sobject.Contact getContact() {
      return Contact;
    }

    public void setContact(com.sforce.soap.enterprise.sobject.Contact Contact) {
      this.Contact = Contact;
      Contact__is_set = true;
    }

    /**
     * element : ContactId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo ContactId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContactId","urn:enterprise.soap.sforce.com","ID",0,1,true);

    private boolean ContactId__is_set = false;

    private java.lang.String ContactId;

    public java.lang.String getContactId() {
      return ContactId;
    }

    public void setContactId(java.lang.String ContactId) {
      this.ContactId = ContactId;
      ContactId__is_set = true;
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
     * element : FirstRespondedDate of type {http://www.w3.org/2001/XMLSchema}date
     * java type: java.util.Calendar
     */
    private static final com.sforce.ws.bind.TypeInfo FirstRespondedDate__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FirstRespondedDate","http://www.w3.org/2001/XMLSchema","date",0,1,true);

    private boolean FirstRespondedDate__is_set = false;

    private java.util.Calendar FirstRespondedDate;

    public java.util.Calendar getFirstRespondedDate() {
      return FirstRespondedDate;
    }

    public void setFirstRespondedDate(java.util.Calendar FirstRespondedDate) {
      this.FirstRespondedDate = FirstRespondedDate;
      FirstRespondedDate__is_set = true;
    }

    /**
     * element : HasResponded of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private static final com.sforce.ws.bind.TypeInfo HasResponded__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","HasResponded","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean HasResponded__is_set = false;

    private java.lang.Boolean HasResponded;

    public java.lang.Boolean getHasResponded() {
      return HasResponded;
    }

    public void setHasResponded(java.lang.Boolean HasResponded) {
      this.HasResponded = HasResponded;
      HasResponded__is_set = true;
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
     * element : Lead of type {urn:sobject.enterprise.soap.sforce.com}Lead
     * java type: com.sforce.soap.enterprise.sobject.Lead
     */
    private static final com.sforce.ws.bind.TypeInfo Lead__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Lead","urn:sobject.enterprise.soap.sforce.com","Lead",0,1,true);

    private boolean Lead__is_set = false;

    private com.sforce.soap.enterprise.sobject.Lead Lead;

    public com.sforce.soap.enterprise.sobject.Lead getLead() {
      return Lead;
    }

    public void setLead(com.sforce.soap.enterprise.sobject.Lead Lead) {
      this.Lead = Lead;
      Lead__is_set = true;
    }

    /**
     * element : LeadId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo LeadId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LeadId","urn:enterprise.soap.sforce.com","ID",0,1,true);

    private boolean LeadId__is_set = false;

    private java.lang.String LeadId;

    public java.lang.String getLeadId() {
      return LeadId;
    }

    public void setLeadId(java.lang.String LeadId) {
      this.LeadId = LeadId;
      LeadId__is_set = true;
    }

    /**
     * element : Status of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo Status__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Status","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean Status__is_set = false;

    private java.lang.String Status;

    public java.lang.String getStatus() {
      return Status;
    }

    public void setStatus(java.lang.String Status) {
      this.Status = Status;
      Status__is_set = true;
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
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "CampaignMember");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeObject(__out, Campaign__typeInfo, Campaign, Campaign__is_set);
       __typeMapper.writeString(__out, CampaignId__typeInfo, CampaignId, CampaignId__is_set);
       __typeMapper.writeObject(__out, Contact__typeInfo, Contact, Contact__is_set);
       __typeMapper.writeString(__out, ContactId__typeInfo, ContactId, ContactId__is_set);
       __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
       __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
       __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
       __typeMapper.writeObject(__out, FirstRespondedDate__typeInfo, FirstRespondedDate, FirstRespondedDate__is_set);
       __typeMapper.writeObject(__out, HasResponded__typeInfo, HasResponded, HasResponded__is_set);
       __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
       __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
       __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
       __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
       __typeMapper.writeObject(__out, Lead__typeInfo, Lead, Lead__is_set);
       __typeMapper.writeString(__out, LeadId__typeInfo, LeadId, LeadId__is_set);
       __typeMapper.writeString(__out, Status__typeInfo, Status, Status__is_set);
       __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
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
        if (__typeMapper.isElement(__in, Campaign__typeInfo)) {
            setCampaign((com.sforce.soap.enterprise.sobject.Campaign)__typeMapper.readObject(__in, Campaign__typeInfo, com.sforce.soap.enterprise.sobject.Campaign.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, CampaignId__typeInfo)) {
            setCampaignId(__typeMapper.readString(__in, CampaignId__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, Contact__typeInfo)) {
            setContact((com.sforce.soap.enterprise.sobject.Contact)__typeMapper.readObject(__in, Contact__typeInfo, com.sforce.soap.enterprise.sobject.Contact.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, ContactId__typeInfo)) {
            setContactId(__typeMapper.readString(__in, ContactId__typeInfo, java.lang.String.class));
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
        if (__typeMapper.isElement(__in, FirstRespondedDate__typeInfo)) {
            setFirstRespondedDate((java.util.Calendar)__typeMapper.readObject(__in, FirstRespondedDate__typeInfo, java.util.Calendar.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, HasResponded__typeInfo)) {
            setHasResponded((java.lang.Boolean)__typeMapper.readObject(__in, HasResponded__typeInfo, java.lang.Boolean.class));
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
        if (__typeMapper.isElement(__in, Lead__typeInfo)) {
            setLead((com.sforce.soap.enterprise.sobject.Lead)__typeMapper.readObject(__in, Lead__typeInfo, com.sforce.soap.enterprise.sobject.Lead.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, LeadId__typeInfo)) {
            setLeadId(__typeMapper.readString(__in, LeadId__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, Status__typeInfo)) {
            setStatus(__typeMapper.readString(__in, Status__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
            setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
        }
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[CampaignMember ");
      sb.append(super.toString());sb.append(" Campaign=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(Campaign)+"'\n");
      sb.append(" CampaignId=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CampaignId)+"'\n");
      sb.append(" Contact=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(Contact)+"'\n");
      sb.append(" ContactId=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ContactId)+"'\n");
      sb.append(" CreatedBy=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
      sb.append(" CreatedById=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
      sb.append(" CreatedDate=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
      sb.append(" FirstRespondedDate=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(FirstRespondedDate)+"'\n");
      sb.append(" HasResponded=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(HasResponded)+"'\n");
      sb.append(" IsDeleted=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
      sb.append(" LastModifiedBy=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
      sb.append(" LastModifiedById=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
      sb.append(" LastModifiedDate=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
      sb.append(" Lead=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(Lead)+"'\n");
      sb.append(" LeadId=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(LeadId)+"'\n");
      sb.append(" Status=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(Status)+"'\n");
      sb.append(" SystemModstamp=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
      sb.append("]\n");
      return sb.toString();
    }
}
