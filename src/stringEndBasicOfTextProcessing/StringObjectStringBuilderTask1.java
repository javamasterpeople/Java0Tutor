 /**StringObjectStringBuilderTask1
 * 3_string end basic of text processing
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package stringEndBasicOfTextProcessing;

import java.util.Scanner;

public class StringObjectStringBuilderTask1 {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner (System.in);
		System.out.println("Введите какое-нибудь слово, желательно с большим количество пробелов");
		str = input.nextLine();
		System.out.println("Максимальное количество пробелов равно:  " + searchSpace (str));
		}
	
	static int searchSpace (String str) {
		int counter = 0;
		int counterTemp = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' & i == str.length() - 1) {
				counterTemp ++;
			if (counterTemp > counter) {
				counter = counterTemp;
				counterTemp = 0;
			    }
			}	
			else if (str.charAt(i) == ' ')
				counterTemp ++;
			else if (counterTemp > counter) {
					counter = counterTemp;
					counterTemp = 0;
				}
			
				else
					counterTemp = 0;
	            }
		return counter;	
	}
}
