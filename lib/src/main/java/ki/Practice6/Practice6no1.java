package ki.Practice6;

import java.util.Scanner;

public class Practice6no1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("数字を入力してください");
		Scanner x = new Scanner(System.in);
		int x1 = x.nextInt();
		pow(x1);
	}
	
	public static void pow(int a) {
		System.out.println(Math.pow(a, 2.0));
		return;
	}

}
