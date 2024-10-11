package com.ibm.wcaz.implementation;

import com.ibm.jzos.fields.CobolDatatypeFactory;
import com.ibm.jzos.fields.ExternalDecimalAsIntField;
import com.ibm.jzos.fields.StringField;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CaEndowment extends CaPolicyRequest {
    private char caEWithProfits = ' ';
    private char caEEquities = ' ';
    private char caEManagedFund = ' ';
    private String caEFundName = "";
    private int caETerm;
    private int caESumAssured;
    private String caELifeAssured = "";
    private String caEPaddingData = "";
    
    public CaEndowment() {}
    
    public CaEndowment(String caRequestId, int caReturnCode, long caCustomerNum, long caPolicyNum, CaPolicyCommon caPolicyCommon, char caEWithProfits, char caEEquities, char caEManagedFund, String caEFundName, int caETerm, int caESumAssured, String caELifeAssured, String caEPaddingData) {
        super(caRequestId, caReturnCode, caCustomerNum, caPolicyNum, caPolicyCommon);
        this.caEWithProfits = caEWithProfits;
        this.caEEquities = caEEquities;
        this.caEManagedFund = caEManagedFund;
        this.caEFundName = caEFundName;
        this.caETerm = caETerm;
        this.caESumAssured = caESumAssured;
        this.caELifeAssured = caELifeAssured;
        this.caEPaddingData = caEPaddingData;
    }
    
    public CaEndowment(CaEndowment that) {
        super(that);
        this.caEWithProfits = that.caEWithProfits;
        this.caEEquities = that.caEEquities;
        this.caEManagedFund = that.caEManagedFund;
        this.caEFundName = that.caEFundName;
        this.caETerm = that.caETerm;
        this.caESumAssured = that.caESumAssured;
        this.caELifeAssured = that.caELifeAssured;
        this.caEPaddingData = that.caEPaddingData;
    }
    
    protected CaEndowment(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected CaEndowment(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static CaEndowment fromBytes(byte[] bytes, int offset) {
        return new CaEndowment(bytes, offset);
    }
    
    public static CaEndowment fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static CaEndowment fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public char getCaEWithProfits() {
        return this.caEWithProfits;
    }
    
    public void setCaEWithProfits(char caEWithProfits) {
        this.caEWithProfits = caEWithProfits;
    }
    
    public char getCaEEquities() {
        return this.caEEquities;
    }
    
    public void setCaEEquities(char caEEquities) {
        this.caEEquities = caEEquities;
    }
    
    public char getCaEManagedFund() {
        return this.caEManagedFund;
    }
    
    public void setCaEManagedFund(char caEManagedFund) {
        this.caEManagedFund = caEManagedFund;
    }
    
    public String getCaEFundName() {
        return this.caEFundName;
    }
    
    public void setCaEFundName(String caEFundName) {
        this.caEFundName = caEFundName;
    }
    
    public int getCaETerm() {
        return this.caETerm;
    }
    
    public void setCaETerm(int caETerm) {
        this.caETerm = caETerm;
    }
    
    public int getCaESumAssured() {
        return this.caESumAssured;
    }
    
    public void setCaESumAssured(int caESumAssured) {
        this.caESumAssured = caESumAssured;
    }
    
    public String getCaELifeAssured() {
        return this.caELifeAssured;
    }
    
    public void setCaELifeAssured(String caELifeAssured) {
        this.caELifeAssured = caELifeAssured;
    }
    
    public String getCaEPaddingData() {
        return this.caEPaddingData;
    }
    
    public void setCaEPaddingData(String caEPaddingData) {
        this.caEPaddingData = caEPaddingData;
    }
    public void reset() {
        super.reset();
        caEWithProfits = ' ';
        caEEquities = ' ';
        caEManagedFund = ' ';
        caEFundName = "";
        caETerm = 0;
        caESumAssured = 0;
        caELifeAssured = "";
        caEPaddingData = "";
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder(super.toString());
        s.append("{ caEWithProfits=\"");
        s.append(getCaEWithProfits());
        s.append("\"");
        s.append(", caEEquities=\"");
        s.append(getCaEEquities());
        s.append("\"");
        s.append(", caEManagedFund=\"");
        s.append(getCaEManagedFund());
        s.append("\"");
        s.append(", caEFundName=\"");
        s.append(getCaEFundName());
        s.append("\"");
        s.append(", caETerm=\"");
        s.append(getCaETerm());
        s.append("\"");
        s.append(", caESumAssured=\"");
        s.append(getCaESumAssured());
        s.append("\"");
        s.append(", caELifeAssured=\"");
        s.append(getCaELifeAssured());
        s.append("\"");
        s.append(", caEPaddingData=\"");
        s.append(getCaEPaddingData());
        s.append("\"");
        s.append("}");
        return s.toString();
    }
    
    public boolean equals(CaEndowment that) {
        return super.equals(that) &&
            this.caEWithProfits == that.caEWithProfits &&
            this.caEEquities == that.caEEquities &&
            this.caEManagedFund == that.caEManagedFund &&
            this.caEFundName.equals(that.caEFundName) &&
            this.caETerm == that.caETerm &&
            this.caESumAssured == that.caESumAssured &&
            this.caELifeAssured.equals(that.caELifeAssured) &&
            this.caEPaddingData.equals(that.caEPaddingData);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof CaEndowment) && this.equals((CaEndowment)that);
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^
            Integer.rotateLeft(Character.hashCode(caEWithProfits), 5) ^
            Integer.rotateLeft(Character.hashCode(caEEquities), 6) ^
            Integer.rotateLeft(Character.hashCode(caEManagedFund), 7) ^
            Integer.rotateLeft(caEFundName.hashCode(), 8) ^
            Integer.rotateLeft(Integer.hashCode(caETerm), 9) ^
            Integer.rotateLeft(Integer.hashCode(caESumAssured), 10) ^
            Integer.rotateLeft(caELifeAssured.hashCode(), 11) ^
            Integer.rotateLeft(caEPaddingData.hashCode(), 12);
    }
    
    public int compareTo(CaEndowment that) {
        int c = 0;
        c = super.compareTo(that);
        if ( c != 0 ) return c;
        c = Character.compare(this.caEWithProfits, that.caEWithProfits);
        if ( c != 0 ) return c;
        c = Character.compare(this.caEEquities, that.caEEquities);
        if ( c != 0 ) return c;
        c = Character.compare(this.caEManagedFund, that.caEManagedFund);
        if ( c != 0 ) return c;
        c = this.caEFundName.compareTo(that.caEFundName);
        if ( c != 0 ) return c;
        c = Integer.compare(this.caETerm, that.caETerm);
        if ( c != 0 ) return c;
        c = Integer.compare(this.caESumAssured, that.caESumAssured);
        if ( c != 0 ) return c;
        c = this.caELifeAssured.compareTo(that.caELifeAssured);
        if ( c != 0 ) return c;
        c = this.caEPaddingData.compareTo(that.caEPaddingData);
        return c;
    }
    
    @Override
    public int compareTo(Dfhcommarea1 that) {
        if (that instanceof CaEndowment) {
            return this.compareTo((CaEndowment)that);
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
    
    private static final StringField CA_E_WITH_PROFITS = factory.getStringField(1, false);
    private static final StringField CA_E_EQUITIES = factory.getStringField(1, false);
    private static final StringField CA_E_MANAGED_FUND = factory.getStringField(1, false);
    private static final StringField CA_E_FUND_NAME = factory.getStringField(10);
    private static final ExternalDecimalAsIntField CA_E_TERM = factory.getExternalDecimalAsIntField(2, true);
    private static final ExternalDecimalAsIntField CA_E_SUM_ASSURED = factory.getExternalDecimalAsIntField(6, true);
    private static final StringField CA_E_LIFE_ASSURED = factory.getStringField(31);
    private static final StringField CA_E_PADDING_DATA = factory.getStringField(32348);
    public static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    public byte[] getBytes(byte[] bytes, int offset) {
        super.getBytes(bytes, offset);
        CA_E_WITH_PROFITS.putString(Character.toString(caEWithProfits), bytes, offset);
        CA_E_EQUITIES.putString(Character.toString(caEEquities), bytes, offset);
        CA_E_MANAGED_FUND.putString(Character.toString(caEManagedFund), bytes, offset);
        CA_E_FUND_NAME.putString(caEFundName, bytes, offset);
        CA_E_TERM.putInt(caETerm, bytes, offset);
        CA_E_SUM_ASSURED.putInt(caESumAssured, bytes, offset);
        CA_E_LIFE_ASSURED.putString(caELifeAssured, bytes, offset);
        CA_E_PADDING_DATA.putString(caEPaddingData, bytes, offset);
        return bytes;
    }
    
    public void setBytes(byte[] bytes, int offset) {
        if (bytes.length < SIZE + offset) {
            byte[] newBytes = Arrays.copyOf(bytes, SIZE + offset);
            Arrays.fill(newBytes, bytes.length, SIZE + offset, (byte)0x40 /*default EBCDIC space character*/);
            bytes = newBytes;
        }
        super.setBytes(bytes, offset);
        caEWithProfits = CA_E_WITH_PROFITS.getString(bytes, offset).charAt(0);
        caEEquities = CA_E_EQUITIES.getString(bytes, offset).charAt(0);
        caEManagedFund = CA_E_MANAGED_FUND.getString(bytes, offset).charAt(0);
        caEFundName = CA_E_FUND_NAME.getString(bytes, offset);
        caETerm = CA_E_TERM.getInt(bytes, offset);
        caESumAssured = CA_E_SUM_ASSURED.getInt(bytes, offset);
        caELifeAssured = CA_E_LIFE_ASSURED.getString(bytes, offset);
        caEPaddingData = CA_E_PADDING_DATA.getString(bytes, offset);
    }
    
    public int numBytes() {
        return SIZE;
    }
    
}
