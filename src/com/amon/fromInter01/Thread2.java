package com.amon.fromInter01;

/**
 * @author "Amon"
 * @version ����ʱ�䣺2018��4��10�� ����9:30:17 
 * һ���̴߳�ӡ��ĸA~Z
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
