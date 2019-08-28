 /**DecompositionTask6
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Scanner;

public class DecompositionTask6 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("������� ������ �����");
		int n1 = input.nextInt();
		System.out.println("������� ������ �����");
		int n2 = input.nextInt();
		System.out.println("������� ������ �����");
		int n3 = input.nextInt();
		check (n1,n2,n3);
		
	}
	
	static void check (int n1, int n2, int n3) {
		int nod1 = nod (n1, n2);
		int nod2 = nod (n3, nod1);
		if (nod1 == 1 & nod2 == 1)
			System.out.println("����� ������� �������");
		else
			System.out.println("����� �� �������� ������� ��������");
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
}
