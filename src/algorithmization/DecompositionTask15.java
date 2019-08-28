 /**DecompositionTask15
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Scanner;

public class DecompositionTask15 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Сколько знаков в числе?");
		int k = input.nextInt();
		search (k);
		
	}
	
	
		
		// Генерируем числа для проверки и печатаем результат
		static void search (int k) {
			int counter = 0;
			// Максимально возможное число
			int lastNumber = 10 * (int)Math.pow(10,k-1) - 1;
			for (int i = 1 * (int)Math.pow(10,k-1); i < 10 * (int)Math.pow(10,k-1); i++) {
				if (increaseСheck (i, lastNumber)) {
					System.out.print(i + "\n");
					counter++;
				}
			}
			System.out.println("Поздравляем! Было найдено " + counter + " чисел");
		}
		
		
		// проверка условия возрастания
		static boolean increaseСheck (int number, int lastNumber) {
			int pcsNumbers = quantification (number);
			float numberTemp = number;
			int temp = 0;
			while ((int)numberTemp != 0) {
				temp = (int) numberTemp % 10;
				if (temp < lastNumber) {
				lastNumber = (int) temp;
				numberTemp = numberTemp / 10;	
				}
				else 
				return false;
			}
			return true;
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
