 /**Algorithmization01
 * 2_Algorithmization
 * Algorithmization program - Task01
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;
import java.util.Scanner;

public class OneArrayTask1 {
	static int [] array;  // ������ � ������� ��������
	static int k;   // ����� � �� �������

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("������� ������������ ������:");
		int n = input.nextInt();
		array = new int [n];
		System.out.println("������� K:");
		k = input.nextInt();
		createArray();
		System.out.println("����� ��������� ������� K �����  " + sum());
	}

	// ����� ���������� �������
	static void createArray () {
		Scanner input = new Scanner (System.in);
		for (int i=0; i < array.length; i++) {
			System.out.println("������� ������� ������� [" + i + "] :");
			array[i]= input.nextInt();
		}	
		
	}
	
	//����� ������ ��� ��������� ������� ������ ��������� �
	static int sum () {
		int result = 0;
		for (int i: array) {
			if (i%k == 0)
				result += i;
		}
		return result;
	}
}
