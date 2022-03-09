package learning;

// It is used to achieve total abstraction.
// methods declared in an interface are by default abstract (only method signature, no body).
// It is used to achieve multiple inheritance.

interface inf1 {
	final int i = 10;
	
	void display();
	int sum(int a, int b);
}

interface vehicle {
	void changeGear(int a);
	void speedUp(int b);
	void applyBrakes(int c);
}

class Bicycle implements vehicle{
	int speed;
	int gear;
	
	@Override
	public void changeGear(int newGear) {
		gear = newGear;
	}
	
	@Override
	public void speedUp(int increment) {
		speed = speed + increment;
	}
	
	@Override
	public void applyBrakes(int decrement) {
		speed = speed - decrement;
	}
	
	public void printState() {
		System.out.println("speed: " + speed + " gear: " + gear);
	}
}

class Bike implements vehicle{
	int speed;
	int gear;
	
	@Override
	public void changeGear(int newGear) {
		gear = newGear;
	}
	
	@Override
	public void speedUp(int incremenet) {
		speed += incremenet;
	}
	
	@Override
	public void applyBrakes(int decrement) {
		speed -= decrement;
	}
	
	public void printState() {
		System.out.println("speed: " + speed + " gear: " + gear);
	}
}

public class InterfacesLearning implements inf1{
	@Override
	public void display() {
		System.out.println("Here in display() in main class");
	}
	
	@Override
	public int sum(int a, int b) {
		return a+b;
	}
	
	
	public static void main(String[] args) {
		InterfacesLearning a = new InterfacesLearning();
		a.display();
		System.out.println(i);
		System.out.println(a.sum(1,2));
		
		Bicycle bicycle = new Bicycle();
		bicycle.changeGear(2);
		bicycle.speedUp(3);
		bicycle.applyBrakes(1);
		bicycle.printState();
		
		Bike bike = new Bike();
		bike.changeGear(3);
		bike.speedUp(4);
		bike.applyBrakes(1);
		bike.printState();
	}

}
