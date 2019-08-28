 /**DecompositionTask9
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Scanner;

public class DecompositionTask9 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Введите сторону X (угол 90 гр между X и Y)");
		double x = input.nextDouble();
		System.out.println("Введите сторону Y (угол 90 гр между X и Y)");
		double y = input.nextDouble();
		System.out.println("Введите сторону Z");
		double z = input.nextDouble();
		System.out.println("Введите сторону T");
		double t = input.nextDouble();
		double result = findingSquareQuadrilateral (findingTheAreaOf​ARightTriangle (x, y), 
				findingTheAreaOf​ATriangle (findingTheBaseOfARightTriangle(x, y), z ,t));
		System.out.println("Площадь четырёхугольника равна " + result);
	}
	

	// нахождение площади первого треугольника
	static double findingTheAreaOf​ARightTriangle (double a, double b) {
		return 0.5 * (a * b);	
	}
	
	// нахождение основания прямоугольного треугольника
	static double findingTheBaseOfARightTriangle (double x, double y) {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	// нахождение площади второго треугольника
	static double findingTheAreaOf​ATriangle (double a, double b, double c) {
		double p = (a + b + c) / 2;
		if ((p - a) < 0 || (p - b) < 0 || (p - c) < 0) {
			return 0;
		}
		else 
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
	// находим площадь четырёхугольника
	static double findingSquareQuadrilateral (double x, double y) {
		if (y == 0) {
			System.out.println("Нельзя построить четырёхугольник по заданным длинам сторон");
			return 0;
		}
		return x + y;
	}
}
