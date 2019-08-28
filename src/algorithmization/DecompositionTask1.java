 /**DecompositionTask1
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */


package algorithmization;

import java.util.Scanner;

public class DecompositionTask1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Введите первое число");
		int n1 = input.nextInt();
		System.out.println("Введите второе число");
		int n2 = input.nextInt();
		System.out.println("НОД чисел равно  " + nod (n1,n2));
		System.out.println("НОК чисел равно  " + nok (n1,n2));
		
	}
	
	
	// алгоритм Евклида поиск НОД
		static int nod (int a, int b) {
	        while (a != b) {
	            if (a > b) {
	                a = a - b;
	            } else {
	                b = b - a;
	            }
	        }
	        return a;
	    }
		
		
		static int nok (int a, int b) {
			return (a * b) / nod (a, b);
		}
}
