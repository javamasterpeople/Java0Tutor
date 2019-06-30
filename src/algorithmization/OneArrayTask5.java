 /**Algorithmization05
 * 2_Algorithmization
 * Algorithmization program - Task05
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;
import java.util.Scanner;

public class OneArrayTask5 {
	static int [] array;  // массив с которым работаем
	
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
	    System.out.println("¬ведите расзмерность масива:");
	    int n = input.nextInt();
	    array = new int [n];
	    createArray();
	    search();    
	} 
	
	// метод заполнени€ массива
	static void createArray () {
		Scanner input = new Scanner (System.in);
		for (int i=0; i < array.length; i++) {
			System.out.println("¬ведите элемент массива [" + i + "] :");
			array[i]= input.nextInt();
		}	
	}
	
	static void search () {
		for(int i = 0; i < array.length; i++) {
			if (array[i] > i)
				System.out.print(array[i] + "  ");
		}
	}
}
