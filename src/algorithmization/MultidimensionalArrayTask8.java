 /**MultidimensionalArrayTask8
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Random;
import java.util.Scanner;

public class MultidimensionalArrayTask8 {
	static int [][] array;

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Введите количество строк:");
		int line = input.nextInt();
		System.out.println("Введите количество столбцов:");
		int column = input.nextInt();
		System.out.println("Какие столбцы поменять:");
		System.out.println("Введите номер первого столбца (отсчёи с нуля):");
		int oneColumn = input.nextInt();
		System.out.println("Введите номер второго столбца (отсчёи с нуля):");
		int twoColumn = input.nextInt();
		createArray(line, column);
		printArray();
		columnReplacement (oneColumn, twoColumn);
		System.out.println("\n\nПроизвели замену столбцов введенных пользователем и получили следующий результат\n");
		printArray();
		

	}
	
	
	// метод создания массива с рандомным заполнением
		static void createArray(int line, int column) {
			array = new int [line][column];
			Random rand = new Random();
			for (int i = 0; i < array.length; i++) {
				for(int j = 0; j < array[i].length; j++) {
					array[i][j] = rand.nextInt(100);
				}
			}
			
		}
		
		// метод вывода массива
		static void printArray () {
			for (int i = 0; i < array.length; i++) {
				System.out.println(" ");
				for(int j = 0; j < array[i].length; j++) {
					System.out.printf("%4d", array[i][j]);
		}
			}
		}

		static void columnReplacement (int oneColumn, int twoColumn) {
				for (int i = 0; i < array.length; i++) {
					int temp = array[i][oneColumn];
					array[i][oneColumn] = array[i][twoColumn];
					array[i][twoColumn] = temp;
				}
		}			
}
