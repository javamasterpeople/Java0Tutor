 /**EasyClassTask4
 * 4_Programming_with_classes
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package programmingWithClasses;

import java.util.Scanner;

public class Train {
	String nameDestination;
	int numberTrain;
	int timeOutHour;
	int timeOutMin;
	
	Train (String name, int number, int timeH, int timeM){
		this.nameDestination = name;
		this.numberTrain = number;
		this.timeOutHour = timeH;
		this.timeOutMin = timeM;
	}
	
	Train (){
		this.nameDestination = "�����������";
		this.numberTrain = 0;
		this.timeOutHour = 0;
		this.timeOutMin = 0;
	}

	public static void main(String[] args) {
		Train [] obj = new Train [5];
		obj[0] = new Train ("������", 654, 22,55);
		obj[1] = new Train ("�������", 720, 10,10);
		obj[2] = new Train ("�������", 541, 9,25);
		obj[3] = new Train ("�����", 233, 22,55);
		obj[4] = new Train ("�������", 321, 6,18);
		System.out.println("**********\n�������� ������:\n**********");
		for (Train i: obj)
			System.out.println("����� ������: " + i.numberTrain + "\n������� �������� ������: " + i.nameDestination + "\n����� �����������: " + i.timeOutHour + "  �����  " + i.timeOutMin + "  �����");
		System.out.println("\n**********\n��������� c��������� ��������� �� ������� �������:\n**********");
		sortingNumberTrain (obj);
		System.out.println("\n**********\n������� ���������� � ������:\n**********");
		printTrainInputNumber (obj);
		System.out.println("\n**********\n��������� c��������� ��������� �� ������ ����������:\n**********");
		sortingNameDestinationTrain (obj);
	}
	
	
	// ���������� ��������� �� ������� �������
	static void sortingNumberTrain (Train[] obj) {
		Train[] objClone = obj.clone();
	    for (int i = objClone.length - 1; i >= 1; i--){  //������� ����
	        for (int j = 0; j < i; j++){       //���������� ����
	            if(objClone[j].numberTrain > objClone[j + 1].numberTrain) {               //���� ������� ��������� �������
					Train temp = objClone[j + 1];
					objClone[j+1] = objClone[j];
					objClone[j] = temp;            //������� �����, �������� �������
	            }
	        }
	    }
	    for (Train i: objClone)
	    	System.out.println("����� ������: " + i.numberTrain + "\n������� �������� ������: " + i.nameDestination + "\n����� �����������: " + i.timeOutHour + "  �����  " + i.timeOutMin + "  �����");
	}

	
	
	
	// ����� ���������� � ������, ����� �������� ������
	static private void printTrainInputNumber (Train [] obj) {
		Scanner input = new Scanner (System.in);
		System.out.println("������� ����� �������� ������:");
		int numberTrainUser = input.nextInt();
		boolean status = false;
		for (int i = 0; i < obj.length; i++) {
			if (obj[i].numberTrain == numberTrainUser) {
				status = true;
				System.out.println("����� ������: " + obj[i].numberTrain + "\n������� �������� ������: " + obj[i].nameDestination + "\n����� �����������: " + obj[i].timeOutHour + "  �����  " + obj[i].timeOutMin + "  �����");
			}
		}
		if (!status)
			System.out.println("������� ������ �� �������!");
	}
	
	
	// ����� ���������� �� ������ ����������
	static void sortingNameDestinationTrain (Train[] obj) {
		Train[] objClone = obj.clone();
	    for (int i = objClone.length - 1; i >= 1; i--){  //������� ����
	        for (int j = 0; j < i; j++)
	        {       //���������� ����
	        	for (int k = 0;((k < objClone[j].nameDestination.length()) & (k < objClone[j + 1].nameDestination.length())); k++) {
	        		if (objClone[j].nameDestination.charAt(k) == objClone[j + 1].nameDestination.charAt(k))
	        			continue;
	        		else if(objClone[j].nameDestination.charAt(k) > objClone[j + 1].nameDestination.charAt(k)) {               //���� ������� ��������� �������
						Train temp = objClone[j + 1];
						objClone[j+1] = objClone[j];
						objClone[j] = temp;            //������� �����, �������� �������
		            }
	        		else 
	        			break;
	        	}
	        	
	        	if (objClone[j].nameDestination.equals(objClone[j+1].nameDestination)) {
      				if (objClone[j].timeOutHour > objClone[j+1].timeOutHour) {
    						Train temp = objClone[j + 1];
    						objClone[j+1] = objClone[j];
    						objClone[j] = temp;   
                            break;
        				}
      				
      				else if (objClone[j].timeOutHour == objClone[j+1].timeOutHour) {
      					if (objClone[j].timeOutMin > objClone[j+1].timeOutMin) {
    						Train temp = objClone[j + 1];
    						objClone[j+1] = objClone[j];
    						objClone[j] = temp;            
        				}
      				}
        		}     	
	        }
	    }
	    for (Train i: objClone)
	    	System.out.println("����� ������: " + i.numberTrain + "\n������� �������� ������: " + i.nameDestination + "\n����� �����������: " + i.timeOutHour + "  �����  " + i.timeOutMin + "  �����");
	}	
}
