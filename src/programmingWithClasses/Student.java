package programmingWithClasses;

public class Student {
	String name;  // ���
	int group;  // ������
	int[] progress;  // ������������
	
	Student (String name, int group, int[] progress) {
		this.name = name;
		this.group = group;
		this.progress = progress;
	}
	
	Student () {
		this.name = "����������� �. �.";
		this.group = 1;
		this.progress = new int []{1,1,1,1,1};
	}
	
	public static void main(String[] args) {
		Student [] arrayObj = new Student [10];
		arrayObj[0] = new Student ();
		arrayObj[1] = new Student ("������ �. �", 2, new int[] {5,6,7,9,9});
		arrayObj[2] = new Student ("���������� �. �", 2, new int[] {5,6,7,9,9});
		arrayObj[3] = new Student ("������� �. �", 2, new int[] {5,10,7,9,9});
		arrayObj[4] = new Student ("������� �. �", 2, new int[] {10,8,7,9,9});
		arrayObj[5] = new Student ();
		arrayObj[6] = new Student ("�������� �. �", 2, new int[] {5,6,7,4,2});
		arrayObj[7] = new Student ("��������� �. �", 2, new int[] {8,6,7,9,9});
		arrayObj[8] = new Student ("�������� �. �", 2, new int[] {5,6,7,5,5});
		arrayObj[9] = new Student ("��������� �. �", 2, new int[] {5,6,7,4,10});
		
		for (int i = 0; i < arrayObj.length; i++) {
			if (arrayObj[i].search (arrayObj[i]))
				System.out.println("���: " + arrayObj[i].name + "   ������: " + arrayObj[i].group);
		}	
	}
	
	// �������� ���� �� ������ 9 � 10
	private boolean search (Student obj) {
		for (int j = 0; j < obj.progress.length; j++) {
			if (obj.progress[j] == 9 || obj.progress[j] == 10)
				return true;		
		}
		return false;
	}
}
