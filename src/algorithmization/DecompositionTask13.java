 /**DecompositionTask13
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Scanner;

public class DecompositionTask13 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("¬ведите стартовое число");
		int n = input.nextInt();
		System.out.println("ћы нашли следующие близнецы на заданном отрезке: \n");
		search (n);
	}
	
	
	static void search (int n) {
		for (int i = n; i < 2*n - 1; i++) 
			System.out.print(i + " -> " + (i+2) + "   ");
	}

}
