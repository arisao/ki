package ki.Practice4;

import java.util.Scanner;

public class Practice4no5 {
	
	public static void main(String[] args) {
		System.out.println(heikin(3));
	}

	public static int heikin(int kaisu) {
		int sum = 0;
		System.out.println("値を入力してください");
		Scanner x = new Scanner(System.in);
		for (int i = 1; i <= kaisu; i++) {
			int x1 = x.nextInt();
			sum += x1;
		}
		return sum / kaisu;

	}
}
