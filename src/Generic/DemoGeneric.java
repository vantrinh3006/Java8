package Generic;

public class DemoGeneric {
    public static void main(String[] args) {
        Dictionary<Integer, String> object = new Dictionary<>(1, "hoc tieng viet");

        //   Dictionary<Student, String> object2 = new Dictionary<>(new Student(), "hoc tieng viet");

        Dictionary<Student,String> object2 = new Dictionary<>(new Student(), "hoc tieng viet");

        Integer number = object.getKey();
        String vietnamese = object.getValue();

        object2.getKey().setName("Dat");
        object2.getKey().setOld(18);

        System.out.println(number + "|" + vietnamese);

        System.out.println(object2.getKey().getName() + " | " + object2.getKey().getOld() + " | " + object2.getValue());
    }
}
