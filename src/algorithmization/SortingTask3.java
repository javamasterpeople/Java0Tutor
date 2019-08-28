 /**SortingTask3
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;
import java.util.Scanner;
import java.util.Random;

public class SortingTask3 {
	static int [] array;
	
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Введите количество элементов");
		int size = input.nextInt();
		createArray (size);
		System.out.println("Исходный массив:");
		printArray ();
		sorting ();
		System.out.println("\nОтсортированный массив:");
		printArray ();
	}

	
	static void createArray (int size) {
		array = new int [size];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array [i] = rand.nextInt(1000);
		}
	}
	
	
	static void printArray () {
		for (int i: array) {
			System.out.print(i + "  ");
		}
	}
	
	
	//сортировка выбором
	static void sorting () {
		for (int i = 0; i < array.length; i ++) {
			int max = array [i];
			int maxI = i;
			for (int j = i + 1; j < array.length; j++) {
	            if (array[j] > max) {
	                max= array[j];
	                maxI = j;
				}	
			}
		            int tmp = array[i];
		            array[i] = array[maxI];
		            array[maxI] = tmp;
		}
		}
}
