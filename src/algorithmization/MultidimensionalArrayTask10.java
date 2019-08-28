 /**MultidimensionalArrayTask10
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Random;
import java.util.Scanner;

public class MultidimensionalArrayTask10 {
	static int [][] array;

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int size = 0;
		System.out.println("Введите размерность:");
		size = input.nextInt();
		
		createArray(size);
		printArray ();
		System.out.println("\n\nПоложительные числа по главной диагонали: \n");
		search ();
		
		


	}
	
	
	// метод создания массива с рандомным заполнением
		static void createArray(int size) {
			array = new int [size][size];
			Random rand = new Random();
			for (int i = 0; i < array.length; i++) {
				for(int j = 0; j < array[i].length; j++) {
					array[i][j] = rand.nextInt();
				}
			}
			
		}
		
		// метод вывода массива
		static void search () {
			for (int i = 0; i < array.length; i++) {
				if (array[i][i] > 0)
					System.out.print(array[i][i] + "  ");
			}
		}
		
		// метод вывода массива
		static void printArray () {
			for (int i = 0; i < array.length; i++) {
				System.out.println(" ");
				for(int j = 0; j < array[i].length; j++) {
					System.out.printf("%12d", array[i][j]);
					System.out.print("   ");
		}
			}
		}

}
