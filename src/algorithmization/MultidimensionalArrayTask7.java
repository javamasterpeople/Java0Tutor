package algorithmization;

import java.util.Scanner;

public class MultidimensionalArrayTask7 {
	static double [][] array;

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int size = 0;
		System.out.println("Введите порядок матрицы (чётное число):");
		size = input.nextInt();
		array = new double [size][size];
		createArray(size);
		printArray();
		System.out.println("\n\nКоличество положиетльных элементов  " + search());

	}
	
	
	// метод вывода массива
	static void printArray () {
		for (int i = 0; i < array.length; i++) {
			System.out.println(" ");
			for(int j = 0; j < array[i].length; j++) {
				System.out.printf("%10f", array[i][j]);
				System.out.print("   ");
	}
		}
	}
	
	
	//метод поиска положительнх элементов
	static int search() {
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if (array[i][j] > 0)
					counter ++;
			}
	}
		return counter;
	}
	
	
	public static void createArray(int size) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2))/size);
			}
		}
	}

}
