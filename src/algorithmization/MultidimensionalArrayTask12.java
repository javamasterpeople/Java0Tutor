 /**MultidimensionalArrayTask12
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;
import java.util.Random;
import java.util.Scanner;

public class MultidimensionalArrayTask12 {
	static int [][] array;


	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Введите количество строк:");
		int line = input.nextInt();
		System.out.println("Введите количество столбцов:");
		int column = input.nextInt();
		createArray (line, column);
		printArray ();
		search ();
		System.out.println("\n Получили результат после сортировки строк\n");
		printArray ();
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

	// сортируем пузырьком
	static void search () {
		for (int i = 0; i < array.length; i++) {
			for(int j = array[i].length - 1; j > 0; j--)
				for (int k = 0; k < j; k++) {
		            if( array [i][k] > array [i][k+1] ) {
		                int tmp = array [i][k];
		                array[i][k] = array[i][k+1];
		                array[i][k+1] = tmp;
		            }
				}
		}
	}	
}
