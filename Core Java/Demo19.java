// same method name but different implementation in child class
class A{
    void display(){
        System.out.println("Hiiiiiiiiii");
    }
}
class B extends A{
    void display(){
        System.out.println("Heloooooooo");
    }
}

public class Demo19 {
    public static void main(String[] args) {
        B b=new B();
        b.display();//B
    }
}
