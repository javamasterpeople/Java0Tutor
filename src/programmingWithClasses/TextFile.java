package programmingWithClasses;

import java.util.Scanner;

public class TextFile extends File {
	String text;
	
	void add () {
		Scanner input = new Scanner (System.in);
		System.out.println ("������� ��� ���������");
		String str = input.nextLine();
		text += str;
	}
	
	void out () {
		System.out.println("��� �����: " + name);
		System.out.println(text);
	}

}
