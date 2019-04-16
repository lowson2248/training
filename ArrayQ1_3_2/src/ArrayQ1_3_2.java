
public class ArrayQ1_3_2 {

	public static void main(String[] args) {
		int result[][] = new int[][] {{98,73,66},{77,75,88},{80,92,83}};
		int calced[][] = new int[5][5];
		int ave = 0;
		int i = 0;
		int j = 0;
		String kyoka[] = new String[] {"国語","数学","英語"};
		String student[] = new String[] {"A","B","C"};


		for(int[] res1:result) {
			for(j=0;j<student.length;j++) {
				ave += res1[j];
			}//for END
				calced[i][j] = ave / res1.length;
				ave = 0;
				System.out.println(student[i] + "さんの平均点は、" + calced[i][j] + "です。");
		}//for END

		ave = 0;

		for(i = 0 ; i< kyoka.length;i++) {
			for(j=0;j<kyoka.length;j++) {
				ave += result[j][i];
			}
				System.out.println(kyoka[i] + "の平均点は、" + ave / kyoka.length + "です。");
				ave = 0;
		}//for END


	}

}
