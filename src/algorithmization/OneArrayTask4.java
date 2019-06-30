 /**Algorithmization04
 * 2_Algorithmization
 * Algorithmization program - Task04
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */
package algorithmization;
import java.util.Scanner;

public class OneArrayTask4 {
	static float [] array;  // массив с которым работаем

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("¬ведите расзмерность масива:");
		int n = input.nextInt();
		array = new float [n];
		createArray();
		replacementOfElements();
		print();


	}
	
	// метод заполнени€ массива
	static void createArray () {
		Scanner input = new Scanner (System.in);
		for (int i=0; i < array.length; i++) {
			System.out.println("¬ведите элемент массива [" + i + "] :");
			array[i]= input.nextFloat();
		}	
	}
	
	//замена элементов
	static void replacementOfElements () {
		int min = 0;
		int max = 0;
		float temp = 0;
		for(int i = 0; i < array.length; i++) {
			if (array[i] > array[max])
				max = i;
			if (array[i] < array[min])
				min = i;
		}
		temp = array[min];
		array[min] = array[max];
		array[max] = temp;
	}
	
	static void print () {
		for(float i: array) 
			System.out.print(" [ " + i + " ]  ");
	}
}
