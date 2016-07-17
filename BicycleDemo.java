class Bicycle{

	int cadence = 0;
	int speed = 0;
	int gear = 1;

	void changeCadence(int newValue){
		cadence = newValue;
	}

	void changeGear(int newValue){
		gear = newValue;
	}

	void speedUP(int increment){
		speed=speed + increment;
	}

	void applyBrakes(int decrement){
		speed = speed - decrement;
	}

	void printStates() {
		System.out.println("cadence:" + cadence + " speed: " +  speed + " gear: " + gear);
	}
}


class BicycleDemo{
	
	public static void main(String[] args){
		// creeat two different bicilets objects

		Bicycle bike1= new Bicycle();
		Bicycle bike2= new Bicycle();

		// Invoke methods on 
		// those objects

		bike1.changeCadence(50);
		bike1.speedUP(10);
		bike1.changeGear(2);
		bike1.printStates();

		bike2.changeCadence(50);
		bike2.speedUP(10);
		bike2.changeGear(2);
		bike2.changeCadence(40);
		bike2.speedUP(10);
		bike2.changeGear(3);
		bike2.printStates();

	}
}





class MountainBike extends Bicycle {

}









