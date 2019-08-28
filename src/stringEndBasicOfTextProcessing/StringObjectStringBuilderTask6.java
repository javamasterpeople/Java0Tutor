 /**StringObjectStringBuilderTask6
 * 3_string end basic of text processing
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package stringEndBasicOfTextProcessing;

import java.util.Scanner;

public class StringObjectStringBuilderTask6 {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner (System.in);
		System.out.println("Введите какое-нибудь слово");
		str = input.nextLine();
		System.out.println("Получили следующее:   \n" + conversion (str));
		
	}
	
	static String conversion (String str) {
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			str2 += str.charAt(i);
		    str2 += str.charAt(i);
		}
		return str2;
	}
}
