package com.amon.fromClass;

import java.util.Random;
/**
 * 
 * @author Administrator
 * 题目1：去除数组中的0，返回新数组
 * 题目2：模拟斗地主发牌，求炸弹数量
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
		System.out.println("运行时间："+(System.currentTimeMillis()-begin));
	}

	/**
	 * 練習1
	 * 
	 * @param a
	 * @return 將數組中的0去掉然後返回一個新數組
	 */
	static int[] test(int[] a) {
		int count = 0;
		// 求出一个数组除了0之后的个数
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
	 * 練習2 模擬鬥地主發牌過程
	 */
	static void test2() {
		int[] a = new int[54]; // 产生扑克牌
		// 随机产生数组下标，如果该位置不是0的话，插入循环到的数字，如果是0的话，再随机产生数组下标，判断，插入，重复此操作
		// 循环插入52（4*13）个数字之后，数组里面会有两个位置是0；
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
		
		// 数组里面两个是0的位置插入两张鬼牌，至此一副随机的扑克牌产生
		for (int j = 0; j < a.length; j++) {
			if (a[j]==0) {
				a[j]=14;
			}
		}
		
		
		// 定义三位玩家（A,B,C），将扑克牌前51张牌分给三位玩家（第一位是前17张，第二位是前34张，后面17张是第三位的），最后3张为底牌。
		int[] A = new int[17];
		int[] B = new int[17];
		int[] C = new int[17];

		for (int j = 0; j < 17; j++) { // 将扑克牌前17张牌分给A玩家
			A[j] = a[j];
		}
		int B_index = 0;
		for (int j = 17; j < 34; j++) { // 将扑克牌17~34张牌分给B玩家
			B[B_index] = a[j];
			B_index++;
		}
		int C_index = 0;
		for (int j = 34; j < 51; j++) { // 将扑克牌前34~51张牌分给C玩家
			C[C_index] = a[j];
			C_index++;
		}

		
		// 最后的输出语句
		System.out.println("底牌：" + a[51] + " " + a[52] + " " + a[53] + " ");
		System.out.println("========================================");
		System.out.print("玩家1    炸弹情况：");
		System.out.println(""+getBomb2(A)+"个");
		for (int j = 0; j < A.length; j++) {
			System.out.print(A[j] + " ");
		}
		System.out.println("");
		System.out.println("========================================");
		System.out.print("玩家2    炸弹情况：");
		System.out.println(""+getBomb2(B)+"个");
		for (int j = 0; j < B.length; j++) {
			System.out.print(B[j] + " ");
		}
		System.out.println("");
		System.out.println("========================================");
		System.out.print("玩家3    炸弹情况：");
		System.out.println(""+getBomb2(C)+"个");
		for (int j = 0; j < C.length; j++) {
			System.out.print(C[j] + " ");
		}
		System.out.println("");

	}

	
	/**
	 * 获取炸弹数量
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
				System.out.print((i+1)+"炸 ");
				couBomb++;
			}
		}
		if(bomb[13]==2){
			System.out.print("王炸 ");
			couBomb++;
		}
		return couBomb;
		
}
}
