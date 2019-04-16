import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("数を入してください");
		int radius = Integer.parseInt(scanner.next());

    	Calc calc = new Calc();
    	System.out.println(radius+"が半径の円の面積は" + calc.calEllipseArea(radius));

	}

}
