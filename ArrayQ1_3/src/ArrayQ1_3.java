
public class ArrayQ1_3 {

	public static void main(String[] args) {

		int result[][][] = new int[10][10][10];

		//for文でxyzの積を配列に代入
		for(int x=0;x<10;x++) {
			for(int y=0;y<10;y++) {
				for(int z=0;z<10;z++) {
					result[x][y][z] = x*y*z;
				}//z for END
			}//y for END
		}//x for END

		//入力
		System.out.println("一桁の数値を３つ入力してください。");
		int a = new java.util.Scanner(System.in).nextInt();
		int b = new java.util.Scanner(System.in).nextInt();
		int c = new java.util.Scanner(System.in).nextInt();

		System.out.println(result[a][b][c]);

	}//main END
}//Class END
