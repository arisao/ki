package ki.Practice5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Practice5no7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("9以下の1桁の数値を入力してください");
		Scanner x = new Scanner(System.in);
		int x1 = x.nextInt();
		System.out.println("9以下の1桁の数値を入力してください");
		Scanner y = new Scanner(System.in);
		int y1 = y.nextInt();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//数値のチェック
		if (x1 > 9) {
			System.out.println("数値を９以下にしてください");
			return;
		}
		if (y1 > 9) {
			System.out.println("数値を９以下にしてください");
			return;
		}
		
		// 二次元配列を宣言
		int kuku[][] = new int[9][9];

		// 配列 kuku に値を代入する
		for (int i = 0; i < 9; i++) {
			// 縦の行を表す
			for (int j = 0; j < 9; j++) {
				// 横の行を表す
				kuku[i][j] = (i + 1) * (j + 1);	
			}
		}
		System.out.println("計算結果" + kuku[x1 - 1][y1 - 1]);
	}
}
