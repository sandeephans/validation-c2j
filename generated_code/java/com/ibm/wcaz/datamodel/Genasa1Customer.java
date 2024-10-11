package com.ibm.wcaz.datamodel;

import com.ibm.jzos.fields.CobolDatatypeFactory;
import com.ibm.jzos.fields.ExternalDecimalAsIntField;
import com.ibm.jzos.fields.StringField;
import java.io.UnsupportedEncodingException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Genasa1Customer implements Comparable<Genasa1Customer> {
    private int customernumber;
    private String firstname = "";
    private String lastname = "";
    private Date dateofbirth = new Date(0);
    private String housename = "";
    private String housenumber = "";
    private String postcode = "";
    private String phonehome = "";
    private String phonemobile = "";
    private String emailaddress = "";
    
    public Genasa1Customer() {}
    
    public Genasa1Customer(int customernumber, String firstname, String lastname, Date dateofbirth, String housename, String housenumber, String postcode, String phonehome, String phonemobile, String emailaddress) {
        this.customernumber = customernumber;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateofbirth = dateofbirth;
        this.housename = housename;
        this.housenumber = housenumber;
        this.postcode = postcode;
        this.phonehome = phonehome;
        this.phonemobile = phonemobile;
        this.emailaddress = emailaddress;
    }
    
    public Genasa1Customer(Genasa1Customer that) {
        this.customernumber = that.customernumber;
        this.firstname = that.firstname;
        this.lastname = that.lastname;
        this.dateofbirth = that.dateofbirth;
        this.housename = that.housename;
        this.housenumber = that.housenumber;
        this.postcode = that.postcode;
        this.phonehome = that.phonehome;
        this.phonemobile = that.phonemobile;
        this.emailaddress = that.emailaddress;
    }
    
    protected Genasa1Customer(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected Genasa1Customer(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static Genasa1Customer fromBytes(byte[] bytes, int offset) {
        return new Genasa1Customer(bytes, offset);
    }
    
    public static Genasa1Customer fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static Genasa1Customer fromBytes(String bytes) {
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
    
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public Date getDateofbirth() {
        return this.dateofbirth;
    }
    
    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
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
    
    public String getPhonehome() {
        return this.phonehome;
    }
    
    public void setPhonehome(String phonehome) {
        this.phonehome = phonehome;
    }
    
    public String getPhonemobile() {
        return this.phonemobile;
    }
    
    public void setPhonemobile(String phonemobile) {
        this.phonemobile = phonemobile;
    }
    
    public String getEmailaddress() {
        return this.emailaddress;
    }
    
    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }
    public void reset() {
        customernumber = 0;
        firstname = "";
        lastname = "";
        dateofbirth = new Date(0);
        housename = "";
        housenumber = "";
        postcode = "";
        phonehome = "";
        phonemobile = "";
        emailaddress = "";
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ customernumber=\"");
        s.append(getCustomernumber());
        s.append("\"");
        s.append(", firstname=\"");
        s.append(getFirstname());
        s.append("\"");
        s.append(", lastname=\"");
        s.append(getLastname());
        s.append("\"");
        s.append(", dateofbirth=\"");
        s.append(getDateofbirth());
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
        s.append(", phonehome=\"");
        s.append(getPhonehome());
        s.append("\"");
        s.append(", phonemobile=\"");
        s.append(getPhonemobile());
        s.append("\"");
        s.append(", emailaddress=\"");
        s.append(getEmailaddress());
        s.append("\"");
        s.append("}");
        return s.toString();
    }
    
    public boolean equals(Genasa1Customer that) {
        return this.customernumber == that.customernumber &&
            this.firstname.equals(that.firstname) &&
            this.lastname.equals(that.lastname) &&
            this.dateofbirth.equals(that.dateofbirth) &&
            this.housename.equals(that.housename) &&
            this.housenumber.equals(that.housenumber) &&
            this.postcode.equals(that.postcode) &&
            this.phonehome.equals(that.phonehome) &&
            this.phonemobile.equals(that.phonemobile) &&
            this.emailaddress.equals(that.emailaddress);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof Genasa1Customer) && this.equals((Genasa1Customer)that);
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(customernumber) ^
            Integer.rotateLeft(firstname.hashCode(), 1) ^
            Integer.rotateLeft(lastname.hashCode(), 2) ^
            Integer.rotateLeft(dateofbirth.hashCode(), 3) ^
            Integer.rotateLeft(housename.hashCode(), 4) ^
            Integer.rotateLeft(housenumber.hashCode(), 5) ^
            Integer.rotateLeft(postcode.hashCode(), 6) ^
            Integer.rotateLeft(phonehome.hashCode(), 7) ^
            Integer.rotateLeft(phonemobile.hashCode(), 8) ^
            Integer.rotateLeft(emailaddress.hashCode(), 9);
    }
    
    @Override
    public int compareTo(Genasa1Customer that) {
        int c = 0;
        c = Integer.compare(this.customernumber, that.customernumber);
        if ( c != 0 ) return c;
        c = this.firstname.compareTo(that.firstname);
        if ( c != 0 ) return c;
        c = this.lastname.compareTo(that.lastname);
        if ( c != 0 ) return c;
        c = this.dateofbirth.compareTo(that.dateofbirth);
        if ( c != 0 ) return c;
        c = this.housename.compareTo(that.housename);
        if ( c != 0 ) return c;
        c = this.housenumber.compareTo(that.housenumber);
        if ( c != 0 ) return c;
        c = this.postcode.compareTo(that.postcode);
        if ( c != 0 ) return c;
        c = this.phonehome.compareTo(that.phonehome);
        if ( c != 0 ) return c;
        c = this.phonemobile.compareTo(that.phonemobile);
        if ( c != 0 ) return c;
        c = this.emailaddress.compareTo(that.emailaddress);
        return c;
    }
    
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final ExternalDecimalAsIntField CUSTOMERNUMBER = factory.getExternalDecimalAsIntField(5, true);
    private static final StringField FIRSTNAME = factory.getStringField(11);
    private static final StringField LASTNAME = factory.getStringField(21);
    private static final StringField DATEOFBIRTH = factory.getStringField(8);
    private static final DateTimeFormatter DATEOFBIRTH_FMT = DateTimeFormatter.ofPattern("yyyyMMdd");
    private static final StringField HOUSENAME = factory.getStringField(21);
    private static final StringField HOUSENUMBER = factory.getStringField(5);
    private static final StringField POSTCODE = factory.getStringField(9);
    private static final StringField PHONEHOME = factory.getStringField(21);
    private static final StringField PHONEMOBILE = factory.getStringField(21);
    private static final StringField EMAILADDRESS = factory.getStringField(101);
    public static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    public byte[] getBytes(byte[] bytes, int offset) {
        CUSTOMERNUMBER.putInt(customernumber, bytes, offset);
        FIRSTNAME.putString(firstname, bytes, offset);
        LASTNAME.putString(lastname, bytes, offset);
        DATEOFBIRTH.putString(dateofbirth.toLocalDate().format(DATEOFBIRTH_FMT), bytes, offset);
        HOUSENAME.putString(housename, bytes, offset);
        HOUSENUMBER.putString(housenumber, bytes, offset);
        POSTCODE.putString(postcode, bytes, offset);
        PHONEHOME.putString(phonehome, bytes, offset);
        PHONEMOBILE.putString(phonemobile, bytes, offset);
        EMAILADDRESS.putString(emailaddress, bytes, offset);
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
        firstname = FIRSTNAME.getString(bytes, offset);
        lastname = LASTNAME.getString(bytes, offset);
        dateofbirth = Date.valueOf(LocalDate.parse(DATEOFBIRTH.getString(bytes, offset), DATEOFBIRTH_FMT));
        housename = HOUSENAME.getString(bytes, offset);
        housenumber = HOUSENUMBER.getString(bytes, offset);
        postcode = POSTCODE.getString(bytes, offset);
        phonehome = PHONEHOME.getString(bytes, offset);
        phonemobile = PHONEMOBILE.getString(bytes, offset);
        emailaddress = EMAILADDRESS.getString(bytes, offset);
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
