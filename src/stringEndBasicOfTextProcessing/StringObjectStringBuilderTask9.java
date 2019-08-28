 /**StringObjectStringBuilderTask9
 * 3_string end basic of text processing
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package stringEndBasicOfTextProcessing;

import java.util.Scanner;

public class StringObjectStringBuilderTask9 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Введите несколько предложений, желательно разделённые ! ? .");
		String str = new String (input.nextLine());
		int arrayResult[] = searchSmall (str);
		System.out.println("Количество строчных английский букв: " + arrayResult[0]);
		System.out.println("Количество прописных английский букв: " + arrayResult[1]);
	}
	
	static int [] searchSmall (String str) {
		int [] counter = {0,0};
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' & str.charAt(i) <= 'z')
				counter[0]++;
			if (str.charAt(i) >= 'A' & str.charAt(i) <= 'Z')
				counter[1]++;
		}
		return counter;
	}
}
