interface I{
    public static final int a = 10;
    public abstract void add();
    void sub();
}
interface J{
    int b = 20;
    void mul();
    void div();
}
interface K extends I, J{
    public void add(){
        System.out.println(I.a + J.b);
    }
    public void sub(){
        System.out.println(I.a + J.b);
    }
    public void mul(){
        System.out.println(I.a + J.b);
    }
    public void div(){
        System.out.println(I.a + J.b);
    }
}
class Cal implements K{
    public void add(){
        System.out.println(I.a + J.b);
    }
    public void sub(){
        System.out.println(I.a + J.b);
    }
    public void mul(){
        System.out.println(I.a + J.b);
    }
    public void div(){
        System.out.println(I.a + J.b);
    }
}
class Demo27{
	public static void main(String[] args) {
        System.out.println("==========CAL==========");
        Cal c = new Cal();
        c.add();
        c.sub();
        c.mul();
        c.div();
        System.out.println("======I Interface======");
        I i = c;
        i.add();
        i.sub();
        // i.mul();
        // i.div();
        System.out.println("======J Interface======");
        J j = c;
        // j.add();
        // j.sub();
        j.mul();
        j.div();
        System.out.println("======K Interface======");
        K k = c;
        k.add();
        k.sub();
        k.mul();
        k.div();

    }
}