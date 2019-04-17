public class Main {

	public static void main(String[] args) {


		String sc = new java.util.Scanner(System.in).nextLine();

		int month = Integer.parseInt(sc);

		//エラー処理
		if(12 < month) {
			System.out.println("数値エラー : 正しい月数を入力してください。");
			return;
		}


		System.out.print("IFの場合 : ");
		/*** IFの場合 ***/
		if(month < 3 || 11 < month) {
			System.out.println(month + "月は冬です。");
		}else if(2<month && month <6){
			System.out.println(month + "月は春です。");
		}else if(5<month && month<9){
			System.out.println(month + "月は夏です。");
		}else {
			System.out.println(month + "月は秋です。");
		}
		/*************/


		System.out.print("SWITCHの場合 : ");
		/*** Switchの場合 ***/
		switch(month) {
			case 12:
			case 1:
			case 2:
				System.out.println(month + "月は冬です。");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println(month + "月は春です。");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(month + "月は夏です。");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(month + "月は秋です。");
				break;
		}//switch END

	}

}
