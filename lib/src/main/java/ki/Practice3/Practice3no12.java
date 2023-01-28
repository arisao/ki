package ki.Practice3;

import java.util.Scanner;

public class Practice3no12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("好きな寿司を番号で選んでください。");
		System.out.println("選択は、“1：まぐろ　2：えび　3：こはだ　４：いくら 5：サーモン　６：はまち　７；イカ　８；たまご　９：うに　１０：たこ"
				+ "１１:　納豆巻き　１２：中トロ");
		Scanner s = new Scanner(System.in);
		int s1 = s.nextInt();
		switch (s1) {
		case 1:
			System.out.println("大吉");
			break;
		case 2:
			System.out.println("大凶");
			break;
		case 3:
			System.out.println("吉");
			break;
		case 4:
			System.out.println("凶");
			break;
		case 5:
			System.out.println("大凶");
			break;
		case 6:
			System.out.println("大吉");
			break;
		case 7:
			System.out.println("大吉");
			break;
		case 8:
			System.out.println("大大吉");
			break;
		case 9:
			System.out.println("凶");
			break;
		case 10:
			System.out.println("吉");
			break;
		case 11:
			System.out.println("凶");
			break;
		case 12:
			System.out.println("大大凶");
			break;
		default:
			System.out.println("不正な値です。");

		}
	}

}
