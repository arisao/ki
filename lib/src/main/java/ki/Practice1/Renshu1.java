package ki.Practice1;

import org.apache.commons.math3.analysis.function.Pow;

public class Renshu1 {
     static int x = 11;
     static int a = 13;
     static int b = 17;
     static int c;
     static int d = 7;
     static int e = 19;
     static int f = 23;
     static int g = 5;
     static int h = 100;
     static int i = 200;
     
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Hello World");
		System.out.println("x=" + x);
		System.out.println(a + "," + b);
		System.out.println(c = a + b);
		System.out.println(13 * 17);
		d = d * 3;
		System.out.println(d);
		d = d / 2;
		System.out.println(d);
		int z = e * f;
		System.out.println(z);
		pow(2);
		pow(3);
		pow(4);
	
		//g = g / 2; 
	    //int h = g % 2;
		System.out.println(g / 2);
		System.out.println(g % 2);
		
		System.out.println(h++);
		System.out.println(h);
		
		//インクリメント
		System.out.println(++i);
		//デクリメント
		System.out.println(--i);
		
	}
	
	public static void pow(double a) {
		
		System.out.println(Math.pow(a, 1.0));
		System.out.println(Math.pow(a, 2.0));
		System.out.println(Math.pow(a, 3.0));
	}
	}
