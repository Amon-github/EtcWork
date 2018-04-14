package com.amon.fromClass;

import java.util.Scanner;

/**
 * @author Amon E-mail:248779716@qq.com
 * @version 创建时间：2018年3月21日 上午8:46:25
 *  题目练习
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

	/**题目1：
	 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，
	 * 小兔子长到第三个月后每个月又生一对兔子。假如兔子都不死，要求输出一年内兔子的数量是多少。 
	 * 1 1 2 3 5 8 13 21 34 55 89... n=(n-1)+(n-2);
	 */
	public static void test1() {
		int s1 = 1;
		int s2 = 1;
		int x;
		System.out.println("请输入月份：");
		int mon = new Scanner(System.in).nextInt();

		if (mon < 3 && mon > 0) {
			System.out.println("兔子数量是：" + 2);
		} else if (mon >= 3) {
			for (int i = 3; i <= mon; i++) {
				x = s1;
				s1 = s2;
				s2 = x + s2;
			}
			System.out.println("兔子对数是：" + s2 + " 数量是：" + s2 * 2);
		}
	}

	
	/**题目2：
	 * 判断10-105之间有多少个素数，并输出所有素数。
	 * 【素数又称为质数，定义为在大于1的自然数中，除了1和它本身以外不再有其他因数的数】
	 */
	public static void test2() {
		int i, j;
		System.out.println("10-105的素数为：");
		for (i = 10; i <= 105; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0)
					break;
			}
			if (i <= j)
				System.out.println(i);
		}

	}
	
	
	
	/**题目3：
	 * 判断100到500之间，哪些数是水仙花数。【水仙花数是指一个 n 位正整数 ( n≥3 )，
	 * 它的每个位上的数字的 n 次幂之和等于它本身。（例如：1^3 + 5^3+ 3^3 = 153）】	
	 */
	public static void test3() {
		for (int i = 100; i < 500; i++) {
			int g=i%10;
			int s=i/10%10;
			int b=i/100%10;
			if ((Math.pow(g,3)+Math.pow(s,3)+Math.pow(b,3)==i)) {
				System.out.println("百位数为："+b+" 十位数为："+s+"  个位数为："+g);
				System.out.println("幂为：          "+(int)Math.pow(b,3)+"      "+(int)Math.pow(s,3)+"      "+(int)Math.pow(g,3));
				System.out.println(i);
				System.out.println("============端=庄=而=雅=的=分=割=线=====Amon=========");
			}
		}
	}
	
	
	
	/**题目4
	 * 求1-100之间，有哪些数是完数。【完全数（Perfect number），又称完美数或完备数，是一些特殊的自然数。
	 * 它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。例如：6=1+2+3】
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
				System.out.println("完数："+i);
				System.out.println("============端=庄=而=雅=的=分=割=线=====Amon=========");
			}
			System.out.println(i);
		}
	}
	
	
	
	
	/**题目5
	 * 判断一个整数是几位数，并按照逆序输出。
	 */
	public static void test5(){
		System.out.println("请输入一个整数");
		String n=new Scanner(System.in).nextLine();
		char[] array=n.toCharArray();
		System.out.println("这个整数是"+array.length+"位数");
		System.out.print("逆序输出为：");
		for (int i =array.length-1; i >=0; i--) {
			System.out.print(array[i]);
		}
		System.out.println();
		System.out.println("============端=庄=而=雅=的=分=割=线=====Amon=========");

	}
	
	
	
	
	/**题目6
	 * 输出2000年到3000年中的闰年。
	 */
	public static void test6(){
		for (int i = 2000; i <3000 ; i++) {
			if (i%100==0) {
				if (i%400==0) {
					System.out.println(i+"年是闰年");
				}
			}else if (i%4==0) {
				System.out.println(i+"年是闰年");
			}
		}

	}
	
	/**练习
	 * 九九乘法表
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
