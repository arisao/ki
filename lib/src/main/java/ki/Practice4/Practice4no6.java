package ki.Practice4;

import java.util.Scanner;

public class Practice4no6 {
	static int kachi = 0;
	static int makeru = 0;
	
	public static void main(String[] args) {
		System.out.println(game(10));
		System.out.println("ゲームの結果、勝ちは" + kachi + "負けは" + makeru);
	}

	public static int game(int taisen) {
	
		System.out.println("0か1を入力してください");
		Scanner x = new Scanner(System.in);
		for (int i = 1; i <= taisen; i++) {
			int x1 = x.nextInt();
			if (x1 == 1) {
				kachi += 1;
			}
			else if(x1 == 0) {
				makeru += 1;
			}
			else {
				System.out.println("不正な値です。");
			}
		}
		int kekka = taisen - makeru;
		return kekka;


	}
}
