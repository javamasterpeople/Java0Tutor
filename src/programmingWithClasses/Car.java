 /**CompositionClassTask2
 * 4_Programming_with_classes
 * string end basic of text processing
 * @author Viachaslau Chyzhyk
 * @version 1.0
 */

package programmingWithClasses;

class Wheel {
	String name;  //марка
	String type;  //тип расположения перед или зад
	String size;  //размер 195/65
	boolean statusOk; //не повреждена
	boolean positionMove; // вращается
	
	
	Wheel (String name, String type, String size, boolean status, boolean position){
		this.name = name;
		this.type = type;
		this.size = size;
		this.statusOk = true;
		this.positionMove = false;
	}
	
	Wheel (){
		this.name = "Белшина";
		this.type = "Передняя ось левая сторона";
		this.size = "195/65";
		this.statusOk = false;
		this.positionMove = false;
	}
	
	
}


class Engine {
	String type;  // тип двигателя бензин, дизель, электро
	int power;  // мощность
	double volume;  //объём двигателя
	boolean positionMove; // запущен
	boolean lowPetrol;  //низкий уровень топлива
	
	Engine (String type, int power, double volume, boolean positionMove, boolean lowPetrol){
		this.type = type;
		this.power = power;
		this.volume = volume;
		this.positionMove = positionMove;
		this.lowPetrol = lowPetrol;
	}
	
	Engine (){
		this.type = "Бензин";
		this.power = 120;
		this.volume = 1.6;
		this.positionMove = false;
		this.lowPetrol = true;
	}
}



public class Car {
	String name;
	Engine engine;  // создаём двигатель
	// создаём колёса
	Wheel[] wheel;
	
	Car (String name, String type, int power, double volume, boolean positionMove, boolean lowPetrol, String nameWheel, String size){
		this.name = name;
		engine = new Engine (type, power, volume, positionMove, lowPetrol);
		wheel = new Wheel [4];
			{
					wheel[0] = new Wheel (nameWheel, "Передняя ось левая сторона", size, true, false);
				    wheel[1] = new Wheel (nameWheel, "Передняя ось правая сторона", size, true, false);
				    wheel[2] = new Wheel (nameWheel, "Задняя ось левая сторона", size, true, false);
				    wheel[3] = new Wheel (nameWheel, "Задняя ось правая сторона", size, true, false);
			}
			System.out.println("Создан автомобиль " + name);
	}
	
	Car (){
		this.name = "Fiat";
		engine = new Engine ("Бензин", 220, 2.2, false, true);
		wheel = new Wheel [4];
		{
				wheel[0] = new Wheel ("Белшина", "Передняя ось левая сторона", "195/65", true, false);
			    wheel[1] = new Wheel ("Белшина", "Передняя ось правая сторона", "195/65", true, false);
			    wheel[2] = new Wheel ("Белшина", "Задняя ось левая сторона", "195/65", true, false);
			    wheel[3] = new Wheel ("Белшина", "Задняя ось правая сторона", "195/65", true, false);
		}
	}

	//возврат марки автомобиля
	String getName() {
		return name;
	}

	//метод для езды
	void goCar () {
		//Проверить состояния колёс
		for (Wheel i: wheel) 
			if (!i.statusOk) {
				System.out.println("Колесо повреждено, движение не возможно");
				return;
			}
		
		// проверить уровень топлива
		if (engine.lowPetrol) {
			System.out.println("Низкий уровень топлива, движение не возможно");
			return;
		}
		
		//запускаем двигатель
		engine.positionMove = true;
		
		//начинаем ехать и вращать колёса
		for (int i = 0; i < wheel.length; i++)
			wheel[i].positionMove = true;
		
		System.out.println("Движение началось");
	}
	
	
	//метод для заправки
	void fueling () {
				
				// проверить уровень топлива
				if (!engine.lowPetrol) {
					System.out.println("Уровень топлива достаточный, заправлять некуда");
					return;
				}
				
				
				// если в движении останавливаем
				if (engine.positionMove) {
			        //глушим двигатель
				engine.positionMove = false;
				
				//останавливаемся и прекращаем вращения колёс
				for (int i = 0; i < wheel.length; i++)
					wheel[i].positionMove = false;
				}
				
				//доливаем
				engine.lowPetrol = false;
				
				System.out.println("Заправка топливом произошла успешно");
	}
	
	
	//метод замены колеса
	void wheelReplacement (int i, String size, String name) {
		// если в движении останавливаем
		if (engine.positionMove) {
	        //глушим двигатель
		engine.positionMove = false;
		
		//останавливаемся и прекращаем вращения колёс
		for (int j = 0; j < wheel.length; j++)
			wheel[j].positionMove = false;
		}
		
		//проверяем подходит ли колесо
		if (!wheel[i].size.equals(size)) {
			System.out.println("Размер колеса не подходит, нельзя установить неподходящий размер");
			return;
		}
		
		// если подощло меняем его
			wheel[i].name = name;
			wheel[i].statusOk = true;
			System.out.println("Замена колеса произошла успешно");
	}
	
	
	public static void main(String[] args) {
		// создаём автомобиль
		Car car = new Car("Alfa Romeo 156", "Бензин", 220, 2.2, false, true, "Белшина", "195/65");
		
		//пробиваем колесо
		car.wheel[3].statusOk = false;
		
		//пробуем начать движение
		car.goCar();
		
		//производим замену колеса поврежденного неверного размера
		car.wheelReplacement(3, "215/65", "China");
		
		// производим замену колеса на подходящее
		car.wheelReplacement(3, "195/65", "Резинотехника");
		
		//пробуем начать движение снова с низким уровнем топлива
		car.goCar();
		
		//доливаем топливо
		car.fueling();
		
		//пробуем начать движение снова 
		car.goCar();
		
		//пробуем заправить с полным баком
		car.fueling();
		
		//возвращаем марку автомобиля
		System.out.println("Марка автомобиля - " + car.getName());	
	}
}
