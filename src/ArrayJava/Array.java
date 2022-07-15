package ArrayJava;

import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {

//        String[] teamMembers2 = {"Amanda", "Loren", "Keith"};
//        List<String> team = List.of(teamMembers2);
//        System.out.println(team);

        String[] teamMembers = {"Amanda", "Loren", "Keith"};
        // using aslist() method
        List teamList = Arrays.asList(teamMembers);

        System.out.println("List : " + teamList);

        teamList.set(1, "abd");
        System.out.println(teamList.get(1));
    }
}
