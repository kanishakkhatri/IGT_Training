// exception handling
// class A{
//     static void abc(){
//         System.out.println("ABC method");
//     }
// }
import java.util.*;
class Demo30 {
    public static void main(String[] args) {
        m1();
    }
    static void m1(){
        m2();
        System.out.println("m1 method");
    }
    static void m2(){
        m3();
        System.out.println("m2 method");
    }
    static void m3(){
        System.out.println("m3 method");
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter value A: ");
            int a = sc.nextInt();

            System.out.println("Enter value B: ");
            int b = sc.nextInt();

            int c = a/b;
            System.out.println("Result is: "+c);
        }
        catch(ArithmeticException ae){
            System.out.println("You cannot divide anything by 0");
        }
        catch(InputMismatchException ime){
            System.out.println("Enter number only");
        }
    }
}
