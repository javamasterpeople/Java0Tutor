 /**Algorithmization02
 * 2_Algorithmization
 * Algorithmization program - Task02
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */
package algorithmization;
import java.util.Scanner;

public class OneArrayTask2 {
	static float [] array;  // массив с которым работаем
	static float z;   // число к из задания

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Введите расзмерность масива:");
		int n = input.nextInt();
		array = new float [n];
		System.out.println("Введите Z:");
		z = input.nextFloat();
		createArray();
		System.out.println("Количество замен: " + searchForMore());
		printArray();
	}
	
	
	// метод заполнения массива
	static void createArray () {
		Scanner input = new Scanner (System.in);
		for (int i=0; i < array.length; i++) {
			System.out.println("Введите элемент массива [" + i + "] :");
			array[i]= input.nextFloat();
		}	
		
	}
	
	//метод поиска 
	static int searchForMore () {
		int counter = 0;
		for (int i = 0; i <array.length; i++) {
			if (array[i] > z) {
				counter ++;
				array[i] = z;
			}
		}
		return counter;
	}
	
	
	// вывод измененного массива
	static void printArray() {
		for(float i: array)
			System.out.print("[ " + i + " ]  ");
	}

}
