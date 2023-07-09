import java.util.Scanner;
class A{
	int id;
	String name; 
	int age;
	int salary;
	String designation;
	Scanner sc= new Scanner(System.in);

	A(){					//constructor

		System.out.print("Enter ID: ");
		id=sc.nextInt();
		System.out.print("Enter Name: ");
		name=sc.next();
		System.out.print("Enter Age: ");
		age=sc.nextInt();
		System.out.print("Enter Salary: ");
		salary=sc.nextInt();
		System.out.print("Enter Designation: ");
		designation=sc.next();	
	}
	void display(){				//method
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary: "+salary);
		System.out.println("Designation : "+designation);	
	}
}
class Demo4{
	public static void main(String args[]){
		System.out.println("Demo3 ");
		A a = new A();	
		a.display();	
	}
}