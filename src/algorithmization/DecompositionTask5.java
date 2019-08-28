 /**DecompositionTask5
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Random;
import java.util.Scanner;

public class DecompositionTask5 {
	static int [] array;

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Введите количество элементов");
		int size = input.nextInt();
		createArray (size);
		System.out.println("Исходный массив:");
		printArray ();
		System.out.println("\nВторое по величине число:  " + search ());
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
	
	static int search () {
		int max = array[0];
		int twoMax = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > twoMax) {
				twoMax = max;
				max = array[i];
			}
		}
		return twoMax;
	}
}
