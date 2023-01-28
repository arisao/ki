package ki.Practice5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Practice5no2 {

	public static void main(String[] args) {
		int[] num;
		// 配列を生成する
		num = new int[10];
		try {
			for (int i = 0; i < num.length; i++) {
				System.out.println("数字を入力してください");
				Scanner x = new Scanner(System.in);
				int x1 = x.nextInt();
				num[i] = x1;
			}
			System.out.println("入力した数と逆にしました");
			for (int i = num.length; i > 0; i--) {
				System.out.print(num[i - 1] + ",");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
