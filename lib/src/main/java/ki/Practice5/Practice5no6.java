package ki.Practice5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practice5no6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 二次元配列を宣言
		int kuku[][] = new int[9][9];

		// 配列 kuku に値を代入する
		for (int i = 0; i < 9; i++) {
			// 縦の行を表す
			for (int j = 0; j < 9; j++) {
				// 横の行を表す
				kuku[i][j] = (i + 1) * (j + 1);
				// " %2d"の意味は？２桁文の幅をとる。
				System.out.printf(" %2d", kuku[i][j]);
			}
			System.out.println();
		}

	}
}
