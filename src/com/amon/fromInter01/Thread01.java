package com.amon.fromInter01;

/**
 * @author "Amon"
 * @version 创建时间：2018年4月10日 上午9:30:17 
 * 一个线程打印1~25
 */
public class Thread01 extends Thread {
	private MThread mThread;

	public Thread01(MThread mThread) {
		this.mThread = mThread;
	}

	@Override
	public void run() {
		while (true) {
			if (MThread.i1 > 52) {
				break;
			}
			try {
				mThread.printNum();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
