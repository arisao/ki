package ki.Practice3;

import java.util.Calendar;
import java.util.Scanner;

public class Practice3no13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("月を入力してください。");
		Scanner m = new Scanner(System.in);
		int m1 = m.nextInt();
		
		switch (m1) {
		case 1:
			System.out.println(nissuukeisan(m1));
			break;
		case 2:
			System.out.println(nissuukeisan(m1));
			break;
		case 3:
			System.out.println(nissuukeisan(m1));
			break;
		case 4:
			System.out.println(nissuukeisan(m1));
			break;
		case 5:
			System.out.println(nissuukeisan(m1));
			break;
		case 6:
			System.out.println(nissuukeisan(m1));
			break;
		case 7:
			System.out.println(nissuukeisan(m1));
			break;
		case 8:
			System.out.println(nissuukeisan(m1));
			break;
		case 9:
			System.out.println(nissuukeisan(m1));
			break;
		case 10:
			System.out.println(nissuukeisan(m1));
			break;
		case 11:
			System.out.println(nissuukeisan(m1));
			break;
		case 12:
			System.out.println(nissuukeisan(m1));
			break;
		default:
			System.out.println("不正な値です。");
		}

	}
	public static int nissuukeisan(int m1) {
		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.MONTH, m1-1);
		return c1.getActualMaximum(Calendar.DAY_OF_MONTH);
	}

}
