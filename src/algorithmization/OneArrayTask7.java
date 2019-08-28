 /**Algorithmization07
 * 2_Algorithmization
 * Algorithmization program - Task07
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Scanner;

public class OneArrayTask7 {
	static int [] array;  // ������ � ������� ��������
	static int [] arrayResult;  // ������ � ������� ��������

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	    System.out.println("������� ������������ ������:");
	    int n = input.nextInt();
	    array = new int [n];
	    arrayResult = new int [n/2];
	    createArray ();
	    System.out.println(search());

	}
	
	// ����� ���������� �������
	static void createArray () {
		Scanner input = new Scanner (System.in);
		for (int i=0; i < array.length; i++) {
			System.out.println("������� ������� ������� [" + i + "] :");
			array[i]= input.nextInt();
		}	
	}
	
	// ����� �� �������
	static int search () {
		int temp = 0;
		int index = 0;
		for (int i = 0; i < array.length - 1; i += 2) {
			temp = array[i] + array[i+1];
			arrayResult[index] = temp;
			index ++;
			}
		temp = arrayResult[0];
		for (int i: arrayResult) {
			if (temp < i)
				temp = i;
		}
		return temp;
	}
}
