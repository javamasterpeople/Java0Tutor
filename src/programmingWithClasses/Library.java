 /**EasyClassTask9
 * 4_Programming_with_classes
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package programmingWithClasses;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		Library obj1 = new Library();
		Book[] obj = new Book [5];
		obj[0] = new Book (18, "Java 8 ����������� ��� ����������", "������� �����", "Oracle press", 2015, 700, 130, "������ �������");
		obj[1] = new Book ();
		obj[2] = new Book (11, "���������������� �� Java ��� ����������", "��������", "������", 2017, 680, 45, "������ �������");
		obj[3] = new Book (10, "������ ����������� Java 8", "������� �����", "�������", 2015, 1355, 280, "������ �������");
		obj[4] = new Book (12, "Java ������������ ����������������", "������, ��������", "�����", 2007, 700, 100, "������ �������");
		
		obj1.printSearchAuthors (obj);
		System.out.println("\n");
		obj1.printSearchPublisher (obj);
		System.out.println("\n");
		obj1.printSearchYear(obj);
		
	}
	
	// ����� ���� ��������� ������
	private void printSearchAuthors (Book[] obj) {
		Scanner input = new Scanner (System.in);
		System.out.println("�������� ����� �� ������:");
		String name = input.nextLine();
		
		boolean status = false;
		for (int i = 0; i < obj.length; i++) {
			if (obj[i].getAuthors().contains(name)) {
				status = true;
				System.out.println(obj[i].toString());
			}
		}
		if (!status)
			System.out.println("������� ������ �� �������!");
	}

	// ����� ���� ��������� ������������
	private void printSearchPublisher(Book[] obj) {
		Scanner input = new Scanner (System.in);
		System.out.println("�������� ����� �� ������������:");
		String name = input.nextLine();
		
		boolean status = false;
		for (int i = 0; i < obj.length; i++) {
			if (obj[i].getPublisher().contains(name)) {
				status = true;
				System.out.println(obj[i].toString());
			}
		}
		if (!status)
			System.out.println("������� ������ �� �������!");
	}
	
	// ����� ���� ����� ��������� ����
	private void printSearchYear (Book[] obj) {
		Scanner input = new Scanner (System.in);
		System.out.println("�������� ����� �� ���� �����������:");
		int name = input.nextInt();
		
		boolean status = false;
		for (int i = 0; i < obj.length; i++) {
			if (obj[i].getYear() >= name) {
				status = true;
				System.out.println(obj[i].toString());
			}
		}
		if (!status)
			System.out.println("������� ������ �� �������!");
	}
}
