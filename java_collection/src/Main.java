import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		//CollectionのArrayListを使用。
		ArrayList<SeitoScore> scores = new ArrayList<SeitoScore>();

		//リストに生徒情報を追加
		scores.add(new SeitoScore("A", 90));
		scores.add(new SeitoScore("B", 48));
		scores.add(new SeitoScore("C", 65));
		scores.add(new SeitoScore("D", 50));
		scores.add(new SeitoScore("E", 55));

		//出力
		for(SeitoScore seito:scores) {
			if(seito.getScore() > 49) {
				System.out.println(seito.getName() + "さんは" + seito.getScore() + "点です。");
			}//if END
		}//for END
	}
}
