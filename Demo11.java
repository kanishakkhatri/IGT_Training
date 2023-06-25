import java.util.Scanner;

class A{
    int id;
    String name;
    Scanner sc=new Scanner(System.in);
    A(){
        System.out.println("==========A class==========");
        // if we create a child class object automatically paent class edfault constructor will call
        System.out.print("Enter ID: ");
        id=sc.nextInt();

        System.out.print("Enter Name: ");
        name=sc.next();
    }
    void abc(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
    }
}

class B extends A{
    // int id; // calling from parent class
    // String name;
    // Scanner sc=new Scanner(System.in);
    B(){
        System.out.println("==========B class==========");
        // System.out.print("Enter ID: ");
        // id=sc.nextInt();
        
        // System.out.print("Enter Name: ");
        // name=sc.next();
    }
    // void xyz(){
        // System.out.println("ID: "+id);
        // System.out.println("Name: "+name);
    // }
}

public class Demo11 {
    public static void main(String[] args) {
        A a=new A();
        a.abc();
        B b=new B();
        // b.xyz();
        b.abc();

    }
}

/* 
A cn 
B co: 
        both 
 
A 
no B : 
        only A 
 
B 
no A 
        only B 

No A 
No B :     
        no output 
*/
