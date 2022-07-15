package LambdaJ8;

import Generic.Student;

import java.util.ArrayList;
import java.util.List;

public class FilterCollectionData {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Bac", 18));
        students.add(new Student(2, "Trung", 19));
        students.add(new Student(3,"Nam", 20));

        // using lambda to filter data
        students.stream().filter(age -> age.getOld() > 19).forEach(System.out::println);

        // using lambda to iterate through collection
    }
}
