package com.amon.fromInter01;

/**
 * @author "Amon"
 * @version ����ʱ�䣺2018��4��10�� ����11:15:42 
 * �ֿ��࣬�����������
 */
public class MThread {
	public static int i1 = 1;
	public static int i2 = 65;
	int value = 1;

	
	
	/** ��ӡ����
	 * ѭ����ӡ��������֮�󣬸ı�value,�ø��߳̽���wait״̬�����������̡߳�
	 * @throws Exception
	 */
	public synchronized void printNum() throws Exception {
		while (value == 2) {
			System.out.println("��������ȴ���...");
			wait();}
		for (int i = 0; i < 2; i++) {
			System.out.println(i1);
			Thread.sleep(500);
			i1++;
		}
		value = 2;
		notify();  
	}
	
	
	/** ��ӡ��ĸ
	 * ��ӡһ����ĸ���ı�value,�ø��߳̽���wait״̬�����������̡߳�
	 * @throws Exception
	 */
	public synchronized void printWord() throws Exception {
		while (value == 1) {
			System.out.println("��ĸ����ȴ���...");
			wait();}
		System.out.println((char) i2);
		Thread.sleep(500);
		i2++;
		value = 1;
		notify();
	}
}





