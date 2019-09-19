 /**EasyClassTask7
 * 4_Programming_with_classes
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package programmingWithClasses;

public class Triangle {
	private double[] a = new double [2];
	private double[] b = new double [2];
	private double[] c = new double [2];
	
	Triangle (){
		this.a[0] = 0;
		this.a[1] = 0;
		this.b[0] = 0;
		this.b[1] = 0;
		this.c[0] = 0;
		this.c[1] = 0;
	}
	
	Triangle (double ax, double ay, double bx, double by, double cx, double cy){
		this.a[0] = ax;
		this.a[1] = ay;
		this.b[0] = bx;
		this.b[1] = by;
		this.c[0] = cx;
		this.c[1] = cy;
	}

	public static void main(String[] args) {
		Triangle obj0 = new Triangle ();
		Triangle obj1 = obj0.createTriangle ();
		Triangle obj2 = obj1.createTriangle(1,1,1.5,3,4,1);
		
		System.out.println("Нахождение точки пересения медиан объекта obj2");
		for (double i:obj2.calculationDot (obj2.a, obj2.b, obj2.c))
			System.out.print("[ " + i + " ]  ");
		
		System.out.println("\nНахождение длин сторон треугольника obj2");
		for (double i: obj2.calculationSide(obj2.a, obj2.b, obj2.c))
			System.out.print("[ " + i + " ]  ");
		
		System.out.println("\nНахождение периметра треугольника obj2");
			System.out.print(obj2.calculationPerimeter(obj2.calculationSide(obj2.a, obj2.b, obj2.c)));
		
		System.out.println("\nНахождение площади треугольника obj2");
		    System.out.print(obj2.calculationSquare(obj2.calculationSide(obj2.a, obj2.b, obj2.c), obj2.calculationPerimeter(obj2.calculationSide(obj2.a, obj2.b, obj2.c))));	
	}
	
	//метод создания объекта
	private Triangle createTriangle () {
		return new Triangle ();
	}
	
	//метод создания объекта
	private Triangle createTriangle (double ax, double ay, double bx, double by, double cx, double cy) {
		return new Triangle (ax, ay, bx, by, cx, cy);
	}
	
	
	//метод нахождения площади треугольника
	private double calculationSquare (double[] abc, double p) {
		double p2 = p/2;   // находим полупериметр
		double s = Math.sqrt(p2 * ((p2 - abc[0]) * (p2 - abc[1]) * (p2 - abc[2])));
		return s;	
	}
	
	
	//метод нахождения периметра треугольника
	private double calculationPerimeter (double[] abc) {
		return abc[0] + abc[1] + abc[2];
	}
	
	//нахождение сторон треугольника
	private double[] calculationSide (double[] a, double[] b, double[] c) {
		double [] abc = new double [3];
		abc[0] = Math.sqrt((Math.pow((b[0] - a[0]), 2)) + Math.pow((b[1] - a[1]), 2));
		abc[1] = Math.sqrt((Math.pow((c[0] - b[0]), 2)) + Math.pow((c[1] - b[1]), 2));
		abc[2] = Math.sqrt((Math.pow((c[0] - a[0]), 2)) + Math.pow((c[1] - a[1]), 2));
		return abc;
	}
	
	
	//нахождение точки пересения медиан
	private double[] calculationDot (double[] a, double[] b, double[] c) {
		double[] centr = new double[2];
		centr[0] = (a[0] + b[0] + c[0])/3;
		centr[1] = (a[1] + b[1] + c[1])/3;
		return centr;
	}
}
