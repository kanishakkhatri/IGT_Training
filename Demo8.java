// inheritance
class Parent{
    int site=5;
    int money=500000;
    private String car="BMW";
}
class Child extends Parent{
    void use(){
        int money=10000;
        System.out.println("Site: "+site);
        System.out.println("Child Money: "+money);
        System.out.println("Parent Money: "+super.money);
        System.out.println("Total money: "+(super.money+money));
        // System.out.println("Car: "+car);// private access modifier
    }
}

public class Demo8 {
    public static void main(String[] args) {
        Child c=new Child();
        c.use();
    }
}
