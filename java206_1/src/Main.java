
public class Main {

	public static void main(String[] args) {

		FuncList fl = new FuncList();
		Func1 func1 = FuncList::isOdd;
		Func2 func2 = fl::addNamePrenix;

		System.out.println(func1.isOdd(10));
		System.out.println(func2.name(true, "岩瀬虎斗"));
	}
}
