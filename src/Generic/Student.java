package Generic;

public class Student {
    private int id;
    private String name;
    private int old;

    public Student() {
    }

    public Student(int id, String name, int old) {
        this.id = id;
        this.name = name;
        this.old = old;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getOld() {
        return old;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "old=" + old +
                '}';
    }

}
