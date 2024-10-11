package com.ibm.wcaz.implementation;

import com.ibm.jzos.fields.CobolDatatypeFactory;
import com.ibm.jzos.fields.ExternalDecimalAsIntField;
import com.ibm.jzos.fields.StringField;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CaHouse extends CaPolicyRequest {
    private String caHPropertyType = "";
    private int caHBedrooms;
    private int caHValue;
    private String caHHouseName = "";
    private String caHHouseNumber = "";
    private String caHPostcode = "";
    private String caHFiller = "";
    
    public CaHouse() {}
    
    public CaHouse(String caRequestId, int caReturnCode, long caCustomerNum, long caPolicyNum, CaPolicyCommon caPolicyCommon, String caHPropertyType, int caHBedrooms, int caHValue, String caHHouseName, String caHHouseNumber, String caHPostcode, String caHFiller) {
        super(caRequestId, caReturnCode, caCustomerNum, caPolicyNum, caPolicyCommon);
        this.caHPropertyType = caHPropertyType;
        this.caHBedrooms = caHBedrooms;
        this.caHValue = caHValue;
        this.caHHouseName = caHHouseName;
        this.caHHouseNumber = caHHouseNumber;
        this.caHPostcode = caHPostcode;
        this.caHFiller = caHFiller;
    }
    
    public CaHouse(CaHouse that) {
        super(that);
        this.caHPropertyType = that.caHPropertyType;
        this.caHBedrooms = that.caHBedrooms;
        this.caHValue = that.caHValue;
        this.caHHouseName = that.caHHouseName;
        this.caHHouseNumber = that.caHHouseNumber;
        this.caHPostcode = that.caHPostcode;
        this.caHFiller = that.caHFiller;
    }
    
    protected CaHouse(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected CaHouse(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static CaHouse fromBytes(byte[] bytes, int offset) {
        return new CaHouse(bytes, offset);
    }
    
    public static CaHouse fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static CaHouse fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String getCaHPropertyType() {
        return this.caHPropertyType;
    }
    
    public void setCaHPropertyType(String caHPropertyType) {
        this.caHPropertyType = caHPropertyType;
    }
    
    public int getCaHBedrooms() {
        return this.caHBedrooms;
    }
    
    public void setCaHBedrooms(int caHBedrooms) {
        this.caHBedrooms = caHBedrooms;
    }
    
    public int getCaHValue() {
        return this.caHValue;
    }
    
    public void setCaHValue(int caHValue) {
        this.caHValue = caHValue;
    }
    
    public String getCaHHouseName() {
        return this.caHHouseName;
    }
    
    public void setCaHHouseName(String caHHouseName) {
        this.caHHouseName = caHHouseName;
    }
    
    public String getCaHHouseNumber() {
        return this.caHHouseNumber;
    }
    
    public void setCaHHouseNumber(String caHHouseNumber) {
        this.caHHouseNumber = caHHouseNumber;
    }
    
    public String getCaHPostcode() {
        return this.caHPostcode;
    }
    
    public void setCaHPostcode(String caHPostcode) {
        this.caHPostcode = caHPostcode;
    }
    
    public String getCaHFiller() {
        return this.caHFiller;
    }
    
    public void setCaHFiller(String caHFiller) {
        this.caHFiller = caHFiller;
    }
    public void reset() {
        super.reset();
        caHPropertyType = "";
        caHBedrooms = 0;
        caHValue = 0;
        caHHouseName = "";
        caHHouseNumber = "";
        caHPostcode = "";
        caHFiller = "";
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder(super.toString());
        s.append("{ caHPropertyType=\"");
        s.append(getCaHPropertyType());
        s.append("\"");
        s.append(", caHBedrooms=\"");
        s.append(getCaHBedrooms());
        s.append("\"");
        s.append(", caHValue=\"");
        s.append(getCaHValue());
        s.append("\"");
        s.append(", caHHouseName=\"");
        s.append(getCaHHouseName());
        s.append("\"");
        s.append(", caHHouseNumber=\"");
        s.append(getCaHHouseNumber());
        s.append("\"");
        s.append(", caHPostcode=\"");
        s.append(getCaHPostcode());
        s.append("\"");
        s.append(", caHFiller=\"");
        s.append(getCaHFiller());
        s.append("\"");
        s.append("}");
        return s.toString();
    }
    
    public boolean equals(CaHouse that) {
        return super.equals(that) &&
            this.caHPropertyType.equals(that.caHPropertyType) &&
            this.caHBedrooms == that.caHBedrooms &&
            this.caHValue == that.caHValue &&
            this.caHHouseName.equals(that.caHHouseName) &&
            this.caHHouseNumber.equals(that.caHHouseNumber) &&
            this.caHPostcode.equals(that.caHPostcode) &&
            this.caHFiller.equals(that.caHFiller);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof CaHouse) && this.equals((CaHouse)that);
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^
            Integer.rotateLeft(caHPropertyType.hashCode(), 5) ^
            Integer.rotateLeft(Integer.hashCode(caHBedrooms), 6) ^
            Integer.rotateLeft(Integer.hashCode(caHValue), 7) ^
            Integer.rotateLeft(caHHouseName.hashCode(), 8) ^
            Integer.rotateLeft(caHHouseNumber.hashCode(), 9) ^
            Integer.rotateLeft(caHPostcode.hashCode(), 10) ^
            Integer.rotateLeft(caHFiller.hashCode(), 11);
    }
    
    public int compareTo(CaHouse that) {
        int c = 0;
        c = super.compareTo(that);
        if ( c != 0 ) return c;
        c = this.caHPropertyType.compareTo(that.caHPropertyType);
        if ( c != 0 ) return c;
        c = Integer.compare(this.caHBedrooms, that.caHBedrooms);
        if ( c != 0 ) return c;
        c = Integer.compare(this.caHValue, that.caHValue);
        if ( c != 0 ) return c;
        c = this.caHHouseName.compareTo(that.caHHouseName);
        if ( c != 0 ) return c;
        c = this.caHHouseNumber.compareTo(that.caHHouseNumber);
        if ( c != 0 ) return c;
        c = this.caHPostcode.compareTo(that.caHPostcode);
        if ( c != 0 ) return c;
        c = this.caHFiller.compareTo(that.caHFiller);
        return c;
    }
    
    @Override
    public int compareTo(Dfhcommarea1 that) {
        if (that instanceof CaHouse) {
            return this.compareTo((CaHouse)that);
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
    
    private static final StringField CA_H_PROPERTY_TYPE = factory.getStringField(15);
    private static final ExternalDecimalAsIntField CA_H_BEDROOMS = factory.getExternalDecimalAsIntField(3, true);
    private static final ExternalDecimalAsIntField CA_H_VALUE = factory.getExternalDecimalAsIntField(8, true);
    private static final StringField CA_H_HOUSE_NAME = factory.getStringField(20);
    private static final StringField CA_H_HOUSE_NUMBER = factory.getStringField(4);
    private static final StringField CA_H_POSTCODE = factory.getStringField(8);
    private static final StringField CA_H_FILLER = factory.getStringField(32342);
    public static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    public byte[] getBytes(byte[] bytes, int offset) {
        super.getBytes(bytes, offset);
        CA_H_PROPERTY_TYPE.putString(caHPropertyType, bytes, offset);
        CA_H_BEDROOMS.putInt(caHBedrooms, bytes, offset);
        CA_H_VALUE.putInt(caHValue, bytes, offset);
        CA_H_HOUSE_NAME.putString(caHHouseName, bytes, offset);
        CA_H_HOUSE_NUMBER.putString(caHHouseNumber, bytes, offset);
        CA_H_POSTCODE.putString(caHPostcode, bytes, offset);
        CA_H_FILLER.putString(caHFiller, bytes, offset);
        return bytes;
    }
    
    public void setBytes(byte[] bytes, int offset) {
        if (bytes.length < SIZE + offset) {
            byte[] newBytes = Arrays.copyOf(bytes, SIZE + offset);
            Arrays.fill(newBytes, bytes.length, SIZE + offset, (byte)0x40 /*default EBCDIC space character*/);
            bytes = newBytes;
        }
        super.setBytes(bytes, offset);
        caHPropertyType = CA_H_PROPERTY_TYPE.getString(bytes, offset);
        caHBedrooms = CA_H_BEDROOMS.getInt(bytes, offset);
        caHValue = CA_H_VALUE.getInt(bytes, offset);
        caHHouseName = CA_H_HOUSE_NAME.getString(bytes, offset);
        caHHouseNumber = CA_H_HOUSE_NUMBER.getString(bytes, offset);
        caHPostcode = CA_H_POSTCODE.getString(bytes, offset);
        caHFiller = CA_H_FILLER.getString(bytes, offset);
    }
    
    public int numBytes() {
        return SIZE;
    }
    
}
