
abstract class A{
	abstract void abc();
}
abstract class B extends A{
	void abc(){
		System.out.println("ABC method");
	}
	abstract void xyz();
}
class C extends B{
	void xyz(){
		System.out.println("XYZ method");
	}
}
class Demo20{
	public static void main(String args[]){
		// A a = new A();
		// B b = new B();
		// b.abc();
		C c = new C();
		c.abc();
		c.xyz();
	}
}




// // method overriding - same method name but different implementation in child class
// class Bank{
//     public int loan(){
//         return 8;
//     }
// }
// class SBI extends Bank{
    
// }
// class Axis extends Bank{
//     public int loan(){
//         return 10;
//     }
// }
// public class Demo19 {
//     public static void main(String[] args) {
//         SBI sbi=new SBI();
//         sbi.loan();
//         System.out.println(sbi.loan()+"%");

//         Axis axis=new Axis();
//         axis.loan();
//         System.out.println(axis.loan()+"%");
//     }
// }



