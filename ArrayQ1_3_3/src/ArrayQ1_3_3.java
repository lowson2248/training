
public class ArrayQ1_3_3 {

	public static void main(String[] args) {

		int[][] A = new int[][] {{2,3,1},{4,5,2}}; //length 3
		int[][] B = new int[][] {{3,1},{5,3},{2,4}};	//length 2
		int[][] ans = new int[A.length][A.length];  //答案格納用

		/* 行列計算(答案)
		 * A         B     answer
		 * 2 3 1  *  3 1 = 23 15
		 * 4 5 2	 5 3   41 27
		 * 			 2 4
		 */

		//計算と格納
		for(int i = 0;i<A.length;i++) {
			for(int j=0; j<A.length;j++) {
				for(int k=0;k<B.length;k++) {
					ans[i][j] += A[i][k] * B[k][j];
				}//k-for END
			}//j-for END
		}//i-for END

		//出力用for文
		for(int[] num : ans) {
			for(int num2 : num) {
				System.out.print(num2 + " ");
			}//num2-for END
				System.out.println("");
		}//num-for END

	}
}
