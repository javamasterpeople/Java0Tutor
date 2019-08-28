 /**DecompositionTask10
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Scanner;

public class DecompositionTask10 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("������� �����");
		int number = input.nextInt();
		System.out.println("���������� �������� ������:");
		process (number);
	}
	
	
	static public void process (int number) {
		int counter = 0;
		float numberTemp = number;
		// ���������� ���������� �����
		while (number != 0) {
			number = number / 10;
			counter ++;
		}
		int [] array = new int [counter];
		// ���������� � ������ ��� ����� �����
		while ((int)numberTemp != 0) {
			array[counter - 1] = (int) numberTemp % 10;
			numberTemp = numberTemp / 10;
			counter -- ;	
		}
		for (int i: array)
			System.out.print(i + "  ");
	}

}
