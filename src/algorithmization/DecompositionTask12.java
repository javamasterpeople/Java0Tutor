/**DecompositionTask12
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;
import java.util.Scanner;

public class DecompositionTask12 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("������� ����� K");
		int k = input.nextInt();
		System.out.println("������� ����� N");
		int n = input.nextInt();
		int counter = 0;
		
		//���������� ����� ������ �������
		for (int i = 0; i < n; i++) {
			if (Search (i, k))
				counter++;
		}
		int [] array = new int [counter];
		
		// ���������� ����� ���������� ��� ������� � ���������� � ������
		counter = 0;
		for (int i = 0; i < n; i++) {
			if (Search (i, k)) {
				array[counter] = i; 
				counter++;
			}
		}
		
		// ������� ����������
		for (int i = 0; i < array.length; i ++)
			System.out.println("array [" + i + "] --->  " + array[i]);
	}
	
	
	// ���������� ���������� �����
		static boolean Search (int number, int k) {
			float numberTemp = number;
			int result = 0;
			while ((int)numberTemp != 0) {
				result += (int) numberTemp % 10;
				numberTemp = numberTemp / 10;
			}
			if (result == k)
				return true;
			else
				return false;
		}
}
