interface University{
    //Univercity(){}
    //int a;
    //void xyz(){}
    public static final int a=1000;
    //public abstract void xyz();
    void exam();
    void result();
     // java 1.8
    static void display()
    {

    }
    default void aaaa()
    {

    }
}
class IITB implements University{
    public void exam(){
        // online
    }
    public void result(){
        // mail
    }
}
class IITD implements University{
    public void exam(){
        // offline
    }
    public void result(){
        // web
    }
}
class IITM implements University{
    public void exam(){
        // offline
    }
    public void result(){
        // newspaper
    }
}

public class Demo31 {
    public static void main(String[] args) {
        // create obj for class and print
        IITD d = new IITD();
        d.exam();
        d.result();
    }
}
