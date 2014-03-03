package com.sforce.soap.enterprise.sobject;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class ProcessInstanceWorkitem extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public ProcessInstanceWorkitem() {}

    /**
     * element : Actor of type {urn:sobject.enterprise.soap.sforce.com}Name
     * java type: com.sforce.soap.enterprise.sobject.Name
     */
    private static final com.sforce.ws.bind.TypeInfo Actor__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Actor","urn:sobject.enterprise.soap.sforce.com","Name",0,1,true);

    private boolean Actor__is_set = false;

    private com.sforce.soap.enterprise.sobject.Name Actor;

    public com.sforce.soap.enterprise.sobject.Name getActor() {
      return Actor;
    }

    public void setActor(com.sforce.soap.enterprise.sobject.Name Actor) {
      this.Actor = Actor;
      Actor__is_set = true;
    }

    /**
     * element : ActorId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo ActorId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ActorId","urn:enterprise.soap.sforce.com","ID",0,1,true);

    private boolean ActorId__is_set = false;

    private java.lang.String ActorId;

    public java.lang.String getActorId() {
      return ActorId;
    }

    public void setActorId(java.lang.String ActorId) {
      this.ActorId = ActorId;
      ActorId__is_set = true;
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
     * element : OriginalActor of type {urn:sobject.enterprise.soap.sforce.com}Name
     * java type: com.sforce.soap.enterprise.sobject.Name
     */
    private static final com.sforce.ws.bind.TypeInfo OriginalActor__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OriginalActor","urn:sobject.enterprise.soap.sforce.com","Name",0,1,true);

    private boolean OriginalActor__is_set = false;

    private com.sforce.soap.enterprise.sobject.Name OriginalActor;

    public com.sforce.soap.enterprise.sobject.Name getOriginalActor() {
      return OriginalActor;
    }

    public void setOriginalActor(com.sforce.soap.enterprise.sobject.Name OriginalActor) {
      this.OriginalActor = OriginalActor;
      OriginalActor__is_set = true;
    }

    /**
     * element : OriginalActorId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo OriginalActorId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OriginalActorId","urn:enterprise.soap.sforce.com","ID",0,1,true);

    private boolean OriginalActorId__is_set = false;

    private java.lang.String OriginalActorId;

    public java.lang.String getOriginalActorId() {
      return OriginalActorId;
    }

    public void setOriginalActorId(java.lang.String OriginalActorId) {
      this.OriginalActorId = OriginalActorId;
      OriginalActorId__is_set = true;
    }

    /**
     * element : ProcessInstance of type {urn:sobject.enterprise.soap.sforce.com}ProcessInstance
     * java type: com.sforce.soap.enterprise.sobject.ProcessInstance
     */
    private static final com.sforce.ws.bind.TypeInfo ProcessInstance__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ProcessInstance","urn:sobject.enterprise.soap.sforce.com","ProcessInstance",0,1,true);

    private boolean ProcessInstance__is_set = false;

    private com.sforce.soap.enterprise.sobject.ProcessInstance ProcessInstance;

    public com.sforce.soap.enterprise.sobject.ProcessInstance getProcessInstance() {
      return ProcessInstance;
    }

    public void setProcessInstance(com.sforce.soap.enterprise.sobject.ProcessInstance ProcessInstance) {
      this.ProcessInstance = ProcessInstance;
      ProcessInstance__is_set = true;
    }

    /**
     * element : ProcessInstanceId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo ProcessInstanceId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ProcessInstanceId","urn:enterprise.soap.sforce.com","ID",0,1,true);

    private boolean ProcessInstanceId__is_set = false;

    private java.lang.String ProcessInstanceId;

    public java.lang.String getProcessInstanceId() {
      return ProcessInstanceId;
    }

    public void setProcessInstanceId(java.lang.String ProcessInstanceId) {
      this.ProcessInstanceId = ProcessInstanceId;
      ProcessInstanceId__is_set = true;
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
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ProcessInstanceWorkitem");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeObject(__out, Actor__typeInfo, Actor, Actor__is_set);
       __typeMapper.writeString(__out, ActorId__typeInfo, ActorId, ActorId__is_set);
       __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
       __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
       __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
       __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
       __typeMapper.writeObject(__out, OriginalActor__typeInfo, OriginalActor, OriginalActor__is_set);
       __typeMapper.writeString(__out, OriginalActorId__typeInfo, OriginalActorId, OriginalActorId__is_set);
       __typeMapper.writeObject(__out, ProcessInstance__typeInfo, ProcessInstance, ProcessInstance__is_set);
       __typeMapper.writeString(__out, ProcessInstanceId__typeInfo, ProcessInstanceId, ProcessInstanceId__is_set);
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
        if (__typeMapper.isElement(__in, Actor__typeInfo)) {
            setActor((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, Actor__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, ActorId__typeInfo)) {
            setActorId(__typeMapper.readString(__in, ActorId__typeInfo, java.lang.String.class));
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
        if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
            setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, OriginalActor__typeInfo)) {
            setOriginalActor((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, OriginalActor__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, OriginalActorId__typeInfo)) {
            setOriginalActorId(__typeMapper.readString(__in, OriginalActorId__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, ProcessInstance__typeInfo)) {
            setProcessInstance((com.sforce.soap.enterprise.sobject.ProcessInstance)__typeMapper.readObject(__in, ProcessInstance__typeInfo, com.sforce.soap.enterprise.sobject.ProcessInstance.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, ProcessInstanceId__typeInfo)) {
            setProcessInstanceId(__typeMapper.readString(__in, ProcessInstanceId__typeInfo, java.lang.String.class));
        }
        __in.peekTag();
        if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
            setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
        }
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[ProcessInstanceWorkitem ");
      sb.append(super.toString());sb.append(" Actor=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(Actor)+"'\n");
      sb.append(" ActorId=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ActorId)+"'\n");
      sb.append(" CreatedBy=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
      sb.append(" CreatedById=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
      sb.append(" CreatedDate=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
      sb.append(" IsDeleted=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
      sb.append(" OriginalActor=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(OriginalActor)+"'\n");
      sb.append(" OriginalActorId=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(OriginalActorId)+"'\n");
      sb.append(" ProcessInstance=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstance)+"'\n");
      sb.append(" ProcessInstanceId=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstanceId)+"'\n");
      sb.append(" SystemModstamp=");
      sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
      sb.append("]\n");
      return sb.toString();
    }
}
