package com.amon.fromClass;

import java.util.Random;
import java.util.Scanner;

/**
* @author Amon E-mail:248779716@qq.com
* @version ����ʱ�䣺2018��3��27�� ����10:39:13-10��45:13
* �����֣���ȭ
*/
public class RandomGame  {
	static long timestart;

	public static void main(String[] args) {
//		startGame();	//��������Ϸ
//		gase();			//��ȭ��Ϸ
		
	}
	
	/**
	 * 
	 */
	static void gase(){
		Scanner sc=new Scanner(System.in);
		Random rNum=new Random();
		int b=rNum.nextInt(3)+1;
		int a=(int)(Math.random()*3+1);
		System.out.println(a);
		String num=a+"";
		System.out.println("�����ȭ�ˣ�(1������|2��ʯͷ|3����)");
		String yourNum=sc.next();
		if (!"1".equals(yourNum)&&!"2".equals(yourNum)&&!"3".equals(yourNum)) {
			System.out.println("��������");
		}else {
			System.out.println("��ѡ���ǣ�"+yourNum);
			if ("1".equals(yourNum)) {
				if ("1".equals(num)) {
					System.out.println("ƽ��");
				}else if ("2".equals(num)) {
					System.out.println("������");
				}else if ("3".equals(num)) {
					System.out.println("����������Ӯ�ˣ�");
				}
			} else if ("2".equals(yourNum)) {
				if ("1".equals(num)) {
					System.out.println("����������Ӯ�ˣ�");
				}else if ("2".equals(num)) {
					System.out.println("ƽ��");
				}else if ("3".equals(num)) {
					System.out.println("������");
				}
			}else if ("3".equals(yourNum)) {
				if ("1".equals(num)) {
					System.out.println("������");
				}else if ("2".equals(num)) {
					System.out.println("����������Ӯ�ˣ�");
				}else if ("3".equals(num)) {
					System.out.println("ƽ��");
				}
			}
			System.out.println("³�ࡾ���ԡ���"+num);
		}
		
		
		
		
		
	}
	
	
	
	
	/**
	 * ��ʼ��Ϸ��ѭ����Ϸ�߼�
	 */
	static void startGame(){
		randomGame();
		while (true) {
			System.out.println("��Ҫ�����𣿣�����������˳�������y������Ϸ����");
			Scanner s=new Scanner(System.in);
			String inter=s.next();
			if ("y".equals(inter)) {
				randomGame();
			}else{
				System.out.println("��Ϸ��������л���飡");
				break;
			}
		}
	}
	/**
	 * ��������Ϸ�߼�
	 */
	static void randomGame(){
		timestart=timestart=System.currentTimeMillis();
		Random r=new Random();
		int ran=r.nextInt(100000);
		System.out.println("��Ϸ��ʼ��������Ѿ����ɣ�1~10�������������ʼ�°ɣ�");
		while (true) {
			Scanner scanner=new Scanner(System.in);
			int geta=scanner.nextInt();
			if (geta!=ran) {
				if (geta>ran) {
					System.out.println("����������е����Ŷ��");
				}else {
					System.out.println("С�ˣ�");
				}
			}else {
				System.out.println("Ӵ�����԰����¶��ˣ�");
				System.out.println("��ʱ��"+(System.currentTimeMillis()-timestart)/1000+"��");
				
				break;
			}
			
		}
		
		
		
	}

}
