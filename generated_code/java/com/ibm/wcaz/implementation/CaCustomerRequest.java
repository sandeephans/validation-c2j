package com.ibm.wcaz.implementation;

import com.ibm.jzos.fields.ByteArrayField;
import com.ibm.jzos.fields.CobolDatatypeFactory;
import com.ibm.jzos.fields.ExternalDecimalAsIntField;
import com.ibm.jzos.fields.StringField;
import com.ibm.wcaz.datamodel.Genasa1Customer;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CaCustomerRequest extends Dfhcommarea1 {
    private int caNumPolicies;
    private String caPolicyData = "";
    private Genasa1Customer genasa1Customer = new Genasa1Customer();
    
    public CaCustomerRequest() {}
    
    public CaCustomerRequest(String caRequestId, int caReturnCode, long caCustomerNum, int caNumPolicies, String caPolicyData, Genasa1Customer genasa1Customer) {
        super(caRequestId, caReturnCode, caCustomerNum);
        this.caNumPolicies = caNumPolicies;
        this.caPolicyData = caPolicyData;
        this.genasa1Customer = genasa1Customer;
    }
    
    public CaCustomerRequest(CaCustomerRequest that) {
        super(that);
        this.caNumPolicies = that.caNumPolicies;
        this.caPolicyData = that.caPolicyData;
        this.genasa1Customer = new Genasa1Customer(that.genasa1Customer);
    }
    
    protected CaCustomerRequest(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected CaCustomerRequest(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static CaCustomerRequest fromBytes(byte[] bytes, int offset) {
        return new CaCustomerRequest(bytes, offset);
    }
    
    public static CaCustomerRequest fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static CaCustomerRequest fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public int getCaNumPolicies() {
        return this.caNumPolicies;
    }
    
    public void setCaNumPolicies(int caNumPolicies) {
        this.caNumPolicies = caNumPolicies;
    }
    
    public String getCaPolicyData() {
        return this.caPolicyData;
    }
    
    public void setCaPolicyData(String caPolicyData) {
        this.caPolicyData = caPolicyData;
    }
    
    public Genasa1Customer getGenasa1Customer() {
        return this.genasa1Customer;
    }
    
    public void setGenasa1Customer(Genasa1Customer genasa1Customer) {
        this.genasa1Customer = genasa1Customer;
    }
    public void reset() {
        super.reset();
        caNumPolicies = 0;
        caPolicyData = "";
        genasa1Customer.reset();
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder(super.toString());
        s.append("{ caNumPolicies=\"");
        s.append(getCaNumPolicies());
        s.append("\"");
        s.append(", caPolicyData=\"");
        s.append(getCaPolicyData());
        s.append("\"");
        s.append(", genasa1Customer=\"");
        s.append(getGenasa1Customer());
        s.append("\"");
        s.append("}");
        return s.toString();
    }
    
    public boolean equals(CaCustomerRequest that) {
        return super.equals(that) &&
            this.caNumPolicies == that.caNumPolicies &&
            this.caPolicyData.equals(that.caPolicyData) &&
            this.genasa1Customer.equals(that.genasa1Customer);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof CaCustomerRequest) && this.equals((CaCustomerRequest)that);
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^
            Integer.rotateLeft(Integer.hashCode(caNumPolicies), 3) ^
            Integer.rotateLeft(caPolicyData.hashCode(), 4) ^
            Integer.rotateLeft(genasa1Customer.hashCode(), 5);
    }
    
    public int compareTo(CaCustomerRequest that) {
        int c = 0;
        c = super.compareTo(that);
        if ( c != 0 ) return c;
        c = Integer.compare(this.caNumPolicies, that.caNumPolicies);
        if ( c != 0 ) return c;
        c = this.caPolicyData.compareTo(that.caPolicyData);
        if ( c != 0 ) return c;
        c = this.genasa1Customer.compareTo(that.genasa1Customer);
        return c;
    }
    
    @Override
    public int compareTo(Dfhcommarea1 that) {
        if (that instanceof CaCustomerRequest) {
            return this.compareTo((CaCustomerRequest)that);
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
    
    private static final ExternalDecimalAsIntField CA_NUM_POLICIES = factory.getExternalDecimalAsIntField(3, true);
    private static final StringField CA_POLICY_DATA = factory.getStringField(32267);
    private static final ByteArrayField GENASA_1_CUSTOMER = factory.getByteArrayField(Genasa1Customer.SIZE);
    public static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    public byte[] getBytes(byte[] bytes, int offset) {
        super.getBytes(bytes, offset);
        CA_NUM_POLICIES.putInt(caNumPolicies, bytes, offset);
        CA_POLICY_DATA.putString(caPolicyData, bytes, offset);
        genasa1Customer.getBytes(bytes, GENASA_1_CUSTOMER.getOffset() + offset);
        return bytes;
    }
    
    public void setBytes(byte[] bytes, int offset) {
        if (bytes.length < SIZE + offset) {
            byte[] newBytes = Arrays.copyOf(bytes, SIZE + offset);
            Arrays.fill(newBytes, bytes.length, SIZE + offset, (byte)0x40 /*default EBCDIC space character*/);
            bytes = newBytes;
        }
        super.setBytes(bytes, offset);
        caNumPolicies = CA_NUM_POLICIES.getInt(bytes, offset);
        caPolicyData = CA_POLICY_DATA.getString(bytes, offset);
        genasa1Customer.setBytes(bytes, GENASA_1_CUSTOMER.getOffset() + offset);
    }
    
    public int numBytes() {
        return SIZE;
    }
    
}
