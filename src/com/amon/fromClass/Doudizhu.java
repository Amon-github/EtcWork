package com.amon.fromClass;

import java.util.Random;
/**
 * 
 * @author Administrator
 * ��Ŀ1��ȥ�������е�0������������
 * ��Ŀ2��ģ�⶷�������ƣ���ը������
 */
public class Doudizhu {

	public static void main(String[] args) {
		/*
		 * int[] a= {0,2,0,33,25,0,45,0,65}; int[] b=test(a); for (int i = 0; i <
		 * b.length; i++) { System.out.print(b[i]+" "); }
		 */
		long begin=System.currentTimeMillis();
		test2();
		System.out.println("========================================");
		System.out.println("����ʱ�䣺"+(System.currentTimeMillis()-begin));
	}

	/**
	 * ����1
	 * 
	 * @param a
	 * @return �����M�е�0ȥ��Ȼ�᷵��һ�����M
	 */
	static int[] test(int[] a) {
		int count = 0;
		// ���һ���������0֮��ĸ���
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				count++;
			}
		}
		int[] newArr = new int[count];
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				newArr[c] = a[i];
				c++;
			}

		}
		return newArr;
	}

	
	
	
	/**
	 * ����2 ģ�M�Y�����l���^��
	 */
	static void test2() {
		int[] a = new int[54]; // �����˿���
		// ������������±꣬�����λ�ò���0�Ļ�������ѭ���������֣������0�Ļ�����������������±꣬�жϣ����룬�ظ��˲���
		// ѭ������52��4*13��������֮�����������������λ����0��
		Random random = new Random();
		int ranNum = random.nextInt(54);
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 13; j++) {
				while (a[ranNum] != 0) {
					ranNum = random.nextInt(54);
				}
				a[ranNum] = j;
			}
		}
		
		// ��������������0��λ�ò������Ź��ƣ�����һ��������˿��Ʋ���
		for (int j = 0; j < a.length; j++) {
			if (a[j]==0) {
				a[j]=14;
			}
		}
		
		
		// ������λ��ң�A,B,C�������˿���ǰ51���Ʒָ���λ��ң���һλ��ǰ17�ţ��ڶ�λ��ǰ34�ţ�����17���ǵ���λ�ģ������3��Ϊ���ơ�
		int[] A = new int[17];
		int[] B = new int[17];
		int[] C = new int[17];

		for (int j = 0; j < 17; j++) { // ���˿���ǰ17���Ʒָ�A���
			A[j] = a[j];
		}
		int B_index = 0;
		for (int j = 17; j < 34; j++) { // ���˿���17~34���Ʒָ�B���
			B[B_index] = a[j];
			B_index++;
		}
		int C_index = 0;
		for (int j = 34; j < 51; j++) { // ���˿���ǰ34~51���Ʒָ�C���
			C[C_index] = a[j];
			C_index++;
		}

		
		// ����������
		System.out.println("���ƣ�" + a[51] + " " + a[52] + " " + a[53] + " ");
		System.out.println("========================================");
		System.out.print("���1    ը�������");
		System.out.println(""+getBomb2(A)+"��");
		for (int j = 0; j < A.length; j++) {
			System.out.print(A[j] + " ");
		}
		System.out.println("");
		System.out.println("========================================");
		System.out.print("���2    ը�������");
		System.out.println(""+getBomb2(B)+"��");
		for (int j = 0; j < B.length; j++) {
			System.out.print(B[j] + " ");
		}
		System.out.println("");
		System.out.println("========================================");
		System.out.print("���3    ը�������");
		System.out.println(""+getBomb2(C)+"��");
		for (int j = 0; j < C.length; j++) {
			System.out.print(C[j] + " ");
		}
		System.out.println("");

	}

	
	/**
	 * ��ȡը������
	 * 
	 * @param a
	 */
	static int getBomb2(int[] a) {
		int[] bomb=new int[14];
		int couBomb=0;
		
		for (int i = 0; i < a.length; i++) {
			switch (a[i]) {
			case 1:bomb[0]++;break;
			case 2:bomb[1]++;break;
			case 3:bomb[2]++;break;
			case 4:bomb[3]++;break;
			case 5:bomb[4]++;break;
			case 6:
				bomb[5]++;
				break;
			case 7:
				bomb[6]++;
				break;
			case 8:
				bomb[7]++;
				break;
			case 9:
				bomb[8]++;
				break;
			case 10:
				bomb[9]++;
				break;
			case 11:
				bomb[10]++;
				break;
			case 12:
				bomb[11]++;
				break;
			case 13:
				bomb[12]++;
				break;
			case 14:
				bomb[13]++;
				break;
			default:
				break;
			}
	}
		for (int i = 0; i < bomb.length-1; i++) {
			if (bomb[i]==4) {
				System.out.print((i+1)+"ը ");
				couBomb++;
			}
		}
		if(bomb[13]==2){
			System.out.print("��ը ");
			couBomb++;
		}
		return couBomb;
		
}
}
