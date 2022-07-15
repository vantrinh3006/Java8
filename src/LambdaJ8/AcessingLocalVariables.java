package LambdaJ8;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);

}
public class AcessingLocalVariables {public static void doSomething1() {
    final int num = 1;
    LambdaJ8.Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);

    stringConverter.convert(2); // 3
}

    public static void doSomething2() {
        int num = 1;
        LambdaJ8.Converter<Integer, String> stringConverter = (from) -> String.valueOf( num + from);

        stringConverter.convert(2); // 3
    }

    public static void doSomething3() {
        int num = 1;
        LambdaJ8.Converter<Integer, String> stringConverter = (from) -> String.valueOf( from + num);

        stringConverter.convert(2); // 3

        // Lambda expression will throw error at num varialbe.
        // Local variable num defined in an enclosing scope must be final or effectively
        // num = 3;
    }
    public static void main(String[] args) {

        LambdaJ8.AcessingLocalVariables.doSomething2();
    }

}
