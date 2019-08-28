 /**MultidimensionalArrayTask9
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;
import java.util.Random;
import java.util.Scanner;

public class MultidimensionalArrayTask9 {
	static int [][] array;

	public static void main(String[] args)  {
		Scanner input = new Scanner (System.in);
		System.out.println("¬ведите количество строк:");
		int line = input.nextInt();
		System.out.println("¬ведите количество столбцов:");
		int column = input.nextInt();
		createArray(line, column);
		printArray ();
		System.out.println(search(column));
	}
	
	
	// метод создани€ массива с рандомным заполнением
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
				System.out.printf("%5d", array[i][j]);
	}
		}
	}
	
	// метод подсчЄта суммы элементов в каждом столбце, определение столбца с максимальной суммой
    static String search(int column ) {
    	int [] tempArray = new int [column]; // массив дл€ аписи сумм столбцов
		System.out.println("\n –езультат");
		int s;
		int index = 0;
		    for (int i = 0; i < array[0].length; i++){
		        s = 0;
		        for (int j = 0; j < array.length; j++){
		            s = s + array [j][i];
		        }
		        tempArray[i] = s;
		    }
		    s = 0;
		    for (int i = 0; i < tempArray.length; i++) {
		    	if (tempArray[i] > s) {
		    		s = tempArray[i];
		    		index = i;
		    	}
		    }
		  return index + "  столбец содержит макисмальную сумму  " + s;  
    }
}
