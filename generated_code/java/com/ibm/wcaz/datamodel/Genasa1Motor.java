package com.ibm.wcaz.datamodel;

import com.ibm.jzos.fields.CobolDatatypeFactory;
import com.ibm.jzos.fields.ExternalDecimalAsIntField;
import com.ibm.jzos.fields.StringField;
import java.io.UnsupportedEncodingException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Genasa1Motor implements Comparable<Genasa1Motor> {
    private int policynumber;
    private String make = "";
    private String model = "";
    private int value;
    private String regnumber = "";
    private String colour = "";
    private int cc;
    private Date yearofmanufacture = new Date(0);
    private int premium;
    private int accidents;
    
    public Genasa1Motor() {}
    
    public Genasa1Motor(int policynumber, String make, String model, int value, String regnumber, String colour, int cc, Date yearofmanufacture, int premium, int accidents) {
        this.policynumber = policynumber;
        this.make = make;
        this.model = model;
        this.value = value;
        this.regnumber = regnumber;
        this.colour = colour;
        this.cc = cc;
        this.yearofmanufacture = yearofmanufacture;
        this.premium = premium;
        this.accidents = accidents;
    }
    
    public Genasa1Motor(Genasa1Motor that) {
        this.policynumber = that.policynumber;
        this.make = that.make;
        this.model = that.model;
        this.value = that.value;
        this.regnumber = that.regnumber;
        this.colour = that.colour;
        this.cc = that.cc;
        this.yearofmanufacture = that.yearofmanufacture;
        this.premium = that.premium;
        this.accidents = that.accidents;
    }
    
    protected Genasa1Motor(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected Genasa1Motor(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static Genasa1Motor fromBytes(byte[] bytes, int offset) {
        return new Genasa1Motor(bytes, offset);
    }
    
    public static Genasa1Motor fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static Genasa1Motor fromBytes(String bytes) {
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
    
    public String getMake() {
        return this.make;
    }
    
    public void setMake(String make) {
        this.make = make;
    }
    
    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public String getRegnumber() {
        return this.regnumber;
    }
    
    public void setRegnumber(String regnumber) {
        this.regnumber = regnumber;
    }
    
    public String getColour() {
        return this.colour;
    }
    
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public int getCc() {
        return this.cc;
    }
    
    public void setCc(int cc) {
        this.cc = cc;
    }
    
    public Date getYearofmanufacture() {
        return this.yearofmanufacture;
    }
    
    public void setYearofmanufacture(Date yearofmanufacture) {
        this.yearofmanufacture = yearofmanufacture;
    }
    
    public int getPremium() {
        return this.premium;
    }
    
    public void setPremium(int premium) {
        this.premium = premium;
    }
    
    public int getAccidents() {
        return this.accidents;
    }
    
    public void setAccidents(int accidents) {
        this.accidents = accidents;
    }
    public void reset() {
        policynumber = 0;
        make = "";
        model = "";
        value = 0;
        regnumber = "";
        colour = "";
        cc = 0;
        yearofmanufacture = new Date(0);
        premium = 0;
        accidents = 0;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ policynumber=\"");
        s.append(getPolicynumber());
        s.append("\"");
        s.append(", make=\"");
        s.append(getMake());
        s.append("\"");
        s.append(", model=\"");
        s.append(getModel());
        s.append("\"");
        s.append(", value=\"");
        s.append(getValue());
        s.append("\"");
        s.append(", regnumber=\"");
        s.append(getRegnumber());
        s.append("\"");
        s.append(", colour=\"");
        s.append(getColour());
        s.append("\"");
        s.append(", cc=\"");
        s.append(getCc());
        s.append("\"");
        s.append(", yearofmanufacture=\"");
        s.append(getYearofmanufacture());
        s.append("\"");
        s.append(", premium=\"");
        s.append(getPremium());
        s.append("\"");
        s.append(", accidents=\"");
        s.append(getAccidents());
        s.append("\"");
        s.append("}");
        return s.toString();
    }
    
    public boolean equals(Genasa1Motor that) {
        return this.policynumber == that.policynumber &&
            this.make.equals(that.make) &&
            this.model.equals(that.model) &&
            this.value == that.value &&
            this.regnumber.equals(that.regnumber) &&
            this.colour.equals(that.colour) &&
            this.cc == that.cc &&
            this.yearofmanufacture.equals(that.yearofmanufacture) &&
            this.premium == that.premium &&
            this.accidents == that.accidents;
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof Genasa1Motor) && this.equals((Genasa1Motor)that);
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(policynumber) ^
            Integer.rotateLeft(make.hashCode(), 1) ^
            Integer.rotateLeft(model.hashCode(), 2) ^
            Integer.rotateLeft(Integer.hashCode(value), 3) ^
            Integer.rotateLeft(regnumber.hashCode(), 4) ^
            Integer.rotateLeft(colour.hashCode(), 5) ^
            Integer.rotateLeft(Integer.hashCode(cc), 6) ^
            Integer.rotateLeft(yearofmanufacture.hashCode(), 7) ^
            Integer.rotateLeft(Integer.hashCode(premium), 8) ^
            Integer.rotateLeft(Integer.hashCode(accidents), 9);
    }
    
    @Override
    public int compareTo(Genasa1Motor that) {
        int c = 0;
        c = Integer.compare(this.policynumber, that.policynumber);
        if ( c != 0 ) return c;
        c = this.make.compareTo(that.make);
        if ( c != 0 ) return c;
        c = this.model.compareTo(that.model);
        if ( c != 0 ) return c;
        c = Integer.compare(this.value, that.value);
        if ( c != 0 ) return c;
        c = this.regnumber.compareTo(that.regnumber);
        if ( c != 0 ) return c;
        c = this.colour.compareTo(that.colour);
        if ( c != 0 ) return c;
        c = Integer.compare(this.cc, that.cc);
        if ( c != 0 ) return c;
        c = this.yearofmanufacture.compareTo(that.yearofmanufacture);
        if ( c != 0 ) return c;
        c = Integer.compare(this.premium, that.premium);
        if ( c != 0 ) return c;
        c = Integer.compare(this.accidents, that.accidents);
        return c;
    }
    
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final ExternalDecimalAsIntField POLICYNUMBER = factory.getExternalDecimalAsIntField(5, true);
    private static final StringField MAKE = factory.getStringField(16);
    private static final StringField MODEL = factory.getStringField(16);
    private static final ExternalDecimalAsIntField VALUE = factory.getExternalDecimalAsIntField(5, true);
    private static final StringField REGNUMBER = factory.getStringField(8);
    private static final StringField COLOUR = factory.getStringField(9);
    private static final ExternalDecimalAsIntField CC = factory.getExternalDecimalAsIntField(3, true);
    private static final StringField YEAROFMANUFACTURE = factory.getStringField(8);
    private static final DateTimeFormatter YEAROFMANUFACTURE_FMT = DateTimeFormatter.ofPattern("yyyyMMdd");
    private static final ExternalDecimalAsIntField PREMIUM = factory.getExternalDecimalAsIntField(5, true);
    private static final ExternalDecimalAsIntField ACCIDENTS = factory.getExternalDecimalAsIntField(5, true);
    public static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    public byte[] getBytes(byte[] bytes, int offset) {
        POLICYNUMBER.putInt(policynumber, bytes, offset);
        MAKE.putString(make, bytes, offset);
        MODEL.putString(model, bytes, offset);
        VALUE.putInt(value, bytes, offset);
        REGNUMBER.putString(regnumber, bytes, offset);
        COLOUR.putString(colour, bytes, offset);
        CC.putInt(cc, bytes, offset);
        YEAROFMANUFACTURE.putString(yearofmanufacture.toLocalDate().format(YEAROFMANUFACTURE_FMT), bytes, offset);
        PREMIUM.putInt(premium, bytes, offset);
        ACCIDENTS.putInt(accidents, bytes, offset);
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
        make = MAKE.getString(bytes, offset);
        model = MODEL.getString(bytes, offset);
        value = VALUE.getInt(bytes, offset);
        regnumber = REGNUMBER.getString(bytes, offset);
        colour = COLOUR.getString(bytes, offset);
        cc = CC.getInt(bytes, offset);
        yearofmanufacture = Date.valueOf(LocalDate.parse(YEAROFMANUFACTURE.getString(bytes, offset), YEAROFMANUFACTURE_FMT));
        premium = PREMIUM.getInt(bytes, offset);
        accidents = ACCIDENTS.getInt(bytes, offset);
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
