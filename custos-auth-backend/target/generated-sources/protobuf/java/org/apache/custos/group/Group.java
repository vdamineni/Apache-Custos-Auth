// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: group.proto

package org.apache.custos.group;

/**
 * Protobuf type {@code org.apache.custos.group.Group}
 */
public final class Group extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.apache.custos.group.Group)
    GroupOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Group.newBuilder() to construct.
  private Group(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Group() {
    groupId_ = "";
    name_ = "";
    description_ = "";
    scopes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    userIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Group();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.custos.group.GroupOuterClass.internal_static_org_apache_custos_group_Group_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.custos.group.GroupOuterClass.internal_static_org_apache_custos_group_Group_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.custos.group.Group.class, org.apache.custos.group.Group.Builder.class);
  }

  public static final int GROUP_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object groupId_ = "";
  /**
   * <code>string group_id = 1;</code>
   * @return The groupId.
   */
  @java.lang.Override
  public java.lang.String getGroupId() {
    java.lang.Object ref = groupId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      groupId_ = s;
      return s;
    }
  }
  /**
   * <code>string group_id = 1;</code>
   * @return The bytes for groupId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGroupIdBytes() {
    java.lang.Object ref = groupId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      groupId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   * <code>string description = 3;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCOPES_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList scopes_;
  /**
   * <code>repeated string scopes = 4;</code>
   * @return A list containing the scopes.
   */
  public com.google.protobuf.ProtocolStringList
      getScopesList() {
    return scopes_;
  }
  /**
   * <code>repeated string scopes = 4;</code>
   * @return The count of scopes.
   */
  public int getScopesCount() {
    return scopes_.size();
  }
  /**
   * <code>repeated string scopes = 4;</code>
   * @param index The index of the element to return.
   * @return The scopes at the given index.
   */
  public java.lang.String getScopes(int index) {
    return scopes_.get(index);
  }
  /**
   * <code>repeated string scopes = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the scopes at the given index.
   */
  public com.google.protobuf.ByteString
      getScopesBytes(int index) {
    return scopes_.getByteString(index);
  }

  public static final int USER_IDS_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList userIds_;
  /**
   * <code>repeated string user_ids = 5;</code>
   * @return A list containing the userIds.
   */
  public com.google.protobuf.ProtocolStringList
      getUserIdsList() {
    return userIds_;
  }
  /**
   * <code>repeated string user_ids = 5;</code>
   * @return The count of userIds.
   */
  public int getUserIdsCount() {
    return userIds_.size();
  }
  /**
   * <code>repeated string user_ids = 5;</code>
   * @param index The index of the element to return.
   * @return The userIds at the given index.
   */
  public java.lang.String getUserIds(int index) {
    return userIds_.get(index);
  }
  /**
   * <code>repeated string user_ids = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the userIds at the given index.
   */
  public com.google.protobuf.ByteString
      getUserIdsBytes(int index) {
    return userIds_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(groupId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, description_);
    }
    for (int i = 0; i < scopes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, scopes_.getRaw(i));
    }
    for (int i = 0; i < userIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, userIds_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(groupId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, description_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < scopes_.size(); i++) {
        dataSize += computeStringSizeNoTag(scopes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getScopesList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < userIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(userIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getUserIdsList().size();
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.apache.custos.group.Group)) {
      return super.equals(obj);
    }
    org.apache.custos.group.Group other = (org.apache.custos.group.Group) obj;

    if (!getGroupId()
        .equals(other.getGroupId())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (!getScopesList()
        .equals(other.getScopesList())) return false;
    if (!getUserIdsList()
        .equals(other.getUserIdsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getGroupId().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    if (getScopesCount() > 0) {
      hash = (37 * hash) + SCOPES_FIELD_NUMBER;
      hash = (53 * hash) + getScopesList().hashCode();
    }
    if (getUserIdsCount() > 0) {
      hash = (37 * hash) + USER_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getUserIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.custos.group.Group parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.custos.group.Group parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.custos.group.Group parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.custos.group.Group parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.custos.group.Group parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.custos.group.Group parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.custos.group.Group parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.custos.group.Group parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.custos.group.Group parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.custos.group.Group parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.custos.group.Group parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.custos.group.Group parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.apache.custos.group.Group prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.apache.custos.group.Group}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.apache.custos.group.Group)
      org.apache.custos.group.GroupOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.custos.group.GroupOuterClass.internal_static_org_apache_custos_group_Group_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.custos.group.GroupOuterClass.internal_static_org_apache_custos_group_Group_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.custos.group.Group.class, org.apache.custos.group.Group.Builder.class);
    }

    // Construct using org.apache.custos.group.Group.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      groupId_ = "";
      name_ = "";
      description_ = "";
      scopes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      userIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.custos.group.GroupOuterClass.internal_static_org_apache_custos_group_Group_descriptor;
    }

    @java.lang.Override
    public org.apache.custos.group.Group getDefaultInstanceForType() {
      return org.apache.custos.group.Group.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.custos.group.Group build() {
      org.apache.custos.group.Group result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.custos.group.Group buildPartial() {
      org.apache.custos.group.Group result = new org.apache.custos.group.Group(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.apache.custos.group.Group result) {
      if (((bitField0_ & 0x00000008) != 0)) {
        scopes_ = scopes_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.scopes_ = scopes_;
      if (((bitField0_ & 0x00000010) != 0)) {
        userIds_ = userIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000010);
      }
      result.userIds_ = userIds_;
    }

    private void buildPartial0(org.apache.custos.group.Group result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.groupId_ = groupId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.description_ = description_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.apache.custos.group.Group) {
        return mergeFrom((org.apache.custos.group.Group)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.custos.group.Group other) {
      if (other == org.apache.custos.group.Group.getDefaultInstance()) return this;
      if (!other.getGroupId().isEmpty()) {
        groupId_ = other.groupId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.scopes_.isEmpty()) {
        if (scopes_.isEmpty()) {
          scopes_ = other.scopes_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureScopesIsMutable();
          scopes_.addAll(other.scopes_);
        }
        onChanged();
      }
      if (!other.userIds_.isEmpty()) {
        if (userIds_.isEmpty()) {
          userIds_ = other.userIds_;
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          ensureUserIdsIsMutable();
          userIds_.addAll(other.userIds_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              groupId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              description_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureScopesIsMutable();
              scopes_.add(s);
              break;
            } // case 34
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureUserIdsIsMutable();
              userIds_.add(s);
              break;
            } // case 42
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object groupId_ = "";
    /**
     * <code>string group_id = 1;</code>
     * @return The groupId.
     */
    public java.lang.String getGroupId() {
      java.lang.Object ref = groupId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        groupId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string group_id = 1;</code>
     * @return The bytes for groupId.
     */
    public com.google.protobuf.ByteString
        getGroupIdBytes() {
      java.lang.Object ref = groupId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        groupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string group_id = 1;</code>
     * @param value The groupId to set.
     * @return This builder for chaining.
     */
    public Builder setGroupId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      groupId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string group_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGroupId() {
      groupId_ = getDefaultInstance().getGroupId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string group_id = 1;</code>
     * @param value The bytes for groupId to set.
     * @return This builder for chaining.
     */
    public Builder setGroupIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      groupId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 3;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 3;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 3;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string description = 3;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList scopes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureScopesIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        scopes_ = new com.google.protobuf.LazyStringArrayList(scopes_);
        bitField0_ |= 0x00000008;
       }
    }
    /**
     * <code>repeated string scopes = 4;</code>
     * @return A list containing the scopes.
     */
    public com.google.protobuf.ProtocolStringList
        getScopesList() {
      return scopes_.getUnmodifiableView();
    }
    /**
     * <code>repeated string scopes = 4;</code>
     * @return The count of scopes.
     */
    public int getScopesCount() {
      return scopes_.size();
    }
    /**
     * <code>repeated string scopes = 4;</code>
     * @param index The index of the element to return.
     * @return The scopes at the given index.
     */
    public java.lang.String getScopes(int index) {
      return scopes_.get(index);
    }
    /**
     * <code>repeated string scopes = 4;</code>
     * @param index The index of the value to return.
     * @return The bytes of the scopes at the given index.
     */
    public com.google.protobuf.ByteString
        getScopesBytes(int index) {
      return scopes_.getByteString(index);
    }
    /**
     * <code>repeated string scopes = 4;</code>
     * @param index The index to set the value at.
     * @param value The scopes to set.
     * @return This builder for chaining.
     */
    public Builder setScopes(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureScopesIsMutable();
      scopes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string scopes = 4;</code>
     * @param value The scopes to add.
     * @return This builder for chaining.
     */
    public Builder addScopes(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureScopesIsMutable();
      scopes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string scopes = 4;</code>
     * @param values The scopes to add.
     * @return This builder for chaining.
     */
    public Builder addAllScopes(
        java.lang.Iterable<java.lang.String> values) {
      ensureScopesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, scopes_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string scopes = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearScopes() {
      scopes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string scopes = 4;</code>
     * @param value The bytes of the scopes to add.
     * @return This builder for chaining.
     */
    public Builder addScopesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureScopesIsMutable();
      scopes_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList userIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureUserIdsIsMutable() {
      if (!((bitField0_ & 0x00000010) != 0)) {
        userIds_ = new com.google.protobuf.LazyStringArrayList(userIds_);
        bitField0_ |= 0x00000010;
       }
    }
    /**
     * <code>repeated string user_ids = 5;</code>
     * @return A list containing the userIds.
     */
    public com.google.protobuf.ProtocolStringList
        getUserIdsList() {
      return userIds_.getUnmodifiableView();
    }
    /**
     * <code>repeated string user_ids = 5;</code>
     * @return The count of userIds.
     */
    public int getUserIdsCount() {
      return userIds_.size();
    }
    /**
     * <code>repeated string user_ids = 5;</code>
     * @param index The index of the element to return.
     * @return The userIds at the given index.
     */
    public java.lang.String getUserIds(int index) {
      return userIds_.get(index);
    }
    /**
     * <code>repeated string user_ids = 5;</code>
     * @param index The index of the value to return.
     * @return The bytes of the userIds at the given index.
     */
    public com.google.protobuf.ByteString
        getUserIdsBytes(int index) {
      return userIds_.getByteString(index);
    }
    /**
     * <code>repeated string user_ids = 5;</code>
     * @param index The index to set the value at.
     * @param value The userIds to set.
     * @return This builder for chaining.
     */
    public Builder setUserIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureUserIdsIsMutable();
      userIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string user_ids = 5;</code>
     * @param value The userIds to add.
     * @return This builder for chaining.
     */
    public Builder addUserIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureUserIdsIsMutable();
      userIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string user_ids = 5;</code>
     * @param values The userIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllUserIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureUserIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, userIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string user_ids = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserIds() {
      userIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string user_ids = 5;</code>
     * @param value The bytes of the userIds to add.
     * @return This builder for chaining.
     */
    public Builder addUserIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureUserIdsIsMutable();
      userIds_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.apache.custos.group.Group)
  }

  // @@protoc_insertion_point(class_scope:org.apache.custos.group.Group)
  private static final org.apache.custos.group.Group DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.custos.group.Group();
  }

  public static org.apache.custos.group.Group getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Group>
      PARSER = new com.google.protobuf.AbstractParser<Group>() {
    @java.lang.Override
    public Group parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Group> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Group> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.custos.group.Group getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
