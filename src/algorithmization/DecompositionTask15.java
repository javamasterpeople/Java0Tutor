 /**DecompositionTask15
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Scanner;

public class DecompositionTask15 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("������� ������ � �����?");
		int k = input.nextInt();
		search (k);
		
	}
	
	
		
		// ���������� ����� ��� �������� � �������� ���������
		static void search (int k) {
			int counter = 0;
			// ����������� ��������� �����
			int lastNumber = 10 * (int)Math.pow(10,k-1) - 1;
			for (int i = 1 * (int)Math.pow(10,k-1); i < 10 * (int)Math.pow(10,k-1); i++) {
				if (increase�heck (i, lastNumber)) {
					System.out.print(i + "\n");
					counter++;
				}
			}
			System.out.println("�����������! ���� ������� " + counter + " �����");
		}
		
		
		// �������� ������� �����������
		static boolean increase�heck (int number, int lastNumber) {
			int pcsNumbers = quantification (number);
			float numberTemp = number;
			int temp = 0;
			while ((int)numberTemp != 0) {
				temp = (int) numberTemp % 10;
				if (temp < lastNumber) {
				lastNumber = (int) temp;
				numberTemp = numberTemp / 10;	
				}
				else 
				return false;
			}
			return true;
		}
		
		
		// ���������� ���������� �����
		static int quantification (int number) {
			int counter = 0;
			while (number != 0) {
				number = number / 10;
				counter ++;
			}
			return counter;
		}
}
