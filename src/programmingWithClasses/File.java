package programmingWithClasses;

import java.util.Scanner;

public abstract class File {
	String name;
	
	abstract void add ();
	abstract void out ();
	abstract void create ();
	
	
	void rename () {
		Scanner input = new Scanner (System.in);
		System.out.println ("������� ����� ���");
		this.name = input.nextLine();
	}
	
	void delete (File a) {
		a = null;
		System.out.println("���� �����");
	}
	
	
	File (){
		this.name = "File";
	}
	
	File (String name){
		this.name = name;
	}
	
}
