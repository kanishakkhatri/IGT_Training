class A{
    // A(){ // constructor
        // System.out.println("hi a class");
    // }
    int a1=1000;
    // void abc(int a1){
    //     a1=50000;
    //     System.out.println("Hi A class "+ this.a1);// to differentiate ambiguity 
    //     System.out.println("Hi A class "+ a1);
    // }
}
class B extends A{
    // B(){
        // System.out.println("hi b class");
    // }
    int a1=100;
    void xyz(int a1){
        System.out.println("Hi B class "+a1);//local
        System.out.println("Hi B class "+this.a1);
        System.out.println("Hi B class "+super.a1);//must extend class A to access super class variable
    }
}
class Demo7{
    public static void main(String[] args) {
        // A a = new A();
        // a.abc(1000);
        B b = new B();
        b.xyz(10);//local
    }
}
/*
data types and its size
    int
    float
    char
    boolean
    double
    byte
    short
    long

    byte
    short
    int
    long
    float
    double

statements: 
    if
    if-else
    switch

loops: 
    for
    while
    do-while

jumping: 
    break
    continue
    return

operators: 
    arithmetic: +, -, *, /
    logical: &&, ||, !
    conditional: >, <, >=, <=, ==
    relational 
    bitwise: & OR NOT
    assignment: int a =10  
*/

/* 
windows         windows/linux/android
        c/cpp
source code ==> obj code
*/

/*                      java (source code)
                                |
                                |(compiler)
                                |
                             _byte code_
                            /    \      \
                           /      \      \
                (interpreter)      \      \
                        /           \      \ 
machine code       android      windows   linux   others
*/

