package com.amon.util; 

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author "Amon" 
 * @version ����ʱ�䣺2018��4��13�� ����8:55:24
 * ��˵��
 */
public class StringUtil {

    /**
     * ���˿�NULL
     * @param o
     * @return 
     */
    public static String FilterNull(Object o) {
        return o != null && !"null".equals(o.toString()) ? o.toString().trim() : "" ;
    }
    
    /**
     * �Ƿ�Ϊ��
     * @param o
     * @return
     */
    public static boolean isEmpty(Object o) {
        if (o == null) {
            return true;
        }
        if ("".equals(FilterNull(o.toString()))) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * �Ƿ�Ϊ��
     * @param o
     * @return
     */
    public static boolean isNotEmpty(Object o) {
        if (o == null) {
            return false;
        }
        if ("".equals(FilterNull(o.toString()))) {
            return false;
        } else {
            return true;
        }
    }
    
    /**
     * �Ƿ��ת��Ϊ����
     * @param o
     * @return
     */
    public static boolean isNum(Object o) {
        try {
            new BigDecimal(o.toString());
            return true;
        } catch (Exception e) {
        }
        return false;
    }
    
    /**
     * �Ƿ��ת��ΪLong������
     * @param o
     * @return
     */
    public static boolean isLong(Object o) {
        try {
            new Long(o.toString());
            return true;
        } catch (Exception e) {
        }
        return false;
    }
    
    /**
     * ת��ΪLong������, ����ת��ʱ����0
     * @param o
     * @return
     */
    public static Long toLong(Object o) {
        if (isLong(o)) {
            return new Long(o.toString());
        } else {
            return 0L;
        }
    }
    
    /**
     * ת��Ϊint������, ����ת��ʱ����0
     * @param o
     * @return
     */
    public static int toInt(Object o) {
        if (isNum(o)) {
            return new Integer(o.toString());
        } else {
            return 0;
        }
    }
    
    /**
     * ���ַ������ȡ�̶������ַ���, ��ֹ�ַ�������, Ĭ�Ͻ�ȡ50
     * @param o
     * @return
     */
    public static String holdmaxlength(Object o) {
        int maxlength = 50;
        if (o == null) {
            return "";
        }
        return subStringByByte(o, maxlength);
    }
    
    /**
     * �����ȡ�̶������ַ���, ��ֹ�ַ�������, maxlengthΪ0ʱĬ��50
     * @param o
     * @return
     */
    public static String holdmaxlength(Object o, int maxlength) {
        maxlength = maxlength <= 0 ? 50 : maxlength;
        if (o == null) {
            return "";
        }
        return subStringByByte(o, maxlength);
    }

    /**
     * ���ֽڽ�ȡ�ַ���
     * @param str
     * @param len
     * @return
     */
    private static String subStringByByte(Object o, int len) {
        if (o == null) {
            return "";
        }
        String str = o.toString();
        String result = null;
        if (str != null) {
            byte[] a = str.getBytes();
            if (a.length <= len) {
                result = str;
            } else if (len > 0) {
                result = new String(a, 0, len);
                int length = result.length();
                if (str.charAt(length - 1) != result.charAt(length - 1)) {
                    if (length < 2) {
                        result = null;
                    } else {
                        result = result.substring(0, length - 1);
                    }
                }
            }
        }
        return result;
    }

    /**
     * ���ű��ʽ_���
     * @param commaexpress ԭ���ű��ʽ �� A,B
     * @param newelement   ����Ԫ�� C
     * @return A,B,C
     */
    public static String comma_add(String commaexpress, String newelement) {
        return comma_rect(FilterNull(commaexpress) + "," + FilterNull(newelement));
    }

    /**
     * ���ű��ʽ_ɾ��
     * @param commaexpress  ԭ���ű��ʽ �� A,B,C
     * @param delelement ɾ��Ԫ�� C,A
     * @return B
     */
    public static String comma_del(String commaexpress, String delelement) {
        if ((commaexpress == null) || (delelement == null) || (commaexpress.trim().equals(delelement.trim()))) {
            return "";
        }
        String[] deletelist = delelement.split(",");
        String result = commaexpress;
        for (String delstr : deletelist) {
            result = comma_delone(result, delstr);
        }
        return result;
    }
    
    /**
     * ���ű��ʽ_��һɾ��
     * @param commaexpress  ԭ���ű��ʽ �� A,B,C
     * @param delelement ɾ��Ԫ�� C
     * @return A,B
     */
    public static String comma_delone(String commaexpress, String delelement) {
        if ((commaexpress == null) || (delelement == null) || (commaexpress.trim().equals(delelement.trim()))) {
          return "";
        }
        String[] strlist = commaexpress.split(",");
        StringBuffer result = new StringBuffer();
        for (String str : strlist) {
          if ((!str.trim().equals(delelement.trim())) && (!"".equals(str.trim()))) {
            result.append(str.trim() + ",");
          }
        }
        return result.toString().substring(0, result.length() - 1 > 0 ? result.length() - 1 : 0);
      }

    /**
     * ���ű��ʽ_�ж��Ƿ����Ԫ��
     * @param commaexpress ���ű��ʽ A,B,C
     * @param element C
     * @return true
     */
    public static boolean comma_contains(String commaexpress, String element) {
        boolean flag = false;
        commaexpress = FilterNull(commaexpress);
        element = FilterNull(element);
        if (!"".equals(commaexpress) && !"".equals(element)) {
            String[] strlist = commaexpress.split(",");
            for (String str : strlist) {
                if (str.trim().equals(element.trim())) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    /**
     * ���ű��ʽ_ȡ����
     * @param commaexpressA ���ű��ʽ1  A,B,C
     * @param commaexpressB ���ű��ʽ2  B,C,D
     * @return B,C
     */
    public static String comma_intersect(String commaexpressA, String commaexpressB) {
        commaexpressA = FilterNull(commaexpressA);
        commaexpressB = FilterNull(commaexpressB);
        StringBuffer result = new StringBuffer();
        String[] strlistA = commaexpressA.split(",");
        String[] strlistB = commaexpressB.split(",");
        for (String boA : strlistA) {
            for (String boB : strlistB) {
                if (boA.trim().equals(boB.trim())) {
                    result.append(boA.trim() + ",");
                }
            }
        }
        return comma_rect(result.toString());
    }

    /**
     * ���ű��ʽ_�淶
     * @param commaexpress  ���ű��ʽ  ,A,B,B,,C
     * @return A,B,C
     */
    public static String comma_rect(String commaexpress) {
        commaexpress = FilterNull(commaexpress);
        String[] strlist = commaexpress.split(",");
        StringBuffer result = new StringBuffer();
        for (String str : strlist) {
            if (!("".equals(str.trim())) && !("," + result.toString() + ",").contains("," + str + ",") && !"null".equals(str)) {
                result.append(str.trim() + ",");
            }
        }
        return result.toString().substring(0, (result.length() - 1 > 0) ? result.length() - 1 : 0);
    }
    
    /**
     * ���ű��ʽ_��ת
     * @param commaexpress A,B,C
     * @return C,B,A
     */
    public static String comma_reverse(String commaexpress) {
        commaexpress = FilterNull(commaexpress);
        String[] ids = commaexpress.split(",");
        StringBuffer str = new StringBuffer();
        for (int i = ids.length - 1; i >= 0; i--) {
            str.append(ids[i] + ",");
        }
        return comma_rect(str.toString());
    }

    /**
     * ���ű��ʽ_��ȡ�׶���
     * @param commaexpress A,B,C
     * @return A
     */
    public static String comma_first(String commaexpress) {
        commaexpress = FilterNull(commaexpress);
        String[] ids = commaexpress.split(",");
        System.out.println("length:" + ids.length);
        if ((ids != null) && (ids.length > 0)) {
            return ids[0];
        }
        return null;
    }

    /**
     * ���ű��ʽ_��ȡβ����
     * @param commaexpress A,B,C
     * @return C
     */
    public static String comma_last(String commaexpress) {
        commaexpress = FilterNull(commaexpress);
        String[] ids = commaexpress.split(",");
        if ((ids != null) && (ids.length > 0)) {
            return ids[(ids.length - 1)];
        }
        return null;
    }

    /**
     * �滻�ַ���,֧���ַ���Ϊ�յ�����
     * @param strData
     * @param regex
     * @param replacement
     * @return
     */
    public static String replace(String strData, String regex, String replacement) {
        return strData == null ? "" : strData.replaceAll(regex, replacement);
    }
        
    /**
     * �ַ���תΪHTML��ʾ�ַ�
     * @param strData
     * @return
     */
    public static String String2HTML(String strData){
        if( strData == null || "".equals(strData) ){
            return "" ;
        }
        strData = replace(strData, "&", "&amp;");
        strData = replace(strData, "<", "&lt;"); 
        strData = replace(strData, ">", "&gt;");
        strData = replace(strData, "\"", "&quot;");
        return strData;
    }
    
    /**     * ���쳣��Ϣת�����ַ������Է��㱣�� */
    public static String getexceptionInfo(Exception e){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try{
            e.printStackTrace(new PrintStream(baos));
        }finally{
            try {
                baos.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        return baos.toString();
    }
    
    /** ����������� */ 
    public static String regex(String str){
        Pattern pattern = Pattern.compile("[0-9-:/ ]");// ���ĺ��ֱ�������
        Matcher matcher;
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            matcher = pattern.matcher(String.valueOf(array[i]));
            if (!matcher.matches()) {// �ո��ݲ��滻
                str = str.replace(String.valueOf(array[i]), "");// �����ַ��ÿ��ַ����滻
            }
        }
         
        return str;    
    }
    
    public static String comma_insert(String commaexpress, String newelement,int index){
        int length = commaexpress.length();
        if ( index > length ) {
            index = length;
        }else if ( index < 0){
            index = 0;
        }
        String result = commaexpress.substring(0, index) + newelement + commaexpress.substring(index, commaexpress.length());
        return result;
    }
    
    /**
     * ��"/"�滻��"\"
     * @param strDir
     * @return
     */
    public static String changeDirection(String strDir) {
        String s = "/";
        String a = "\\";
        if (strDir != null && !" ".equals(strDir)) {
            if (strDir.contains(s)) {
                strDir = strDir.replace(s, a);
            }
        }
        return strDir;
    }

    /**
     * ȥ���ַ����� ͷ��β�Ŀո��м�Ŀո���
     * 
     * @Title: trim
     * @Description: TODO
     * @return String
     * @throws
     */
    public static String trim(String s) {
        int i = s.length();// �ַ������һ���ַ���λ��
        int j = 0;// �ַ�����һ���ַ�
        int k = 0;// �м����
        char[] arrayOfChar = s.toCharArray();// ���ַ���ת�����ַ�����
        while ((j < i) && (arrayOfChar[(k + j)] <= ' '))
        ++j;// ȷ���ַ���ǰ��Ŀո���
        while ((j < i) && (arrayOfChar[(k + i - 1)] <= ' '))
        --i;// ȷ���ַ�������Ŀո���
        return (((j > 0) || (i < s.length())) ? s.substring(j, i) : s);// ����ȥ���ո����ַ���
    }
    /**
     * �õ��������е�����
     * @param str
     * @return
     */
    public static String getBrackets(String str) {
        int a = str.indexOf("{");
        int c = str.indexOf("}");
        if (a >= 0 && c >= 0 & c > a) {
            return (str.substring(a + 1, c));
        } else {
            return str;
        }
    }

    /**
     * ���ַ��������еģ��滻��|
     * 
     * @param str
     * @return
     */
    public static String commaToVerti(String str) {
        if (str != null && !"".equals(str) && str.contains(",")) {
            return str.replaceAll(",", "|");
        } else {
            return str;
        }
    }

    /**
     * ȥ���ַ����С�ǰ����Ŀո�
     * @param args
     * @throws IOException
     */
    public static String extractBlank(String name) {
        if (name != null && !"".equals(name)) {
            return name.replaceAll(" +", "");
        } else {
            return name;
        }
    }

    /**
     * ��null����""
     * @param str
     * @return
     */
    public static String ConvertStr(String str) {
        return str != null && !"null".equals(str) ? str.trim() : "";
    }
    
    public static void main(String[] args){
        System.out.println(isNum("a"));
        System.out.println(isNum("-1"));
        System.out.println(isNum("01"));
        System.out.println(isNum("1E3"));
        System.out.println(isNum("1.a"));
        System.out.println(isLong("014650"));
        System.out.println(Long.parseLong("014650"));
    }
}