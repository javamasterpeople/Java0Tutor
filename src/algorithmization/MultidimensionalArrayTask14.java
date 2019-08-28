 /**MultidimensionalArrayTask14
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;
import java.util.Random;

public class MultidimensionalArrayTask14 {
	static int [][] array;

	public static void main(String[] args) {
		createArray ();
		printArray();
	}
	
	
	// метод создани€ массива с заполнением
		static void createArray() {
			Random rand = new Random();
			int column = rand.nextInt(15);
			int line = 0;
			do {
				line = rand.nextInt(15);
			} while (line < column);
			
			array = new int [line][column];
			System.out.println("\n—формирован произвольный массив Array [" + line + "] [" + column + "]\n");
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					if (i < j)
						array[i][j] = 1;
					else
						array[i][j] = 0;
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

}
