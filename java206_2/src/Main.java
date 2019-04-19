
public class Main {
	public static void main(String[] args) {

		Func1 func1 = x -> x % 2 ==1;
		Func2 func2 = (male,name) ->{
			if(male == true){
				return "Mr." + name;
			}else {
				return "Ms." + name;
			}//if END
		};//func2 END

		System.out.println(func1.isOdd(4));
		System.out.println(func2.name(true, "岩瀬"));

	}
}
