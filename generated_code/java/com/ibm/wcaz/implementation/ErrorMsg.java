package com.ibm.wcaz.implementation;

import com.ibm.jzos.fields.ByteArrayField;
import com.ibm.jzos.fields.CobolDatatypeFactory;
import com.ibm.jzos.fields.StringField;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ErrorMsg implements Comparable<ErrorMsg> {
    private String emDate = "";
    private String emTime = "";
    private EmVariable emVariable = new EmVariable();
    
    public ErrorMsg() {}
    
    public ErrorMsg(String emDate, String emTime, EmVariable emVariable) {
        this.emDate = emDate;
        this.emTime = emTime;
        this.emVariable = emVariable;
    }
    
    public ErrorMsg(ErrorMsg that) {
        this.emDate = that.emDate;
        this.emTime = that.emTime;
        this.emVariable = new EmVariable(that.emVariable);
    }
    
    protected ErrorMsg(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected ErrorMsg(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static ErrorMsg fromBytes(byte[] bytes, int offset) {
        return new ErrorMsg(bytes, offset);
    }
    
    public static ErrorMsg fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static ErrorMsg fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String getEmDate() {
        return this.emDate;
    }
    
    public void setEmDate(String emDate) {
        this.emDate = emDate;
    }
    
    public String getEmTime() {
        return this.emTime;
    }
    
    public void setEmTime(String emTime) {
        this.emTime = emTime;
    }
    
    public EmVariable getEmVariable() {
        return this.emVariable;
    }
    
    public void setEmVariable(EmVariable emVariable) {
        this.emVariable = emVariable;
    }
    public void reset() {
        emDate = "";
        emTime = "";
        emVariable.reset();
    }
    
    
    public void writeErrorMessage(Dfhcommarea1 dfhcommarea1) {}
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ emDate=\"");
        s.append(getEmDate());
        s.append("\"");
        s.append(", emTime=\"");
        s.append(getEmTime());
        s.append("\"");
        s.append(", emVariable=\"");
        s.append(getEmVariable());
        s.append("\"");
        s.append("}");
        return s.toString();
    }
    
    public boolean equals(ErrorMsg that) {
        return this.emDate.equals(that.emDate) &&
            this.emTime.equals(that.emTime) &&
            this.emVariable.equals(that.emVariable);
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof ErrorMsg) && this.equals((ErrorMsg)that);
    }
    
    @Override
    public int hashCode() {
        return emDate.hashCode() ^
            Integer.rotateLeft(emTime.hashCode(), 1) ^
            Integer.rotateLeft(emVariable.hashCode(), 2);
    }
    
    @Override
    public int compareTo(ErrorMsg that) {
        int c = 0;
        c = this.emDate.compareTo(that.emDate);
        if ( c != 0 ) return c;
        c = this.emTime.compareTo(that.emTime);
        if ( c != 0 ) return c;
        c = this.emVariable.compareTo(that.emVariable);
        return c;
    }
    
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final StringField EM_DATE = factory.getStringField(8);
    private static final StringField EM_TIME = factory.getStringField(6);
    private static final ByteArrayField EM_VARIABLE = factory.getByteArrayField(EmVariable.SIZE);
    public static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    public byte[] getBytes(byte[] bytes, int offset) {
        EM_DATE.putString(emDate, bytes, offset);
        EM_TIME.putString(emTime, bytes, offset);
        emVariable.getBytes(bytes, EM_VARIABLE.getOffset() + offset);
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
        emDate = EM_DATE.getString(bytes, offset);
        emTime = EM_TIME.getString(bytes, offset);
        emVariable.setBytes(bytes, EM_VARIABLE.getOffset() + offset);
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
