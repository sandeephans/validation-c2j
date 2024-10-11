package com.ibm.wcaz.implementation;

import com.ibm.jzos.fields.CobolDatatypeFactory;
import com.ibm.jzos.fields.ExternalDecimalAsIntField;
import com.ibm.jzos.fields.ExternalDecimalAsLongField;
import com.ibm.jzos.fields.StringField;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CaClaim extends CaPolicyRequest {
    private long caCNum;
    private String caCDate = "";
    private int caCPaid;
    private int caCValue;
    private String caCCause = "";
    private String caCObservations = "";
    private String caCFiller = "";
    
    public CaClaim() {}
    
    public CaClaim(String caRequestId, int caReturnCode, long caCustomerNum, long caPolicyNum, CaPolicyCommon caPolicyCommon, long caCNum, String caCDate, int caCPaid, int caCValue, String caCCause, String caCObservations, String caCFiller) {
        super(caRequestId, caReturnCode, caCustomerNum, caPolicyNum, caPolicyCommon);
        this.caCNum = caCNum;
        this.caCDate = caCDate;
        this.caCPaid = caCPaid;
        this.caCValue = caCValue;
        this.caCCause = caCCause;
        this.caCObservations = caCObservations;
        this.caCFiller = caCFiller;
    }
    
    public CaClaim(CaClaim that) {
        super(that);
        this.caCNum = that.caCNum;
        this.caCDate = that.caCDate;
        this.caCPaid = that.caCPaid;
        this.caCValue = that.caCValue;
        this.caCCause = that.caCCause;
        this.caCObservations = that.caCObservations;
        this.caCFiller = that.caCFiller;
    }
    
    protected CaClaim(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected CaClaim(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static CaClaim fromBytes(byte[] bytes, int offset) {
        return new CaClaim(bytes, offset);
    }
    
    public static CaClaim fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static CaClaim fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public long getCaCNum() {
        return this.caCNum;
    }
    
    public void setCaCNum(long caCNum) {
        this.caCNum = caCNum;
    }
    
    public String getCaCDate() {
        return this.caCDate;
    }
    
    public void setCaCDate(String caCDate) {
        this.caCDate = caCDate;
    }
    
    public int getCaCPaid() {
        return this.caCPaid;
    }
    
    public void setCaCPaid(int caCPaid) {
        this.caCPaid = caCPaid;
    }
    
    public int getCaCValue() {
        return this.caCValue;
    }
    
    public void setCaCValue(int caCValue) {
        this.caCValue = caCValue;
    }
    
    public String getCaCCause() {
        return this.caCCause;
    }
    
    public void setCaCCause(String caCCause) {
        this.caCCause = caCCause;
    }
    
    public String getCaCObservations() {
        return this.caCObservations;
    }
    
    public void setCaCObservations(String caCObservations) {
        this.caCObservations = caCObservations;
    }
    
    public String getCaCFiller() {
        return this.caCFiller;
    }
    
    public void setCaCFiller(String caCFiller) {
        this.caCFiller = caCFiller;
    }
    public void reset() {
        super.reset();
        caCNum = 0;
        caCDate = "";
        caCPaid = 0;
        caCValue = 0;
        caCCause = "";
        caCObservations = "";
        caCFiller = "";
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder(super.toString());
        s.append("{ caCNum=\"");
        s.append(getCaCNum());
        s.append("\"");
        s.append(", caCDate=\"");
        s.append(getCaCDate());
        s.append("\"");
        s.append(", caCPaid=\"");
        s.append(getCaCPaid());
        s.append("\"");
        s.append(", caCValue=\"");
        s.append(getCaCValue());
        s.append("\"");
        s.append(", caCCause=\"");
        s.append(getCaCCause());
        s.append("\"");
        s.append(", caCObservations=\"");
        s.append(getCaCObservations());
        s.append("\"");
        s.append(", caCFiller=\"");
        s.append(getCaCFiller());
        s.append("\"");
        s.append("}");
        return s.toString();
    }
    
    public boolean equals(CaClaim that) {
        return super.equals(that) &&
            this.caCNum == that.caCNum &&
            this.caCDate.equals(that.caCDate) &&
            this.caCPaid == that.caCPaid &&
            this.caCValue == that.caCValue &&
            this.caCCause.equals(that.caCCause) &&
            this.caCObservations.equals(that.caCObservations) &&
            this.caCFiller.equals(that.caCFiller);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof CaClaim) && this.equals((CaClaim)that);
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^
            Integer.rotateLeft(Long.hashCode(caCNum), 5) ^
            Integer.rotateLeft(caCDate.hashCode(), 6) ^
            Integer.rotateLeft(Integer.hashCode(caCPaid), 7) ^
            Integer.rotateLeft(Integer.hashCode(caCValue), 8) ^
            Integer.rotateLeft(caCCause.hashCode(), 9) ^
            Integer.rotateLeft(caCObservations.hashCode(), 10) ^
            Integer.rotateLeft(caCFiller.hashCode(), 11);
    }
    
    public int compareTo(CaClaim that) {
        int c = 0;
        c = super.compareTo(that);
        if ( c != 0 ) return c;
        c = Long.compare(this.caCNum, that.caCNum);
        if ( c != 0 ) return c;
        c = this.caCDate.compareTo(that.caCDate);
        if ( c != 0 ) return c;
        c = Integer.compare(this.caCPaid, that.caCPaid);
        if ( c != 0 ) return c;
        c = Integer.compare(this.caCValue, that.caCValue);
        if ( c != 0 ) return c;
        c = this.caCCause.compareTo(that.caCCause);
        if ( c != 0 ) return c;
        c = this.caCObservations.compareTo(that.caCObservations);
        if ( c != 0 ) return c;
        c = this.caCFiller.compareTo(that.caCFiller);
        return c;
    }
    
    @Override
    public int compareTo(Dfhcommarea1 that) {
        if (that instanceof CaClaim) {
            return this.compareTo((CaClaim)that);
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
        factory.incrementOffset(CaPolicyRequest.SIZE);
    }
    
    private static final ExternalDecimalAsLongField CA_C_NUM = factory.getExternalDecimalAsLongField(10, true);
    private static final StringField CA_C_DATE = factory.getStringField(10);
    private static final ExternalDecimalAsIntField CA_C_PAID = factory.getExternalDecimalAsIntField(8, true);
    private static final ExternalDecimalAsIntField CA_C_VALUE = factory.getExternalDecimalAsIntField(8, true);
    private static final StringField CA_C_CAUSE = factory.getStringField(255);
    private static final StringField CA_C_OBSERVATIONS = factory.getStringField(255);
    private static final StringField CA_C_FILLER = factory.getStringField(31854);
    public static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    public byte[] getBytes(byte[] bytes, int offset) {
        super.getBytes(bytes, offset);
        CA_C_NUM.putLong(caCNum, bytes, offset);
        CA_C_DATE.putString(caCDate, bytes, offset);
        CA_C_PAID.putInt(caCPaid, bytes, offset);
        CA_C_VALUE.putInt(caCValue, bytes, offset);
        CA_C_CAUSE.putString(caCCause, bytes, offset);
        CA_C_OBSERVATIONS.putString(caCObservations, bytes, offset);
        CA_C_FILLER.putString(caCFiller, bytes, offset);
        return bytes;
    }
    
    public void setBytes(byte[] bytes, int offset) {
        if (bytes.length < SIZE + offset) {
            byte[] newBytes = Arrays.copyOf(bytes, SIZE + offset);
            Arrays.fill(newBytes, bytes.length, SIZE + offset, (byte)0x40 /*default EBCDIC space character*/);
            bytes = newBytes;
        }
        super.setBytes(bytes, offset);
        caCNum = CA_C_NUM.getLong(bytes, offset);
        caCDate = CA_C_DATE.getString(bytes, offset);
        caCPaid = CA_C_PAID.getInt(bytes, offset);
        caCValue = CA_C_VALUE.getInt(bytes, offset);
        caCCause = CA_C_CAUSE.getString(bytes, offset);
        caCObservations = CA_C_OBSERVATIONS.getString(bytes, offset);
        caCFiller = CA_C_FILLER.getString(bytes, offset);
    }
    
    public int numBytes() {
        return SIZE;
    }
    
}
