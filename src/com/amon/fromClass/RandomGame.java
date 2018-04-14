package com.amon.fromClass;

import java.util.Random;
import java.util.Scanner;

/**
* @author Amon E-mail:248779716@qq.com
* @version 创建时间：2018年3月27日 上午10:39:13-10：45:13
* 猜数字，猜拳
*/
public class RandomGame  {
	static long timestart;

	public static void main(String[] args) {
//		startGame();	//猜数字游戏
//		gase();			//猜拳游戏
		
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
		System.out.println("到你出拳了！(1：剪刀|2：石头|3：布)");
		String yourNum=sc.next();
		if (!"1".equals(yourNum)&&!"2".equals(yourNum)&&!"3".equals(yourNum)) {
			System.out.println("输入有误");
		}else {
			System.out.println("你选择是："+yourNum);
			if ("1".equals(yourNum)) {
				if ("1".equals(num)) {
					System.out.println("平局");
				}else if ("2".equals(num)) {
					System.out.println("你输了");
				}else if ("3".equals(num)) {
					System.out.println("厉害啊，你赢了！");
				}
			} else if ("2".equals(yourNum)) {
				if ("1".equals(num)) {
					System.out.println("厉害啊，你赢了！");
				}else if ("2".equals(num)) {
					System.out.println("平局");
				}else if ("3".equals(num)) {
					System.out.println("你输了");
				}
			}else if ("3".equals(yourNum)) {
				if ("1".equals(num)) {
					System.out.println("你输了");
				}else if ("2".equals(num)) {
					System.out.println("厉害啊，你赢了！");
				}else if ("3".equals(num)) {
					System.out.println("平局");
				}
			}
			System.out.println("鲁班【电脑】："+num);
		}
		
		
		
		
		
	}
	
	
	
	
	/**
	 * 开始游戏和循环游戏逻辑
	 */
	static void startGame(){
		randomGame();
		while (true) {
			System.out.println("还要继续吗？（输入任意键退出，输入y继续游戏！）");
			Scanner s=new Scanner(System.in);
			String inter=s.next();
			if ("y".equals(inter)) {
				randomGame();
			}else{
				System.out.println("游戏结束，感谢体验！");
				break;
			}
		}
	}
	/**
	 * 猜数字游戏逻辑
	 */
	static void randomGame(){
		timestart=timestart=System.currentTimeMillis();
		Random r=new Random();
		int ran=r.nextInt(100000);
		System.out.println("游戏开始！随机数已经生成（1~10万的整数），开始猜吧！");
		while (true) {
			Scanner scanner=new Scanner(System.in);
			int geta=scanner.nextInt();
			if (geta!=ran) {
				if (geta>ran) {
					System.out.println("你输入的数有点大了哦！");
				}else {
					System.out.println("小了！");
				}
			}else {
				System.out.println("哟，可以啊！猜对了！");
				System.out.println("用时："+(System.currentTimeMillis()-timestart)/1000+"秒");
				
				break;
			}
			
		}
		
		
		
	}

}
