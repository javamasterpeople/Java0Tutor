 /**Algorithmization10
 * 2_Algorithmization
 * Algorithmization program - Task10
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Scanner;

public class OneArrayTask10 {
	static int [] array;  // массив с которым работаем
	
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
	    System.out.println("¬ведите расзмерность масива:");
	    int n = input.nextInt();
	    array = new int [n];
	    createArray ();
	    deletingItems ();
	    
	    //печатаем результат
		for (int i: array)
			System.out.print(i + " ");
		
	}

	
	// метод заполнени€ массива
	static void createArray () {
		Scanner input = new Scanner (System.in);
		for (int i=0; i < array.length; i++) {
			System.out.println("¬ведите элемент массива [" + i + "] :");
			array[i]= input.nextInt();
		}	
	}
	
	//метод сжати€ массива выбрасываем каждый второй элемент свободное место 0 заполн€ем
	static void deletingItems () {
		int counter = 1;
		for (int i = 1; i < array.length; i++) {
			if (i%2 == 0) {
				array[i - counter] = array [i];
				counter ++;
			}
		}
		for (int i = counter; i < array.length; i++)
			array[i] = 0;
	}
}
