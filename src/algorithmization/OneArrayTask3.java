 /**Algorithmization03
 * 2_Algorithmization
 * Algorithmization program - Task03
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;
import java.util.Scanner;

public class OneArrayTask3 {
	static float [] array;  // ������ � ������� ��������
	static int counterPlus = 0;
	static int counterMinus = 0;
	static int counterZero = 0;

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("������� ������������ ������:");
		int n = input.nextInt();
		array = new float [n];
		createArray();
		search();
		print();
		
		
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
	static void search () {
		for (float i: array) {
			if (i > 0)
				counterPlus ++;
			if (i < 0)
				counterMinus ++;
			if (i == 0)
				counterZero ++;
		}
	}
	
	//����� ������ �����������
	static void print () {
		System.out.println("���������� ��������� �������������: " + counterPlus);
		System.out.println("���������� ��������� �������������: " + counterMinus);
		System.out.println("���������� ��������� ������ ����: " + counterZero);
	}

	

}
