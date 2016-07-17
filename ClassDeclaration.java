public class ClassDeclaration {

	private int cadence;
	private int gear;
	private int speed;

	public ClassDeclaration(int startCadence, int startSpeed, int startGear) {
		cadence  = startCadence;
		gear = startGear;
		speed = startSpeed;
	}

	public int getCadence(){
		return cadence;
	}

	public void setCadence(int newValue){
		cadence = newValue;
	}
	public int getGear(){
		return gear;
	}
	public void setGear(int newValue){
		gear = newValue;
	}
	public int getSpeed(){
		return speed;
	}

	public void applyBrake(intdecrement){
		speed -=decrement;
	}
	public void speedUp(int increment){
		speed +=increment;
	}

}
