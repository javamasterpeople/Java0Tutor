 /**SortingTask8
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Random;
import java.util.Scanner;

public class SortingTask8 {

	static int [][] array;
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Введите количество элементов");
		int n = input.nextInt();
		createArray (n);
		System.out.print("Сформировали дроби");
		printArray ();
		create (searchNumber ());
		System.out.print("\n\nВот Вам новые дроби с общим знаменатилем");
		printArray ();
		System.out.print("\n\nВот Вам отсортированные дроби");
		sortingArray ();
		printArray ();
	}
	
	// формируем массив рандомом
	static void createArray (int n) {
		Random rand = new Random();
		array = new int [2][n];
		for (int i = 0; i < array.length; i++) 
		for (int j = 0; j < array[i].length; j++)
		{
			do {
			array [i][j] = rand.nextInt(20);
			} while (array[i][j] == 0);
		}
	}
	
	
	// функция вывода 
	static void printArray () {
		for (int i[]: array) {
			System.out.println("");
			for (int j: i)
				System.out.printf("%10d", j);
		}
	}
	
	
	// Поиск общего делителя
	static int searchNumber() {
		boolean status = false;
		int counter = 0;
		int element = 0;
		do {
			element = 0;
			counter++;		
		for (int i = 0; i < array[1].length; i++) {
			if (counter % array[1][i] == 0)
				element ++;			
		}	
		if (element == array[0].length) {
			status = true;
		}
		} while (!status);
		return counter;
	}

	// Приводим все дроби к общему делителю
	static void create (int number) {
		for (int i = 0; i < array[0].length; i++) {
			array[0][i] = (number / array[1][i]) * array[0][i];
			array[1][i] = number;
		}
	}
	
	
	//сортировка массива
	static void sortingArray () {
		boolean sorted = false;
		int temp;
		int i;
		while (!sorted) {
			sorted = true;
		     for (i = 0; i < array[0].length - 1; i++) {
		            if (array[0][i] > array[0][i+1]) {
		                temp = array[0][i];
		                array[0][i] = array[0][i+1];
		                array[0][i+1] = temp;
		                sorted = false;
		}
		     }
		}	
	}
	
	
}
