// inheritance real time 

import java.util.Scanner;
class Emp{
    Scanner sc= new Scanner(System.in);
    int id;
    String name;
    Emp(){
        // as soon as we create a child class object it automatically create or call a super class default constrauctor ....!
        System.out.print("Enter ID :");
        id = sc.nextInt();
        System.out.print("Enter Name :");
        name=sc.next();
    }
    // void display(){
    //     System.out.println("ID :"+id);
    //     System.out.println("Name :"+name);
    //     // System.out.println("Desig :"+desig);
    // }
}
class Clerk extends Emp{
    String desig="Clerk";
    void display(){
        System.out.println("ID :"+id);
        System.out.println("Name :"+name);
        System.out.println("Desig :"+desig);

    }
}
class Dev extends Emp{
    void display(){
        String desig="Dev";
        System.out.println("ID :"+id);
        System.out.println("Name :"+name);
        System.out.println("Desig :"+desig);
    }
}
class Tester extends Emp{
    void display(){
        String desig="Tester";
        System.out.println("ID :"+id);
        System.out.println("Name :"+name);
        System.out.println("Desig :"+desig);
    }
}
class Demo12{
    public static void main(String args[]){
        System.out.println("============DEVELOPER=================");
        Dev d = new Dev();
        d.display();
        System.out.println("============= CLERK ================");
        Clerk c = new Clerk();
        c.display();
        System.out.println("=============== TESTER ==============");
        Tester t = new Tester();
        t.display();
    }
}

/*
3 class 30 lines of code 

100 class :
        100 * 10 lines - 1000 lines of code we reduced 
        our application performace will be incressesssssss....! fast 
 */