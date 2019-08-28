 /**StringArrayDataTask1
 * 3_string end basic of text processing
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */
package stringEndBasicOfTextProcessing;

public class StringArrayDataTask1 {
	public static void main (String [] args) {
		String [] arrayString = {"methodOneInt", "methodTwoFloat", "methodThreeDouble", "methodFourString", "methodFiveBoolean"};
		System.out.println("Исходный массив:");
		print(arrayString);
		System.out.println("\nПолучаем результат:");
		print(conversion (arrayString));
	}
	
	//Печать массива
	static void print (String[] array) {
		System.out.println();
		for (String i: array)
			System.out.print(i + ", ");
		System.out.println();
	}
	
	static String[] conversion (String[] array) {
		for (int i = 0; i < array.length; i++) {
			String strTemp = "";
			for (int j = 0; j < array[i].length(); j++) {
				char symbolArray = array[i].charAt(j);
				if (symbolArray >= 'A' & symbolArray <= 'Z')
					strTemp = strTemp + '_' + symbolArray;
				else 
					strTemp = strTemp + symbolArray;
			}
			String strResult = strTemp.toLowerCase();
			array[i] = strResult;
		}
		return array;
	}
}
