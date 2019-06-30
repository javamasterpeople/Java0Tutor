 /**Algorithmization02
 * 2_Algorithmization
 * Algorithmization program - Task02
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */
package algorithmization;
import java.util.Scanner;

public class OneArrayTask2 {
	static float [] array;  // ������ � ������� ��������
	static float z;   // ����� � �� �������

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("������� ������������ ������:");
		int n = input.nextInt();
		array = new float [n];
		System.out.println("������� Z:");
		z = input.nextFloat();
		createArray();
		System.out.println("���������� �����: " + searchForMore());
		printArray();
	}
	
	
	// ����� ���������� �������
	static void createArray () {
		Scanner input = new Scanner (System.in);
		for (int i=0; i < array.length; i++) {
			System.out.println("������� ������� ������� [" + i + "] :");
			array[i]= input.nextFloat();
		}	
		
	}
	
	//����� ������ 
	static int searchForMore () {
		int counter = 0;
		for (int i = 0; i <array.length; i++) {
			if (array[i] > z) {
				counter ++;
				array[i] = z;
			}
		}
		return counter;
	}
	
	
	// ����� ����������� �������
	static void printArray() {
		for(float i: array)
			System.out.print("[ " + i + " ]  ");
	}

}
