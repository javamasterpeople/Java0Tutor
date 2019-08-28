 /**MultidimensionalArrayTask4
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;
import java.util.Scanner;

public class MultidimensionalArrayTask4 {
	static int [][] array;
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("¬ведите пор€док матрицы:");
		int size = input.nextInt();
		array = new int [size][size];
		createArray(size);
		printArray();
		
		
	}
	
	
	public static void createArray(int size) {
		for (int i = 0; i < array.length; i++) {
			int temp = size;
			for (int j = 0; j < array[i].length; j++) {
				if (i%2 == 0) 
					array[i][j] = j + 1;
				else
					array[i][j] = temp --;
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

}
