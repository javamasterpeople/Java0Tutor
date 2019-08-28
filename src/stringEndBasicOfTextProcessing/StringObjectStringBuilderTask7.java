 /**StringObjectStringBuilderTask7
 * 3_string end basic of text processing
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package stringEndBasicOfTextProcessing;
import java.util.Scanner;

public class StringObjectStringBuilderTask7 {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Введите строку, желательно с повторяющими символами");
		StringBuilder str = new StringBuilder (input.nextLine());
		System.out.println("Получаем результат: \n" + characterConversion(str));		
	}
	
	static StringBuilder characterConversion (StringBuilder str) {
		for (int i = 0; i < str.length() - 1; i++) {
			char symbol = str.charAt(i);
			for (int j = i + 1; j < str.length(); j++) {
				if (symbol == str.charAt(j))
					str.deleteCharAt(j);
				if (symbol == ' ')
					str.deleteCharAt(i);
			}
	}
		return str;
	}
}
