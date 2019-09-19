 /**EasyClassTask1
 * 4_Programming_with_classes
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package programmingWithClasses;

import java.util.Scanner;

public class Test1 {
	private int a = 0;
	private int b = 0;

	public static void main(String[] args) {
		Test1 obj = new Test1 ();
		obj.print(obj.a, obj.b);
		obj.changeValue();
		obj.print(obj.a, obj.b);
		obj.calculation(obj.a, obj.b);
		obj.search(obj.a, obj.b);
		obj.changeValue();
		obj.print(obj.a, obj.b);
		obj.calculation(obj.a, obj.b);
		obj.search(obj.a, obj.b);
		obj.changeValue();
		obj.print(obj.a, obj.b);
		obj.calculation(obj.a, obj.b);
		obj.search(obj.a, obj.b);
	}
	
	//метод вывода значений на экран
	private void print (int a, int b) {
		System.out.println("Значение a = " + a);
		System.out.println("Значение b = " + b);
	}
	
	// метод изменения переменных
	private void changeValue () {
		Scanner input = new Scanner (System.in);
		System.out.println("Введите новое значение A");
		this.a = input.nextInt();
		System.out.println("Введите новое значение B");
		this.b = input.nextInt();
	}
	
	//метод нахождения суммы полей
	private void calculation (int a, int b) {
		System.out.println ("Сумма чисел равна " + (a+b));
	}
	
	//метод нахождения большего числа
	private void search (int a, int b) {
		if (a == b)
			System.out.println ("Числа A и B равны");
	    else if (a > b)
			System.out.println ("Большее число A = " + a);
		     else
			System.out.println ("Большее число B = " + b);
	}
}
