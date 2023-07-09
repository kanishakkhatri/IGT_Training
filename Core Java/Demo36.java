public class Demo36 {
    public static void main(String[] args) {
        String name="Kanishak";
        System.out.println(name.length());
            // name=null; // NullPointerException
        System.out.println();

        int arr[]={0, 10, 20, 30, 40};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        // System.out.println(arr[5]); // ArrayIndexOutOfBoundsException

        String num="100";
        // String num="100A"; // NumberFormatException
        System.out.println(Integer.parseInt(num)); 
    }
}
