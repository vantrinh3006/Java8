package LambdaJ8;

public class LambdaMakeThread {
    public static void main(String[] args) {
        // Using an anonymous inner class
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Run run run 1");
            }
        };
        // Using Lambda Expression for Funcational Interface
        Runnable runnable2 = () -> System.out.println("Runnable 2");

        runnable1.run();
        runnable2.run();
    }
}
