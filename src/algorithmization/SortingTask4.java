 /**SortingTask4
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Random;
import java.util.Scanner;

public class SortingTask4 {
	static int [] array;
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Введите количество элементов");
		int size = input.nextInt();
		createArray (size);
		System.out.println("Исходный массив:");
		printArray ();
		System.out.println("\nПроизведено перестановок  " + sorting () + "  штук");
		System.out.println("\nОтсортированный массив:");
		printArray ();

	}

	
	static void createArray (int size) {
		array = new int [size];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array [i] = array [i] = rand.nextInt(1000);
		}
	}
	
	
	static void printArray () {
		for (int i: array) {
			System.out.print(i + "  ");
		}
	}
	
	
	//сортировка обменом (пузырёк)
	static int sorting () {
		int counter = 0;
		for (int i = 0; i < array.length - 1; i ++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array [j+1]) {
				int temp = array [j];
				array[j] = array [j+1];
				array[j+1] = temp;
				counter++;
			}
			}
		}
		return counter;
		}
}
