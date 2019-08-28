 /**MultidimensionalArrayTask15
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */
package algorithmization;

import java.util.Random;
import java.util.Scanner;

public class MultidimensionalArrayTask15 {
	static int [][] array;

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Введите размерность:");
		int size = input.nextInt();
		createArray (size);
		System.out.println("Создали следующий массив:");
		printArray();
		System.out.println("\nМаксимальное число  " + search());
		System.out.println("\nПолучили после манипуляций:");
		printArray();
	}

	
	// метод создания массива с рандомным заполнением
	static void createArray(int size) {
		array = new int [size][size];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(100000);
			}
		}
		
	}
	
	// метод вывода массива
	static void printArray () {
		for (int i = 0; i < array.length; i++) {
			System.out.println(" ");
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " \t");
	}
		}
	}
	
	//метод поиска и вывода результата
	static int search() {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > max)
					max = array [i][j];
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if ((array[i][j])%2 != 0)
					array [i][j] = max;
			}
		}
		return max;
	}
}
