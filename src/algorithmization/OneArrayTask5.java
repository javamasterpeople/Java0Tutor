 /**Algorithmization05
 * 2_Algorithmization
 * Algorithmization program - Task05
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;
import java.util.Scanner;

public class OneArrayTask5 {
	static int [] array;  // ������ � ������� ��������
	
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
	    System.out.println("������� ������������ ������:");
	    int n = input.nextInt();
	    array = new int [n];
	    createArray();
	    search();    
	} 
	
	// ����� ���������� �������
	static void createArray () {
		Scanner input = new Scanner (System.in);
		for (int i=0; i < array.length; i++) {
			System.out.println("������� ������� ������� [" + i + "] :");
			array[i]= input.nextInt();
		}	
	}
	
	static void search () {
		for(int i = 0; i < array.length; i++) {
			if (array[i] > i)
				System.out.print(array[i] + "  ");
		}
	}
}
