 /**StringArrayDataTask3
* 3_string end basic of text processing
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package stringEndBasicOfTextProcessing;

import java.util.Scanner;

public class StringArrayDataTask3 {
	public static void main (String[] args) {
		String str;
		Scanner input = new Scanner (System.in);
		System.out.println("Введите какую-ниюудь строку, желательно с цифрами");
		str = input.nextLine();
		System.out.println("Количество цифр в строке равно: " + search (str));
	}
	
	static int search (String str) {
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			char symbol = str.charAt(i);
			if (symbol >= '0' & symbol <= '9')
				counter++;
		}
		return counter;
	}
}
