// final class Car
class Car{
	final int speed = 200;
	// 100 var
	// 100 method
	final void run(){
		System.out.println("Hi run method with speed of 200");
	}
}
class Maruti extends Car{
	// void run(){
	// 	System.out.println("Hi runmethod with speed of 250"); // final method cannot be overridden
	// }
}
class Demo25{
	public static void main(String args[]){
		Car c = new Car();
		c.run();
		System.out.println("Speed: "+c.speed);

		// c.speed=2000;// we cannot modify the final variable
		System.out.println("Speed: "+ c.speed);

		Maruti m = new Maruti();
		m.run();
	}
}







