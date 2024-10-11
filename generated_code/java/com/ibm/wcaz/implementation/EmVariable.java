package com.ibm.wcaz.implementation;

import com.ibm.jzos.fields.CobolDatatypeFactory;
import com.ibm.jzos.fields.ExternalDecimalAsIntField;
import com.ibm.jzos.fields.StringField;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class EmVariable implements Comparable<EmVariable> {
    private String emCusnum = "";
    private String emPolnum = "";
    private String emSqlreq = "";
    private int emSqlrc;
    
    public EmVariable() {}
    
    public EmVariable(String emCusnum, String emPolnum, String emSqlreq, int emSqlrc) {
        this.emCusnum = emCusnum;
        this.emPolnum = emPolnum;
        this.emSqlreq = emSqlreq;
        this.emSqlrc = emSqlrc;
    }
    
    public EmVariable(EmVariable that) {
        this.emCusnum = that.emCusnum;
        this.emPolnum = that.emPolnum;
        this.emSqlreq = that.emSqlreq;
        this.emSqlrc = that.emSqlrc;
    }
    
    protected EmVariable(byte[] bytes, int offset) {
        setBytes(bytes, offset);
    }
    
    protected EmVariable(byte[] bytes) {
        this(bytes, 0);
    }
    
    public static EmVariable fromBytes(byte[] bytes, int offset) {
        return new EmVariable(bytes, offset);
    }
    
    public static EmVariable fromBytes(byte[] bytes) {
        return fromBytes(bytes, 0);
    }
    
    public static EmVariable fromBytes(String bytes) {
        try {
            return fromBytes(bytes.getBytes(factory.getStringEncoding()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String getEmCusnum() {
        return this.emCusnum;
    }
    
    public void setEmCusnum(String emCusnum) {
        this.emCusnum = emCusnum;
    }
    
    public String getEmPolnum() {
        return this.emPolnum;
    }
    
    public void setEmPolnum(String emPolnum) {
        this.emPolnum = emPolnum;
    }
    
    public String getEmSqlreq() {
        return this.emSqlreq;
    }
    
    public void setEmSqlreq(String emSqlreq) {
        this.emSqlreq = emSqlreq;
    }
    
    public int getEmSqlrc() {
        return this.emSqlrc;
    }
    
    public void setEmSqlrc(int emSqlrc) {
        this.emSqlrc = emSqlrc;
    }
    public void reset() {
        emCusnum = "";
        emPolnum = "";
        emSqlreq = "";
        emSqlrc = 0;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{ emCusnum=\"");
        s.append(getEmCusnum());
        s.append("\"");
        s.append(", emPolnum=\"");
        s.append(getEmPolnum());
        s.append("\"");
        s.append(", emSqlreq=\"");
        s.append(getEmSqlreq());
        s.append("\"");
        s.append(", emSqlrc=\"");
        s.append(getEmSqlrc());
        s.append("\"");
        s.append("}");
        return s.toString();
    }
    
    public boolean equals(EmVariable that) {
        return this.emCusnum.equals(that.emCusnum) &&
            this.emPolnum.equals(that.emPolnum) &&
            this.emSqlreq.equals(that.emSqlreq) &&
            this.emSqlrc == that.emSqlrc;
    }
    
    @Override
    public boolean equals(Object that) {
        return (that instanceof EmVariable) && this.equals((EmVariable)that);
    }
    
    @Override
    public int hashCode() {
        return emCusnum.hashCode() ^
            Integer.rotateLeft(emPolnum.hashCode(), 1) ^
            Integer.rotateLeft(emSqlreq.hashCode(), 2) ^
            Integer.rotateLeft(Integer.hashCode(emSqlrc), 3);
    }
    
    @Override
    public int compareTo(EmVariable that) {
        int c = 0;
        c = this.emCusnum.compareTo(that.emCusnum);
        if ( c != 0 ) return c;
        c = this.emPolnum.compareTo(that.emPolnum);
        if ( c != 0 ) return c;
        c = this.emSqlreq.compareTo(that.emSqlreq);
        if ( c != 0 ) return c;
        c = Integer.compare(this.emSqlrc, that.emSqlrc);
        return c;
    }
    
    // Start of COBOL-compatible binary serialization metadata
    private static CobolDatatypeFactory factory = new CobolDatatypeFactory();
    static {
        factory.setStringTrimDefault(true);
        factory.setStringEncoding("IBM-1047");
    }
    
    private static final StringField EM_CUSNUM = factory.getStringField(10);
    private static final StringField EM_POLNUM = factory.getStringField(10);
    private static final StringField EM_SQLREQ = factory.getStringField(16);
    private static final ExternalDecimalAsIntField EM_SQLRC = factory.getExternalDecimalAsIntField(6, true);
    public static final int SIZE = factory.getOffset();
    // End of COBOL-compatible binary serialization metadata
    
    public byte[] getBytes(byte[] bytes, int offset) {
        EM_CUSNUM.putString(emCusnum, bytes, offset);
        EM_POLNUM.putString(emPolnum, bytes, offset);
        EM_SQLREQ.putString(emSqlreq, bytes, offset);
        EM_SQLRC.putInt(emSqlrc, bytes, offset);
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
        emCusnum = EM_CUSNUM.getString(bytes, offset);
        emPolnum = EM_POLNUM.getString(bytes, offset);
        emSqlreq = EM_SQLREQ.getString(bytes, offset);
        emSqlrc = EM_SQLRC.getInt(bytes, offset);
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
