
public class MethodQ1_2 {

	public static void main(String[] args) {
		System.out.println(calcEllipseArea(5.5,10.0));

		System.out.println(calcEllipseArea(2.0));
	}

	public static double calcEllipseArea(double longDiameter,double shortDiameter) {
		double area = longDiameter * shortDiameter * Math.PI;
		return area;
	}

	public static double calcEllipseArea(double radius) {
		double area = radius * radius* Math.PI;
		return area;
	}
}
