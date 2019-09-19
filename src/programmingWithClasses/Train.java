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
		this.nameDestination = "Отсутствует";
		this.numberTrain = 0;
		this.timeOutHour = 0;
		this.timeOutMin = 0;
	}

	public static void main(String[] args) {
		Train [] obj = new Train [5];
		obj[0] = new Train ("Кишинёв", 654, 22,55);
		obj[1] = new Train ("Торонто", 720, 10,10);
		obj[2] = new Train ("Батайск", 541, 9,25);
		obj[3] = new Train ("Токио", 233, 22,55);
		obj[4] = new Train ("Торонто", 321, 6,18);
		System.out.println("**********\nИсходные данные:\n**********");
		for (Train i: obj)
			System.out.println("Номер поезда: " + i.numberTrain + "\nСтанция прибытия поезда: " + i.nameDestination + "\nВремя отправления: " + i.timeOutHour + "  часов  " + i.timeOutMin + "  минут");
		System.out.println("\n**********\nПроизвели cортировку элементов по номерам поездов:\n**********");
		sortingNumberTrain (obj);
		System.out.println("\n**********\nВыводим информацию о поезду:\n**********");
		printTrainInputNumber (obj);
		System.out.println("\n**********\nПроизвели cортировку элементов по пункту назначения:\n**********");
		sortingNameDestinationTrain (obj);
	}
	
	
	// сортировка элементов по номерам поездов
	static void sortingNumberTrain (Train[] obj) {
		Train[] objClone = obj.clone();
	    for (int i = objClone.length - 1; i >= 1; i--){  //Внешний цикл
	        for (int j = 0; j < i; j++){       //Внутренний цикл
	            if(objClone[j].numberTrain > objClone[j + 1].numberTrain) {               //Если порядок элементов нарушен
					Train temp = objClone[j + 1];
					objClone[j+1] = objClone[j];
					objClone[j] = temp;            //вызвать метод, меняющий местами
	            }
	        }
	    }
	    for (Train i: objClone)
	    	System.out.println("Номер поезда: " + i.numberTrain + "\nСтанция прибытия поезда: " + i.nameDestination + "\nВремя отправления: " + i.timeOutHour + "  часов  " + i.timeOutMin + "  минут");
	}

	
	
	
	// вывод информации о поезде, номер которого введен
	static private void printTrainInputNumber (Train [] obj) {
		Scanner input = new Scanner (System.in);
		System.out.println("Введите номер искомого поезда:");
		int numberTrainUser = input.nextInt();
		boolean status = false;
		for (int i = 0; i < obj.length; i++) {
			if (obj[i].numberTrain == numberTrainUser) {
				status = true;
				System.out.println("Номер поезда: " + obj[i].numberTrain + "\nСтанция прибытия поезда: " + obj[i].nameDestination + "\nВремя отправления: " + obj[i].timeOutHour + "  часов  " + obj[i].timeOutMin + "  минут");
			}
		}
		if (!status)
			System.out.println("Искомые поезда не найдены!");
	}
	
	
	// метод сортировки по пункту назначения
	static void sortingNameDestinationTrain (Train[] obj) {
		Train[] objClone = obj.clone();
	    for (int i = objClone.length - 1; i >= 1; i--){  //Внешний цикл
	        for (int j = 0; j < i; j++)
	        {       //Внутренний цикл
	        	for (int k = 0;((k < objClone[j].nameDestination.length()) & (k < objClone[j + 1].nameDestination.length())); k++) {
	        		if (objClone[j].nameDestination.charAt(k) == objClone[j + 1].nameDestination.charAt(k))
	        			continue;
	        		else if(objClone[j].nameDestination.charAt(k) > objClone[j + 1].nameDestination.charAt(k)) {               //Если порядок элементов нарушен
						Train temp = objClone[j + 1];
						objClone[j+1] = objClone[j];
						objClone[j] = temp;            //вызвать метод, меняющий местами
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
	    	System.out.println("Номер поезда: " + i.numberTrain + "\nСтанция прибытия поезда: " + i.nameDestination + "\nВремя отправления: " + i.timeOutHour + "  часов  " + i.timeOutMin + "  минут");
	}	
}
