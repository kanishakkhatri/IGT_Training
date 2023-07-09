
class A{
    // everything same but different parameter - overloading
    void draw(){
        System.out.println("Draw() method");
    }
    void draw(int a){
        System.out.println("Draw() method "+(a*a));
    }
    void draw(int l, int b){
        System.out.println("Draw() method "+(l*b));
    }
}
//     // same constructor in different child class - constructor overriding
public class Demo18 {
    public static void main(String[] args) {
        A a=new A();
        a.draw();
        a.draw(10);
        a.draw(10, 20);
    }
}
// same method name + multiple time + with different parameter + in same class = method overloading