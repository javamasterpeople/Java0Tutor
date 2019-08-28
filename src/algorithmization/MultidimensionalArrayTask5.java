 /**MultidimensionalArrayTask5
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Scanner;

public class MultidimensionalArrayTask5 {
	static double [][] array;

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int size = 0;
		do {
		System.out.println("Введите порядок матрицы (чётное число):");
		size = input.nextInt();
		} while (size%2 != 0);
		array = new double [size][size];
		createArray(size);
		printArray();
		System.out.println("Количество положиетльных элементов  " + search());

	}
	
	public static void createArray(int size) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2))/size);
			}
		}
	}
	
	
	// метод вывода массива
	static void printArray () {
		for (int i = 0; i < array.length; i++) {
			System.out.println(" ");
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
	}
		}
	}
	
	
	//метод поиска положительнх элементов
	static int search() {
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if (array[i][j] > 0)
					counter ++;
			}
	}
		return counter;
	}
	
	
}



