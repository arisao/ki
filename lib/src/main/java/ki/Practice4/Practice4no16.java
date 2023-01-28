package ki.Practice4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice4no16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("数字を入力して下さい。");

		Scanner x = new Scanner(System.in);
		try {
			int x1 = x.nextInt();

			if (x1 < 2) {
				System.out.println("素因数分解すると、" + x1 + "です");
				return;
			}

			for (int i = 2; i < x1; i++) {
				if (x1 % i == 0) {
					System.out.println(i);
					x1 = x1 / i;
					i = 1;
				}
			}
			System.out.println(x1);

		} catch (InputMismatchException e) {
			System.out.println("数字以外は入力出來ません");
		}

	}
}
