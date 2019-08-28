 /**SortingTask6
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Random;
import java.util.Scanner;

public class SortingTask6 {

	static int [] array;
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Введите количество элементов");
		int size = input.nextInt();
		createArray (size);
		System.out.println("Исходный массив:");
		printArray ();
		sorting();
		System.out.println("\nОтсортированный массив:");
		printArray ();

	}

	
	static void createArray (int size) {
		array = new int [size];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array [i] = rand.nextInt(1000);
		}
	}
	
	
	static void printArray () {
		for (int i: array) {
			System.out.print(i + "  ");
		}
	}
	
	
	//сортировка шелла
	static void sorting () {
		int h = 1;
        int n = array.length;
        while (h < n / 3)
            h = 3 * h + 1;  // последовательность предложенная Дональдом Кнутом
                             // перебираем до 1/3 размера массива
 
        while (h >= 1) {
            for (int i = h; i < array.length; i++) {
                for (int j = i; j >= h && array[j] < array[j - h]; j -= h) {
                    int temp = array[j];
                    array[j] = array[j - h];
                    array[j - h] = temp;
                }
            }
            h = h / 3;
        }
	}
}
