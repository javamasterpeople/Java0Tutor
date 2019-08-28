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
		//массив для координат
		int [][] arrayDots;
		Scanner input = new Scanner (System.in);
		System.out.println("Введите количество точек");
		int n = input.nextInt();
		arrayDots = new int [2][n];
		//размер массива с результатами 
		int sizeResultArray = 0;
		for (int i = 1; i <= n; i++)
			for (int j = i + 1; j <= n; j++)
				sizeResultArray++;		
		//результат расстояний между точками
		float [] resultFloat = new float [sizeResultArray];
		//название точек
		String [] resultString = new String [sizeResultArray];
		//создаём массив
		createArray (arrayDots);
		//печатаем массив
		printArray (arrayDots);
		//вычисляем расстояния между точками
		distanceCalculation (arrayDots, resultFloat, resultString );
		//результат с максимально удалёнными точками
		float result = search (resultFloat);
		System.out.println("\n" + resultString [(int) result]);
		printArray (resultString, resultFloat);	
	}
	
	// создание массива
		static void createArray (int[][] arrayDots) {
			Random rand = new Random ();
			  for (int i = 0; i < arrayDots[0].length; i ++) {
				arrayDots[0][i] = rand.nextInt(10);
				arrayDots[1][i] = rand.nextInt(10);
				}
		}
		
		
		// вывод массива
		static void printArray (int [][] array) {
			for (int []i: array ) {
				System.out.println("");
				for (int j: i)
					System.out.print(j + "   ");
			}
		}
		
		// вывод массива
		static void printArray (String [] arrayString, float [] arrayFloat) {
			System.out.println("");
			for (int i = 0; i < arrayString.length; i++) 
				System.out.println(arrayString [i] + "  =  " + arrayFloat[i]);
		}
		
		// вывод массива
		static void printArray (int [] array) {
			System.out.println("");
			for (int i: array ) {
					System.out.print(i + "   ");
			}
		}



		// поиск максимального расстояния
		static int search (float [] array) {
			int maxIndex = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i] > array [maxIndex])
					maxIndex = i;
			}
			return maxIndex;
		}
		
		
		// расчёт расстояний между точками
		static void distanceCalculation (int [][] arrayDots, float [] resultInt, String [] resultString) {
			int counter = 0;
				for (int j = 0; j < arrayDots[0].length; j++) {
					for (int k = j + 1; k < arrayDots[0].length; k++) {
						resultInt [counter] = (float) Math.sqrt(Math.pow((arrayDots[0][j] - arrayDots[0][k]), 2) + Math.pow((arrayDots[1][j] - arrayDots[1][k]), 2));
						resultString [counter] = "точка " + j + " ---> " + " точка  " + k;
						counter++;
					}
				}
		}
	
}