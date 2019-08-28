 /**DecompositionTask16
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Scanner;

public class DecompositionTask16 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("До какого числа искать то что искать?");
		int k = input.nextInt();
		search (k);
	}
	
	
		
		// Производим проверку и суммируем если нужно
		static void search (int k) {
			int result = 0;
			for (int i = 1; i < k; i++) 
				if (check1(i))
					result += i;
			System.out.println("Сумма чисел содержащих только нечётные числа равна: " + result);
			System.out.println("В найденом результате обнаружено: " + check2(result) + " чётных чисел");
		}
		
		
		
		// проверяем подходит ли число под условие
		static boolean check1 (int number) {
			float numberTemp = number;
			int temp = 0;
			while ((int)numberTemp != 0) {
				temp = (int) numberTemp % 10;
				if (temp % 2 == 0)
					return false;
				numberTemp = numberTemp / 10;	
			}
			return true;
		}
		
		// проверяем сколько чётных чисел в результате
		static int check2 (int number) {
			float numberTemp = number;
			int temp = 0;
			int counter = 0;
			while ((int)numberTemp != 0) {
				temp = (int) numberTemp % 10;
				if (temp % 2 == 0)
					counter++;
				numberTemp = numberTemp / 10;	
			}
			return counter;
		}
}
