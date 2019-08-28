 /**
  * Algorithmization09
 * 2_Algorithmization
 * Algorithmization program - Task09
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */
package algorithmization;
import java.util.Random;
import java.util.Scanner;

public class OneArrayTask9 {
	static int [] array;  // ������ � ������� ��������


	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	    System.out.println("������� ������������ ������:");
	    int n = input.nextInt();
	    createArray (n);
	    printArray();
	    search();
	    
	}
	
	// ����� �������� ������� � ��������� �����������
	static void createArray(int n) {
		array = new int [n];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) 
			array[i] = rand.nextInt(10);
	}
	
	
	// ����� ������ �������
			static void printArray () {
				for (int i = 0; i < array.length; i++) 
					System.out.print(array[i] + "  ");
				
			}
			
			
	// ����� ������
			static void search () {
				int [] tempArray = new int [array.length];
				
				// ���������� ����� ���������� ���������� � ����� �����
				for (int i = 0; i < array.length - 1; i ++) {
					int counter = -1;
					for (int j = i; j < array.length; j++) {
						if (array[i] == array [j]) {
							counter ++;
						}
					}
					tempArray[i] = counter;
				}
				
				// ������� ������������ ���������� ��������
				int temp = 0;
				for (int i = 0; i < tempArray.length; i ++) {
					if (tempArray [i] > tempArray[temp])
						temp = i;
				}
				
				// ���� ����� ����� ���������
				int result  = temp;
				int status = 0;
				for (int i = 0; i < tempArray.length; i++) {
					if (tempArray[result] == tempArray[i]) {
						status ++;
						if (array [i] < array[result])
							result = i;
					}
				}
				
				if (status < 2)
					System.out.println("\n�����  " + array[result] + 
							"  ����������� ������������ ���������� ��� (" + tempArray[result] + ")");
				else {
					System.out.println("\n����������� ������������� ����� ���������");
					System.out.println("����� �������� ����������� �� "
							+ "����� �������������  " + array[result] + 
							"  �����������  " + tempArray[result] + "  ���");
				}
				
			}
}
