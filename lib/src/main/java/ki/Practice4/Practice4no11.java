package ki.Practice4;

import java.util.Scanner;

public class Practice4no11 {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("個数を入力してください");
		Scanner x = new Scanner(System.in);
		int x1 = x.nextInt();
		for (int i = 0; i < x1; i++) {
				System.out.print(i % 10);	
	    }

	}

}
