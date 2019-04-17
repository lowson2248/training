import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//アルファベット抜き
		deleteAlpha();
		//FNとLNを分けて出力
		dispName();
	}//main END


	//アルファベット抜きメソッド
	public static void deleteAlpha() {
		String str = "プFiログVラムgK開gr発PwのO現li場cWでxlはUH必ずBとXいpっgてよhwいLほwど文J字列saにKh関lすgOるug処D理がgu要mWe求cさRhれまwす。I\n"
				   + "特qeにXPyW本格fu的なBS開Ke発FDでHQはa、ME「照I合UO」「Q部OS分置T換」aaなどB、I"
				   + "wS文J字b列k処aer理BPのh中avでもW複C雑でZk高度MZなyi処理nがhH求uFめOられhるこtLとnOもp少なcくあbPりnませufん";
		//正規表現を使い、アルファベットを空文字に置換。
		String str2 = str.replaceAll("[A-Z,a-z]" , "");
		System.out.println(str2);
	}//method END


	//FN LN分け
	public static void dispName() {

		//姓と名をfor文内で判別するためのフラグ
		boolean n_flg = true;

		List<String> list = new ArrayList<>(Arrays.asList(
			"石橋 玲那","羽切 蒼","溝口 七瀬","宋 彦霖","川瀬 杏樹","加藤 嵩大","林 敏生","家塚 晃慈",
			"市村 泰誠","巴 美月","萬田 一沙","泉 向日葵","山本 翔太","濱本 洸多","村上 舞","佐々木 瞭",
			"大室 宏樹","岩瀬 虎斗","禹 明香","川口 洋平","池田 清花","佐々木 徳哉","大坪 一輝"));

		/*分割後の名前をリストに格納
		 * fullName : list内の各名前を入れ込む変数
		 * splitName : 姓と名分割後の名前を入れ込む配列
		 * name : splitNameから、姓と名に分かれた文字を入れ込む変数
		 * 姓か名を判別するため、n_flgで切り替えながら出力。
		 */
		for(String fullName: list) {
			String[] splitName = fullName.split(" ");
			for(String name:splitName) {
				if(n_flg) {
					System.out.print("姓は" + name);
					n_flg = false;
				}else {
					System.out.println("  名は" + name);
					n_flg = true;
				}//if END
			}//for END
		}//for END
	}//method END

}//Class END
