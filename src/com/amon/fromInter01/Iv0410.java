package com.amon.fromInter01;

/**
 * @author "Amon"
 * @version 创建时间：2018年4月10日 上午8:49:37
 * “编写两个线程，一个线程打印1~25，另一个线程打印字母A~Z，
 *  打印顺序为12A34B56C……5152Z，要求使用线程间的通信。”
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
