 /**Algorithmization01
 * 2_Algorithmization
 * Algorithmization program - Task01
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;
import java.util.Scanner;

public class OneArrayTask1 {
	static int [] array;  // массив с которым работаем
	static int k;   // число к из задания

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Введите расзмерность масива:");
		int n = input.nextInt();
		array = new int [n];
		System.out.println("Введите K:");
		k = input.nextInt();
		createArray();
		System.out.println("Сумма элементов кратных K равна  " + sum());
	}

	// метод заполнения массива
	static void createArray () {
		Scanner input = new Scanner (System.in);
		for (int i=0; i < array.length; i++) {
			System.out.println("Введите элемент массива [" + i + "] :");
			array[i]= input.nextInt();
		}	
		
	}
	
	//метод поиска тех элементов которые кратны заданному К
	static int sum () {
		int result = 0;
		for (int i: array) {
			if (i%k == 0)
				result += i;
		}
		return result;
	}
}
