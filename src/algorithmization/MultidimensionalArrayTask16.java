 /**MultidimensionalArrayTask16
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Random;
import java.util.Scanner;

public class MultidimensionalArrayTask16 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int [][] array;
		System.out.println("Введите размерность:");
		int size = input.nextInt();
		array = new int[size][size];
		int type = 0; // способ построения
		if (size % 3 == 0)
			type = 1;
		switch (type) {
		case 1:
			System.out.println("Строим квадрат нечётного порядка");
			createArrayMagic1 (array);
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			break;		
		}
	}


// метод построения квадрата нечётного порядка
static int [][] createArrayMagic1 (int [][] array) {
	// ищем константу магическую
	int magicConst = (array.length * ((array.length * 2) + 1)) / 2;
	int counter = 1;
	array [0][((array.length + 1) / 2) - 1] = counter++;
	
	
}

}
