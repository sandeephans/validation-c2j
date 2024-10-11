package com.ibm.wcaz.implementation;

import com.ibm.jzos.fields.CobolDatatypeFactory;
import com.ibm.jzos.fields.ExternalDecimalAsIntField;
import com.ibm.jzos.fields.StringField;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CaCommercial extends CaPolicyRequest {
    private String caBAddress = "";
    private String caBPostcode = "";
    private String caBLatitude = "";
    private String caBLongitude = "";
    private String caBCustomer = "";
    private String caBPropType = "";
    private int caBFirePeril;
    private int caBFirePremium;
    private int caBCrimePeril;
    private int caBCrimePremium;
    private int caBFloodPeril;
    private int caBFloodPremium;
    private int caBWeatherPeril;
    private int caBWeatherPremium;
    private int caBStatus;
    private String caBRejectReason = "";
    private String caBFiller = "";
    
    public CaCommercial() {}
    
    public CaCommercial(String caRequestId, int caReturnCode, long caCustomerNum, long caPolicyNum, CaPolicyCommon caPolicyCommon, String caBAddress, String caBPostcode, String caBLatitude, String caBLongitude, String caBCustomer, String caBPropType, int caBFirePeril, int caBFirePremium, int caBCrimePeril, int caBCrimePremium, int caBFloodPeril, int caBFloodPremium, int caBWeatherPeril, int caBWeatherPremium, int caBStatus, String caBRejectReason, String caBFiller) {
        super(caRequestId, caReturnCode, caCustomerNum, caPolicyNum, caPolicyCommon);
        this.caBAddress = caBAddress;
        this.caBPostcode = caBPostcode;
        this.caBLatitude = caBLatitude;
        this.caBLongitude = caBLongitude;
        this.caBCustomer = caBCustomer;
        this.caBPropType = caBPropType;
        this.caBFirePeril = caBFirePeril;
        this.caBFirePremium = caBFirePremium;
        this.caBCrimePeril = caBCrimePeril;
        this.caBCrimePremium = caBCrimePremium;
        this.caBFloodPeril = caBFloodPeril;
        this.caBFloodPremium = caBFloodPremium;
        this.caBWeatherPeril = caBWeatherPeril;
        this.caBWeatherPremium = caBWeatherPremium;
        this.caBStatus = caBStatus;
        this.caBRejectReason = caBRejectReason;
        this.caBFiller = caBFiller;
    }
    
    public CaCommercial(CaCommercial that) {
        super(that);
        this.caBAddress = that.caBAddress;
        this.caBPostcode = that.caBPostcode;
        this.caBLatitude = that.caBLatitude;
        this.caBLongitude = that.caBLongitude;
        this.caBCustomer = that.caBCustomer;
        this.caBPropType = that.caBPropType;
        this.caBFirePeril = that.caBFirePeril;
        this.caBFirePremium = that.caBFirePremium;
        this.caBCrimePeril = that.caBCrimePeril;
        this.caBCrimePremium = that.caBCrimePremium;
        this.caBFloodPeril = that.caBFloodPeril;
        this.caBFloodPremium = that.caBFloodPremium;
        this.caBWeatherPeril = that.caBWeatherPeril;
        this.caBWeatherPremium = that.caBWeatherPremium;
        this.caBStatus = that.caBStatus;
        this.caBRejectReason = that.caBRejectReason;
        this.caBFiller = that.caBFiller;
    }
    
    protected CaCommercial(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected CaCommercial(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static CaCommercial fromBytes(byte[] bytes, int offset) {
        return new CaCommercial(bytes, offset);
    }
    
    public static CaCommercial fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static CaCommercial fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String getCaBAddress() {
        return this.caBAddress;
    }
    
    public void setCaBAddress(String caBAddress) {
        this.caBAddress = caBAddress;
    }
    
    public String getCaBPostcode() {
        return this.caBPostcode;
    }
    
    public void setCaBPostcode(String caBPostcode) {
        this.caBPostcode = caBPostcode;
    }
    
    public String getCaBLatitude() {
        return this.caBLatitude;
    }
    
    public void setCaBLatitude(String caBLatitude) {
        this.caBLatitude = caBLatitude;
    }
    
    public String getCaBLongitude() {
        return this.caBLongitude;
    }
    
    public void setCaBLongitude(String caBLongitude) {
        this.caBLongitude = caBLongitude;
    }
    
    public String getCaBCustomer() {
        return this.caBCustomer;
    }
    
    public void setCaBCustomer(String caBCustomer) {
        this.caBCustomer = caBCustomer;
    }
    
    public String getCaBPropType() {
        return this.caBPropType;
    }
    
    public void setCaBPropType(String caBPropType) {
        this.caBPropType = caBPropType;
    }
    
    public int getCaBFirePeril() {
        return this.caBFirePeril;
    }
    
    public void setCaBFirePeril(int caBFirePeril) {
        this.caBFirePeril = caBFirePeril;
    }
    
    public int getCaBFirePremium() {
        return this.caBFirePremium;
    }
    
    public void setCaBFirePremium(int caBFirePremium) {
        this.caBFirePremium = caBFirePremium;
    }
    
    public int getCaBCrimePeril() {
        return this.caBCrimePeril;
    }
    
    public void setCaBCrimePeril(int caBCrimePeril) {
        this.caBCrimePeril = caBCrimePeril;
    }
    
    public int getCaBCrimePremium() {
        return this.caBCrimePremium;
    }
    
    public void setCaBCrimePremium(int caBCrimePremium) {
        this.caBCrimePremium = caBCrimePremium;
    }
    
    public int getCaBFloodPeril() {
        return this.caBFloodPeril;
    }
    
    public void setCaBFloodPeril(int caBFloodPeril) {
        this.caBFloodPeril = caBFloodPeril;
    }
    
    public int getCaBFloodPremium() {
        return this.caBFloodPremium;
    }
    
    public void setCaBFloodPremium(int caBFloodPremium) {
        this.caBFloodPremium = caBFloodPremium;
    }
    
    public int getCaBWeatherPeril() {
        return this.caBWeatherPeril;
    }
    
    public void setCaBWeatherPeril(int caBWeatherPeril) {
        this.caBWeatherPeril = caBWeatherPeril;
    }
    
    public int getCaBWeatherPremium() {
        return this.caBWeatherPremium;
    }
    
    public void setCaBWeatherPremium(int caBWeatherPremium) {
        this.caBWeatherPremium = caBWeatherPremium;
    }
    
    public int getCaBStatus() {
        return this.caBStatus;
    }
    
    public void setCaBStatus(int caBStatus) {
        this.caBStatus = caBStatus;
    }
    
    public String getCaBRejectReason() {
        return this.caBRejectReason;
    }
    
    public void setCaBRejectReason(String caBRejectReason) {
        this.caBRejectReason = caBRejectReason;
    }
    
    public String getCaBFiller() {
        return this.caBFiller;
    }
    
    public void setCaBFiller(String caBFiller) {
        this.caBFiller = caBFiller;
    }
    public void reset() {
        super.reset();
        caBAddress = "";
        caBPostcode = "";
        caBLatitude = "";
        caBLongitude = "";
        caBCustomer = "";
        caBPropType = "";
        caBFirePeril = 0;
        caBFirePremium = 0;
        caBCrimePeril = 0;
        caBCrimePremium = 0;
        caBFloodPeril = 0;
        caBFloodPremium = 0;
        caBWeatherPeril = 0;
        caBWeatherPremium = 0;
        caBStatus = 0;
        caBRejectReason = "";
        caBFiller = "";
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder(super.toString());
        s.append("{ caBAddress=\"");
        s.append(getCaBAddress());
        s.append("\"");
        s.append(", caBPostcode=\"");
        s.append(getCaBPostcode());
        s.append("\"");
        s.append(", caBLatitude=\"");
        s.append(getCaBLatitude());
        s.append("\"");
        s.append(", caBLongitude=\"");
        s.append(getCaBLongitude());
        s.append("\"");
        s.append(", caBCustomer=\"");
        s.append(getCaBCustomer());
        s.append("\"");
        s.append(", caBPropType=\"");
        s.append(getCaBPropType());
        s.append("\"");
        s.append(", caBFirePeril=\"");
        s.append(getCaBFirePeril());
        s.append("\"");
        s.append(", caBFirePremium=\"");
        s.append(getCaBFirePremium());
        s.append("\"");
        s.append(", caBCrimePeril=\"");
        s.append(getCaBCrimePeril());
        s.append("\"");
        s.append(", caBCrimePremium=\"");
        s.append(getCaBCrimePremium());
        s.append("\"");
        s.append(", caBFloodPeril=\"");
        s.append(getCaBFloodPeril());
        s.append("\"");
        s.append(", caBFloodPremium=\"");
        s.append(getCaBFloodPremium());
        s.append("\"");
        s.append(", caBWeatherPeril=\"");
        s.append(getCaBWeatherPeril());
        s.append("\"");
        s.append(", caBWeatherPremium=\"");
        s.append(getCaBWeatherPremium());
        s.append("\"");
        s.append(", caBStatus=\"");
        s.append(getCaBStatus());
        s.append("\"");
        s.append(", caBRejectReason=\"");
        s.append(getCaBRejectReason());
        s.append("\"");
        s.append(", caBFiller=\"");
        s.append(getCaBFiller());
        s.append("\"");
        s.append("}");
        return s.toString();
    }
    
    public boolean equals(CaCommercial that) {
        return super.equals(that) &&
            this.caBAddress.equals(that.caBAddress) &&
            this.caBPostcode.equals(that.caBPostcode) &&
            this.caBLatitude.equals(that.caBLatitude) &&
            this.caBLongitude.equals(that.caBLongitude) &&
            this.caBCustomer.equals(that.caBCustomer) &&
            this.caBPropType.equals(that.caBPropType) &&
            this.caBFirePeril == that.caBFirePeril &&
            this.caBFirePremium == that.caBFirePremium &&
            this.caBCrimePeril == that.caBCrimePeril &&
            this.caBCrimePremium == that.caBCrimePremium &&
            this.caBFloodPeril == that.caBFloodPeril &&
            this.caBFloodPremium == that.caBFloodPremium &&
            this.caBWeatherPeril == that.caBWeatherPeril &&
            this.caBWeatherPremium == that.caBWeatherPremium &&
            this.caBStatus == that.caBStatus &&
            this.caBRejectReason.equals(that.caBRejectReason) &&
            this.caBFiller.equals(that.caBFiller);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof CaCommercial) && this.equals((CaCommercial)that);
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^
            Integer.rotateLeft(caBAddress.hashCode(), 5) ^
            Integer.rotateLeft(caBPostcode.hashCode(), 6) ^
            Integer.rotateLeft(caBLatitude.hashCode(), 7) ^
            Integer.rotateLeft(caBLongitude.hashCode(), 8) ^
            Integer.rotateLeft(caBCustomer.hashCode(), 9) ^
            Integer.rotateLeft(caBPropType.hashCode(), 10) ^
            Integer.rotateLeft(Integer.hashCode(caBFirePeril), 11) ^
            Integer.rotateLeft(Integer.hashCode(caBFirePremium), 12) ^
            Integer.rotateLeft(Integer.hashCode(caBCrimePeril), 13) ^
            Integer.rotateLeft(Integer.hashCode(caBCrimePremium), 14) ^
            Integer.rotateLeft(Integer.hashCode(caBFloodPeril), 15) ^
            Integer.rotateLeft(Integer.hashCode(caBFloodPremium), 16) ^
            Integer.rotateLeft(Integer.hashCode(caBWeatherPeril), 17) ^
            Integer.rotateLeft(Integer.hashCode(caBWeatherPremium), 18) ^
            Integer.rotateLeft(Integer.hashCode(caBStatus), 19) ^
            Integer.rotateLeft(caBRejectReason.hashCode(), 20) ^
            Integer.rotateLeft(caBFiller.hashCode(), 21);
    }
    
    public int compareTo(CaCommercial that) {
        int c = 0;
        c = super.compareTo(that);
        if ( c != 0 ) return c;
        c = this.caBAddress.compareTo(that.caBAddress);
        if ( c != 0 ) return c;
        c = this.caBPostcode.compareTo(that.caBPostcode);
        if ( c != 0 ) return c;
        c = this.caBLatitude.compareTo(that.caBLatitude);
        if ( c != 0 ) return c;
        c = this.caBLongitude.compareTo(that.caBLongitude);
        if ( c != 0 ) return c;
        c = this.caBCustomer.compareTo(that.caBCustomer);
        if ( c != 0 ) return c;
        c = this.caBPropType.compareTo(that.caBPropType);
        if ( c != 0 ) return c;
        c = Integer.compare(this.caBFirePeril, that.caBFirePeril);
        if ( c != 0 ) return c;
        c = Integer.compare(this.caBFirePremium, that.caBFirePremium);
        if ( c != 0 ) return c;
        c = Integer.compare(this.caBCrimePeril, that.caBCrimePeril);
        if ( c != 0 ) return c;
        c = Integer.compare(this.caBCrimePremium, that.caBCrimePremium);
        if ( c != 0 ) return c;
        c = Integer.compare(this.caBFloodPeril, that.caBFloodPeril);
        if ( c != 0 ) return c;
        c = Integer.compare(this.caBFloodPremium, that.caBFloodPremium);
        if ( c != 0 ) return c;
        c = Integer.compare(this.caBWeatherPeril, that.caBWeatherPeril);
        if ( c != 0 ) return c;
        c = Integer.compare(this.caBWeatherPremium, that.caBWeatherPremium);
        if ( c != 0 ) return c;
        c = Integer.compare(this.caBStatus, that.caBStatus);
        if ( c != 0 ) return c;
        c = this.caBRejectReason.compareTo(that.caBRejectReason);
        if ( c != 0 ) return c;
        c = this.caBFiller.compareTo(that.caBFiller);
        return c;
    }
    
    @Override
    public int compareTo(Dfhcommarea1 that) {
        if (that instanceof CaCommercial) {
            return this.compareTo((CaCommercial)that);
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
    
    private static final StringField CA_B_ADDRESS = factory.getStringField(255);
    private static final StringField CA_B_POSTCODE = factory.getStringField(8);
    private static final StringField CA_B_LATITUDE = factory.getStringField(11);
    private static final StringField CA_B_LONGITUDE = factory.getStringField(11);
    private static final StringField CA_B_CUSTOMER = factory.getStringField(255);
    private static final StringField CA_B_PROP_TYPE = factory.getStringField(255);
    private static final ExternalDecimalAsIntField CA_B_FIRE_PERIL = factory.getExternalDecimalAsIntField(4, true);
    private static final ExternalDecimalAsIntField CA_B_FIRE_PREMIUM = factory.getExternalDecimalAsIntField(8, true);
    private static final ExternalDecimalAsIntField CA_B_CRIME_PERIL = factory.getExternalDecimalAsIntField(4, true);
    private static final ExternalDecimalAsIntField CA_B_CRIME_PREMIUM = factory.getExternalDecimalAsIntField(8, true);
    private static final ExternalDecimalAsIntField CA_B_FLOOD_PERIL = factory.getExternalDecimalAsIntField(4, true);
    private static final ExternalDecimalAsIntField CA_B_FLOOD_PREMIUM = factory.getExternalDecimalAsIntField(8, true);
    private static final ExternalDecimalAsIntField CA_B_WEATHER_PERIL = factory.getExternalDecimalAsIntField(4, true);
    private static final ExternalDecimalAsIntField CA_B_WEATHER_PREMIUM = factory.getExternalDecimalAsIntField(8, true);
    private static final ExternalDecimalAsIntField CA_B_STATUS = factory.getExternalDecimalAsIntField(4, true);
    private static final StringField CA_B_REJECT_REASON = factory.getStringField(255);
    private static final StringField CA_B_FILLER = factory.getStringField(31298);
    public static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    public byte[] getBytes(byte[] bytes, int offset) {
        super.getBytes(bytes, offset);
        CA_B_ADDRESS.putString(caBAddress, bytes, offset);
        CA_B_POSTCODE.putString(caBPostcode, bytes, offset);
        CA_B_LATITUDE.putString(caBLatitude, bytes, offset);
        CA_B_LONGITUDE.putString(caBLongitude, bytes, offset);
        CA_B_CUSTOMER.putString(caBCustomer, bytes, offset);
        CA_B_PROP_TYPE.putString(caBPropType, bytes, offset);
        CA_B_FIRE_PERIL.putInt(caBFirePeril, bytes, offset);
        CA_B_FIRE_PREMIUM.putInt(caBFirePremium, bytes, offset);
        CA_B_CRIME_PERIL.putInt(caBCrimePeril, bytes, offset);
        CA_B_CRIME_PREMIUM.putInt(caBCrimePremium, bytes, offset);
        CA_B_FLOOD_PERIL.putInt(caBFloodPeril, bytes, offset);
        CA_B_FLOOD_PREMIUM.putInt(caBFloodPremium, bytes, offset);
        CA_B_WEATHER_PERIL.putInt(caBWeatherPeril, bytes, offset);
        CA_B_WEATHER_PREMIUM.putInt(caBWeatherPremium, bytes, offset);
        CA_B_STATUS.putInt(caBStatus, bytes, offset);
        CA_B_REJECT_REASON.putString(caBRejectReason, bytes, offset);
        CA_B_FILLER.putString(caBFiller, bytes, offset);
        return bytes;
    }
    
    public void setBytes(byte[] bytes, int offset) {
        if (bytes.length < SIZE + offset) {
            byte[] newBytes = Arrays.copyOf(bytes, SIZE + offset);
            Arrays.fill(newBytes, bytes.length, SIZE + offset, (byte)0x40 /*default EBCDIC space character*/);
            bytes = newBytes;
        }
        super.setBytes(bytes, offset);
        caBAddress = CA_B_ADDRESS.getString(bytes, offset);
        caBPostcode = CA_B_POSTCODE.getString(bytes, offset);
        caBLatitude = CA_B_LATITUDE.getString(bytes, offset);
        caBLongitude = CA_B_LONGITUDE.getString(bytes, offset);
        caBCustomer = CA_B_CUSTOMER.getString(bytes, offset);
        caBPropType = CA_B_PROP_TYPE.getString(bytes, offset);
        caBFirePeril = CA_B_FIRE_PERIL.getInt(bytes, offset);
        caBFirePremium = CA_B_FIRE_PREMIUM.getInt(bytes, offset);
        caBCrimePeril = CA_B_CRIME_PERIL.getInt(bytes, offset);
        caBCrimePremium = CA_B_CRIME_PREMIUM.getInt(bytes, offset);
        caBFloodPeril = CA_B_FLOOD_PERIL.getInt(bytes, offset);
        caBFloodPremium = CA_B_FLOOD_PREMIUM.getInt(bytes, offset);
        caBWeatherPeril = CA_B_WEATHER_PERIL.getInt(bytes, offset);
        caBWeatherPremium = CA_B_WEATHER_PREMIUM.getInt(bytes, offset);
        caBStatus = CA_B_STATUS.getInt(bytes, offset);
        caBRejectReason = CA_B_REJECT_REASON.getString(bytes, offset);
        caBFiller = CA_B_FILLER.getString(bytes, offset);
    }
    
    public int numBytes() {
        return SIZE;
    }
    
}
