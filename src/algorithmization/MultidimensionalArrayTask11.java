 /**MultidimensionalArrayTask11
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;
import java.util.Random;
import java.util.Scanner;

public class MultidimensionalArrayTask11 {
	static int [][] array;

	public static void main(String[] args) {
		createArray();
		printArray();
		search();
	}
	
	// ����� �������� ������� � ��������� �����������
		static void createArray() {
			array = new int [10][20];
			Random rand = new Random();
			for (int i = 0; i < array.length; i++) {
				for(int j = 0; j < array[i].length; j++) {
					array[i][j] = rand.nextInt(15);
				}
			}
		}
		
		
		// ����� ������ �������
		static void printArray () {
			for (int i = 0; i < array.length; i++) {
				System.out.println(" ");
				for(int j = 0; j < array[i].length; j++) {
					System.out.printf("%4d", array[i][j]);
		}
			}
		}

		//����� ������� ����� � ������� ����� 5 ����������� 3 � ����� ���
		static void search () {
			int counter = 0;
			System.out.println("\n������ ����� � ������� ����� 5 ����������� 3 ��� ����� ���");
			for (int i = 0; i < array.length; i++) {
				for(int j = 0; j < array[i].length; j++) {
					if (array[i][j] == 5)
						counter++;	
				}
				if (counter >= 3) 
					System.out.print(i + "  ");
				counter = 0;
		}
		}
}
