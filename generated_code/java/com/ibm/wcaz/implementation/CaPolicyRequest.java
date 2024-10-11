package com.ibm.wcaz.implementation;

import com.ibm.jzos.fields.ByteArrayField;
import com.ibm.jzos.fields.CobolDatatypeFactory;
import com.ibm.jzos.fields.ExternalDecimalAsLongField;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CaPolicyRequest extends Dfhcommarea1 {
    private long caPolicyNum;
    private CaPolicyCommon caPolicyCommon = new CaPolicyCommon();
    
    public CaPolicyRequest() {}
    
    public CaPolicyRequest(String caRequestId, int caReturnCode, long caCustomerNum, long caPolicyNum, CaPolicyCommon caPolicyCommon) {
        super(caRequestId, caReturnCode, caCustomerNum);
        this.caPolicyNum = caPolicyNum;
        this.caPolicyCommon = caPolicyCommon;
    }
    
    public CaPolicyRequest(CaPolicyRequest that) {
        super(that);
        this.caPolicyNum = that.caPolicyNum;
        this.caPolicyCommon = new CaPolicyCommon(that.caPolicyCommon);
    }
    
    protected CaPolicyRequest(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected CaPolicyRequest(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static CaPolicyRequest fromBytes(byte[] bytes, int offset) {
        return new CaPolicyRequest(bytes, offset);
    }
    
    public static CaPolicyRequest fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static CaPolicyRequest fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public long getCaPolicyNum() {
        return this.caPolicyNum;
    }
    
    public void setCaPolicyNum(long caPolicyNum) {
        this.caPolicyNum = caPolicyNum;
    }
    
    public CaPolicyCommon getCaPolicyCommon() {
        return this.caPolicyCommon;
    }
    
    public void setCaPolicyCommon(CaPolicyCommon caPolicyCommon) {
        this.caPolicyCommon = caPolicyCommon;
    }
    public void reset() {
        super.reset();
        caPolicyNum = 0;
        caPolicyCommon.reset();
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder(super.toString());
        s.append("{ caPolicyNum=\"");
        s.append(getCaPolicyNum());
        s.append("\"");
        s.append(", caPolicyCommon=\"");
        s.append(getCaPolicyCommon());
        s.append("\"");
        s.append("}");
        return s.toString();
    }
    
    public boolean equals(CaPolicyRequest that) {
        return super.equals(that) &&
            this.caPolicyNum == that.caPolicyNum &&
            this.caPolicyCommon.equals(that.caPolicyCommon);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof CaPolicyRequest) && this.equals((CaPolicyRequest)that);
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^
            Integer.rotateLeft(Long.hashCode(caPolicyNum), 3) ^
            Integer.rotateLeft(caPolicyCommon.hashCode(), 4);
    }
    
    public int compareTo(CaPolicyRequest that) {
        int c = 0;
        c = super.compareTo(that);
        if ( c != 0 ) return c;
        c = Long.compare(this.caPolicyNum, that.caPolicyNum);
        if ( c != 0 ) return c;
        c = this.caPolicyCommon.compareTo(that.caPolicyCommon);
        return c;
    }
    
    @Override
    public int compareTo(Dfhcommarea1 that) {
        if (that instanceof CaPolicyRequest) {
            return this.compareTo((CaPolicyRequest)that);
        } else {
            int c = super.compareTo(that);
            // for compatibility with equals(), unequal objects shouldn't compare equal
            if ( c == 0 ) {
                return this.getClass().getTypeName().compareTo(that.getClass().getTypeName());
            } else {
                return c;
            }
        }
    }
    
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
        factory.incrementOffset(Dfhcommarea1.SIZE);
    }
    
    private static final ExternalDecimalAsLongField CA_POLICY_NUM = factory.getExternalDecimalAsLongField(10, true);
    private static final ByteArrayField CA_POLICY_COMMON = factory.getByteArrayField(CaPolicyCommon.SIZE);
    public static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    public byte[] getBytes(byte[] bytes, int offset) {
        super.getBytes(bytes, offset);
        CA_POLICY_NUM.putLong(caPolicyNum, bytes, offset);
        caPolicyCommon.getBytes(bytes, CA_POLICY_COMMON.getOffset() + offset);
        return bytes;
    }
    
    public void setBytes(byte[] bytes, int offset) {
        if (bytes.length < SIZE + offset) {
            byte[] newBytes = Arrays.copyOf(bytes, SIZE + offset);
            Arrays.fill(newBytes, bytes.length, SIZE + offset, (byte)0x40 /*default EBCDIC space character*/);
            bytes = newBytes;
        }
        super.setBytes(bytes, offset);
        caPolicyNum = CA_POLICY_NUM.getLong(bytes, offset);
        caPolicyCommon.setBytes(bytes, CA_POLICY_COMMON.getOffset() + offset);
    }
    
    public int numBytes() {
        return SIZE;
    }
    
}
