package LambdaJ8;
interface Addable{
    int add(int a, int b);
}
public class LambdaMultiParameter {
    public static void main(String[] args) {

        // Multiple parameters with data type in lambda expression
//        Addable ad1 = (int a, int b) -> (a + b);
//        System.out.println(ad1.add(1,2));

        // Multiple parameters in lambda expression
        // Lambda expression without return keyword.
        // Lambda expression without return keyword.
//        Addable ad2 = (a, b) -> (a + b);
//        System.out.println(ad2.add(3, 4));

        // Lambda expression with return keyword.
//        Addable ad4 = (a, b) -> {
//            return (a + b);
//        };
//        System.out.println(ad4.add(5,6));

// Lambda expression with multi-statement
        LambdaJ8.Addable ad6 = (a, b) -> {
            int sum = (a + b);
            return sum;
        };
        System.out.println(ad6.add(10, 20));

    }
}
