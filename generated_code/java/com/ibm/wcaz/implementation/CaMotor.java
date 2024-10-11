package com.ibm.wcaz.implementation;

import com.ibm.jzos.fields.CobolDatatypeFactory;
import com.ibm.jzos.fields.ExternalDecimalAsIntField;
import com.ibm.jzos.fields.StringField;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CaMotor extends CaPolicyRequest {
    private String caMMake = "";
    private String caMModel = "";
    private int caMValue;
    private String caMRegnumber = "";
    private String caMColour = "";
    private int caMCc;
    private String caMManufactured = "";
    private int caMPremium;
    private int caMAccidents;
    private String caMFiller = "";
    
    public CaMotor() {}
    
    public CaMotor(String caRequestId, int caReturnCode, long caCustomerNum, long caPolicyNum, CaPolicyCommon caPolicyCommon, String caMMake, String caMModel, int caMValue, String caMRegnumber, String caMColour, int caMCc, String caMManufactured, int caMPremium, int caMAccidents, String caMFiller) {
        super(caRequestId, caReturnCode, caCustomerNum, caPolicyNum, caPolicyCommon);
        this.caMMake = caMMake;
        this.caMModel = caMModel;
        this.caMValue = caMValue;
        this.caMRegnumber = caMRegnumber;
        this.caMColour = caMColour;
        this.caMCc = caMCc;
        this.caMManufactured = caMManufactured;
        this.caMPremium = caMPremium;
        this.caMAccidents = caMAccidents;
        this.caMFiller = caMFiller;
    }
    
    public CaMotor(CaMotor that) {
        super(that);
        this.caMMake = that.caMMake;
        this.caMModel = that.caMModel;
        this.caMValue = that.caMValue;
        this.caMRegnumber = that.caMRegnumber;
        this.caMColour = that.caMColour;
        this.caMCc = that.caMCc;
        this.caMManufactured = that.caMManufactured;
        this.caMPremium = that.caMPremium;
        this.caMAccidents = that.caMAccidents;
        this.caMFiller = that.caMFiller;
    }
    
    protected CaMotor(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected CaMotor(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static CaMotor fromBytes(byte[] bytes, int offset) {
        return new CaMotor(bytes, offset);
    }
    
    public static CaMotor fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static CaMotor fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String getCaMMake() {
        return this.caMMake;
    }
    
    public void setCaMMake(String caMMake) {
        this.caMMake = caMMake;
    }
    
    public String getCaMModel() {
        return this.caMModel;
    }
    
    public void setCaMModel(String caMModel) {
        this.caMModel = caMModel;
    }
    
    public int getCaMValue() {
        return this.caMValue;
    }
    
    public void setCaMValue(int caMValue) {
        this.caMValue = caMValue;
    }
    
    public String getCaMRegnumber() {
        return this.caMRegnumber;
    }
    
    public void setCaMRegnumber(String caMRegnumber) {
        this.caMRegnumber = caMRegnumber;
    }
    
    public String getCaMColour() {
        return this.caMColour;
    }
    
    public void setCaMColour(String caMColour) {
        this.caMColour = caMColour;
    }
    
    public int getCaMCc() {
        return this.caMCc;
    }
    
    public void setCaMCc(int caMCc) {
        this.caMCc = caMCc;
    }
    
    public String getCaMManufactured() {
        return this.caMManufactured;
    }
    
    public void setCaMManufactured(String caMManufactured) {
        this.caMManufactured = caMManufactured;
    }
    
    public int getCaMPremium() {
        return this.caMPremium;
    }
    
    public void setCaMPremium(int caMPremium) {
        this.caMPremium = caMPremium;
    }
    
    public int getCaMAccidents() {
        return this.caMAccidents;
    }
    
    public void setCaMAccidents(int caMAccidents) {
        this.caMAccidents = caMAccidents;
    }
    
    public String getCaMFiller() {
        return this.caMFiller;
    }
    
    public void setCaMFiller(String caMFiller) {
        this.caMFiller = caMFiller;
    }
    public void reset() {
        super.reset();
        caMMake = "";
        caMModel = "";
        caMValue = 0;
        caMRegnumber = "";
        caMColour = "";
        caMCc = 0;
        caMManufactured = "";
        caMPremium = 0;
        caMAccidents = 0;
        caMFiller = "";
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder(super.toString());
        s.append("{ caMMake=\"");
        s.append(getCaMMake());
        s.append("\"");
        s.append(", caMModel=\"");
        s.append(getCaMModel());
        s.append("\"");
        s.append(", caMValue=\"");
        s.append(getCaMValue());
        s.append("\"");
        s.append(", caMRegnumber=\"");
        s.append(getCaMRegnumber());
        s.append("\"");
        s.append(", caMColour=\"");
        s.append(getCaMColour());
        s.append("\"");
        s.append(", caMCc=\"");
        s.append(getCaMCc());
        s.append("\"");
        s.append(", caMManufactured=\"");
        s.append(getCaMManufactured());
        s.append("\"");
        s.append(", caMPremium=\"");
        s.append(getCaMPremium());
        s.append("\"");
        s.append(", caMAccidents=\"");
        s.append(getCaMAccidents());
        s.append("\"");
        s.append(", caMFiller=\"");
        s.append(getCaMFiller());
        s.append("\"");
        s.append("}");
        return s.toString();
    }
    
    public boolean equals(CaMotor that) {
        return super.equals(that) &&
            this.caMMake.equals(that.caMMake) &&
            this.caMModel.equals(that.caMModel) &&
            this.caMValue == that.caMValue &&
            this.caMRegnumber.equals(that.caMRegnumber) &&
            this.caMColour.equals(that.caMColour) &&
            this.caMCc == that.caMCc &&
            this.caMManufactured.equals(that.caMManufactured) &&
            this.caMPremium == that.caMPremium &&
            this.caMAccidents == that.caMAccidents &&
            this.caMFiller.equals(that.caMFiller);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof CaMotor) && this.equals((CaMotor)that);
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^
            Integer.rotateLeft(caMMake.hashCode(), 5) ^
            Integer.rotateLeft(caMModel.hashCode(), 6) ^
            Integer.rotateLeft(Integer.hashCode(caMValue), 7) ^
            Integer.rotateLeft(caMRegnumber.hashCode(), 8) ^
            Integer.rotateLeft(caMColour.hashCode(), 9) ^
            Integer.rotateLeft(Integer.hashCode(caMCc), 10) ^
            Integer.rotateLeft(caMManufactured.hashCode(), 11) ^
            Integer.rotateLeft(Integer.hashCode(caMPremium), 12) ^
            Integer.rotateLeft(Integer.hashCode(caMAccidents), 13) ^
            Integer.rotateLeft(caMFiller.hashCode(), 14);
    }
    
    public int compareTo(CaMotor that) {
        int c = 0;
        c = super.compareTo(that);
        if ( c != 0 ) return c;
        c = this.caMMake.compareTo(that.caMMake);
        if ( c != 0 ) return c;
        c = this.caMModel.compareTo(that.caMModel);
        if ( c != 0 ) return c;
        c = Integer.compare(this.caMValue, that.caMValue);
        if ( c != 0 ) return c;
        c = this.caMRegnumber.compareTo(that.caMRegnumber);
        if ( c != 0 ) return c;
        c = this.caMColour.compareTo(that.caMColour);
        if ( c != 0 ) return c;
        c = Integer.compare(this.caMCc, that.caMCc);
        if ( c != 0 ) return c;
        c = this.caMManufactured.compareTo(that.caMManufactured);
        if ( c != 0 ) return c;
        c = Integer.compare(this.caMPremium, that.caMPremium);
        if ( c != 0 ) return c;
        c = Integer.compare(this.caMAccidents, that.caMAccidents);
        if ( c != 0 ) return c;
        c = this.caMFiller.compareTo(that.caMFiller);
        return c;
    }
    
    @Override
    public int compareTo(Dfhcommarea1 that) {
        if (that instanceof CaMotor) {
            return this.compareTo((CaMotor)that);
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
    
    private static final StringField CA_M_MAKE = factory.getStringField(15);
    private static final StringField CA_M_MODEL = factory.getStringField(15);
    private static final ExternalDecimalAsIntField CA_M_VALUE = factory.getExternalDecimalAsIntField(6, true);
    private static final StringField CA_M_REGNUMBER = factory.getStringField(7);
    private static final StringField CA_M_COLOUR = factory.getStringField(8);
    private static final ExternalDecimalAsIntField CA_M_CC = factory.getExternalDecimalAsIntField(4, true);
    private static final StringField CA_M_MANUFACTURED = factory.getStringField(10);
    private static final ExternalDecimalAsIntField CA_M_PREMIUM = factory.getExternalDecimalAsIntField(6, true);
    private static final ExternalDecimalAsIntField CA_M_ACCIDENTS = factory.getExternalDecimalAsIntField(6, true);
    private static final StringField CA_M_FILLER = factory.getStringField(32323);
    public static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    public byte[] getBytes(byte[] bytes, int offset) {
        super.getBytes(bytes, offset);
        CA_M_MAKE.putString(caMMake, bytes, offset);
        CA_M_MODEL.putString(caMModel, bytes, offset);
        CA_M_VALUE.putInt(caMValue, bytes, offset);
        CA_M_REGNUMBER.putString(caMRegnumber, bytes, offset);
        CA_M_COLOUR.putString(caMColour, bytes, offset);
        CA_M_CC.putInt(caMCc, bytes, offset);
        CA_M_MANUFACTURED.putString(caMManufactured, bytes, offset);
        CA_M_PREMIUM.putInt(caMPremium, bytes, offset);
        CA_M_ACCIDENTS.putInt(caMAccidents, bytes, offset);
        CA_M_FILLER.putString(caMFiller, bytes, offset);
        return bytes;
    }
    
    public void setBytes(byte[] bytes, int offset) {
        if (bytes.length < SIZE + offset) {
            byte[] newBytes = Arrays.copyOf(bytes, SIZE + offset);
            Arrays.fill(newBytes, bytes.length, SIZE + offset, (byte)0x40 /*default EBCDIC space character*/);
            bytes = newBytes;
        }
        super.setBytes(bytes, offset);
        caMMake = CA_M_MAKE.getString(bytes, offset);
        caMModel = CA_M_MODEL.getString(bytes, offset);
        caMValue = CA_M_VALUE.getInt(bytes, offset);
        caMRegnumber = CA_M_REGNUMBER.getString(bytes, offset);
        caMColour = CA_M_COLOUR.getString(bytes, offset);
        caMCc = CA_M_CC.getInt(bytes, offset);
        caMManufactured = CA_M_MANUFACTURED.getString(bytes, offset);
        caMPremium = CA_M_PREMIUM.getInt(bytes, offset);
        caMAccidents = CA_M_ACCIDENTS.getInt(bytes, offset);
        caMFiller = CA_M_FILLER.getString(bytes, offset);
    }
    
    public int numBytes() {
        return SIZE;
    }
    
}
