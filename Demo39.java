// Multithreading
class A extends Thread{
    public void run(){
        try {
            for (int i=0; i<= 10; i++) {
                System.out.println("I: "+i);
                Thread.sleep(1000);
            }
        } 
        catch (InterruptedException e) {
            // TODO: handle exception
        }
    }
}
class B extends Thread{
    public void abc(){
        try {
            for (int j=0; j<= 10; j++) {
                System.out.println("J: "+j);
                Thread.sleep(1000);

            }
        } 
        catch (InterruptedException e) {
            // TODO: handle exception
        }
    }
}
class C extends Thread{
    public void run(){
        try {
            for (int k=0; k<= 10; k++) {
                System.out.println("K: "+k);
                Thread.sleep(1000);
            }
        } 
        catch (InterruptedException e) {
            // TODO: handle exception
        }
    }
}

public class Demo39 {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();
        a.start();
        b.start();
        c.start();
    }
}
