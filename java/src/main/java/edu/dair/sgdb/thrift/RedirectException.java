/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.dair.sgdb.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-10-04")
public class RedirectException extends org.apache.thrift.TException implements org.apache.thrift.TBase<RedirectException, RedirectException._Fields>, java.io.Serializable, Cloneable, Comparable<RedirectException> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RedirectException");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TARGET_FIELD_DESC = new org.apache.thrift.protocol.TField("target", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField RE_FIELD_DESC = new org.apache.thrift.protocol.TField("re", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField BITMAP_FIELD_DESC = new org.apache.thrift.protocol.TField("bitmap", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RedirectExceptionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RedirectExceptionTupleSchemeFactory();

  public int status; // required
  public int target; // optional
  public java.util.List<Movement> re; // optional
  public java.nio.ByteBuffer bitmap; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    TARGET((short)2, "target"),
    RE((short)3, "re"),
    BITMAP((short)4, "bitmap");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STATUS
          return STATUS;
        case 2: // TARGET
          return TARGET;
        case 3: // RE
          return RE;
        case 4: // BITMAP
          return BITMAP;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __STATUS_ISSET_ID = 0;
  private static final int __TARGET_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TARGET,_Fields.RE,_Fields.BITMAP};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TARGET, new org.apache.thrift.meta_data.FieldMetaData("target", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.RE, new org.apache.thrift.meta_data.FieldMetaData("re", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Movement.class))));
    tmpMap.put(_Fields.BITMAP, new org.apache.thrift.meta_data.FieldMetaData("bitmap", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RedirectException.class, metaDataMap);
  }

  public RedirectException() {
  }

  public RedirectException(
    int status)
  {
    this();
    this.status = status;
    setStatusIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RedirectException(RedirectException other) {
    __isset_bitfield = other.__isset_bitfield;
    this.status = other.status;
    this.target = other.target;
    if (other.isSetRe()) {
      java.util.List<Movement> __this__re = new java.util.ArrayList<Movement>(other.re.size());
      for (Movement other_element : other.re) {
        __this__re.add(new Movement(other_element));
      }
      this.re = __this__re;
    }
    if (other.isSetBitmap()) {
      this.bitmap = org.apache.thrift.TBaseHelper.copyBinary(other.bitmap);
    }
  }

  public RedirectException deepCopy() {
    return new RedirectException(this);
  }

  @Override
  public void clear() {
    setStatusIsSet(false);
    this.status = 0;
    setTargetIsSet(false);
    this.target = 0;
    this.re = null;
    this.bitmap = null;
  }

  public int getStatus() {
    return this.status;
  }

  public RedirectException setStatus(int status) {
    this.status = status;
    setStatusIsSet(true);
    return this;
  }

  public void unsetStatus() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STATUS_ISSET_ID);
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STATUS_ISSET_ID);
  }

  public void setStatusIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STATUS_ISSET_ID, value);
  }

  public int getTarget() {
    return this.target;
  }

  public RedirectException setTarget(int target) {
    this.target = target;
    setTargetIsSet(true);
    return this;
  }

  public void unsetTarget() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TARGET_ISSET_ID);
  }

  /** Returns true if field target is set (has been assigned a value) and false otherwise */
  public boolean isSetTarget() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TARGET_ISSET_ID);
  }

  public void setTargetIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TARGET_ISSET_ID, value);
  }

  public int getReSize() {
    return (this.re == null) ? 0 : this.re.size();
  }

  public java.util.Iterator<Movement> getReIterator() {
    return (this.re == null) ? null : this.re.iterator();
  }

  public void addToRe(Movement elem) {
    if (this.re == null) {
      this.re = new java.util.ArrayList<Movement>();
    }
    this.re.add(elem);
  }

  public java.util.List<Movement> getRe() {
    return this.re;
  }

  public RedirectException setRe(java.util.List<Movement> re) {
    this.re = re;
    return this;
  }

  public void unsetRe() {
    this.re = null;
  }

  /** Returns true if field re is set (has been assigned a value) and false otherwise */
  public boolean isSetRe() {
    return this.re != null;
  }

  public void setReIsSet(boolean value) {
    if (!value) {
      this.re = null;
    }
  }

  public byte[] getBitmap() {
    setBitmap(org.apache.thrift.TBaseHelper.rightSize(bitmap));
    return bitmap == null ? null : bitmap.array();
  }

  public java.nio.ByteBuffer bufferForBitmap() {
    return org.apache.thrift.TBaseHelper.copyBinary(bitmap);
  }

  public RedirectException setBitmap(byte[] bitmap) {
    this.bitmap = bitmap == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(bitmap.clone());
    return this;
  }

  public RedirectException setBitmap(java.nio.ByteBuffer bitmap) {
    this.bitmap = org.apache.thrift.TBaseHelper.copyBinary(bitmap);
    return this;
  }

  public void unsetBitmap() {
    this.bitmap = null;
  }

  /** Returns true if field bitmap is set (has been assigned a value) and false otherwise */
  public boolean isSetBitmap() {
    return this.bitmap != null;
  }

  public void setBitmapIsSet(boolean value) {
    if (!value) {
      this.bitmap = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((java.lang.Integer)value);
      }
      break;

    case TARGET:
      if (value == null) {
        unsetTarget();
      } else {
        setTarget((java.lang.Integer)value);
      }
      break;

    case RE:
      if (value == null) {
        unsetRe();
      } else {
        setRe((java.util.List<Movement>)value);
      }
      break;

    case BITMAP:
      if (value == null) {
        unsetBitmap();
      } else {
        if (value instanceof byte[]) {
          setBitmap((byte[])value);
        } else {
          setBitmap((java.nio.ByteBuffer)value);
        }
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case TARGET:
      return getTarget();

    case RE:
      return getRe();

    case BITMAP:
      return getBitmap();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case TARGET:
      return isSetTarget();
    case RE:
      return isSetRe();
    case BITMAP:
      return isSetBitmap();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof RedirectException)
      return this.equals((RedirectException)that);
    return false;
  }

  public boolean equals(RedirectException that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_status = true;
    boolean that_present_status = true;
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (this.status != that.status)
        return false;
    }

    boolean this_present_target = true && this.isSetTarget();
    boolean that_present_target = true && that.isSetTarget();
    if (this_present_target || that_present_target) {
      if (!(this_present_target && that_present_target))
        return false;
      if (this.target != that.target)
        return false;
    }

    boolean this_present_re = true && this.isSetRe();
    boolean that_present_re = true && that.isSetRe();
    if (this_present_re || that_present_re) {
      if (!(this_present_re && that_present_re))
        return false;
      if (!this.re.equals(that.re))
        return false;
    }

    boolean this_present_bitmap = true && this.isSetBitmap();
    boolean that_present_bitmap = true && that.isSetBitmap();
    if (this_present_bitmap || that_present_bitmap) {
      if (!(this_present_bitmap && that_present_bitmap))
        return false;
      if (!this.bitmap.equals(that.bitmap))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + status;

    hashCode = hashCode * 8191 + ((isSetTarget()) ? 131071 : 524287);
    if (isSetTarget())
      hashCode = hashCode * 8191 + target;

    hashCode = hashCode * 8191 + ((isSetRe()) ? 131071 : 524287);
    if (isSetRe())
      hashCode = hashCode * 8191 + re.hashCode();

    hashCode = hashCode * 8191 + ((isSetBitmap()) ? 131071 : 524287);
    if (isSetBitmap())
      hashCode = hashCode * 8191 + bitmap.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(RedirectException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTarget()).compareTo(other.isSetTarget());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTarget()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.target, other.target);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRe()).compareTo(other.isSetRe());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRe()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.re, other.re);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetBitmap()).compareTo(other.isSetBitmap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBitmap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bitmap, other.bitmap);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("RedirectException(");
    boolean first = true;

    sb.append("status:");
    sb.append(this.status);
    first = false;
    if (isSetTarget()) {
      if (!first) sb.append(", ");
      sb.append("target:");
      sb.append(this.target);
      first = false;
    }
    if (isSetRe()) {
      if (!first) sb.append(", ");
      sb.append("re:");
      if (this.re == null) {
        sb.append("null");
      } else {
        sb.append(this.re);
      }
      first = false;
    }
    if (isSetBitmap()) {
      if (!first) sb.append(", ");
      sb.append("bitmap:");
      if (this.bitmap == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.bitmap, sb);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'status' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RedirectExceptionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RedirectExceptionStandardScheme getScheme() {
      return new RedirectExceptionStandardScheme();
    }
  }

  private static class RedirectExceptionStandardScheme extends org.apache.thrift.scheme.StandardScheme<RedirectException> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RedirectException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = iprot.readI32();
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TARGET
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.target = iprot.readI32();
              struct.setTargetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RE
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.re = new java.util.ArrayList<Movement>(_list8.size);
                Movement _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = new Movement();
                  _elem9.read(iprot);
                  struct.re.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setReIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // BITMAP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.bitmap = iprot.readBinary();
              struct.setBitmapIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetStatus()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'status' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RedirectException struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(STATUS_FIELD_DESC);
      oprot.writeI32(struct.status);
      oprot.writeFieldEnd();
      if (struct.isSetTarget()) {
        oprot.writeFieldBegin(TARGET_FIELD_DESC);
        oprot.writeI32(struct.target);
        oprot.writeFieldEnd();
      }
      if (struct.re != null) {
        if (struct.isSetRe()) {
          oprot.writeFieldBegin(RE_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.re.size()));
            for (Movement _iter11 : struct.re)
            {
              _iter11.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.bitmap != null) {
        if (struct.isSetBitmap()) {
          oprot.writeFieldBegin(BITMAP_FIELD_DESC);
          oprot.writeBinary(struct.bitmap);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RedirectExceptionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RedirectExceptionTupleScheme getScheme() {
      return new RedirectExceptionTupleScheme();
    }
  }

  private static class RedirectExceptionTupleScheme extends org.apache.thrift.scheme.TupleScheme<RedirectException> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RedirectException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.status);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTarget()) {
        optionals.set(0);
      }
      if (struct.isSetRe()) {
        optionals.set(1);
      }
      if (struct.isSetBitmap()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTarget()) {
        oprot.writeI32(struct.target);
      }
      if (struct.isSetRe()) {
        {
          oprot.writeI32(struct.re.size());
          for (Movement _iter12 : struct.re)
          {
            _iter12.write(oprot);
          }
        }
      }
      if (struct.isSetBitmap()) {
        oprot.writeBinary(struct.bitmap);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RedirectException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.status = iprot.readI32();
      struct.setStatusIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.target = iprot.readI32();
        struct.setTargetIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.re = new java.util.ArrayList<Movement>(_list13.size);
          Movement _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = new Movement();
            _elem14.read(iprot);
            struct.re.add(_elem14);
          }
        }
        struct.setReIsSet(true);
      }
      if (incoming.get(2)) {
        struct.bitmap = iprot.readBinary();
        struct.setBitmapIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
