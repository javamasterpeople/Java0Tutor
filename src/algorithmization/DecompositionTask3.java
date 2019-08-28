 /**DecompositionTask3
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Scanner;

public class DecompositionTask3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Введите длину стороны (см)");
		int a = input.nextInt();
		System.out.println("Разбиваем правильный шестиугольник на 6 треугольников с углами "
				+ "по 60 градусов и считаем площадь по формуле треугольника");
		System.out.println("Площадь шестиугольника равна:  " + calculation (a));
		

	}
	
	static double calculation (int a) {
		double rad = Math.toRadians(60);
		return (0.5 * a * a * Math.sin(rad)) * 6;
	}
}
