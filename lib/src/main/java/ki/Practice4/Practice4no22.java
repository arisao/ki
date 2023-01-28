package ki.Practice4;

import java.util.Scanner;

public class Practice4no22 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int fibo = 1; 
		int n1 = 0;
		int n2 = 1;
		for (int i = 1; i <= 16; i++) {
			//i番目のfiboを表示
				System.out.print(fibo + ",");
			//次のfiboを計算
				fibo = n1 + n2;
			//過去２回の値を計算
				n1 = n2;
				n2 = fibo;
			
		}
	}

}
