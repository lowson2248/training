public class Main {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();

		for(int i=1;i<101;i++) {
			sb.append(i).append(",");
		}//for END

		String s = sb.toString();
		String[] a = s.split(",");

		//生成文字表示用
		for(String a_num : a) {
			System.out.println(a_num);
		}//for END

	}
}
