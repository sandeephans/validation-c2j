package com.ibm.wcaz.implementation;

import com.ibm.jzos.fields.CobolDatatypeFactory;
import java.io.UnsupportedEncodingException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

public class Lgacdb01 implements Comparable<Lgacdb01> {
    public Lgacdb01() {}
    
    public Lgacdb01(Lgacdb01 that) {
    }
    
    protected Lgacdb01(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected Lgacdb01(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static Lgacdb01 fromBytes(byte[] bytes, int offset) {
        return new Lgacdb01(bytes, offset);
    }
    
    public static Lgacdb01 fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static Lgacdb01 fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void insertCustomer(long db2CustomernumInt, String lgacNcs, CaCustomerRequest caCustomerRequest) {
    // CaCustomerRequest caCustomerRequest = new CaCustomerRequest();
    // long db2CustomernumInt = 0;
    ErrorMsg errorMsg = new ErrorMsg(); caCustomerRequest.setCaCustomerNum(db2CustomernumInt);
    // String lgacNcs = "ON";
    // caCustomerRequest.getEmVariable().setEmSqlreq(" INSERT CUSTOMER");
    errorMsg.getEmVariable().setEmSqlreq(" INSERT CUSTOMER");
    if (lgacNcs.equals("ON")) {
        try {
            String sql = "INSERT INTO CUSTOMER(CUSTOMERNUMBER, FIRSTNAME, LASTNAME, DATEOFBIRTH, HOUSENAME, HOUSENUMBER, POSTCODE, PHONEMOBILE, PHONEHOME, EMAILADDRESS) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = DriverManager.getConnection("endpoint_url").prepareStatement(sql);
            ps.setLong(1, db2CustomernumInt);
            ps.setString(2, caCustomerRequest.getGenasa1Customer().getFirstname());
            ps.setString(3, caCustomerRequest.getGenasa1Customer().getLastname());
            // ps.setDate(4, caCustomerRequest.getGenasa1Customer().getDateofbirth());
            ps.setString(5, caCustomerRequest.getGenasa1Customer().getHousename());
            ps.setString(6, caCustomerRequest.getGenasa1Customer().getHousenumber());
            ps.setString(7, caCustomerRequest.getGenasa1Customer().getPostcode());
            ps.setString(8, caCustomerRequest.getGenasa1Customer().getPhonemobile());
            ps.setString(9, caCustomerRequest.getGenasa1Customer().getPhonehome());
            ps.setString(10, caCustomerRequest.getGenasa1Customer().getEmailaddress());
            ps.executeUpdate();
            ps.close();
        } catch (Exception exception) {
            // caReturnCode = 90;
            // errorMsg.writeErrorMessage();
            System.out.println("[EXCEPTION CAUGHT] " + exception);
        }
    } else {
        try {
            String sql = "INSERT INTO CUSTOMER(FIRSTNAME, LASTNAME, DATEOFBIRTH, HOUSENAME, HOUSENUMBER, POSTCODE, PHONEMOBILE, PHONEHOME, EMAILADDRESS) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = DriverManager.getConnection("endpoint_url").prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, caCustomerRequest.getGenasa1Customer().getFirstname());
            ps.setString(2, caCustomerRequest.getGenasa1Customer().getLastname());
            // ps.setDate(3, caCustomerRequest.getGenasa1Customer().getDateofbirth());
            ps.setString(4, caCustomerRequest.getGenasa1Customer().getHousename());
            ps.setString(5, caCustomerRequest.getGenasa1Customer().getHousenumber());
            ps.setString(6, caCustomerRequest.getGenasa1Customer().getPostcode());
            ps.setString(7, caCustomerRequest.getGenasa1Customer().getPhonemobile());
            ps.setString(8, caCustomerRequest.getGenasa1Customer().getPhonehome());
            ps.setString(9, caCustomerRequest.getGenasa1Customer().getEmailaddress());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            db2CustomernumInt = rs.getLong(1);
            ps.close();
        } catch (Exception exception) {
            // caReturnCode = 90;
            // errorMsg.writeErrorMessage();
            System.out.println("[EXCEPTION CAUGHT] " + exception);
        }
        caCustomerRequest.setCaCustomerNum(db2CustomernumInt);
    }
}

    
    public static void main(String[] args) {
        // insertCustomer();
    }
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("}");
        return s.toString();
    }
    
    public boolean equals(Lgacdb01 that) {
        return true;
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof Lgacdb01) && this.equals((Lgacdb01)that);
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
    
    @Override
    public int compareTo(Lgacdb01 that) {
        int c = 0;
        return c;
    }
    
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    public static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    public byte[] getBytes(byte[] bytes, int offset) {
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
