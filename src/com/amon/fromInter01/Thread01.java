package com.amon.fromInter01;

/**
 * @author "Amon"
 * @version ����ʱ�䣺2018��4��10�� ����9:30:17 
 * һ���̴߳�ӡ1~25
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
