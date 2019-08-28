 /**StringObjectStringBuilderTask3
 * 3_string end basic of text processing
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */


package stringEndBasicOfTextProcessing;

import java.util.Scanner;

public class StringObjectStringBuilderTask3 {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner (System.in);
		System.out.println("¬ведите какое-нибудь слово, желательно палиндром");
		str = input.nextLine();
		System.out.println("явл€етс€ ли слово палиндромом? -   " + test(str));
	}
	
	
	static boolean test (String str) {
		boolean status = false;
		StringBuffer str1 = new StringBuffer (str);
		str1 = str1.reverse();
		String str3 = new String (str1.toString());
		return str.equalsIgnoreCase(str3);
	}
}
