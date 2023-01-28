package ki.Practice4;

import java.util.Scanner;

public class Practice4no8 {
	public static void main(String[] args) {
		int max = 0;
		int[] data;
		data = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.println("値を入力してください");
			Scanner x = new Scanner(System.in);
			int x1 = x.nextInt();
			data[i] = x1;
			max = Math.max(max, x1);
	    }
		System.out.println("最大値は" + max);

		
		
	}
}
