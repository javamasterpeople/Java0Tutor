 /**StringObjectStringBuilderTask4
 * 3_string end basic of text processing
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package stringEndBasicOfTextProcessing;


public class StringObjectStringBuilderTask4 {

	public static void main(String[] args) {
		String str = "информатика";
		System.out.println(createTort(str));

	}
	
	static String createTort (String str) {
		String str2 = "";
		str2 += str.charAt(7);
		str2 += str.charAt(3);
		str2 += str.charAt(4);
		str2 += str.charAt(7);
		return str2;
	}

}
