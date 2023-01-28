package ki.Practice3;

import java.util.Scanner;

public class Practice3no11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("月を入力してください。");
		Scanner m = new Scanner(System.in);
		int m1 = m.nextInt();
		switch (m1) {
		case 1:
			System.out.println("元日、成人の日");
			break;
		case 2:
			System.out.println("建国記念の日、天皇誕生日");
			break;
		case 3:
			System.out.println("春分の日");
			break;
		case 4:
			System.out.println("昭和の日");
			break;
		case 5:
			System.out.println("憲法記念日、みどりの日、こどもの日");
			break;
		case 6:
			System.out.println("祝日はありません。");
			break;
		case 7:
			System.out.println("海の日");
			break;
		case 8:
			System.out.println("山の日");
			break;
		case 9:
			System.out.println("敬老の日、秋分の日");
			break;
		case 10:
			System.out.println("体育の日");
			break;
		case 11:
			System.out.println("文化の日、勤労感謝の日");
			break;
		case 12:
			System.out.println("祝日はありません。");
			break;
		default:
			System.out.println("不正な値です。");

		}

	}

}
