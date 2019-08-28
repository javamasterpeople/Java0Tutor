 /**SortingTask2
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */


package algorithmization;

import java.util.Random;

public class SortingTask2 {

	public static void main(String[] args) {
		int size1 = 10;
		int size2 = 6;
		int dot = 0;
	    int [] array1 = new int [size1];
		int [] array2 = new int [size2];
		createArray (array1);
		createArray (array2);
		System.out.println("Получили два массива рандомно:");
		printArray (array1);
		printArray (array2);
		System.out.println("\nПоимели после объединения и сортировки:");
		printArray (combination (array1, array2));
	}
	
	static void createArray (int [] array) {
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array [i] = rand.nextInt(100);
		}
	}
	
	
	static void printArray (int [] array) {
		System.out.println("");
		for (int i: array) {
			System.out.print(i + "  ");
		}
	}
	
	
	static int [] combination (int [] array1, int [] array2) {
		int [] resultArray = new int [array1.length + array2.length];
		for (int i = 0; i < resultArray.length; i++) {
			if (i < array1.length)
				resultArray [i] = array1[i];
			else
				resultArray[i] = array2[i - array1.length];
		}
		
		boolean status = true;
		while (status) {
			status = false;
		for (int i = 0; i < resultArray.length - 1; i++) {
			if (resultArray [i] > resultArray [i + 1]) {
				int temp = resultArray [i];
				resultArray [i] = resultArray [i + 1];
				resultArray [i + 1] = temp;
				status = true;
			}
		}
		}
		return resultArray;
	}
}
