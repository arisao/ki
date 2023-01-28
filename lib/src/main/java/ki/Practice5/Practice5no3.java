package ki.Practice5;

import java.util.Arrays;
import java.util.Scanner;

public class Practice5no3 {

	public static void main(String[] args) {
		int[] num;
		// 配列を生成する
		num = new int[10];
		int[] kisu = new int[10];
		int[] gusu = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("数字を入力してください");
			Scanner x = new Scanner(System.in);
			int x1 = x.nextInt();
			// num[i] = x1;
			if (x1 % 2 == 0) {
				gusu[i] = x1;
			} else {
				kisu[i] = x1;
			}
			if (i == 9) {
				System.out.print("偶数:");
				for (int h = 0; h < 10;  h++) {
					if (gusu[h] > 0) {
						System.out.print(" " + gusu[h]);	
					}
	
				}
				System.out.println("");
				System.out.print("奇数:");
				for (int h = 0; h < 10;  h++) {
					if (kisu[h] > 0) {
						System.out.print(" " + kisu[h]);	
					}
	
				}

			}
		}

	}
}
