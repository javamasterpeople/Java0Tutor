/**DecompositionTask4
 * 2_Algorithmization
 * Algorithmization program
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package algorithmization;

import java.util.Random;
import java.util.Scanner;

public class DecompositionTask4 {

	public static void main(String[] args) {
		//������ ��� ���������
		int [][] arrayDots;
		Scanner input = new Scanner (System.in);
		System.out.println("������� ���������� �����");
		int n = input.nextInt();
		arrayDots = new int [2][n];
		//������ ������� � ������������ 
		int sizeResultArray = 0;
		for (int i = 1; i <= n; i++)
			for (int j = i + 1; j <= n; j++)
				sizeResultArray++;		
		//��������� ���������� ����� �������
		float [] resultFloat = new float [sizeResultArray];
		//�������� �����
		String [] resultString = new String [sizeResultArray];
		//������ ������
		createArray (arrayDots);
		//�������� ������
		printArray (arrayDots);
		//��������� ���������� ����� �������
		distanceCalculation (arrayDots, resultFloat, resultString );
		//��������� � ����������� ��������� �������
		float result = search (resultFloat);
		System.out.println("\n" + resultString [(int) result]);
		printArray (resultString, resultFloat);	
	}
	
	// �������� �������
		static void createArray (int[][] arrayDots) {
			Random rand = new Random ();
			  for (int i = 0; i < arrayDots[0].length; i ++) {
				arrayDots[0][i] = rand.nextInt(10);
				arrayDots[1][i] = rand.nextInt(10);
				}
		}
		
		
		// ����� �������
		static void printArray (int [][] array) {
			for (int []i: array ) {
				System.out.println("");
				for (int j: i)
					System.out.print(j + "   ");
			}
		}
		
		// ����� �������
		static void printArray (String [] arrayString, float [] arrayFloat) {
			System.out.println("");
			for (int i = 0; i < arrayString.length; i++) 
				System.out.println(arrayString [i] + "  =  " + arrayFloat[i]);
		}
		
		// ����� �������
		static void printArray (int [] array) {
			System.out.println("");
			for (int i: array ) {
					System.out.print(i + "   ");
			}
		}



		// ����� ������������� ����������
		static int search (float [] array) {
			int maxIndex = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i] > array [maxIndex])
					maxIndex = i;
			}
			return maxIndex;
		}
		
		
		// ������ ���������� ����� �������
		static void distanceCalculation (int [][] arrayDots, float [] resultInt, String [] resultString) {
			int counter = 0;
				for (int j = 0; j < arrayDots[0].length; j++) {
					for (int k = j + 1; k < arrayDots[0].length; k++) {
						resultInt [counter] = (float) Math.sqrt(Math.pow((arrayDots[0][j] - arrayDots[0][k]), 2) + Math.pow((arrayDots[1][j] - arrayDots[1][k]), 2));
						resultString [counter] = "����� " + j + " ---> " + " �����  " + k;
						counter++;
					}
				}
		}
	
}