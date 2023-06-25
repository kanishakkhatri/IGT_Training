import java.util.Scanner;

class Employee{
    int id;
    String name;
    int age;
    int salary;
    String designation;
    Scanner sc=new Scanner(System.in);
    Employee(){
        System.out.print("Enter ID: ");
        id=sc.nextInt();
        
        System.out.print("Enter Name: ");
        name=sc.next();

        System.out.print("Enter Age: ");
        age=sc.nextInt();    
    }
    void display(){
        System.out.println("====================");
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
        System.out.println("Designation: "+designation);
    }
}
class Manager extends Employee{
    Manager(){
        salary=90000;
    designation="Manager";
    }

    
}

class Developer extends Employee{
    Developer(){
        salary=60000;
    designation="Developer";
    }
}
class Tester extends Employee{
    Tester(){
        salary=40000;
        designation="Tester";
    }
}

class Clerk extends Employee{
    Clerk(){
        salary=20000;
        designation="Clerk";
    }
}

public class Demo10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("1) Manager");
            System.out.println("2) Developer");
            System.out.println("3) Tester");
            System.out.println("4) Clerk");
            System.out.println("5) Exit");
            System.out.print("Enter choice: ");

            choice=sc.nextInt();

            if(choice==1){
                Manager m=new Manager();
                m.display();
            }
            else if(choice==2){
                Developer d=new Developer();
                d.display();
            }
            else if(choice==3){
                Tester t=new Tester();
                t.display();
            }
            else if (choice==4) {
                Clerk c=new Clerk();
                c.display();
            }
            else if (choice==5) {
                System.out.println("Thank You");
                System.exit(0);
            }
        } while (choice<=4);


    }
}
