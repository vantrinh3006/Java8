package LambdaJ8;
interface Sayable2 {
    String say(String name);

}
public class Lambda1Parameter {
    public static void main(String[] args) {

        // Lambda expression with single parameter-------------
        LambdaJ8.Sayable2 s1 = (name) -> {
            return "Hello, " + name;
        };
        System.out.println(s1.say("Coder S1"));


        // Shorter---------------------------------------------------------
        LambdaJ8.Sayable2 s2 = name -> {
            return "Hello, " + name;
        };
        System.out.println(s2.say("Coder S2"));

        // Shortest------------------------------------------------------------------------
        LambdaJ8.Sayable2 s3 = name -> "Hello, " + name;

        System.out.println(s3.say("Coder S3"));

//        List<Double> list=  Arrays.asList(1.0, 33.3, 2.4, 8.6);
//        list.stream().filter(new Predicate<Double>() {
//            @Override
//            public boolean test(Double integer) {
//                return false;
//            }
//        }).forEach(System.out::println);

//        list.stream().filter(a -> a > 5).sorted(Comparator.comparing((a , b) -> a.compareTo(b))).forEach(System.out::println);

    }
}

