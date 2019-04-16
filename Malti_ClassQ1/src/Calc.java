
public class Calc{
	public static double calcEllipseArea(double longDiameter,double shortDiameter){
		double area;

		area = Math.PI * longDiameter * shortDiameter;

		return area;
	}

	public static double calEllipseArea(double radius){

		return calcEllipseArea(radius,radius);
	}
}