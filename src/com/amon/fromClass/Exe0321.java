package com.amon.fromClass;

import java.util.Scanner;

/**
 * @author Amon E-mail:248779716@qq.com
 * @version ����ʱ�䣺2018��3��21�� ����8:46:25
 *  ��Ŀ��ϰ
 */
public class Exe0321 {

	public static void main(String[] args) {
//		test1();
//		test2();
		test3();
//		test4();
//		test5();
//		test6();
//		test7();

	}

	/**��Ŀ1��
	 * ��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
	 * С���ӳ����������º�ÿ��������һ�����ӡ��������Ӷ�������Ҫ�����һ�������ӵ������Ƕ��١� 
	 * 1 1 2 3 5 8 13 21 34 55 89... n=(n-1)+(n-2);
	 */
	public static void test1() {
		int s1 = 1;
		int s2 = 1;
		int x;
		System.out.println("�������·ݣ�");
		int mon = new Scanner(System.in).nextInt();

		if (mon < 3 && mon > 0) {
			System.out.println("���������ǣ�" + 2);
		} else if (mon >= 3) {
			for (int i = 3; i <= mon; i++) {
				x = s1;
				s1 = s2;
				s2 = x + s2;
			}
			System.out.println("���Ӷ����ǣ�" + s2 + " �����ǣ�" + s2 * 2);
		}
	}

	
	/**��Ŀ2��
	 * �ж�10-105֮���ж��ٸ����������������������
	 * �������ֳ�Ϊ����������Ϊ�ڴ���1����Ȼ���У�����1�����������ⲻ������������������
	 */
	public static void test2() {
		int i, j;
		System.out.println("10-105������Ϊ��");
		for (i = 10; i <= 105; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0)
					break;
			}
			if (i <= j)
				System.out.println(i);
		}

	}
	
	
	
	/**��Ŀ3��
	 * �ж�100��500֮�䣬��Щ����ˮ�ɻ�������ˮ�ɻ�����ָһ�� n λ������ ( n��3 )��
	 * ����ÿ��λ�ϵ����ֵ� n ����֮�͵��������������磺1^3 + 5^3+ 3^3 = 153����	
	 */
	public static void test3() {
		for (int i = 100; i < 500; i++) {
			int g=i%10;
			int s=i/10%10;
			int b=i/100%10;
			if ((Math.pow(g,3)+Math.pow(s,3)+Math.pow(b,3)==i)) {
				System.out.println("��λ��Ϊ��"+b+" ʮλ��Ϊ��"+s+"  ��λ��Ϊ��"+g);
				System.out.println("��Ϊ��          "+(int)Math.pow(b,3)+"      "+(int)Math.pow(s,3)+"      "+(int)Math.pow(g,3));
				System.out.println(i);
				System.out.println("============��=ׯ=��=��=��=��=��=��=====Amon=========");
			}
		}
	}
	
	
	
	/**��Ŀ4
	 * ��1-100֮�䣬����Щ��������������ȫ����Perfect number�����ֳ����������걸������һЩ�������Ȼ����
	 * �����е������ӣ����������������Լ�����ĺͣ������Ӻ�������ǡ�õ������������磺6=1+2+3��
	 */
	
	public static void test4(){
		int count;
		for (int i = 1; i < 100; i++) {
			count=0;
			for (int j = 1; j < i; j++) {
				if (i%j==0) {
					count+=j;
				}
			}
			if (count==i) {
				System.out.println("������"+i);
				System.out.println("============��=ׯ=��=��=��=��=��=��=====Amon=========");
			}
			System.out.println(i);
		}
	}
	
	
	
	
	/**��Ŀ5
	 * �ж�һ�������Ǽ�λ�������������������
	 */
	public static void test5(){
		System.out.println("������һ������");
		String n=new Scanner(System.in).nextLine();
		char[] array=n.toCharArray();
		System.out.println("���������"+array.length+"λ��");
		System.out.print("�������Ϊ��");
		for (int i =array.length-1; i >=0; i--) {
			System.out.print(array[i]);
		}
		System.out.println();
		System.out.println("============��=ׯ=��=��=��=��=��=��=====Amon=========");

	}
	
	
	
	
	/**��Ŀ6
	 * ���2000�굽3000���е����ꡣ
	 */
	public static void test6(){
		for (int i = 2000; i <3000 ; i++) {
			if (i%100==0) {
				if (i%400==0) {
					System.out.println(i+"��������");
				}
			}else if (i%4==0) {
				System.out.println(i+"��������");
			}
		}

	}
	
	/**��ϰ
	 * �žų˷���
	 */
	public static void test7(){
		for (int i = 1; i <=9; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(j+"*"+i+"="+i*j+"   ");
			}
			System.out.println("");
		}
		
	}
	
	
	
	
}
