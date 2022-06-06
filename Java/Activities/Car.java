package Activities;

public class Car {

	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	 Car () {
		 tyres = 4;
		 doors = 4;
		}
	
	public void displayCharacteristics()
	{
		System.out.println("The value of color is " + color);
		System.out.println("The value of transmission is " + transmission);
		System.out.println("The value of make is " + make);
		System.out.println("The value of tyres is " + tyres);
		System.out.println("The value of doors is " + doors);
	}
	
	public void accelerate()
	{
		System.out.println("The car is moving forward");
	}
	
	public void brake()
	{
		System.out.println("The car has stopped ");
	}
}
