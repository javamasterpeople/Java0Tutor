package programmingWithClasses;

import java.util.Scanner;

public class Airport {

	public static void main(String[] args) {
		Airport obj1 = new Airport();
		Airline[] obj = new Airline [5];
		obj[0] = new Airline ("�����", 3358, "Boeing - 737", 1748, "�������");
		obj[1] = new Airline ();
		obj[2] = new Airline ("�������", 8874, "��-25", 1748, "����� �������");
		obj[3] = new Airline ("����", 3413, "��-2", 1748, "�������");
		obj[4] = new Airline ("������", 3102, "��-76", 1748, "�����������");
		
		obj1.printSearchDestination(obj);
		System.out.println("\n");
		obj1.printSearchDay(obj);
		System.out.println("\n");
		obj1.printSearch(obj);
		
	}
	
	
	// ����� ������ ��� ������ ����������
		private void printSearchDestination (Airline[] obj) {
			Scanner input = new Scanner (System.in);
			System.out.println("�������� ����� ������ ����������:");
			String name = input.nextLine();
			
			boolean status = false;
			for (int i = 0; i < obj.length; i++) {
				if (obj[i].getDestination().contains(name)) {
					status = true;
					System.out.println(obj[i].toString());
				}
			}
			if (!status)
				System.out.println("������� ������ �� �������!");
		}
	
		// ����� ������ ��� ��� ������
		private void printSearchDay(Airline[] obj) {
			Scanner input = new Scanner (System.in);
			System.out.println("�������� ����� �� ��� ������:");
			String name = input.nextLine();
			
			boolean status = false;
			for (int i = 0; i < obj.length; i++) {
				if (obj[i].getDay().contains(name)) {
					status = true;
					System.out.println(obj[i].toString());
				}
			}
			if (!status)
				System.out.println("������� ������ �� �������!");
		}

		// ����� ������ ��� ��� ������ � ����� ������ ������ ���������
		private void printSearch(Airline[] obj) {
			Scanner input = new Scanner (System.in);
			System.out.println("�������� ����� �� ��� ������ � ������� ������:");
			System.out.println("������� ���� ������");
			String name = input.nextLine();
			System.out.println("������� ��� ������");
			int time = input.nextInt();
			
			boolean status = false;
			for (int i = 0; i < obj.length; i++) {
				if ((obj[i].getDay().contains(name)) & obj[i].getTimeHour() > time) {
					status = true;
					System.out.println(obj[i].toString());
				}
			}
			if (!status)
				System.out.println("������� ������ �� �������!");
		}	
}
