package com.amon.util;
/**
* @author Amon E-mail:248779716@qq.com
* @version ����ʱ�䣺2018��3��28�� ����7:51:37
* �ַ���������
*/
public class StringUtils {
	

	/**���ַ���str���ҳ���n���ַ�c
	 * eg:�ҳ���afjannvagr���У���2��'a'��λ��
	 * @param str	����Դ�ַ���
	 * @param c		��Ҫ�ҵ��ַ�
	 * @param cou	��Ҫ�ҵڼ���
	 * @return		���ض�Ӧ�ַ���str�е�λ��(û�еĻ�����-1)
	 */ 
	public static int getTheChar(String str,char c,int cou){
		char[] n=str.toCharArray();
		int i=0;
		int count=0;
		for (char d : n) {
			i++;
			if (c==d) {
				count++;
				System.out.println("ƥ��"+count+"��");
				if (count==cou) {
					return i;
				}
			}
		}
		return -1;
	}
	
	/**
	 * �ж��Ƿ�Ϊ��
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
	 * �ж��Ƿ�Ϊ��
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
	 * �ж��ǲ�������
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
