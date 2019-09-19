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
	
	//����� ������ �������� �� �����
	private void print (int a, int b) {
		System.out.println("�������� a = " + a);
		System.out.println("�������� b = " + b);
	}
	
	// ����� ��������� ����������
	private void changeValue () {
		Scanner input = new Scanner (System.in);
		System.out.println("������� ����� �������� A");
		this.a = input.nextInt();
		System.out.println("������� ����� �������� B");
		this.b = input.nextInt();
	}
	
	//����� ���������� ����� �����
	private void calculation (int a, int b) {
		System.out.println ("����� ����� ����� " + (a+b));
	}
	
	//����� ���������� �������� �����
	private void search (int a, int b) {
		if (a == b)
			System.out.println ("����� A � B �����");
	    else if (a > b)
			System.out.println ("������� ����� A = " + a);
		     else
			System.out.println ("������� ����� B = " + b);
	}
}
