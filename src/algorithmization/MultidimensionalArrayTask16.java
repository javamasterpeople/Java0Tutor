 /**MultidimensionalArrayTask16
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Random;
import java.util.Scanner;

public class MultidimensionalArrayTask16 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int [][] array;
		System.out.println("������� �����������:");
		int size = input.nextInt();
		array = new int[size][size];
		int type = 0; // ������ ����������
		if (size % 3 == 0)
			type = 1;
		switch (type) {
		case 1:
			System.out.println("������ ������� ��������� �������");
			createArrayMagic1 (array);
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			break;		
		}
	}


// ����� ���������� �������� ��������� �������
static int [][] createArrayMagic1 (int [][] array) {
	// ���� ��������� ����������
	int magicConst = (array.length * ((array.length * 2) + 1)) / 2;
	int counter = 1;
	array [0][((array.length + 1) / 2) - 1] = counter++;
	
	
}

}
