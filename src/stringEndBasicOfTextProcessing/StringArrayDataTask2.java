 /**StringArrayDataTask2
 * 3_string end basic of text processing
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package stringEndBasicOfTextProcessing;
import java.util.Scanner;

public class StringArrayDataTask2 {
	public static void main (String [] args) {
		String str;
		Scanner input = new Scanner (System.in);
		System.out.println("¬ведите какую-ниюудь строку, желательно со словом 'world'");
		str = input.nextLine();
		System.out.println(replacement(str));
	}
	
	static String replacement (String str) {
		String strResult = str.replaceAll("word", "letter");
		return strResult;
	}
}
