 /**StringObjectStringBuilderTask2
 * 3_string end basic of text processing
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package stringEndBasicOfTextProcessing;

import java.util.Scanner;

public class StringObjectStringBuilderTask2 {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner (System.in);
		System.out.println("������� �����-������ �����, ���������� � ������� a");
		str = input.nextLine();
		System.out.println("�������� ���������");
		System.out.println(str.replaceAll("a", "ab"));
	}
}
