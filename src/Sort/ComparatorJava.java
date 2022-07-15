package Sort;

import Generic.Student;

import java.util.ArrayList;
import java.util.List;

public class ComparatorJava {
    public static void main(String[] args) {

        List<Student> listStudents = new ArrayList<>();
        // add students to list
        listStudents.add(new Student(4, "A_Vinh", 19));
        listStudents.add(new Student(2, "C_Hoa", 24));
        listStudents.add(new Student(3, "D_Phu", 20));
        listStudents.add(new Student(1, "B_Quy", 20));

        // sort list student by it's name ASC
        System.out.println("sort list student by it's name ASC: ");
//        Collections.sort(listStudents, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//        //        return o1.getName().compareTo(o2.getName());
//              return o1.getOld() > o2.getOld() ? 1 : -1;
//            }
//        });

        // show list students
//        for (Student student : listStudents) {
//            System.out.println(student.getName() + "" + student.getOld());
//        }


        listStudents.stream().sorted((o1, o2) ->  o1.getOld() - o2.getOld()).forEach(System.out::println);


    }
}