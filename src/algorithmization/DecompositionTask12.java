/**DecompositionTask12
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;
import java.util.Scanner;

public class DecompositionTask12 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("¬ведите число K");
		int k = input.nextInt();
		System.out.println("¬ведите число N");
		int n = input.nextInt();
		int counter = 0;
		
		//определ€ем какой размер массива
		for (int i = 0; i < n; i++) {
			if (Search (i, k))
				counter++;
		}
		int [] array = new int [counter];
		
		// определ€ем числа подход€щее под условие и записываем в массив
		counter = 0;
		for (int i = 0; i < n; i++) {
			if (Search (i, k)) {
				array[counter] = i; 
				counter++;
			}
		}
		
		// выводим результаты
		for (int i = 0; i < array.length; i ++)
			System.out.println("array [" + i + "] --->  " + array[i]);
	}
	
	
	// определ€ем количество чисел
		static boolean Search (int number, int k) {
			float numberTemp = number;
			int result = 0;
			while ((int)numberTemp != 0) {
				result += (int) numberTemp % 10;
				numberTemp = numberTemp / 10;
			}
			if (result == k)
				return true;
			else
				return false;
		}
}
