package ki.Practice4;

import java.util.Scanner;

public class Practice4no7 {

	static int kyojinScore = 0;
	static int hansinScore = 0;
	
	public static void main(String[] args) {
		game(10);
		System.out.println("巨人は" + kyojinScore + "阪神は" + hansinScore);
		if (kyojinScore > hansinScore) {
			System.out.println("巨人の勝ちです。");
		}
		else if (kyojinScore == hansinScore) {
			System.out.println("引き分けです。");
	    }
		else {
			System.out.println("阪神の勝ちです。");
		}
	}
	public static void game(int taisen) {
		for (int i = 1; i <= taisen; i++) {
			System.out.print("巨人の得点は");
			Scanner x = new Scanner(System.in);		
			int x1 = x.nextInt();
			if (x1 >= 0) {
				kyojinScore += x1;
			}
			else {
				System.out.println("不正な値です。");
			}
			System.out.print("阪神の得点は");
			Scanner y = new Scanner(System.in);
			int y1 = y.nextInt();
			if (y1 >= 0) {
				hansinScore += y1;
			}
			else {
				System.out.println("不正な値です。");
			}
		}
	}

}
