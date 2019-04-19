import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		String str = "IntBinaryOperator sumSquare = (int a,int b) -> return {a*a + 2*a*b + b*b;}";
		System.out.println("省略前は : " + str);


		String str2 = "IntUnaryOperator cube = x -> x*x*x;";
		System.out.println("出来る限り省略した形は : " + str2);


		String[] stringArray = { "a", null, "b", "", "c" };
		List<String> stringList = Arrays.asList(stringArray);
		System.out.println(stringList);

		/*List<String> filterList = new ArrayList<>();
		for (String string : stringList) {
			if (string != null && !string.isEmpty()) {
				filterList.add(string);
			}
		}*/
		Stream<String> filterList = stringList.stream().filter(s -> s != null);

		//filterListの中身を出力
		filterList.forEach(s->System.out.print(s));
	}
}
