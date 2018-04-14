package com.amon.fromClass;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Amon E-mail:248779716@qq.com
 * @version 创建时间：2018年3月20日 上午10:36:43 
 * 键盘输入会员的卡号，计算四个位数的和
 */
public class Exe0320 {

	public static void main(String[] args) throws IOException {
		int count=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入4位会员卡号");
		int num = scanner.nextInt();

		System.out.println("会员卡号是：" + num);
		/*
		 * int qian=num/1000; int bai=(num-qian*1000)/100; int
		 * shi=(num-qian*1000-bai*100)/10; int ge=num-qian*1000-bai*100-shi*10;
		 */

		int g = num % 10;
		int s = num / 10 % 10;
		int b = num / 100 % 10;
		int q = num / 1000 % 10;

		System.out.println("千位数：" + q + " 百位数：" + b + " 十位数：" + s + " 个位数：" + g);
		System.out.println("四个位数的和为：" + (q + s + b + g));

	}

}
