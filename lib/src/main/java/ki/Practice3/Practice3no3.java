package ki.Practice3;

import java.util.Scanner;

public class Practice3no3 {
	public static void main(String[] args) {
		System.out.println("曜日を入力してください。曜日は月〜土曜日を入力することができます。");
		Scanner youbi = new Scanner(System.in);
		String youbiyoyaku = youbi.nextLine();
		System.out.println("希望の時間帯を入力してください。時間帯は午前、午後、夜間の３つです。");
		Scanner jikan = new Scanner(System.in);
		//String yoyakujikan = jikan.nextLine();
		String yoyakujikan = null;
		if (youbiyoyaku.equals( "月曜日" ) || youbiyoyaku.equals("木曜日")) {
			if ("午前".equals(yoyakujikan) ||"午後".equals(yoyakujikan) || "夜間".equals(yoyakujikan)) {
				System.out.println("受診");
			} else {
				System.out.println("error");
			}
		} else if (youbiyoyaku == "火曜日" || youbiyoyaku == "金曜日") {
			if (yoyakujikan == "午前") {
				System.out.println("休診");
			} else if (yoyakujikan == "午後" || yoyakujikan == "夜間") {
				System.out.println("受診");
			} else {
				System.out.println("error");
			}
		} else if (youbiyoyaku == "水曜日") {
			if (yoyakujikan == "夜間") {
				System.out.println("休診");
			} else if (yoyakujikan == "午前" || yoyakujikan == "午後") {
				System.out.println("受診");
			} else {
				System.out.println("error");
			}
		} else if (youbiyoyaku == "土曜日") {
			if (yoyakujikan == "午前") {
				System.out.println("受診");
			} else if (yoyakujikan == "夜間" || yoyakujikan == "午後") {
				System.out.println("休診");
			} else {
				System.out.println("error");
			}
		} else {
			System.out.println("error");
		}

	}
}
