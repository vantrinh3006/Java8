package LambdaJ8;

import java.util.Arrays;
import java.util.List;

public class ForEachLambda {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
        // Using Lambda expression
        languages.forEach(language -> System.out.println(language));

    }
}
