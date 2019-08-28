 /**Algorithmization08
 * 2_Algorithmization
 * Algorithmization program - Task08
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Scanner;

public class OneArrayTask8 {
	static int [] array;  // ������ � ������� ��������
	static int [] newArray;  // ������ �����

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	    System.out.println("������� ������������ ������:");
	    int n = input.nextInt();
	    array = new int [n];
	    createArray();
	    creatinANewArray();
	    for(int i: newArray)
	    	System.out.print(i + "  ");

	}
	
	
	// ����� ���������� �������
		static void createArray () {
			Scanner input = new Scanner (System.in);
			for (int i=0; i < array.length; i++) {
				System.out.println("������� ������� ������� [" + i + "] :");
				array[i]= input.nextInt();
				
			}	
		}
		
		
		static void creatinANewArray () {
			int counter = 0;
			int counterArray = 0;
			for (int i = 0; i < array.length; i++) {
				boolean min = false;
				for (int j = 0; j < array.length; j++) {
					if (array[i] > array[j])
						min = true;
				}
				if (min != true) 
					counter ++;
			}
			
			newArray = new int [array.length - counter];
			
			for (int i = 0; i < array.length; i++) {
				boolean min = false;
				for (int j = 0; j < array.length; j++) {
					if (array[i] > array[j])
						min = true;
				}
				if (min == true) {
					newArray[counterArray] = array[i];
					counterArray ++;
				}
			}
		}
}
