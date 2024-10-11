package com.ibm.wcaz.implementation;

import com.ibm.jzos.fields.CobolDatatypeFactory;
import com.ibm.jzos.fields.ExternalDecimalAsIntField;
import com.ibm.jzos.fields.ExternalDecimalAsLongField;
import com.ibm.jzos.fields.StringField;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CaPolicyCommon implements Comparable<CaPolicyCommon> {
    private String caIssueDate = "";
    private String caExpiryDate = "";
    private String caLastchanged = "";
    private long caBrokerid;
    private String caBrokersref = "";
    private int caPayment;
    
    public CaPolicyCommon() {}
    
    public CaPolicyCommon(String caIssueDate, String caExpiryDate, String caLastchanged, long caBrokerid, String caBrokersref, int caPayment) {
        this.caIssueDate = caIssueDate;
        this.caExpiryDate = caExpiryDate;
        this.caLastchanged = caLastchanged;
        this.caBrokerid = caBrokerid;
        this.caBrokersref = caBrokersref;
        this.caPayment = caPayment;
    }
    
    public CaPolicyCommon(CaPolicyCommon that) {
        this.caIssueDate = that.caIssueDate;
        this.caExpiryDate = that.caExpiryDate;
        this.caLastchanged = that.caLastchanged;
        this.caBrokerid = that.caBrokerid;
        this.caBrokersref = that.caBrokersref;
        this.caPayment = that.caPayment;
    }
    
    protected CaPolicyCommon(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected CaPolicyCommon(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static CaPolicyCommon fromBytes(byte[] bytes, int offset) {
        return new CaPolicyCommon(bytes, offset);
    }
    
    public static CaPolicyCommon fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static CaPolicyCommon fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String getCaIssueDate() {
        return this.caIssueDate;
    }
    
    public void setCaIssueDate(String caIssueDate) {
        this.caIssueDate = caIssueDate;
    }
    
    public String getCaExpiryDate() {
        return this.caExpiryDate;
    }
    
    public void setCaExpiryDate(String caExpiryDate) {
        this.caExpiryDate = caExpiryDate;
    }
    
    public String getCaLastchanged() {
        return this.caLastchanged;
    }
    
    public void setCaLastchanged(String caLastchanged) {
        this.caLastchanged = caLastchanged;
    }
    
    public long getCaBrokerid() {
        return this.caBrokerid;
    }
    
    public void setCaBrokerid(long caBrokerid) {
        this.caBrokerid = caBrokerid;
    }
    
    public String getCaBrokersref() {
        return this.caBrokersref;
    }
    
    public void setCaBrokersref(String caBrokersref) {
        this.caBrokersref = caBrokersref;
    }
    
    public int getCaPayment() {
        return this.caPayment;
    }
    
    public void setCaPayment(int caPayment) {
        this.caPayment = caPayment;
    }
    public void reset() {
        caIssueDate = "";
        caExpiryDate = "";
        caLastchanged = "";
        caBrokerid = 0;
        caBrokersref = "";
        caPayment = 0;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ caIssueDate=\"");
        s.append(getCaIssueDate());
        s.append("\"");
        s.append(", caExpiryDate=\"");
        s.append(getCaExpiryDate());
        s.append("\"");
        s.append(", caLastchanged=\"");
        s.append(getCaLastchanged());
        s.append("\"");
        s.append(", caBrokerid=\"");
        s.append(getCaBrokerid());
        s.append("\"");
        s.append(", caBrokersref=\"");
        s.append(getCaBrokersref());
        s.append("\"");
        s.append(", caPayment=\"");
        s.append(getCaPayment());
        s.append("\"");
        s.append("}");
        return s.toString();
    }
    
    public boolean equals(CaPolicyCommon that) {
        return this.caIssueDate.equals(that.caIssueDate) &&
            this.caExpiryDate.equals(that.caExpiryDate) &&
            this.caLastchanged.equals(that.caLastchanged) &&
            this.caBrokerid == that.caBrokerid &&
            this.caBrokersref.equals(that.caBrokersref) &&
            this.caPayment == that.caPayment;
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof CaPolicyCommon) && this.equals((CaPolicyCommon)that);
    }
    
    @Override
    public int hashCode() {
        return caIssueDate.hashCode() ^
            Integer.rotateLeft(caExpiryDate.hashCode(), 1) ^
            Integer.rotateLeft(caLastchanged.hashCode(), 2) ^
            Integer.rotateLeft(Long.hashCode(caBrokerid), 3) ^
            Integer.rotateLeft(caBrokersref.hashCode(), 4) ^
            Integer.rotateLeft(Integer.hashCode(caPayment), 5);
    }
    
    @Override
    public int compareTo(CaPolicyCommon that) {
        int c = 0;
        c = this.caIssueDate.compareTo(that.caIssueDate);
        if ( c != 0 ) return c;
        c = this.caExpiryDate.compareTo(that.caExpiryDate);
        if ( c != 0 ) return c;
        c = this.caLastchanged.compareTo(that.caLastchanged);
        if ( c != 0 ) return c;
        c = Long.compare(this.caBrokerid, that.caBrokerid);
        if ( c != 0 ) return c;
        c = this.caBrokersref.compareTo(that.caBrokersref);
        if ( c != 0 ) return c;
        c = Integer.compare(this.caPayment, that.caPayment);
        return c;
    }
    
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final StringField CA_ISSUE_DATE = factory.getStringField(10);
    private static final StringField CA_EXPIRY_DATE = factory.getStringField(10);
    private static final StringField CA_LASTCHANGED = factory.getStringField(26);
    private static final ExternalDecimalAsLongField CA_BROKERID = factory.getExternalDecimalAsLongField(10, true);
    private static final StringField CA_BROKERSREF = factory.getStringField(10);
    private static final ExternalDecimalAsIntField CA_PAYMENT = factory.getExternalDecimalAsIntField(6, true);
    public static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    public byte[] getBytes(byte[] bytes, int offset) {
        CA_ISSUE_DATE.putString(caIssueDate, bytes, offset);
        CA_EXPIRY_DATE.putString(caExpiryDate, bytes, offset);
        CA_LASTCHANGED.putString(caLastchanged, bytes, offset);
        CA_BROKERID.putLong(caBrokerid, bytes, offset);
        CA_BROKERSREF.putString(caBrokersref, bytes, offset);
        CA_PAYMENT.putInt(caPayment, bytes, offset);
        return bytes;
    }
    
    public final byte[] getBytes(byte[] bytes) {
        return getBytes(bytes, 0);
    }
    
    public final byte[] getBytes() {
        return getBytes(new byte[numBytes()]);
    }
    
    public final String toByteString() {
        try {
            return new String(getBytes(), factory.getStringEncoding()).stripTrailing();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void setBytes(byte[] bytes, int offset) {
        if (bytes.length < SIZE + offset) {
            byte[] newBytes = Arrays.copyOf(bytes, SIZE + offset);
            Arrays.fill(newBytes, bytes.length, SIZE + offset, (byte)0x40 /*default EBCDIC space character*/);
            bytes = newBytes;
        }
        caIssueDate = CA_ISSUE_DATE.getString(bytes, offset);
        caExpiryDate = CA_EXPIRY_DATE.getString(bytes, offset);
        caLastchanged = CA_LASTCHANGED.getString(bytes, offset);
        caBrokerid = CA_BROKERID.getLong(bytes, offset);
        caBrokersref = CA_BROKERSREF.getString(bytes, offset);
        caPayment = CA_PAYMENT.getInt(bytes, offset);
    }
    
    
    public final void setBytes(byte[] bytes) {
        setBytes(bytes, 0);
    }
    
    public final void setBytes(String bytes) {
        try {
            setBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public int numBytes() {
        return SIZE;
    }
    
}
