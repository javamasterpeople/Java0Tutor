 /**StringObjectStringBuilderTask10
 * 3_string end basic of text processing
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package stringEndBasicOfTextProcessing;

import java.util.Scanner;

public class StringObjectStringBuilderTask10 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Введите несколько предложений, желательно разделённые ! ? .");
		String str = new String (input.nextLine());
		System.out.println("Количество предложений: " + searchSentence(str));
	}
	
	static int searchSentence (String str) {
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == '!') || (str.charAt(i) == '?') || (str.charAt(i) == '.'))
				counter ++;
		}
		return counter;
	}

}
