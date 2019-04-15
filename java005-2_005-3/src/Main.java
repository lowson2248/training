
public class Main {

	public static void main(String[] args) {
		email("メールのタイトル","メールの宛先アドレス","メールの本文");

	}

	private static void email(String title,String address,String text) {

		System.out.println("「" + address + "」に、以下のメールを送信しました。");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);

	}


	//emailオーバーロード(005-3)
	private static void email(String address,String text) {
		System.out.println("「" + address + "」に、以下のメールを送信しました。");
		System.out.println("件名: 無題");
		System.out.println("本文:" + text);
	}



}
