package ki.Practice5;

import java.util.Arrays;
import java.util.Scanner;

public class Practice5no1 {

	public static void main(String[] args) {
		int[] num;
		//配列を生成する
		num = new int[10];
		for (int i = 0; i < num.length; i++) {
		System.out.println("数字を入力してください");
		Scanner x = new Scanner(System.in);
		int x1 = x.nextInt();
		num[i] = x1 * 2;
			
		}
		System.out.println(Arrays.toString(num));
	}
}
