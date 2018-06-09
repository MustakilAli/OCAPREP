package secretSauce;

class Vehicle {
	String type = "4W";
	int maxSpeed = 100;

Vehicle(String type, int maxSpeed) { this.type = type;
this.maxSpeed = maxSpeed; }
}

class Car extends Vehicle {
	String trans;

	Car(String trans) { // Line n1 //(compilation error)
		
		this.trans = trans;
	}


	Car(String type, int maxSpeed, String trans) {
		super(type, maxSpeed);
		this(trans); // Line n2 //(compilation error) }
}
}

