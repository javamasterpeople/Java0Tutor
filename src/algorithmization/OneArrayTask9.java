 /**Algorithmization09
 * 2_Algorithmization
 * Algorithmization program - Task09
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */
package algorithmization;
import java.util.Scanner;

public class OneArrayTask9 {
	static int [] array;  // ������ � ������� ��������
	static int [] reiterationArray; // ������ ��� ������ ���������� ����������
	static boolean [] resultArray; // ������ ���������������

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	    System.out.println("������� ������������ ������:");
	    int n = input.nextInt();
	    array = new int [n];
	    reiterationArray = new int [n];
	    createArray(); // ������ ������

	}
	
	
	// ����� ���������� �������
	static void createArray () {
		Scanner input = new Scanner (System.in);
		for (int i=0; i < array.length; i++) {
			System.out.println("������� ������� ������� [" + i + "] :");
			array[i]= input.nextInt();
			reiterationArray[i] = 0;
			resultArray [i] = false;
		}	
	}
	
	
	static void search () {
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j])
					reiterationArray[i] ++;
			}
		}
		
		int max = 0;
		for (int i = 0; i < reiterationArray.length; i++) {
			if (reiterationArray[i] > reiterationArray[max]) 
				max = i;	
		}	
		
		for (int i = 0; i < reiterationArray.length; i++ ) {
			if (reiterationArray[i] == reiterationArray[max]) {
				resultArray [i] = true;	
				counter ++;
			}
		}
		
		if (counter > 1) {
			int min = 0;
			for (int i = 0; i < resultArray.length; i++) {
				if (resultArray [i] == true) {
					
				}
			}	
		}
		
	}

}
