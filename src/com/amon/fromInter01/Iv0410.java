package com.amon.fromInter01;

/**
 * @author "Amon"
 * @version ����ʱ�䣺2018��4��10�� ����8:49:37
 * ����д�����̣߳�һ���̴߳�ӡ1~25����һ���̴߳�ӡ��ĸA~Z��
 *  ��ӡ˳��Ϊ12A34B56C����5152Z��Ҫ��ʹ���̼߳��ͨ�š���
 */
public class Iv0410 {

	public static void main(String[] args) throws Exception {
		MThread mThread = new MThread();

		Thread01 thread01 = new Thread01(mThread);
		Thread2 thread2 = new Thread2(mThread);
		thread01.start();
		thread2.start();
	}

}
