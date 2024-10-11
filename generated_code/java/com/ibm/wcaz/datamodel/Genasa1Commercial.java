package com.ibm.wcaz.datamodel;

import com.ibm.jzos.fields.CobolDatatypeFactory;
import com.ibm.jzos.fields.ExternalDecimalAsIntField;
import com.ibm.jzos.fields.StringField;
import java.io.UnsupportedEncodingException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Genasa1Commercial implements Comparable<Genasa1Commercial> {
    private int policynumber;
    private Date requestdate = new Date(0);
    private Date startdate = new Date(0);
    private Date renewaldate = new Date(0);
    private String address = "";
    private String zipcode = "";
    private String latituden = "";
    private String longitudew = "";
    private String customer = "";
    private String propertytype = "";
    private int fireperil;
    private int firepremium;
    private int crimeperil;
    private int crimepremium;
    private int floodperil;
    private int floodpremium;
    private int weatherperil;
    private int weatherpremium;
    private int status;
    private String rejectionreason = "";
    
    public Genasa1Commercial() {}
    
    public Genasa1Commercial(int policynumber, Date requestdate, Date startdate, Date renewaldate, String address, String zipcode, String latituden, String longitudew, String customer, String propertytype, int fireperil, int firepremium, int crimeperil, int crimepremium, int floodperil, int floodpremium, int weatherperil, int weatherpremium, int status, String rejectionreason) {
        this.policynumber = policynumber;
        this.requestdate = requestdate;
        this.startdate = startdate;
        this.renewaldate = renewaldate;
        this.address = address;
        this.zipcode = zipcode;
        this.latituden = latituden;
        this.longitudew = longitudew;
        this.customer = customer;
        this.propertytype = propertytype;
        this.fireperil = fireperil;
        this.firepremium = firepremium;
        this.crimeperil = crimeperil;
        this.crimepremium = crimepremium;
        this.floodperil = floodperil;
        this.floodpremium = floodpremium;
        this.weatherperil = weatherperil;
        this.weatherpremium = weatherpremium;
        this.status = status;
        this.rejectionreason = rejectionreason;
    }
    
    public Genasa1Commercial(Genasa1Commercial that) {
        this.policynumber = that.policynumber;
        this.requestdate = that.requestdate;
        this.startdate = that.startdate;
        this.renewaldate = that.renewaldate;
        this.address = that.address;
        this.zipcode = that.zipcode;
        this.latituden = that.latituden;
        this.longitudew = that.longitudew;
        this.customer = that.customer;
        this.propertytype = that.propertytype;
        this.fireperil = that.fireperil;
        this.firepremium = that.firepremium;
        this.crimeperil = that.crimeperil;
        this.crimepremium = that.crimepremium;
        this.floodperil = that.floodperil;
        this.floodpremium = that.floodpremium;
        this.weatherperil = that.weatherperil;
        this.weatherpremium = that.weatherpremium;
        this.status = that.status;
        this.rejectionreason = that.rejectionreason;
    }
    
    protected Genasa1Commercial(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected Genasa1Commercial(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static Genasa1Commercial fromBytes(byte[] bytes, int offset) {
        return new Genasa1Commercial(bytes, offset);
    }
    
    public static Genasa1Commercial fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static Genasa1Commercial fromBytes(String bytes) {
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
    
    public Date getRequestdate() {
        return this.requestdate;
    }
    
    public void setRequestdate(Date requestdate) {
        this.requestdate = requestdate;
    }
    
    public Date getStartdate() {
        return this.startdate;
    }
    
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }
    
    public Date getRenewaldate() {
        return this.renewaldate;
    }
    
    public void setRenewaldate(Date renewaldate) {
        this.renewaldate = renewaldate;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getZipcode() {
        return this.zipcode;
    }
    
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    
    public String getLatituden() {
        return this.latituden;
    }
    
    public void setLatituden(String latituden) {
        this.latituden = latituden;
    }
    
    public String getLongitudew() {
        return this.longitudew;
    }
    
    public void setLongitudew(String longitudew) {
        this.longitudew = longitudew;
    }
    
    public String getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(String customer) {
        this.customer = customer;
    }
    
    public String getPropertytype() {
        return this.propertytype;
    }
    
    public void setPropertytype(String propertytype) {
        this.propertytype = propertytype;
    }
    
    public int getFireperil() {
        return this.fireperil;
    }
    
    public void setFireperil(int fireperil) {
        this.fireperil = fireperil;
    }
    
    public int getFirepremium() {
        return this.firepremium;
    }
    
    public void setFirepremium(int firepremium) {
        this.firepremium = firepremium;
    }
    
    public int getCrimeperil() {
        return this.crimeperil;
    }
    
    public void setCrimeperil(int crimeperil) {
        this.crimeperil = crimeperil;
    }
    
    public int getCrimepremium() {
        return this.crimepremium;
    }
    
    public void setCrimepremium(int crimepremium) {
        this.crimepremium = crimepremium;
    }
    
    public int getFloodperil() {
        return this.floodperil;
    }
    
    public void setFloodperil(int floodperil) {
        this.floodperil = floodperil;
    }
    
    public int getFloodpremium() {
        return this.floodpremium;
    }
    
    public void setFloodpremium(int floodpremium) {
        this.floodpremium = floodpremium;
    }
    
    public int getWeatherperil() {
        return this.weatherperil;
    }
    
    public void setWeatherperil(int weatherperil) {
        this.weatherperil = weatherperil;
    }
    
    public int getWeatherpremium() {
        return this.weatherpremium;
    }
    
    public void setWeatherpremium(int weatherpremium) {
        this.weatherpremium = weatherpremium;
    }
    
    public int getStatus() {
        return this.status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }
    
    public String getRejectionreason() {
        return this.rejectionreason;
    }
    
    public void setRejectionreason(String rejectionreason) {
        this.rejectionreason = rejectionreason;
    }
    public void reset() {
        policynumber = 0;
        requestdate = new Date(0);
        startdate = new Date(0);
        renewaldate = new Date(0);
        address = "";
        zipcode = "";
        latituden = "";
        longitudew = "";
        customer = "";
        propertytype = "";
        fireperil = 0;
        firepremium = 0;
        crimeperil = 0;
        crimepremium = 0;
        floodperil = 0;
        floodpremium = 0;
        weatherperil = 0;
        weatherpremium = 0;
        status = 0;
        rejectionreason = "";
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ policynumber=\"");
        s.append(getPolicynumber());
        s.append("\"");
        s.append(", requestdate=\"");
        s.append(getRequestdate());
        s.append("\"");
        s.append(", startdate=\"");
        s.append(getStartdate());
        s.append("\"");
        s.append(", renewaldate=\"");
        s.append(getRenewaldate());
        s.append("\"");
        s.append(", address=\"");
        s.append(getAddress());
        s.append("\"");
        s.append(", zipcode=\"");
        s.append(getZipcode());
        s.append("\"");
        s.append(", latituden=\"");
        s.append(getLatituden());
        s.append("\"");
        s.append(", longitudew=\"");
        s.append(getLongitudew());
        s.append("\"");
        s.append(", customer=\"");
        s.append(getCustomer());
        s.append("\"");
        s.append(", propertytype=\"");
        s.append(getPropertytype());
        s.append("\"");
        s.append(", fireperil=\"");
        s.append(getFireperil());
        s.append("\"");
        s.append(", firepremium=\"");
        s.append(getFirepremium());
        s.append("\"");
        s.append(", crimeperil=\"");
        s.append(getCrimeperil());
        s.append("\"");
        s.append(", crimepremium=\"");
        s.append(getCrimepremium());
        s.append("\"");
        s.append(", floodperil=\"");
        s.append(getFloodperil());
        s.append("\"");
        s.append(", floodpremium=\"");
        s.append(getFloodpremium());
        s.append("\"");
        s.append(", weatherperil=\"");
        s.append(getWeatherperil());
        s.append("\"");
        s.append(", weatherpremium=\"");
        s.append(getWeatherpremium());
        s.append("\"");
        s.append(", status=\"");
        s.append(getStatus());
        s.append("\"");
        s.append(", rejectionreason=\"");
        s.append(getRejectionreason());
        s.append("\"");
        s.append("}");
        return s.toString();
    }
    
    public boolean equals(Genasa1Commercial that) {
        return this.policynumber == that.policynumber &&
            this.requestdate.equals(that.requestdate) &&
            this.startdate.equals(that.startdate) &&
            this.renewaldate.equals(that.renewaldate) &&
            this.address.equals(that.address) &&
            this.zipcode.equals(that.zipcode) &&
            this.latituden.equals(that.latituden) &&
            this.longitudew.equals(that.longitudew) &&
            this.customer.equals(that.customer) &&
            this.propertytype.equals(that.propertytype) &&
            this.fireperil == that.fireperil &&
            this.firepremium == that.firepremium &&
            this.crimeperil == that.crimeperil &&
            this.crimepremium == that.crimepremium &&
            this.floodperil == that.floodperil &&
            this.floodpremium == that.floodpremium &&
            this.weatherperil == that.weatherperil &&
            this.weatherpremium == that.weatherpremium &&
            this.status == that.status &&
            this.rejectionreason.equals(that.rejectionreason);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof Genasa1Commercial) && this.equals((Genasa1Commercial)that);
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(policynumber) ^
            Integer.rotateLeft(requestdate.hashCode(), 1) ^
            Integer.rotateLeft(startdate.hashCode(), 2) ^
            Integer.rotateLeft(renewaldate.hashCode(), 3) ^
            Integer.rotateLeft(address.hashCode(), 4) ^
            Integer.rotateLeft(zipcode.hashCode(), 5) ^
            Integer.rotateLeft(latituden.hashCode(), 6) ^
            Integer.rotateLeft(longitudew.hashCode(), 7) ^
            Integer.rotateLeft(customer.hashCode(), 8) ^
            Integer.rotateLeft(propertytype.hashCode(), 9) ^
            Integer.rotateLeft(Integer.hashCode(fireperil), 10) ^
            Integer.rotateLeft(Integer.hashCode(firepremium), 11) ^
            Integer.rotateLeft(Integer.hashCode(crimeperil), 12) ^
            Integer.rotateLeft(Integer.hashCode(crimepremium), 13) ^
            Integer.rotateLeft(Integer.hashCode(floodperil), 14) ^
            Integer.rotateLeft(Integer.hashCode(floodpremium), 15) ^
            Integer.rotateLeft(Integer.hashCode(weatherperil), 16) ^
            Integer.rotateLeft(Integer.hashCode(weatherpremium), 17) ^
            Integer.rotateLeft(Integer.hashCode(status), 18) ^
            Integer.rotateLeft(rejectionreason.hashCode(), 19);
    }
    
    @Override
    public int compareTo(Genasa1Commercial that) {
        int c = 0;
        c = Integer.compare(this.policynumber, that.policynumber);
        if ( c != 0 ) return c;
        c = this.requestdate.compareTo(that.requestdate);
        if ( c != 0 ) return c;
        c = this.startdate.compareTo(that.startdate);
        if ( c != 0 ) return c;
        c = this.renewaldate.compareTo(that.renewaldate);
        if ( c != 0 ) return c;
        c = this.address.compareTo(that.address);
        if ( c != 0 ) return c;
        c = this.zipcode.compareTo(that.zipcode);
        if ( c != 0 ) return c;
        c = this.latituden.compareTo(that.latituden);
        if ( c != 0 ) return c;
        c = this.longitudew.compareTo(that.longitudew);
        if ( c != 0 ) return c;
        c = this.customer.compareTo(that.customer);
        if ( c != 0 ) return c;
        c = this.propertytype.compareTo(that.propertytype);
        if ( c != 0 ) return c;
        c = Integer.compare(this.fireperil, that.fireperil);
        if ( c != 0 ) return c;
        c = Integer.compare(this.firepremium, that.firepremium);
        if ( c != 0 ) return c;
        c = Integer.compare(this.crimeperil, that.crimeperil);
        if ( c != 0 ) return c;
        c = Integer.compare(this.crimepremium, that.crimepremium);
        if ( c != 0 ) return c;
        c = Integer.compare(this.floodperil, that.floodperil);
        if ( c != 0 ) return c;
        c = Integer.compare(this.floodpremium, that.floodpremium);
        if ( c != 0 ) return c;
        c = Integer.compare(this.weatherperil, that.weatherperil);
        if ( c != 0 ) return c;
        c = Integer.compare(this.weatherpremium, that.weatherpremium);
        if ( c != 0 ) return c;
        c = Integer.compare(this.status, that.status);
        if ( c != 0 ) return c;
        c = this.rejectionreason.compareTo(that.rejectionreason);
        return c;
    }
    
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final ExternalDecimalAsIntField POLICYNUMBER = factory.getExternalDecimalAsIntField(5, true);
    private static final StringField REQUESTDATE = factory.getStringField(14);
    private static final DateTimeFormatter REQUESTDATE_FMT = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    private static final StringField STARTDATE = factory.getStringField(8);
    private static final DateTimeFormatter STARTDATE_FMT = DateTimeFormatter.ofPattern("yyyyMMdd");
    private static final StringField RENEWALDATE = factory.getStringField(8);
    private static final DateTimeFormatter RENEWALDATE_FMT = DateTimeFormatter.ofPattern("yyyyMMdd");
    private static final StringField ADDRESS = factory.getStringField(254);
    private static final StringField ZIPCODE = factory.getStringField(9);
    private static final StringField LATITUDEN = factory.getStringField(12);
    private static final StringField LONGITUDEW = factory.getStringField(12);
    private static final StringField CUSTOMER = factory.getStringField(254);
    private static final StringField PROPERTYTYPE = factory.getStringField(254);
    private static final ExternalDecimalAsIntField FIREPERIL = factory.getExternalDecimalAsIntField(3, true);
    private static final ExternalDecimalAsIntField FIREPREMIUM = factory.getExternalDecimalAsIntField(5, true);
    private static final ExternalDecimalAsIntField CRIMEPERIL = factory.getExternalDecimalAsIntField(3, true);
    private static final ExternalDecimalAsIntField CRIMEPREMIUM = factory.getExternalDecimalAsIntField(5, true);
    private static final ExternalDecimalAsIntField FLOODPERIL = factory.getExternalDecimalAsIntField(3, true);
    private static final ExternalDecimalAsIntField FLOODPREMIUM = factory.getExternalDecimalAsIntField(5, true);
    private static final ExternalDecimalAsIntField WEATHERPERIL = factory.getExternalDecimalAsIntField(3, true);
    private static final ExternalDecimalAsIntField WEATHERPREMIUM = factory.getExternalDecimalAsIntField(5, true);
    private static final ExternalDecimalAsIntField STATUS = factory.getExternalDecimalAsIntField(3, true);
    private static final StringField REJECTIONREASON = factory.getStringField(254);
    public static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    public byte[] getBytes(byte[] bytes, int offset) {
        POLICYNUMBER.putInt(policynumber, bytes, offset);
        REQUESTDATE.putString(requestdate.toLocalDate().format(REQUESTDATE_FMT), bytes, offset);
        STARTDATE.putString(startdate.toLocalDate().format(STARTDATE_FMT), bytes, offset);
        RENEWALDATE.putString(renewaldate.toLocalDate().format(RENEWALDATE_FMT), bytes, offset);
        ADDRESS.putString(address, bytes, offset);
        ZIPCODE.putString(zipcode, bytes, offset);
        LATITUDEN.putString(latituden, bytes, offset);
        LONGITUDEW.putString(longitudew, bytes, offset);
        CUSTOMER.putString(customer, bytes, offset);
        PROPERTYTYPE.putString(propertytype, bytes, offset);
        FIREPERIL.putInt(fireperil, bytes, offset);
        FIREPREMIUM.putInt(firepremium, bytes, offset);
        CRIMEPERIL.putInt(crimeperil, bytes, offset);
        CRIMEPREMIUM.putInt(crimepremium, bytes, offset);
        FLOODPERIL.putInt(floodperil, bytes, offset);
        FLOODPREMIUM.putInt(floodpremium, bytes, offset);
        WEATHERPERIL.putInt(weatherperil, bytes, offset);
        WEATHERPREMIUM.putInt(weatherpremium, bytes, offset);
        STATUS.putInt(status, bytes, offset);
        REJECTIONREASON.putString(rejectionreason, bytes, offset);
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
        requestdate = Date.valueOf(LocalDate.parse(REQUESTDATE.getString(bytes, offset), REQUESTDATE_FMT));
        startdate = Date.valueOf(LocalDate.parse(STARTDATE.getString(bytes, offset), STARTDATE_FMT));
        renewaldate = Date.valueOf(LocalDate.parse(RENEWALDATE.getString(bytes, offset), RENEWALDATE_FMT));
        address = ADDRESS.getString(bytes, offset);
        zipcode = ZIPCODE.getString(bytes, offset);
        latituden = LATITUDEN.getString(bytes, offset);
        longitudew = LONGITUDEW.getString(bytes, offset);
        customer = CUSTOMER.getString(bytes, offset);
        propertytype = PROPERTYTYPE.getString(bytes, offset);
        fireperil = FIREPERIL.getInt(bytes, offset);
        firepremium = FIREPREMIUM.getInt(bytes, offset);
        crimeperil = CRIMEPERIL.getInt(bytes, offset);
        crimepremium = CRIMEPREMIUM.getInt(bytes, offset);
        floodperil = FLOODPERIL.getInt(bytes, offset);
        floodpremium = FLOODPREMIUM.getInt(bytes, offset);
        weatherperil = WEATHERPERIL.getInt(bytes, offset);
        weatherpremium = WEATHERPREMIUM.getInt(bytes, offset);
        status = STATUS.getInt(bytes, offset);
        rejectionreason = REJECTIONREASON.getString(bytes, offset);
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
