
// class A
// {​​​​​
//     A()
//     {​​​​​
//         for(int i=0;i<=10;i++)
//         {​​​​​
//         }​​​​​
//     }​​​​​
// }​​​​​
// class B
// {​​​​​
//     B()
//     {​​​​​
//         // loan        
//     }​​​​​
// }​​​​​
// class Demo38
// {​​​​​
//     public static void main(String args[])
//     {​​​​​
//         System.out.println("HI ");
//     }​​​​​
// }​​​​​
// // pc of code is called as Thread


// multithreading
class A {

    int ss = 0;

    int mm = 0;

    int hh = 0;




    void abc() {

        try {

            for (int i = 0; i <= 10000; i++) {

                System.out.print("\r" + hh + " :" + mm + ":" + i);

                if (i == 60) {

                    mm++;

                    i = 0;

                }

                Thread.sleep(1000);

            }

        } catch (InterruptedException e) {




        }

    }

}




public class demo38test {

    public static void main(String[] args) {

        A a = new A();

        a.abc();

    }




}

 fire 1