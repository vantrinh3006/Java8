package LambdaJ8;
interface Sayable1 {
    public String say();
}
public class LambdaNoParameter {
    public static void main(String[] args) {
        Sayable1 s = () -> {
            return "ok ok";
        };
        System.out.println(s.say());
    }
}
