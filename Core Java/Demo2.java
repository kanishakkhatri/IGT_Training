import java.util.Scanner;
class Demo2{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter ID: ");
		int id=sc.nextInt();

		System.out.print("Enter Name: ");
		String name=sc.next();

		System.out.print("Enter Age: ");
		int age=sc.nextInt();

		System.out.print("Enter Salary: ");
		int salary=sc.nextInt();

		System.out.print("Enter Desigation: ");
		String designation=sc.next();

		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary: "+salary);
		System.out.println("Designation : "+designation);		
	}
}