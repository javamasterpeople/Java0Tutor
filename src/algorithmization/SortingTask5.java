 /**SortingTask1
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;
import java.util.Random;
import java.util.Scanner;

public class SortingTask5 {
	public static void main (String [] args) {
		Random rand = new Random ();
		Scanner input = new Scanner (System.in);
		System.out.println ("¬ведите количество элементов:");
		int element = input.nextInt();
		// —оздвЄм рандомный массив
		int [] array = new int [element];
		for (int i = 0; i < array.length; i++) 
			array[i] = rand.nextInt(100);
		for (int i: array)
			System.out.print(i + "  ");
		sorting (array);
		System.out.print("\n");
		for (int i: array)
			System.out.print(i + "  ");
	}
	
	void binarSearch (int [] array, int i ) {


	}
	
	static void sorting (int[] array) {
		    for(int i = 1; i < array.length; i++){
		        int currElem = array[i];
		        int prevKey = i - 1;
		            while(prevKey >= 0 && array[prevKey] > currElem){
		                array[prevKey+1] = array[prevKey];
		                array[prevKey] = currElem;
		                prevKey--;
		            }
		    }
		
	}

}
