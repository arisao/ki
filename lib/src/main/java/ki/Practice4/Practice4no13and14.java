package ki.Practice4;

import java.util.Scanner;

public class Practice4no13and14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int strike = 0;
		int ball = 0;
		for (int i = 0; ball < 4 && strike < 3; i++) {
			System.out.println("ストライク＝１、ボール＝２？、ファウル＝3？");
			Scanner x = new Scanner(System.in);
			int x1 = x.nextInt();
			if (x1 == 1) {
				strike += 1;
			}
			else if (x1 == 2) {
				ball += 1;
			}
			else if (x1 == 3) {
				if (strike < 2) {
					strike += 1;
			    }
			}
			else {
				System.out.println("不正な値です。");
			}
	    }
		System.out.println(ball + "ボール" + strike + "ストライク");
	}
}
