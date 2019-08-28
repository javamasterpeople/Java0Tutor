 /**DecompositionTask1
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */


package algorithmization;

import java.util.Scanner;

public class DecompositionTask1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("������� ������ �����");
		int n1 = input.nextInt();
		System.out.println("������� ������ �����");
		int n2 = input.nextInt();
		System.out.println("��� ����� �����  " + nod (n1,n2));
		System.out.println("��� ����� �����  " + nok (n1,n2));
		
	}
	
	
	// �������� ������� ����� ���
		static int nod (int a, int b) {
	        while (a != b) {
	            if (a > b) {
	                a = a - b;
	            } else {
	                b = b - a;
	            }
	        }
	        return a;
	    }
		
		
		static int nok (int a, int b) {
			return (a * b) / nod (a, b);
		}
}
