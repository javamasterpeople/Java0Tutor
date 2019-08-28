 /**SortingTask1
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Random;
import java.util.Scanner;

public class SortingTask1 {
	static int [] array1;
	static int [] array2;
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("¬ведите количество элементов первого массива");
		int n1 = input.nextInt();
		System.out.println("¬ведите количество элементов второго массива");
		int n2 = input.nextInt();
		System.out.println(" уда вставл€ть?");
		int k = input.nextInt();
		createArray (n1, n2);
		printArray ();
		System.out.println("\n—формировали новый массив");
		for(int i: union (k))
			System.out.print(i + "  ");
	}
	
	// создание массивов
	static void createArray (int n1, int n2) {
		Random rand = new Random();
		array1 = new int [n1];
		array2 = new int [n2];
		for (int i = 0; i < array1.length; i ++)
			array1[i] = rand.nextInt(100);
		for (int i = 0; i < array2.length; i ++)
			array2[i] = rand.nextInt(100);
	}
	
	// вывод массивов
	static void printArray () {
		for (int i: array1) 
				System.out.printf("%4d", i);
		System.out.println("");
		for (int i: array2) 
			System.out.printf("%4d", i);
	}
	
	// сращиваем массивы
	static int[] union (int k) {
		int [] resultArray = new int [array1.length + array2.length];
		for (int i = 0; i < resultArray.length; i++) {
			if (i <= k)
				resultArray[i] = array1[i];
			else 
				if (i <= k + array2.length)
					resultArray[i] = array2[i - k - 1];
				
			if (i > k + array2.length)
				resultArray[i] = array1[i - array2.length];	
		}
		return resultArray;
	}	
}
