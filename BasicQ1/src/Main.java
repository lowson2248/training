import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("整数を二つ入力してください：");
		int a = Integer.parseInt(scanner.next());
    	int b = Integer.parseInt(scanner.next());
		int gcd = 0; //最大公約数を格納する変数

		/** 以下に最大公約数を求める処理 **/
		for(int i=a;i>1;i--) {
			if(a%b == 0) {
				break;
			}
				gcd = a%b;
				a = b;
				b = gcd;
		}

		System.out.println("最大公約数は" + gcd);
	}
}
