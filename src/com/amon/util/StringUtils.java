package com.amon.util;
/**
* @author Amon E-mail:248779716@qq.com
* @version 创建时间：2018年3月28日 下午7:51:37
* 字符串工具类
*/
public class StringUtils {
	

	/**从字符串str中找出第n个字符c
	 * eg:找出‘afjannvagr’中，第2个'a'的位置
	 * @param str	数据源字符串
	 * @param c		需要找的字符
	 * @param cou	需要找第几个
	 * @return		返回对应字符在str中的位置(没有的话返回-1)
	 */ 
	public static int getTheChar(String str,char c,int cou){
		char[] n=str.toCharArray();
		int i=0;
		int count=0;
		for (char d : n) {
			i++;
			if (c==d) {
				count++;
				System.out.println("匹配"+count+"次");
				if (count==cou) {
					return i;
				}
			}
		}
		return -1;
	}
	
	/**
	 * 判断是否为空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		if (str==null||"".equals(str.trim())) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * 判断是否不为空
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str){
		if (str!=null&&!"".equals(str.trim())) {
			return true;
		}else {
			return false;
		}
	}
	
	
	/**
	 * 判断是不是数字
	 * @param str
	 * @return
	 */
	public static boolean isNum(String str){
	    for(int i=str.length();--i>=0;){
	        int chr=str.charAt(i);
	        if(chr<48 || chr>57)
	            return false;
	    }
			return true;
	}
	
	
	
	
	
	
	
	
}
