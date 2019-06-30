 /**Algorithmization06
 * 2_Algorithmization
 * Algorithmization program - Task06
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;
import java.util.Scanner;

public class OneArrayTask6 {
	static float [] array;  // массив с которым работаем

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	    System.out.println("¬ведите расзмерность масива:");
	    int n = input.nextInt();
	    array = new float [n];
	    createArray();
	    int sum = search();
	    System.out.println(sum);
	}
	
	
	// метод заполнени€ массива
		static void createArray () {
			Scanner input = new Scanner (System.in);
			for (int i=0; i < array.length; i++) {
				System.out.println("¬ведите элемент массива [" + i + "] :");
				array[i]= input.nextFloat();
			}	
		}
		
		
		
		static int search () {
			int sum = 0;
			for(int i = 1; i < array.length; i++) {
				int counter = 0;
				for (int j = 2; j <= i; j++) {
					if (i%j == 0) {
						counter++;
					}
				}
				if(counter == 1)
					sum += array[i];
			}
			return sum;
		}
}
