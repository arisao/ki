package ki.Practice4;

import java.util.Scanner;

public class Practice4no20 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner x = new Scanner(System.in);
		int x1 = x.nextInt();
		for (int i = 0; i < x1; i++) {
			for (int h = 0; h < i; h++) {
				System.out.print("$");
			}
			System.out.println("$");
		}
	}

}
