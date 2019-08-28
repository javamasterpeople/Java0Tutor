 /**StringObjectStringBuilderTask5
 * 3_string end basic of text processing
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package stringEndBasicOfTextProcessing;

import java.util.Scanner;

public class StringObjectStringBuilderTask5 {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner (System.in);
		System.out.println("¬ведите какое-нибудь слово, желательно с буквами a");
		str = input.nextLine();
		System.out.println(" оличество букв а равно  -   " +  countA (str));
	}
	
	static int countA (String str) {
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a')
				counter++;
		}
		return counter;
	}
	
	
	

}
