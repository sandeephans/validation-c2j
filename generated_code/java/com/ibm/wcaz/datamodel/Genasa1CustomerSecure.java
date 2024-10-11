package com.ibm.wcaz.datamodel;

import com.ibm.jzos.fields.CobolDatatypeFactory;
import com.ibm.jzos.fields.ExternalDecimalAsIntField;
import com.ibm.jzos.fields.StringField;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Genasa1CustomerSecure implements Comparable<Genasa1CustomerSecure> {
    private int customernumber;
    private String customerpass = "";
    private String stateIndicator = "";
    private int passChanges;
    
    public Genasa1CustomerSecure() {}
    
    public Genasa1CustomerSecure(int customernumber, String customerpass, String stateIndicator, int passChanges) {
        this.customernumber = customernumber;
        this.customerpass = customerpass;
        this.stateIndicator = stateIndicator;
        this.passChanges = passChanges;
    }
    
    public Genasa1CustomerSecure(Genasa1CustomerSecure that) {
        this.customernumber = that.customernumber;
        this.customerpass = that.customerpass;
        this.stateIndicator = that.stateIndicator;
        this.passChanges = that.passChanges;
    }
    
    protected Genasa1CustomerSecure(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected Genasa1CustomerSecure(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static Genasa1CustomerSecure fromBytes(byte[] bytes, int offset) {
        return new Genasa1CustomerSecure(bytes, offset);
    }
    
    public static Genasa1CustomerSecure fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static Genasa1CustomerSecure fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public int getCustomernumber() {
        return this.customernumber;
    }
    
    public void setCustomernumber(int customernumber) {
        this.customernumber = customernumber;
    }
    
    public String getCustomerpass() {
        return this.customerpass;
    }
    
    public void setCustomerpass(String customerpass) {
        this.customerpass = customerpass;
    }
    
    public String getStateIndicator() {
        return this.stateIndicator;
    }
    
    public void setStateIndicator(String stateIndicator) {
        this.stateIndicator = stateIndicator;
    }
    
    public int getPassChanges() {
        return this.passChanges;
    }
    
    public void setPassChanges(int passChanges) {
        this.passChanges = passChanges;
    }
    public void reset() {
        customernumber = 0;
        customerpass = "";
        stateIndicator = "";
        passChanges = 0;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ customernumber=\"");
        s.append(getCustomernumber());
        s.append("\"");
        s.append(", customerpass=\"");
        s.append(getCustomerpass());
        s.append("\"");
        s.append(", stateIndicator=\"");
        s.append(getStateIndicator());
        s.append("\"");
        s.append(", passChanges=\"");
        s.append(getPassChanges());
        s.append("\"");
        s.append("}");
        return s.toString();
    }
    
    public boolean equals(Genasa1CustomerSecure that) {
        return this.customernumber == that.customernumber &&
            this.customerpass.equals(that.customerpass) &&
            this.stateIndicator.equals(that.stateIndicator) &&
            this.passChanges == that.passChanges;
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof Genasa1CustomerSecure) && this.equals((Genasa1CustomerSecure)that);
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(customernumber) ^
            Integer.rotateLeft(customerpass.hashCode(), 1) ^
            Integer.rotateLeft(stateIndicator.hashCode(), 2) ^
            Integer.rotateLeft(Integer.hashCode(passChanges), 3);
    }
    
    @Override
    public int compareTo(Genasa1CustomerSecure that) {
        int c = 0;
        c = Integer.compare(this.customernumber, that.customernumber);
        if ( c != 0 ) return c;
        c = this.customerpass.compareTo(that.customerpass);
        if ( c != 0 ) return c;
        c = this.stateIndicator.compareTo(that.stateIndicator);
        if ( c != 0 ) return c;
        c = Integer.compare(this.passChanges, that.passChanges);
        return c;
    }
    
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final ExternalDecimalAsIntField CUSTOMERNUMBER = factory.getExternalDecimalAsIntField(5, true);
    private static final StringField CUSTOMERPASS = factory.getStringField(33);
    private static final StringField STATE_INDICATOR = factory.getStringField(2);
    private static final ExternalDecimalAsIntField PASS_CHANGES = factory.getExternalDecimalAsIntField(5, true);
    public static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    public byte[] getBytes(byte[] bytes, int offset) {
        CUSTOMERNUMBER.putInt(customernumber, bytes, offset);
        CUSTOMERPASS.putString(customerpass, bytes, offset);
        STATE_INDICATOR.putString(stateIndicator, bytes, offset);
        PASS_CHANGES.putInt(passChanges, bytes, offset);
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
        customernumber = CUSTOMERNUMBER.getInt(bytes, offset);
        customerpass = CUSTOMERPASS.getString(bytes, offset);
        stateIndicator = STATE_INDICATOR.getString(bytes, offset);
        passChanges = PASS_CHANGES.getInt(bytes, offset);
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
