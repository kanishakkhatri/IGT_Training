import java.util.*;

class A{
	Scanner sc= new Scanner(System.in);	
	A(){
		System.out.println("A class");
	}
	void abc(){
		System.out.println("abc()");// max of 3 
	}
}
class Demo6{
	public static void main(String arg[]){
		A a = new A();
		a.abc();
	}
}

// constructor 				method
// A(){}				same + other name also 
// no return type 			must have return type
// always try to create once 		utilize multiple times
// internally it allocate the memory 	but no memory-it just utilizes same memory
// as soon as object creat con will call : we have to call externally