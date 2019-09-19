 /**CompositionClassTask2
 * 4_Programming_with_classes
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package programmingWithClasses;

class Wheel {
	String name;  //�����
	String type;  //��� ������������ ����� ��� ���
	String size;  //������ 195/65
	boolean statusOk; //�� ����������
	boolean positionMove; // ���������
	
	
	Wheel (String name, String type, String size, boolean status, boolean position){
		this.name = name;
		this.type = type;
		this.size = size;
		this.statusOk = true;
		this.positionMove = false;
	}
	
	Wheel (){
		this.name = "�������";
		this.type = "�������� ��� ����� �������";
		this.size = "195/65";
		this.statusOk = false;
		this.positionMove = false;
	}
	
	
}


class Engine {
	String type;  // ��� ��������� ������, ������, �������
	int power;  // ��������
	double volume;  //����� ���������
	boolean positionMove; // �������
	boolean lowPetrol;  //������ ������� �������
	
	Engine (String type, int power, double volume, boolean positionMove, boolean lowPetrol){
		this.type = type;
		this.power = power;
		this.volume = volume;
		this.positionMove = positionMove;
		this.lowPetrol = lowPetrol;
	}
	
	Engine (){
		this.type = "������";
		this.power = 120;
		this.volume = 1.6;
		this.positionMove = false;
		this.lowPetrol = true;
	}
}



public class Car {
	String name;
	Engine engine;  // ������ ���������
	// ������ �����
	Wheel[] wheel;
	
	Car (String name, String type, int power, double volume, boolean positionMove, boolean lowPetrol, String nameWheel, String size){
		this.name = name;
		engine = new Engine (type, power, volume, positionMove, lowPetrol);
		wheel = new Wheel [4];
			{
					wheel[0] = new Wheel (nameWheel, "�������� ��� ����� �������", size, true, false);
				    wheel[1] = new Wheel (nameWheel, "�������� ��� ������ �������", size, true, false);
				    wheel[2] = new Wheel (nameWheel, "������ ��� ����� �������", size, true, false);
				    wheel[3] = new Wheel (nameWheel, "������ ��� ������ �������", size, true, false);
			}
			System.out.println("������ ���������� " + name);
	}
	
	Car (){
		this.name = "Fiat";
		engine = new Engine ("������", 220, 2.2, false, true);
		wheel = new Wheel [4];
		{
				wheel[0] = new Wheel ("�������", "�������� ��� ����� �������", "195/65", true, false);
			    wheel[1] = new Wheel ("�������", "�������� ��� ������ �������", "195/65", true, false);
			    wheel[2] = new Wheel ("�������", "������ ��� ����� �������", "195/65", true, false);
			    wheel[3] = new Wheel ("�������", "������ ��� ������ �������", "195/65", true, false);
		}
	}

	//������� ����� ����������
	String getName() {
		return name;
	}

	//����� ��� ����
	void goCar () {
		//��������� ��������� ����
		for (Wheel i: wheel) 
			if (!i.statusOk) {
				System.out.println("������ ����������, �������� �� ��������");
				return;
			}
		
		// ��������� ������� �������
		if (engine.lowPetrol) {
			System.out.println("������ ������� �������, �������� �� ��������");
			return;
		}
		
		//��������� ���������
		engine.positionMove = true;
		
		//�������� ����� � ������� �����
		for (int i = 0; i < wheel.length; i++)
			wheel[i].positionMove = true;
		
		System.out.println("�������� ��������");
	}
	
	
	//����� ��� ��������
	void fueling () {
				
				// ��������� ������� �������
				if (!engine.lowPetrol) {
					System.out.println("������� ������� �����������, ���������� ������");
					return;
				}
				
				
				// ���� � �������� �������������
				if (engine.positionMove) {
			        //������ ���������
				engine.positionMove = false;
				
				//��������������� � ���������� �������� ����
				for (int i = 0; i < wheel.length; i++)
					wheel[i].positionMove = false;
				}
				
				//��������
				engine.lowPetrol = false;
				
				System.out.println("�������� �������� ��������� �������");
	}
	
	
	//����� ������ ������
	void wheelReplacement (int i, String size, String name) {
		// ���� � �������� �������������
		if (engine.positionMove) {
	        //������ ���������
		engine.positionMove = false;
		
		//��������������� � ���������� �������� ����
		for (int j = 0; j < wheel.length; j++)
			wheel[j].positionMove = false;
		}
		
		//��������� �������� �� ������
		if (!wheel[i].size.equals(size)) {
			System.out.println("������ ������ �� ��������, ������ ���������� ������������ ������");
			return;
		}
		
		// ���� ������� ������ ���
			wheel[i].name = name;
			wheel[i].statusOk = true;
			System.out.println("������ ������ ��������� �������");
	}
	
	
	public static void main(String[] args) {
		// ������ ����������
		Car car = new Car("Alfa Romeo 156", "������", 220, 2.2, false, true, "�������", "195/65");
		
		//��������� ������
		car.wheel[3].statusOk = false;
		
		//������� ������ ��������
		car.goCar();
		
		//���������� ������ ������ ������������� ��������� �������
		car.wheelReplacement(3, "215/65", "China");
		
		// ���������� ������ ������ �� ����������
		car.wheelReplacement(3, "195/65", "�������������");
		
		//������� ������ �������� ����� � ������ ������� �������
		car.goCar();
		
		//�������� �������
		car.fueling();
		
		//������� ������ �������� ����� 
		car.goCar();
		
		//������� ��������� � ������ �����
		car.fueling();
		
		//���������� ����� ����������
		System.out.println("����� ���������� - " + car.getName());	
	}
}
