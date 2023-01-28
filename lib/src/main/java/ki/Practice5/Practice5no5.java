package ki.Practice5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice5no5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("数値を入力してください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			//valueに入力した値が入る
			int value = Integer.parseInt(br.readLine());
			//配列を宣言
			int binary[] = new int[16];
			//二進数を保持
			String str = Integer.toBinaryString(value);
			//★一文字ずつバイナリに変換する
	        //配列 binaryに0か1を代入する
			for (int i = 0; i < 16; i++)
			System.out.println(str.substring(i, i + 1));
				//System.out.print(binary[i]);
		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			
		}



	}

}
