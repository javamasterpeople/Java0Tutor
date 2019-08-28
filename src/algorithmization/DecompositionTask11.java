/**DecompositionTask11
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Scanner;

public class DecompositionTask11 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Введите первое число");
		int number1 = input.nextInt();
		System.out.println("Введите второе число");
		int number2 = input.nextInt();
		int [] array1 = new int [quantification (number1)];
		int [] array2 = new int [quantification (number2)];
		createArray (array1, number1);
		createArray (array2, number2);
		print (array1);
		print (array2);
		search (array1, array2);
	}
	

	// определяем количество чисел
	static int quantification (int number) {
		int counter = 0;
		while (number != 0) {
			number = number / 10;
			counter ++;
		}
		return counter;
	}
	
	
	// записываем в массив ппо одной цифре
	static void createArray (int[] array, int number) {
		float numberTemp = number;
		int counter = array.length;
		while ((int)numberTemp != 0) {
			array[counter - 1] = (int) numberTemp % 10;
			numberTemp = numberTemp / 10;
			counter -- ;	
		}
	}
	
	//вывод массива
	static void print (int [] array) {
		System.out.println("");
		for (int i: array)
			System.out.print(i + "  ");
	}
	
	
	// определение где больше чисел
	static void search (int[] array1, int[] array2) {
		System.out.println("");
		if (array1.length > array2.length)
			System.out.println("Чисел больше в первом числе");
		else if (array1.length < array2.length)
			System.out.println("Чисел больше во втором числе");
		else 
			System.out.println("Количество чисел в числах равны");
	}	
}
