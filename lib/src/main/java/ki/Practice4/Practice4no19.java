package ki.Practice4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice4no19 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		double sum = 0;
		double count = 0;
		while (true) {
			System.out.println("値を入力してください");
			try {
				double x1 = x.nextDouble();
				if (x1 == 0) {
					break;
				} else {
					count++;
					sum += x1;
				}
			} catch (InputMismatchException e) {
				System.out.println("入力値が不正です");
			}
		}
		System.out.println(sum / count);
	}
	// 無限ループ
	// for(::) {

	// }
}
