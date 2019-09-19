 /**CompositionClassTask3
 * 4_Programming_with_classes
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package programmingWithClasses;

class City {
	String nameCity;  //�������� ������
	boolean capital;  //�������
	boolean region; //��������� �����
	
	City (String nameCity, boolean capital, boolean region) {
		this.nameCity = nameCity;
		this.capital = capital;
		this.region = region;
	}
	
	City (){
		this.nameCity = "�����������";
		this.capital = false;
		this.region = false;
	}
	
	//�������������� ����� �� �� ������
 public String toString () {
		return "�����: " + this.nameCity + "\n";	
	}
}


class Region {
	String nameRegion; //�������� 
	double squareRegion; //������� 
	City[] cityArray; //������ 
	
	Region (String nameRegion, double squareRegion, String[] nameCity, boolean[] capital, boolean [] region) {
		this.nameRegion = nameRegion;
		this.squareRegion = squareRegion;
		cityArray = new City [nameCity.length];
		for (int i = 0; i < cityArray.length; i++) 
			cityArray[i] = new City (nameCity[i], capital[i], region[i]);
	}
	
	Region (){
		this.nameRegion = "���������� �������";
		this.squareRegion = 1;
		cityArray = new City [1];
		cityArray[0] = new City ();
	}
}




public class Country {
	String nameCountry; // �������� �����������
	Region [] regionArray; //�������
	
	Country (String nameCountry, String[] nameRegion, double[] squareRegion, String[][] nameCity, boolean[][] capital, boolean [][] region){
		this.nameCountry = nameCountry;
		regionArray = new Region [nameRegion.length];
		for (int i = 0; i < regionArray.length; i++) 
			regionArray[i] = new Region (nameRegion[i], squareRegion[i], nameCity[i], capital[i], region[i]);
	}
	
	Country (){
		this.nameCountry = "����� �� ����";
		regionArray = new Region [1];
			regionArray[0] = new Region ();
	}
	
	
	//����� ������ �� ������� �������
	void printCapital () {
		for (Region i: regionArray)
				for (City k: i.cityArray)
					if (k.capital)
					{
						 System.out.println("������� � ������ �����������:");
						 System.out.println(k.toString());
						 return;
					}
	}
	
	
	//����� ������ �� ������� ��������� ������
	void printRegion () {
		System.out.println("��������� ������ � ������ �����������:");
		for (Region i: regionArray)
				for (City k: i.cityArray)
					if (k.region)
					{
						System.out.println (k.toString());
					}
	}
	
	
	// ����� ���������� ��������
	void printRegionPcs () {
		int counter = 0;
		for (Region i: regionArray)
				for (City k: i.cityArray)
					if (k.region)
						counter++;
		System.out.println("���������� ��������: " + counter);
	}
	
	//����� ������� �����������
	void printSquare () {
		double counter = 0;
		for (Region i: regionArray)
				counter += i.squareRegion;
		System.out.println("������� �����������: " + counter);
	}
	
	
	
					
	
	public static void main (String[] args) {
		String[] nameRegion = {"���������", "���������", "����������", "�����������", "����������", "�������"};
		double[] squareRegion = {325.02, 654.22, 421.85, 324.21, 444.22, 323.85};
		String[][] nameCity = {{"����������", "�����", "������"},{"�������", "�������", "������"},{"������", "������"},{"������"},{"������", "�����",
			"��������", "���������"},{"�����", "���������"}};
		boolean[][] capital = {{false, false, false},{false, false, false},{false, false},{false},{false, false,
			false, false},{true, false}};
		boolean [][] region = {{false, true, false},{true, false, false},{true, false},{true},{true, false,
			false, false},{true, false}};
		
		Country Belarus = new Country ("��������", nameRegion, squareRegion, nameCity, capital, region );
		
		Belarus.printCapital();
		Belarus.printRegion();
		Belarus.printRegionPcs();
		Belarus.printSquare();
	
	}

}
