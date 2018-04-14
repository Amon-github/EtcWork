package com.amon.fromInter01;

/**
 * @author "Amon"
 * @version 创建时间：2018年4月10日 上午11:15:42 
 * 仓库类，存放连个方法
 */
public class MThread {
	public static int i1 = 1;
	public static int i2 = 65;
	int value = 1;

	
	
	/** 打印数字
	 * 循环打印两个数字之后，改变value,让该线程进入wait状态，唤醒其他线程。
	 * @throws Exception
	 */
	public synchronized void printNum() throws Exception {
		while (value == 2) {
			System.out.println("数字输出等待中...");
			wait();}
		for (int i = 0; i < 2; i++) {
			System.out.println(i1);
			Thread.sleep(500);
			i1++;
		}
		value = 2;
		notify();  
	}
	
	
	/** 打印字母
	 * 打印一个字母，改变value,让该线程进入wait状态，唤醒其他线程。
	 * @throws Exception
	 */
	public synchronized void printWord() throws Exception {
		while (value == 1) {
			System.out.println("字母输出等待中...");
			wait();}
		System.out.println((char) i2);
		Thread.sleep(500);
		i2++;
		value = 1;
		notify();
	}
}





