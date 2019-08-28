 /**Algorithmization10
 * 2_Algorithmization
 * Algorithmization program - Task10
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Scanner;

public class OneArrayTask10 {
	static int [] array;  // ������ � ������� ��������
	
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
	    System.out.println("������� ������������ ������:");
	    int n = input.nextInt();
	    array = new int [n];
	    createArray ();
	    deletingItems ();
	    
	    //�������� ���������
		for (int i: array)
			System.out.print(i + " ");
		
	}

	
	// ����� ���������� �������
	static void createArray () {
		Scanner input = new Scanner (System.in);
		for (int i=0; i < array.length; i++) {
			System.out.println("������� ������� ������� [" + i + "] :");
			array[i]= input.nextInt();
		}	
	}
	
	//����� ������ ������� ����������� ������ ������ ������� ��������� ����� 0 ���������
	static void deletingItems () {
		int counter = 1;
		for (int i = 1; i < array.length; i++) {
			if (i%2 == 0) {
				array[i - counter] = array [i];
				counter ++;
			}
		}
		for (int i = counter; i < array.length; i++)
			array[i] = 0;
	}
}
