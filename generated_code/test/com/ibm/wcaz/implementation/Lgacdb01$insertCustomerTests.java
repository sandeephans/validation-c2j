package com.ibm.wcaz.implementation;

import java.util.Arrays;
import org.mockito.ArgumentMatchers;
import java.sql.Connection;
import org.junit.runner.RunWith;
import java.util.HashMap;
import java.util.ArrayList;
import org.mockito.stubbing.Answer;
import org.mockito.invocation.InvocationOnMock;
import java.sql.ResultSet;
import java.util.Map;
import org.junit.After;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.api.mockito.PowerMockito;
import org.junit.Before;
import org.junit.Test;
import com.ibm.jzos.fields.CobolDatatypeFactory;
import java.sql.PreparedStatement;
import org.mockito.Mockito;
import java.util.List;
import org.mockito.MockedStatic;
import java.sql.Statement;
import org.junit.Assert;
import java.io.UnsupportedEncodingException;
import java.sql.DriverManager;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Lgacdb01.class, DriverManager.class})
public class Lgacdb01$insertCustomerTests {

    Map<Integer, Map<String, Object>> resOutputValueMap = new HashMap<Integer, Map<String,Object>>();

    MockedStatic<java.sql.ResultSet> mockResultSet;
    MockedStatic<com.ibm.jzos.fields.CobolDatatypeFactory> mockCobolDatatypeFactory;
    MockedStatic<java.sql.PreparedStatement> mockPreparedStatement;
    MockedStatic<java.sql.DriverManager> mockDriverManager;


    @Before
    public void setUp(){
        mockResultSet = Mockito.mockStatic(java.sql.ResultSet.class);
        mockCobolDatatypeFactory = Mockito.mockStatic(com.ibm.jzos.fields.CobolDatatypeFactory.class);
        mockPreparedStatement = Mockito.mockStatic(java.sql.PreparedStatement.class);
        mockDriverManager = Mockito.mockStatic(java.sql.DriverManager.class);
    }

    @After
    public void tearDown(){
        mockResultSet.close();
        mockCobolDatatypeFactory.close();
        mockPreparedStatement.close();
        mockDriverManager.close();
    }

    @Test
    public void insertCustomerTest_1() throws Exception{
        System.out.println("\n\nTestID: 1");
        // Skipping this test, since there is a cobol_resource_input with var = "SQLCODE OF SQLCA" with non-zero value.
    }


    @Test
    public void insertCustomerTest_2() throws Exception{
        System.out.println("\n\nTestID: 2");
        // Instantiate the class or method to test
        Lgacdb01 lgacdb01Obj = new Lgacdb01();


        // create local variables
        CaCustomerRequest caCustomerRequest = new CaCustomerRequest();
        long db2CustomernumInt = 0;
        ErrorMsg errorMsg = new ErrorMsg();
        String lgacNcs = "0";
        String sql = "0";
        PreparedStatement ps = Mockito.mock(PreparedStatement.class);
        ResultSet rs = Mockito.mock(ResultSet.class);

        // create class level variables

        // create target method parameters

        // mocking static behaviour
        Connection connection__ = Mockito.mock(Connection.class);
        Mockito.doNothing().when(ps).close();
        Mockito.doNothing().when(ps).close();
        Mockito.doAnswer(new Answer<Void>() {
            private int invocationCount = 0;
            public Void answer(InvocationOnMock invocation) {
                invocationCount++;
                switch (invocationCount) {
                    case 1 : setResourceValues(315,"CUSTOMER.CUSTOMERNUMBER",1,convertByteArrayToString(invocation.getArguments()));
                }
                return null;
        }}).when(ps).setLong(ArgumentMatchers.anyInt(),ArgumentMatchers.anyLong());
        Mockito.doAnswer(new Answer<Void>() {
            private int invocationCount = 0;
            public Void answer(InvocationOnMock invocation) {
                invocationCount++;
                switch (invocationCount) {
                    case 1 : setResourceValues(315,"CUSTOMER.FIRSTNAME",1,convertByteArrayToString(invocation.getArguments()));break;
                    case 2 : setResourceValues(315,"CUSTOMER.LASTNAME",1,convertByteArrayToString(invocation.getArguments()));break;
                    case 3 : setResourceValues(315,"CUSTOMER.HOUSENAME",1,convertByteArrayToString(invocation.getArguments()));break;
                    case 4 : setResourceValues(315,"CUSTOMER.HOUSENUMBER",1,convertByteArrayToString(invocation.getArguments()));break;
                    case 5 : setResourceValues(315,"CUSTOMER.POSTCODE",1,convertByteArrayToString(invocation.getArguments()));break;
                    case 6 : setResourceValues(315,"CUSTOMER.PHONEMOBILE",1,convertByteArrayToString(invocation.getArguments()));break;
                    case 7 : setResourceValues(315,"CUSTOMER.PHONEHOME",1,convertByteArrayToString(invocation.getArguments()));break;
                    case 8 : setResourceValues(315,"CUSTOMER.EMAILADDRESS",1,convertByteArrayToString(invocation.getArguments()));
                }
                return null;
        }}).when(ps).setString(ArgumentMatchers.anyInt(),ArgumentMatchers.anyString());
        Mockito.doAnswer(new Answer<Void>() {
            private int invocationCount = 0;
            public Void answer(InvocationOnMock invocation) {
                invocationCount++;
                switch (invocationCount) {
                    case 1 : setResourceValues(315,"CUSTOMER.DATEOFBIRTH",1,convertByteArrayToString(invocation.getArguments()));
                }
                return null;
        }}).when(ps).setDate(ArgumentMatchers.anyInt(),ArgumentMatchers.any(java.sql.Date.class));
        PowerMockito.when(DriverManager.getConnection(ArgumentMatchers.anyString())).thenReturn(connection__,connection__);
        PowerMockito.when(connection__.prepareStatement(ArgumentMatchers.anyString())).thenReturn(ps);
        PowerMockito.when(connection__.prepareStatement(ArgumentMatchers.anyString(),ArgumentMatchers.<String[]>any())).thenReturn(ps);
        PowerMockito.when(ps.getGeneratedKeys()).thenReturn(rs);
        PowerMockito.when(rs.next()).thenReturn(true);
        PowerMockito.when(ps.executeUpdate()).thenReturn(0,0);
        PowerMockito.when(connection__.prepareStatement(ArgumentMatchers.anyString(),ArgumentMatchers.anyInt())).thenReturn(ps);
        PowerMockito.when(connection__.prepareStatement(ArgumentMatchers.anyString(),ArgumentMatchers.<int[]>any())).thenReturn(ps);

        // Call the target method  
        try {
            lgacdb01Obj.insertCustomer();
        } catch (Exception e) {
            Exception failure = new Exception("Cannot complete the test. Exception while executing insertCustomer." + e.getMessage());
            failure.setStackTrace(getMethodStackTrace(e));
            throw failure;
        }


        // Assertions to check the expected outcome
        // COMMENT: Skipping assertion since errorMsg is local var. 
        //        Assert.assertEquals("INSERT CUSTOMER", getValue(errorMsg.getEmVariable().getEmSqlreq()));
        // COMMENT: Skipping assertion since caCustomerRequest is local var. 
        //        Assert.assertEquals(368978, getValue(caCustomerRequest.getCaCustomerNum()));

        // Assertions for resource output
        Assert.assertTrue(resOutputValueMap.size()>0);
        Assert.assertEquals("xxxxxxxx", getData(resOutputValueMap,315,"CUSTOMER.POSTCODE"));
        Assert.assertEquals("368978", getData(resOutputValueMap,315,"CUSTOMER.CUSTOMERNUMBER"));
        Assert.assertEquals("xxxxxxxxxx", getData(resOutputValueMap,315,"CUSTOMER.FIRSTNAME"));
        Assert.assertEquals("xxxxxxxxxxxxxxxxxxxx", getData(resOutputValueMap,315,"CUSTOMER.PHONEHOME"));
        Assert.assertEquals("xxxxxxxxxxxxxxxxxxxx", getData(resOutputValueMap,315,"CUSTOMER.HOUSENAME"));
        Assert.assertEquals("xxxxxxxxxxxxxxxxxxxx", getData(resOutputValueMap,315,"CUSTOMER.LASTNAME"));
        Assert.assertEquals("xxxxxxxxxx", getData(resOutputValueMap,315,"CUSTOMER.DATEOFBIRTH"));
        Assert.assertEquals("xxxxxxxxxxxxxxxxxxxx", getData(resOutputValueMap,315,"CUSTOMER.PHONEMOBILE"));
        Assert.assertEquals("xxxx", getData(resOutputValueMap,315,"CUSTOMER.HOUSENUMBER"));
        Assert.assertEquals("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", getData(resOutputValueMap,315,"CUSTOMER.EMAILADDRESS"));
    }


    @Test
    public void insertCustomerTest_3() throws Exception{
        System.out.println("\n\nTestID: 3");
        // Skipping this test, since there is a cobol_resource_input with var = "SQLCODE OF SQLCA" with non-zero value.
    }


    @Test
    public void insertCustomerTest_4() throws Exception{
        System.out.println("\n\nTestID: 4");
        // Instantiate the class or method to test
        Lgacdb01 lgacdb01Obj = new Lgacdb01();


        // create local variables
        CaCustomerRequest caCustomerRequest = new CaCustomerRequest();
        long db2CustomernumInt = 0;
        ErrorMsg errorMsg = new ErrorMsg();
        String lgacNcs = "0";
        String sql = "0";
        PreparedStatement ps = Mockito.mock(PreparedStatement.class);
        ResultSet rs = Mockito.mock(ResultSet.class);

        // create class level variables

        // create target method parameters

        // mocking static behaviour
        Connection connection__ = Mockito.mock(Connection.class);
        Mockito.doNothing().when(ps).close();
        Mockito.doNothing().when(ps).close();
        Mockito.doAnswer(new Answer<Void>() {
            private int invocationCount = 0;
            public Void answer(InvocationOnMock invocation) {
                invocationCount++;
                switch (invocationCount) {
                    case 1 : setResourceValues(344,"CUSTOMER.DATEOFBIRTH",1,convertByteArrayToString(invocation.getArguments()));
                }
                return null;
        }}).when(ps).setDate(ArgumentMatchers.anyInt(),ArgumentMatchers.any(java.sql.Date.class));
        Mockito.doAnswer(new Answer<Void>() {
            private int invocationCount = 0;
            public Void answer(InvocationOnMock invocation) {
                invocationCount++;
                switch (invocationCount) {
                    case 1 : setResourceValues(344,"CUSTOMER.FIRSTNAME",1,convertByteArrayToString(invocation.getArguments()));break;
                    case 2 : setResourceValues(344,"CUSTOMER.LASTNAME",1,convertByteArrayToString(invocation.getArguments()));break;
                    case 3 : setResourceValues(344,"CUSTOMER.HOUSENAME",1,convertByteArrayToString(invocation.getArguments()));break;
                    case 4 : setResourceValues(344,"CUSTOMER.HOUSENUMBER",1,convertByteArrayToString(invocation.getArguments()));break;
                    case 5 : setResourceValues(344,"CUSTOMER.POSTCODE",1,convertByteArrayToString(invocation.getArguments()));break;
                    case 6 : setResourceValues(344,"CUSTOMER.PHONEMOBILE",1,convertByteArrayToString(invocation.getArguments()));break;
                    case 7 : setResourceValues(344,"CUSTOMER.PHONEHOME",1,convertByteArrayToString(invocation.getArguments()));break;
                    case 8 : setResourceValues(344,"CUSTOMER.EMAILADDRESS",1,convertByteArrayToString(invocation.getArguments()));
                }
                return null;
        }}).when(ps).setString(ArgumentMatchers.anyInt(),ArgumentMatchers.anyString());
        PowerMockito.when(DriverManager.getConnection(ArgumentMatchers.anyString())).thenReturn(connection__,connection__);
        PowerMockito.when(connection__.prepareStatement(ArgumentMatchers.anyString())).thenReturn(ps);
        PowerMockito.when(rs.getLong(ArgumentMatchers.anyInt())).thenReturn(0L);
        PowerMockito.when(connection__.prepareStatement(ArgumentMatchers.anyString(),ArgumentMatchers.<String[]>any())).thenReturn(ps);
        PowerMockito.when(rs.getLong(ArgumentMatchers.anyString())).thenReturn(0L);
        PowerMockito.when(ps.getGeneratedKeys()).thenReturn(rs);
        PowerMockito.when(rs.next()).thenReturn(true);
        PowerMockito.when(ps.executeUpdate()).thenReturn(0,0);
        PowerMockito.when(connection__.prepareStatement(ArgumentMatchers.anyString(),ArgumentMatchers.anyInt())).thenReturn(ps);
        PowerMockito.when(connection__.prepareStatement(ArgumentMatchers.anyString(),ArgumentMatchers.<int[]>any())).thenReturn(ps);

        // Call the target method  
        try {
            lgacdb01Obj.insertCustomer();
        } catch (Exception e) {
            Exception failure = new Exception("Cannot complete the test. Exception while executing insertCustomer." + e.getMessage());
            failure.setStackTrace(getMethodStackTrace(e));
            throw failure;
        }


        // Assertions to check the expected outcome
        // COMMENT: Skipping assertion since errorMsg is local var. 
        //        Assert.assertEquals("INSERT CUSTOMER", getValue(errorMsg.getEmVariable().getEmSqlreq()));
        // COMMENT: Skipping assertion since db2CustomernumInt is local var. 
        //        Assert.assertEquals(0, getValue(db2CustomernumInt));
        // COMMENT: Skipping assertion since caCustomerRequest is local var. 
        //        Assert.assertEquals(0, getValue(caCustomerRequest.getCaCustomerNum()));

        // Assertions for resource output
        Assert.assertTrue(resOutputValueMap.size()>0);
        Assert.assertEquals("xxxxxxxx", getData(resOutputValueMap,344,"CUSTOMER.POSTCODE"));
        Assert.assertEquals("xxxxxxxxxx", getData(resOutputValueMap,344,"CUSTOMER.FIRSTNAME"));
        Assert.assertEquals("xxxxxxxxxxxxxxxxxxxx", getData(resOutputValueMap,344,"CUSTOMER.PHONEHOME"));
        Assert.assertEquals("xxxxxxxxxxxxxxxxxxxx", getData(resOutputValueMap,344,"CUSTOMER.HOUSENAME"));
        Assert.assertEquals("xxxxxxxxxxxxxxxxxxxx", getData(resOutputValueMap,344,"CUSTOMER.LASTNAME"));
        Assert.assertEquals("xxxxxxxxxx", getData(resOutputValueMap,344,"CUSTOMER.DATEOFBIRTH"));
        Assert.assertEquals("xxxxxxxxxxxxxxxxxxxx", getData(resOutputValueMap,344,"CUSTOMER.PHONEMOBILE"));
        Assert.assertEquals("xxxx", getData(resOutputValueMap,344,"CUSTOMER.HOUSENUMBER"));
        Assert.assertEquals("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", getData(resOutputValueMap,344,"CUSTOMER.EMAILADDRESS"));
    }


    private String getData(Map<Integer, Map<String, Object>> resOutputValueMap, int cobolLine, String fieldname){
	     if (resOutputValueMap.containsKey(cobolLine) && resOutputValueMap.get(cobolLine).containsKey(fieldname) && resOutputValueMap.get(cobolLine).get(fieldname) != null)
		     return resOutputValueMap.get(cobolLine).get(fieldname).toString();

      return null;
    }

    private Object getValue(Object varValue) {
      if (varValue != null && varValue instanceof String)
        return varValue.toString().trim();
      if (varValue != null && varValue instanceof Long)
        return ((Long) varValue).intValue();
      return varValue;
    }

    private StackTraceElement[] getMethodStackTrace(Exception e) {
      List<StackTraceElement> stackTraceList = new ArrayList<>();
	     boolean flag = false;
      for (StackTraceElement element : e.getStackTrace()) {
        if (element.getClassName().startsWith("com.ibm.wcaz.implementation")) {
          flag = true;
        } else if (flag) {
          break;
        }
        stackTraceList.add(element);
      }
      return stackTraceList.toArray(new StackTraceElement[0]);
    }

    private Object[] convertByteArrayToString(Object[] objects) {
      for (int i = 0; i < objects.length; i++) {
        if (objects[i] instanceof byte[]) {
          objects[i] = new String((byte[]) objects[i]);
        }
      }
      return objects;
    }

    private int setResourceValues(int cobolLine, String cobolField, int javaIndex, Object[] args) {
        Map<String, Object> varValue = resOutputValueMap.get(cobolLine);
        if (varValue == null) {
          varValue = new HashMap<String, Object> ();
          resOutputValueMap.put(cobolLine, varValue);
        }
        varValue.put(cobolField, args[javaIndex]);
    return 0;
    }

}
