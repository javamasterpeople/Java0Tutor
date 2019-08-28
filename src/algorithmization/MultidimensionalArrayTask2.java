 /**MultidimensionalArrayTask2
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */
package algorithmization;
import java.util.Random;
import java.util.Scanner;

public class MultidimensionalArrayTask2 {
	static int [][] array;

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("¬ведите размерность:");
		int size = input.nextInt();
		createArray (size);
		printArray();
		search();

	}
	
	
	// метод создани€ массива с рандомным заполнением
	static void createArray(int size) {
		array = new int [size][size];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(10);
			}
		}
		
	}
	
	// метод вывода массива
	static void printArray () {
		for (int i = 0; i < array.length; i++) {
			System.out.println(" ");
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "  ");
	}
		}
	}
	
	//метод поиска и вывода результата
	static void search() {
		System.out.println("\n\n–езультат");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i][i] + " ");
		}
	    System.out.println("");
	    for (int i = 0, j = array.length-1; i < array.length; i++, j--) {
			System.out.print(array[i][j] + " ");
		}
	}
}
