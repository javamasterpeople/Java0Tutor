 /**SortingTask7
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Random;
import java.util.Scanner;

public class SortingTask7 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("¬ведите количество элементов первого массива");
		int n1 = input.nextInt();
		System.out.println("¬ведите количество элементов второго массива");
		int n2 = input.nextInt();
		int array1 [] = new int [n1];
		int array2 [] = new int [n2];
		createArray (array1);
		createArray (array2);
		sortingArray (array1);
		sortingArray (array2);
		System.out.println("—формировали массивы:");
		printArray (array1);
		System.out.println("");
		printArray (array2);
		System.out.println("");
		search (array1, array2);
		System.out.println("\nќбъединили два массива и отсортировали:");
		union (array1, array2);
	}
	
	// формирование массива
	static void createArray(int [] array) {
		Random rand = new Random ();
		for (int i = 0; i < array.length; i++) 
			array[i] = rand.nextInt(100);
	}
	
	//сортировка массива
	static void sortingArray (int [] array) {
		boolean sorted = false;
		int temp;
		int i = 0;
		while (!sorted) {
			sorted = true;
		     for (i = 0; i < array.length - 1; i++) {
		            if (array[i] > array[i+1]) {
		                temp = array[i];
		                array[i] = array[i+1];
		                array[i+1] = temp;
		                sorted = false;
		}
		     }
		}	
	}
	
	
	//печать массива
	static void printArray(int [] array) {
		for (int i: array)
			System.out.print(i + "  ");
	}
	
	//нахождени€ мест вставки
	static void search (int [] array1, int [] array2) {
		int [] array3 = new int [array1.length + 1];
		int temp = 0;
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array3.length - 1; j++)
				array3[j] = array1[j];
			array3[array3.length - 1] = array2[i];
			sortingArray (array3);
			for(int k = 0; k < array3.length; k++)
				if (array3[k] == array2[i])
					temp = k;
			System.out.println("„исло " + array2[i] + " необходимо вставить на позицию [" 
			       + temp + "] первого массива");
		}			
	}
	
	
	//объединение массива и сортировка
	static void union (int [] array1, int[] array2) {
		int [] array3 = new int [array1.length + array2.length];
		for (int i = 0; i < array1.length; i ++) {
			array3[i] = array1[i];
		}
		for (int i = 0; i < array2.length; i++) {
			array3[i + array1.length ] = array2[i];
		}
		sortingArray (array3);
		printArray (array3);		
	}
}
