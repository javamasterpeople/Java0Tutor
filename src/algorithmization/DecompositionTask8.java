 /**DecompositionTask8
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Random;
import java.util.Scanner;

public class DecompositionTask8 {
	static int [] array;

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Введите количество элементов");
		int size = input.nextInt();
		createArray (size);
		System.out.println("Исходный массив:");
		printArray ();
		calculationAndOutput ();
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
	
	
	
	static void calculationAndOutput () {
		int counter = 0;
		int counterElements = 0;
		int result = 0;
		System.out.println("");
		for (int i = 0; i < array.length; i++) {
			while (counter == 3) {
				counter = 0;
				counterElements++;
				System.out.println("Сумма группы номер  " + counterElements + "  равна  " + result);
				result = 0;
				break;
			}
			counter++;
			result += array[i];	
		}
	}
}
