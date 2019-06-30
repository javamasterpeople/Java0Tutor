 /**Algorithmization03
 * 2_Algorithmization
 * Algorithmization program - Task03
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;
import java.util.Scanner;

public class OneArrayTask3 {
	static float [] array;  // массив с которым работаем
	static int counterPlus = 0;
	static int counterMinus = 0;
	static int counterZero = 0;

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Введите расзмерность масива:");
		int n = input.nextInt();
		array = new float [n];
		createArray();
		search();
		print();
		
		
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
	static void search () {
		for (float i: array) {
			if (i > 0)
				counterPlus ++;
			if (i < 0)
				counterMinus ++;
			if (i == 0)
				counterZero ++;
		}
	}
	
	//метод печати результатов
	static void print () {
		System.out.println("Количество элементов положительных: " + counterPlus);
		System.out.println("Количество элементов отрицательных: " + counterMinus);
		System.out.println("Количество элементов равных нулю: " + counterZero);
	}

	

}
