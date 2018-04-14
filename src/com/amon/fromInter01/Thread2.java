package com.amon.fromInter01;

/**
 * @author "Amon"
 * @version 创建时间：2018年4月10日 上午9:30:17 
 * 一个线程打印字母A~Z
 */
public class Thread2 extends Thread {
	private MThread mThread;

	public Thread2(MThread mThread) {
		this.mThread = mThread;
	}

	@Override
	public void run() {
		while (true) {
			if (MThread.i2 >90) {
				break;
			}
			try {
				mThread.printWord();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
