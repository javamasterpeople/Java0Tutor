 /**
  * MultidimensionalArrayTask6
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;
import java.util.Scanner;

public class MultidimensionalArrayTask6 {
	static int [][] array;
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int size = 0;
		do {
		System.out.println("Введите порядок матрицы (чётное число):");
		size = input.nextInt();
		} while (size%2 != 0);
		createArray (size);
		printArray ();
		
	}
	
	
	
	public static void createArray(int size) {
		array = new int [size][size];
		// заполняем первую половину массива
		for (int i = 0; i < array.length / 2; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (j < i | j > array[i].length - i - 1)
					array[i][j] = 0;
				else 
					array[i][j] = 1;
			}
		}
		
		// заполняем вторую половину массива
        int counter = 1;
		for (int i = array.length / 2; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = array[i - counter][j];
			}
			counter += 2;
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

}
