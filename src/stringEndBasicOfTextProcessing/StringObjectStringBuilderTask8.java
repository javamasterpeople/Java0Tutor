 /**StringObjectStringBuilderTask8
 * 3_string end basic of text processing
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package stringEndBasicOfTextProcessing;

import java.util.Scanner;

public class StringObjectStringBuilderTask8 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("¬ведите слова, желательно разделенные пробелами");
		StringBuffer str = new StringBuffer (input.nextLine());
		System.out.println("—амое длинное слово в строке :  " + wordCount (str));	
	}
	
	static StringBuffer wordCount (StringBuffer str) {
		StringBuffer strResult = new StringBuffer("");
		StringBuffer strTemp = new StringBuffer("");
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == ' ') || (i == str.length() - 1)) {
				strTemp.delete(0, strTemp.length());
				for (int j = 0; j <= i; j++)
					strTemp.append(str.charAt(j));
				str.delete(0, i + 1);
				if (strTemp.length() > strResult.length()) {
					strResult.delete(0, strResult.length());
					strResult.append(strTemp);
				}
				 i -= i;
			}
		}	
		return strResult;	
	}
}
