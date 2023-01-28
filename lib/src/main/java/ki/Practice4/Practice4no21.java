package ki.Practice4;

import java.util.Scanner;

public class Practice4no21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("数値を入力してください");
		Scanner x = new Scanner(System.in);
		int x1 = x.nextInt();
		// ↗︎︎を表す

		// "↘︎"を表す
		for (int i = 0; i < x1; i++) {
			for (int h = 0; h < x1; h++) {
				if (i == h || x1 == i + h + 1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
