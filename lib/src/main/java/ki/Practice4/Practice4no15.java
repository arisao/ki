package ki.Practice4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice4no15 {
	public static void main(String[] args) {
		System.out.println("数字を入力して下さい。");

		Scanner x = new Scanner(System.in);
		try {
			int x1 = x.nextInt();

			if (x1 < 2) {
				System.out.println(x1 + "は素数ではありません。");
				return;
			}

			for (int i = 2; i < x1; i++) {
				if (x1 % i == 0) {
					System.out.println(x1 + "は素数ではありません。");
					return;
				}
			}

			System.out.println(x1 + "は素数です。");

		} catch (InputMismatchException e) {
			System.out.println("数字以外は入力出來ません");
		}

	}
}
