 /**DecompositionTask17
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Scanner;

public class DecompositionTask17 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Введите число:");
		int number = input.nextInt();
		search (number);
		
	}
	
	
		
		// Производим проверку
		static void search (int number) {
			int counter = 0;
			for (int i = number; i > 0; i = i - countingTheAmount (i)) 
				counter++;
			System.out.println("Было произведено  " + counter + "  действий");
			
		}
		
		
		// подсчёт суммы цифр 
		static int countingTheAmount (int number) {
			float numberTemp = number;
			int sum = 0;
			while ((int)numberTemp != 0) {
				sum += (int) numberTemp % 10;
				numberTemp = numberTemp / 10;	
			}
			return sum;
		}	
}