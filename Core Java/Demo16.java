// constructor overloading
class Draw{
    Draw(){
        this(10);// it must always be first line
        System.out.println("Draw()");
    }
    Draw(int a){
        this(10,20);
        System.out.println("Draw() area of square: "+(a*a));
    }
    Draw(int l, int b){
        System.out.println("Draw() area of rectangle: "+(l*b));
    }
}

public class Demo16 {
    public static void main(String[] args) {
        Draw d1=new Draw();
        // Draw d2=new Draw(10);
        // Draw d3=new Draw(10, 20);

    }
}
