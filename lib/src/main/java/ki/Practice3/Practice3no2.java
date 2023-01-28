package ki.Practice3;

import java.util.Scanner;

public class Practice3no2 {

	public static void main(String[] args) {
		System.out.println("値を入力してください");
		Scanner x = new Scanner(System.in);
		int x1 = x.nextInt();
		if (x1 % 2 == 0) {
		System.out.println(x1 + "は偶数です" );
		}else {
			System.out.println(x1 + "は奇数です" );
		}
		

		System.out.println("値を入力してください");
		Scanner y = new Scanner(System.in);
		int y1 = y.nextInt();
		
		if (y1 >= 0 && y1 % 2 == 0) {
			System.out.println(y1 + "は正の偶数です");
		}
		else if (y1 >= 0 && y1 % 2 == 1) {
			System.out.println(y1 + "は正の奇数です");
		}
		else if (y1 < 0 && y1 % 2 == 0) {
			System.out.println(y1 + "は負の偶数です");
		}
		else {
			System.out.println(y1 + "は負の奇数です");
		}
		
		System.out.println("数学試験の結果を入力してください。");
		Scanner test = new Scanner(System.in);
		int test1 = test.nextInt();
		if (test1 >= 60) {
			System.out.println("合格");
		}
		else {
			System.out.println("不合格");
		}
		
		System.out.println("国語試験の結果を入力してください。");
		Scanner testkokugo = new Scanner(System.in);
		int test2 = testkokugo.nextInt();
		if (test2 >= 80) {
			System.out.println("たいへんよくできました");
		}
		else if(test2 < 80 && test2 >= 60) {
			System.out.println("よくできました");
		}
		else {
			System.out.println("残念でした");
		}
		
		System.out.println("英語試験の結果を入力してください。");
		Scanner testenglish = new Scanner(System.in);
		int test3 = testenglish.nextInt();
		if (test3 >= 80) {
			System.out.println("優");
		}
		else if(test3 < 80 && test3 >= 70) {
			System.out.println("良");
		}
		else if(test3 < 70 && test3 >= 60) {
			System.out.println("可");
		}		
		else {
			System.out.println("不可");
		}
		
		System.out.println("中間試験の結果を入力してください");
		Scanner testchukan = new Scanner(System.in);
		int chukan = testchukan.nextInt();
		
		System.out.println("期末試験の結果を入力してください");
		Scanner testkimatu = new Scanner(System.in);
		int kimatu = testkimatu.nextInt();
		
		if (chukan >= 60 && kimatu >= 60) {
			System.out.println("合格");
		}
		else if (chukan + kimatu >= 130) {
			System.out.println("合格");
		}
		else if (chukan + kimatu >= 100 && chukan >= 90 || kimatu >= 90) {
			System.out.println("合格");
		}
		else {
			System.out.println("不合格");
		}
	}
}


