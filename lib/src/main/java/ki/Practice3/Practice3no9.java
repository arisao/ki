package ki.Practice3;

import java.util.Scanner;

public class Practice3no9 {
	public static void main(String[] args) {
		System.out.println("値を入力してください");
		Scanner x = new Scanner(System.in);
		int x1 = x.nextInt();
		System.out.println("値を入力してください");
		Scanner y = new Scanner(System.in);
		int y1 = y.nextInt();
		if (x1 < y1 && (x1 % 2 == 0 && y1 % 2 == 0)) {
		System.out.println("x は y より小さく、かつ、x と y は共に偶数である。");
		}
		else if ((x1 == y1) && (x1 < 0) && (y1 < 0)) {
			System.out.println("x と y は等しく、かつ、負の数である。");
		}
		else if (x1 < y1 || x1 % 2 == 0) {
			System.out.println("x は y より小さい、または、x は偶数である。");
		}
		else if ((x1 < 10 || x1 >= 100) && (y1 >= 10 && y1 <= 100) ) {
			System.out.println("x は 10 以下または 100 以上で、かつ、y は 10 以上かつ 100 以下である。");
		}
		else if (!(x1 < 0 && y1 < 0) ) {
			System.out.println("xもyも負の数である、ではない。");
		}
		else {
			System.out.println("どれにも当てはまりません");
		}



	}
}
