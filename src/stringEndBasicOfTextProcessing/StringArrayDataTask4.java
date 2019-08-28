 /**StringArrayDataTask4
 * 3_string end basic of text processing
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */
package stringEndBasicOfTextProcessing;

import java.util.Scanner;

public class StringArrayDataTask4 {
	static int counter = 0;
	static boolean status = false;
	
	public static void main (String [] args) {
		String str;
		Scanner input = new Scanner (System.in);
		System.out.println("Введите какую-ниюудь строку, желательно с цифрами между пробелами");
		str = input.nextLine();
		System.out.println("Количество чисел в строке равно: " + searchNumber (str) );
	}

	
	static int searchNumber (String str) {
		int counter = 0;
		boolean status = false;
		for (int i = 0; i < str.length(); i++) {
			if ((((str.charAt(i) > '9')) & status) | ((i == str.length() - 1) & status) | ((str.charAt(i) == ' ') & status)) {
				counter++;
			    status = false;		
			}
			else if ((str.charAt(i) >= '0') & (str.charAt(i) <= '9')) {
				status = true;
			}
		}
		return counter;
	}
}
