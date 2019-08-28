 /**DecompositionTask14
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Scanner;

public class DecompositionTask14 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("До какого числа искать числа Армстронга?");
		int k = input.nextInt();
		search (k);
	}
	
	
		
		// Производим проверку
		static void search (int k) {
			int counter = 0;
			for (int i = 1; i < k; i++) {
				if ( countingTheAmount (i)== i) {
					System.out.println(i + "  является числом Амстронга");
					counter++;
				}
			}
			System.out.println("Поздравляем! Было найдено " + counter + " чисел");
		}
		
		
		// подсчёт суммы цифр возведенных в нужную степень числа
		static int countingTheAmount (int number) {
			int pcsNumbers = quantification (number);
			float numberTemp = number;
			int sum = 0;
			while ((int)numberTemp != 0) {
				sum += (int) Math.pow((int) numberTemp % 10,pcsNumbers);
				numberTemp = numberTemp / 10;	
			}
			return sum;
		}
		
		
		// определяем количество чисел
		static int quantification (int number) {
			int counter = 0;
			while (number != 0) {
				number = number / 10;
				counter ++;
			}
			return counter;
		}

}
