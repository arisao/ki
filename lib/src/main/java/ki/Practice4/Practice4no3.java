package ki.Practice4;

public class Practice4no3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1; i <= 8; i++) {
			System.out.println(kaijyo(i));
		}

		System.out.println();
	}

	public static int kaijyo(int shisu) {
		//底
		int bottom = 2;
		int result = 1;
		for (int i = 1; i <= shisu; i++) {
			result *= bottom;
		}

		return result;

	}

}
