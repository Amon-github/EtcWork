package com.amon.fromClass;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Amon E-mail:248779716@qq.com
 * @version ����ʱ�䣺2018��3��20�� ����10:36:43 
 * ���������Ա�Ŀ��ţ������ĸ�λ���ĺ�
 */
public class Exe0320 {

	public static void main(String[] args) throws IOException {
		int count=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("������4λ��Ա����");
		int num = scanner.nextInt();

		System.out.println("��Ա�����ǣ�" + num);
		/*
		 * int qian=num/1000; int bai=(num-qian*1000)/100; int
		 * shi=(num-qian*1000-bai*100)/10; int ge=num-qian*1000-bai*100-shi*10;
		 */

		int g = num % 10;
		int s = num / 10 % 10;
		int b = num / 100 % 10;
		int q = num / 1000 % 10;

		System.out.println("ǧλ����" + q + " ��λ����" + b + " ʮλ����" + s + " ��λ����" + g);
		System.out.println("�ĸ�λ���ĺ�Ϊ��" + (q + s + b + g));

	}

}
