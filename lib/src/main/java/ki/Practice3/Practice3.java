package ki.Practice3;

import java.util.Scanner;



public class Practice3 {
	//3-1から3-4まで
	

	public static void main(String[] args) {
		System.out.println("値を入力してください");
		System.out.println("xは");
		Scanner x = new Scanner(System.in);
		int x1 = x.nextInt();
		System.out.println("yは");
		Scanner y = new Scanner(System.in);
		int y1 = y.nextInt();
		if (x1 > y1) {
			System.out.println("xはyより大きい");
		}
		
		System.out.println("値を入力してください");
		System.out.println("aは");
		Scanner a = new Scanner(System.in);
		int a1 = a.nextInt();
		System.out.println("bは");
		Scanner b = new Scanner(System.in);
		int b1 = b.nextInt();
		System.out.println(Math.max(a1, b1));
		
		System.out.println("値を入力してください");
		System.out.println("cは");
		Scanner c = new Scanner(System.in);
		int c1 = c.nextInt();
		System.out.println("dは");
		Scanner d = new Scanner(System.in);
		int d1 = d.nextInt();
		if (c1 > d1) {
			System.out.println("cはdより大きい");
		}
		else if (c1 < d1) {
			System.out.println("dはcより大きい");
		}
		else {
			System.out.println("cとdは等しい");
		}

	}

}
