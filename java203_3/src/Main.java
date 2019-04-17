import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<Hero,Integer> heroMap = new HashMap<Hero,Integer>();
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");

		heroMap.put(h1, 3);
		heroMap.put(h2, 7);

		for(Hero hKey : heroMap.keySet()) {
			int num = heroMap.get(hKey);
			System.out.println(hKey.getName() + "が倒した数=" + num);
		}//for END

	}
}
