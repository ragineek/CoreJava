package oops.concept;

public class CarInheritance{
	
	public static void main(String args[])
	{
		//Car is abstract
		//Car c = new Car();
		DieselCar ds = new DieselCar("KUV500");
		PetrolCar ps = new PetrolCar("Sedan");
		System.out.println("Fuel of:" + ds.name + " is " + ds.getFuel());
		System.out.println("Fuel of:" + ps.name + " is " + ps.getFuel());
	}
}


abstract class Car {
	abstract String getFuel();
}

class DieselCar extends Car{
	String name;
	
	DieselCar(String name){
		this.name = name;
	}

	String getFuel() {
		// TODO Auto-generated method stub
		return "Diesel";
	} 
}

class PetrolCar extends Car{
	String name;
	
	PetrolCar(String name){
		this.name = name;
	}

	@Override
	String getFuel() {
		// TODO Auto-generated method stub
		return "Petrol";
	} 
}