package com.ibm.wcaz.datamodel;

import com.ibm.jzos.fields.CobolDatatypeFactory;
import com.ibm.jzos.fields.ExternalDecimalAsIntField;
import com.ibm.jzos.fields.StringField;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Genasa1House implements Comparable<Genasa1House> {
    private int policynumber;
    private String propertytype = "";
    private int bedrooms;
    private int value;
    private String housename = "";
    private String housenumber = "";
    private String postcode = "";
    
    public Genasa1House() {}
    
    public Genasa1House(int policynumber, String propertytype, int bedrooms, int value, String housename, String housenumber, String postcode) {
        this.policynumber = policynumber;
        this.propertytype = propertytype;
        this.bedrooms = bedrooms;
        this.value = value;
        this.housename = housename;
        this.housenumber = housenumber;
        this.postcode = postcode;
    }
    
    public Genasa1House(Genasa1House that) {
        this.policynumber = that.policynumber;
        this.propertytype = that.propertytype;
        this.bedrooms = that.bedrooms;
        this.value = that.value;
        this.housename = that.housename;
        this.housenumber = that.housenumber;
        this.postcode = that.postcode;
    }
    
    protected Genasa1House(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected Genasa1House(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static Genasa1House fromBytes(byte[] bytes, int offset) {
        return new Genasa1House(bytes, offset);
    }
    
    public static Genasa1House fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static Genasa1House fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public int getPolicynumber() {
        return this.policynumber;
    }
    
    public void setPolicynumber(int policynumber) {
        this.policynumber = policynumber;
    }
    
    public String getPropertytype() {
        return this.propertytype;
    }
    
    public void setPropertytype(String propertytype) {
        this.propertytype = propertytype;
    }
    
    public int getBedrooms() {
        return this.bedrooms;
    }
    
    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public String getHousename() {
        return this.housename;
    }
    
    public void setHousename(String housename) {
        this.housename = housename;
    }
    
    public String getHousenumber() {
        return this.housenumber;
    }
    
    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }
    
    public String getPostcode() {
        return this.postcode;
    }
    
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    public void reset() {
        policynumber = 0;
        propertytype = "";
        bedrooms = 0;
        value = 0;
        housename = "";
        housenumber = "";
        postcode = "";
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ policynumber=\"");
        s.append(getPolicynumber());
        s.append("\"");
        s.append(", propertytype=\"");
        s.append(getPropertytype());
        s.append("\"");
        s.append(", bedrooms=\"");
        s.append(getBedrooms());
        s.append("\"");
        s.append(", value=\"");
        s.append(getValue());
        s.append("\"");
        s.append(", housename=\"");
        s.append(getHousename());
        s.append("\"");
        s.append(", housenumber=\"");
        s.append(getHousenumber());
        s.append("\"");
        s.append(", postcode=\"");
        s.append(getPostcode());
        s.append("\"");
        s.append("}");
        return s.toString();
    }
    
    public boolean equals(Genasa1House that) {
        return this.policynumber == that.policynumber &&
            this.propertytype.equals(that.propertytype) &&
            this.bedrooms == that.bedrooms &&
            this.value == that.value &&
            this.housename.equals(that.housename) &&
            this.housenumber.equals(that.housenumber) &&
            this.postcode.equals(that.postcode);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof Genasa1House) && this.equals((Genasa1House)that);
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(policynumber) ^
            Integer.rotateLeft(propertytype.hashCode(), 1) ^
            Integer.rotateLeft(Integer.hashCode(bedrooms), 2) ^
            Integer.rotateLeft(Integer.hashCode(value), 3) ^
            Integer.rotateLeft(housename.hashCode(), 4) ^
            Integer.rotateLeft(housenumber.hashCode(), 5) ^
            Integer.rotateLeft(postcode.hashCode(), 6);
    }
    
    @Override
    public int compareTo(Genasa1House that) {
        int c = 0;
        c = Integer.compare(this.policynumber, that.policynumber);
        if ( c != 0 ) return c;
        c = this.propertytype.compareTo(that.propertytype);
        if ( c != 0 ) return c;
        c = Integer.compare(this.bedrooms, that.bedrooms);
        if ( c != 0 ) return c;
        c = Integer.compare(this.value, that.value);
        if ( c != 0 ) return c;
        c = this.housename.compareTo(that.housename);
        if ( c != 0 ) return c;
        c = this.housenumber.compareTo(that.housenumber);
        if ( c != 0 ) return c;
        c = this.postcode.compareTo(that.postcode);
        return c;
    }
    
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final ExternalDecimalAsIntField POLICYNUMBER = factory.getExternalDecimalAsIntField(5, true);
    private static final StringField PROPERTYTYPE = factory.getStringField(16);
    private static final ExternalDecimalAsIntField BEDROOMS = factory.getExternalDecimalAsIntField(3, true);
    private static final ExternalDecimalAsIntField VALUE = factory.getExternalDecimalAsIntField(5, true);
    private static final StringField HOUSENAME = factory.getStringField(21);
    private static final StringField HOUSENUMBER = factory.getStringField(5);
    private static final StringField POSTCODE = factory.getStringField(9);
    public static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    public byte[] getBytes(byte[] bytes, int offset) {
        POLICYNUMBER.putInt(policynumber, bytes, offset);
        PROPERTYTYPE.putString(propertytype, bytes, offset);
        BEDROOMS.putInt(bedrooms, bytes, offset);
        VALUE.putInt(value, bytes, offset);
        HOUSENAME.putString(housename, bytes, offset);
        HOUSENUMBER.putString(housenumber, bytes, offset);
        POSTCODE.putString(postcode, bytes, offset);
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
        policynumber = POLICYNUMBER.getInt(bytes, offset);
        propertytype = PROPERTYTYPE.getString(bytes, offset);
        bedrooms = BEDROOMS.getInt(bytes, offset);
        value = VALUE.getInt(bytes, offset);
        housename = HOUSENAME.getString(bytes, offset);
        housenumber = HOUSENUMBER.getString(bytes, offset);
        postcode = POSTCODE.getString(bytes, offset);
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
