 /**MultidimensionalArrayTask1
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;
import java.util.Random;
import java.util.Scanner;

public class MultidimensionalArrayTask1 {
	static int [][] array;

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("������� ���������� �����:");
		int line = input.nextInt();
		System.out.println("������� ���������� ��������:");
		int column = input.nextInt();
		createArray (line, column);
		printArray();
		search();

	}

	// ����� �������� ������� � ��������� �����������
	static void createArray(int line, int column) {
		array = new int [line][column];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(10);
			}
		}
		
	}
	
	// ����� ������ �������
	static void printArray () {
		for (int i = 0; i < array.length; i++) {
			System.out.println(" ");
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "  ");
	}
		}
	}
	
	
	//����� ������
	static void search() {
		System.out.println("\n ���������");
		for (int j = 0; j < array[0].length; j++) {
			if (j%2 != 0 & (array[0][j] > array [array.length - 1][j])) {
				for (int i = 0; i < array.length; i++) {
					System.out.print(array[i][j] + " ");
				}
				System.out.print("\n");
			}
		}
	}
	
}
