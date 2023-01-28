package ki.Practice5;

import java.util.Arrays;
import java.util.Scanner;

public class Practice5no4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 配列を生成する
		int[] num;
		num = new int[10];
		int sum = 0;
		Scanner x = new Scanner(System.in);

		for (int i = 0; i <= 10; i++) {
			System.out.println("数を入力してください");
			int x1 = x.nextInt();
			sum += x1;
			num[i] = x1;
			if (sum >= 100) {
				break;
			}
		}
		for (int h = 0; h < 10; h++) {
			if (num[h] > 0) {
				System.out.print(num[h] + " ");
			}
		}
		System.out.println(" ");
		System.out.println("合計が" + sum + "です");
	}
}