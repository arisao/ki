package ki.Practice4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice4no18 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int sum = 0;
		while (true) {
			System.out.println("値を入力してください");
			try {
				int x1 = x.nextInt();
				if (x1 == 0) {
					break;
				} else {
					sum += x1;
				}
			} catch (InputMismatchException e) {
				System.out.println("入力値が不正です");
			}
		}
			System.out.println(sum);
		}
	//無限ループ
	//for(::) {
		
	//}
	}
