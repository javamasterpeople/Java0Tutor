 /**StringArrayDataTask5
* 3_string end basic of text processing
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */
package stringEndBasicOfTextProcessing;

import java.util.Scanner;

public class StringArrayDataTask5 {

	public static void main(String[] args) {
			String str;
			Scanner input = new Scanner (System.in);
			System.out.println("������� �����-������ ������, ���������� � ��������� ������� ������");
			str = input.nextLine();
			System.out.println(conversion (str));
		}
		
		static String conversion (String str) {
			// �������� ��������� � �������� ��������
			str = str.trim();
			String strNew = "";
			for (int i = 0; i < str.length(); i++) {
				char symbol = str.charAt(i);
				if (symbol == ' ') {
					char symbolNext = str.charAt(i + 1);
					if (symbolNext == ' ')
						continue;
				}
				strNew = strNew + symbol;
			}
			return strNew;
		}
	}
