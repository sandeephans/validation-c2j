package com.ibm.wcaz.datamodel;

import com.ibm.jzos.fields.CobolDatatypeFactory;
import com.ibm.jzos.fields.ExternalDecimalAsIntField;
import com.ibm.jzos.fields.StringField;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Genasa1Endowment implements Comparable<Genasa1Endowment> {
    private int policynumber;
    private String equities = "";
    private String withprofits = "";
    private String managedfund = "";
    private String fundname = "";
    private int term;
    private int sumassured;
    private String lifeassured = "";
    private String paddingdata = "";
    
    public Genasa1Endowment() {}
    
    public Genasa1Endowment(int policynumber, String equities, String withprofits, String managedfund, String fundname, int term, int sumassured, String lifeassured, String paddingdata) {
        this.policynumber = policynumber;
        this.equities = equities;
        this.withprofits = withprofits;
        this.managedfund = managedfund;
        this.fundname = fundname;
        this.term = term;
        this.sumassured = sumassured;
        this.lifeassured = lifeassured;
        this.paddingdata = paddingdata;
    }
    
    public Genasa1Endowment(Genasa1Endowment that) {
        this.policynumber = that.policynumber;
        this.equities = that.equities;
        this.withprofits = that.withprofits;
        this.managedfund = that.managedfund;
        this.fundname = that.fundname;
        this.term = that.term;
        this.sumassured = that.sumassured;
        this.lifeassured = that.lifeassured;
        this.paddingdata = that.paddingdata;
    }
    
    protected Genasa1Endowment(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected Genasa1Endowment(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static Genasa1Endowment fromBytes(byte[] bytes, int offset) {
        return new Genasa1Endowment(bytes, offset);
    }
    
    public static Genasa1Endowment fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static Genasa1Endowment fromBytes(String bytes) {
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
    
    public String getEquities() {
        return this.equities;
    }
    
    public void setEquities(String equities) {
        this.equities = equities;
    }
    
    public String getWithprofits() {
        return this.withprofits;
    }
    
    public void setWithprofits(String withprofits) {
        this.withprofits = withprofits;
    }
    
    public String getManagedfund() {
        return this.managedfund;
    }
    
    public void setManagedfund(String managedfund) {
        this.managedfund = managedfund;
    }
    
    public String getFundname() {
        return this.fundname;
    }
    
    public void setFundname(String fundname) {
        this.fundname = fundname;
    }
    
    public int getTerm() {
        return this.term;
    }
    
    public void setTerm(int term) {
        this.term = term;
    }
    
    public int getSumassured() {
        return this.sumassured;
    }
    
    public void setSumassured(int sumassured) {
        this.sumassured = sumassured;
    }
    
    public String getLifeassured() {
        return this.lifeassured;
    }
    
    public void setLifeassured(String lifeassured) {
        this.lifeassured = lifeassured;
    }
    
    public String getPaddingdata() {
        return this.paddingdata;
    }
    
    public void setPaddingdata(String paddingdata) {
        this.paddingdata = paddingdata;
    }
    public void reset() {
        policynumber = 0;
        equities = "";
        withprofits = "";
        managedfund = "";
        fundname = "";
        term = 0;
        sumassured = 0;
        lifeassured = "";
        paddingdata = "";
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ policynumber=\"");
        s.append(getPolicynumber());
        s.append("\"");
        s.append(", equities=\"");
        s.append(getEquities());
        s.append("\"");
        s.append(", withprofits=\"");
        s.append(getWithprofits());
        s.append("\"");
        s.append(", managedfund=\"");
        s.append(getManagedfund());
        s.append("\"");
        s.append(", fundname=\"");
        s.append(getFundname());
        s.append("\"");
        s.append(", term=\"");
        s.append(getTerm());
        s.append("\"");
        s.append(", sumassured=\"");
        s.append(getSumassured());
        s.append("\"");
        s.append(", lifeassured=\"");
        s.append(getLifeassured());
        s.append("\"");
        s.append(", paddingdata=\"");
        s.append(getPaddingdata());
        s.append("\"");
        s.append("}");
        return s.toString();
    }
    
    public boolean equals(Genasa1Endowment that) {
        return this.policynumber == that.policynumber &&
            this.equities.equals(that.equities) &&
            this.withprofits.equals(that.withprofits) &&
            this.managedfund.equals(that.managedfund) &&
            this.fundname.equals(that.fundname) &&
            this.term == that.term &&
            this.sumassured == that.sumassured &&
            this.lifeassured.equals(that.lifeassured) &&
            this.paddingdata.equals(that.paddingdata);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof Genasa1Endowment) && this.equals((Genasa1Endowment)that);
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(policynumber) ^
            Integer.rotateLeft(equities.hashCode(), 1) ^
            Integer.rotateLeft(withprofits.hashCode(), 2) ^
            Integer.rotateLeft(managedfund.hashCode(), 3) ^
            Integer.rotateLeft(fundname.hashCode(), 4) ^
            Integer.rotateLeft(Integer.hashCode(term), 5) ^
            Integer.rotateLeft(Integer.hashCode(sumassured), 6) ^
            Integer.rotateLeft(lifeassured.hashCode(), 7) ^
            Integer.rotateLeft(paddingdata.hashCode(), 8);
    }
    
    @Override
    public int compareTo(Genasa1Endowment that) {
        int c = 0;
        c = Integer.compare(this.policynumber, that.policynumber);
        if ( c != 0 ) return c;
        c = this.equities.compareTo(that.equities);
        if ( c != 0 ) return c;
        c = this.withprofits.compareTo(that.withprofits);
        if ( c != 0 ) return c;
        c = this.managedfund.compareTo(that.managedfund);
        if ( c != 0 ) return c;
        c = this.fundname.compareTo(that.fundname);
        if ( c != 0 ) return c;
        c = Integer.compare(this.term, that.term);
        if ( c != 0 ) return c;
        c = Integer.compare(this.sumassured, that.sumassured);
        if ( c != 0 ) return c;
        c = this.lifeassured.compareTo(that.lifeassured);
        if ( c != 0 ) return c;
        c = this.paddingdata.compareTo(that.paddingdata);
        return c;
    }
    
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final ExternalDecimalAsIntField POLICYNUMBER = factory.getExternalDecimalAsIntField(5, true);
    private static final StringField EQUITIES = factory.getStringField(2);
    private static final StringField WITHPROFITS = factory.getStringField(2);
    private static final StringField MANAGEDFUND = factory.getStringField(2);
    private static final StringField FUNDNAME = factory.getStringField(11);
    private static final ExternalDecimalAsIntField TERM = factory.getExternalDecimalAsIntField(3, true);
    private static final ExternalDecimalAsIntField SUMASSURED = factory.getExternalDecimalAsIntField(5, true);
    private static final StringField LIFEASSURED = factory.getStringField(32);
    private static final StringField PADDINGDATA = factory.getStringField(2000);
    public static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    public byte[] getBytes(byte[] bytes, int offset) {
        POLICYNUMBER.putInt(policynumber, bytes, offset);
        EQUITIES.putString(equities, bytes, offset);
        WITHPROFITS.putString(withprofits, bytes, offset);
        MANAGEDFUND.putString(managedfund, bytes, offset);
        FUNDNAME.putString(fundname, bytes, offset);
        TERM.putInt(term, bytes, offset);
        SUMASSURED.putInt(sumassured, bytes, offset);
        LIFEASSURED.putString(lifeassured, bytes, offset);
        PADDINGDATA.putString(paddingdata, bytes, offset);
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
        equities = EQUITIES.getString(bytes, offset);
        withprofits = WITHPROFITS.getString(bytes, offset);
        managedfund = MANAGEDFUND.getString(bytes, offset);
        fundname = FUNDNAME.getString(bytes, offset);
        term = TERM.getInt(bytes, offset);
        sumassured = SUMASSURED.getInt(bytes, offset);
        lifeassured = LIFEASSURED.getString(bytes, offset);
        paddingdata = PADDINGDATA.getString(bytes, offset);
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
